package io.github.sdftdusername.fixcameraclipping.mixins;

import com.badlogic.gdx.graphics.Camera;
import finalforeach.cosmicreach.entities.PlayerController;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerController.class)
public class PlayerControllerMixin {
    @Shadow Camera playerCam;

    @Inject(method = "updateCamera", at = @At(value = "INVOKE", target = "Lfinalforeach/cosmicreach/entities/PlayerController;getEntity()Lfinalforeach/cosmicreach/entities/Entity;"))
    private void injected(CallbackInfo ci) {
        playerCam.near = 0.01f;
    }
}
