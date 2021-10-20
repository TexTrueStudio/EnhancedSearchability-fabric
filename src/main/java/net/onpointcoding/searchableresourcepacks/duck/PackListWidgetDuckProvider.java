package net.onpointcoding.searchableresourcepacks.duck;

import net.minecraft.client.gui.screen.pack.PackListWidget;
import net.minecraft.text.Text;

import java.util.List;
import java.util.function.Supplier;

public interface PackListWidgetDuckProvider {
    Text getHeaderText();

    void filter(Supplier<String> searchTextSupplier);

    List<PackListWidget.ResourcePackEntry> getSyncStore();

    void hideHeaderAndShift();
}
