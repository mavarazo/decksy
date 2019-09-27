package com.decksy.controller;

import com.decksy.service.storage.StorageService;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

  @Autowired private StorageService storageService;

  @Autowired private JobLauncher jobLauncher;

  @GetMapping(value = "/")
  public String index(Model model) {
    return "index";
  }

  @GetMapping(value = "/admin/card/upload")
  public String cardUpload(Model model) {
    return "/admin/card_upload";
  }

  @PostMapping(value = "/admin/card/upload")
  public String cardUploaded(
      @RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
    storageService.store(file);

    redirectAttributes.addFlashAttribute("message_type", "success");
    redirectAttributes.addFlashAttribute(
        "message", "You successfully uploaded " + file.getOriginalFilename() + "!");

    return "redirect:/";
  }

  @GetMapping(value = "/admin/card/migrate")
  public String migrateCards() {
    return null;
  }
}
