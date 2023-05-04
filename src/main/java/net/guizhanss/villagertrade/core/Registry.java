package net.guizhanss.villagertrade.core;

import java.util.ArrayList;
import java.util.List;

import net.guizhanss.villagertrade.api.trades.TradeConfiguration;
import net.guizhanss.villagertrade.api.trades.TradeItem;

import lombok.Getter;

@Getter
public final class Registry {
    private final List<TradeConfiguration> tradeConfigurations = new ArrayList<>();
    private final List<TradeConfiguration> wanderingTraderConfigurations = new ArrayList<>();
    private final List<TradeConfiguration> villagerConfigurations = new ArrayList<>();
    private final List<TradeItem> slimefunTradeInputs = new ArrayList<>();

    public void reset() {
        tradeConfigurations.clear();
        wanderingTraderConfigurations.clear();
        villagerConfigurations.clear();
        slimefunTradeInputs.clear();
    }
}
