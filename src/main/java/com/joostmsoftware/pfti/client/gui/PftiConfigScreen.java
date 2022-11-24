package com.joostmsoftware.pfti.client.gui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ScreenTexts;
import net.minecraft.client.gui.screen.option.SimpleOptionsScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.option.Option;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class PftiConfigScreen extends SimpleOptionsScreen {
    private final Screen parent;
    private static final MinecraftClient client = MinecraftClient.getInstance();
    private static final Text title = new TranslatableText("pfti.gui.options.screen");

    public PftiConfigScreen(Screen parent, Option[] options) {
        super(parent, client.options, title, options);
        this.parent = parent;
    }

    @Override
    protected void initFooter() {
        this.addDrawableChild(new ButtonWidget(this.width / 2 - 100, this.height - 27, 200, 20, ScreenTexts.DONE, button -> {

        }));

        super.initFooter();
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackgroundTexture(0);
        super.render(matrices, mouseX, mouseY, delta);
    }
}
