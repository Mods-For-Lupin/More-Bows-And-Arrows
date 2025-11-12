package com.cursee.monolib.mixin.client;

import com.cursee.monolib.MoreBowsAndArrows;
import com.cursee.monolib.platform.Services;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {

  @Inject(at = @At("TAIL"), method = "<init>")
  private void init(CallbackInfo info) {

    if (Services.PLATFORM.isDevelopmentEnvironment()) {
      MoreBowsAndArrows.LOG.info("This line is printed by an example mixin from Common!");
      MoreBowsAndArrows.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
    }
  }
}