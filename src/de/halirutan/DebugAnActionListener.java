package de.halirutan;

import com.intellij.application.Topics;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.ex.AnActionListener;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;

/**
 * @author patrick (26.07.19).
 */
public class DebugAnActionListener implements AnActionListener {

  private Logger log = Logger.getInstance(DebugAnActionListener.class);
  private static int counter = 0;

  public DebugAnActionListener() {
    Topics.subscribe(TOPIC, null, this);
  }

  @Override
  public void beforeActionPerformed(@NotNull AnAction action, @NotNull DataContext dataContext, @NotNull AnActionEvent event) {
    final String msg = "Click " + counter++ + " " + event.getPlace();
    log.info(msg);
    System.out.println(msg);
  }
}
