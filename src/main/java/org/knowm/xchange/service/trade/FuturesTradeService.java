package org.knowm.xchange.service.trade;

import org.knowm.xchange.dto.account.OpenPositions;
import org.knowm.xchange.dto.trade.*;
import org.knowm.xchange.exceptions.NotYetImplementedForExchangeException;
import org.knowm.xchange.service.BaseService;
import org.knowm.xchange.service.trade.params.CancelOrderParams;
import org.knowm.xchange.service.trade.params.DefaultCancelOrderParamId;
import org.knowm.xchange.service.trade.params.TradeHistoryParams;
import org.knowm.xchange.service.trade.params.orders.OpenOrdersParams;

import java.io.IOException;

public interface FuturesTradeService extends BaseService {

    default OpenOrders getOpenOrders() throws IOException {
        throw new NotYetImplementedForExchangeException("getOpenOrders");
    }

    default OpenOrders getOpenOrders(OpenOrdersParams params) throws IOException {
        throw new NotYetImplementedForExchangeException("getOpenOrders");
    }

    default OpenPositions getOpenPositions() throws IOException {
        throw new NotYetImplementedForExchangeException();
    }

    default String placeLimitOrder(LimitOrder limitOrder) throws IOException {
        throw new NotYetImplementedForExchangeException("placeLimitOrder");
    }

    default String placeMarketOrder(MarketOrder marketOrder) throws IOException {
        throw new NotYetImplementedForExchangeException("placeMarketOrder");
    }

    default String placeStopOrder(StopOrder stopOrder) throws IOException {
        throw new NotYetImplementedForExchangeException("placeStopOrder");
    }

    default boolean cancelOrder(String orderId) throws IOException {
        return cancelOrder(new DefaultCancelOrderParamId(orderId));
    }

    default boolean cancelOrder(CancelOrderParams orderParams) throws IOException {
        throw new NotYetImplementedForExchangeException("cancelOrder");
    }

    default UserTrades getTradeHistory(TradeHistoryParams params) throws IOException {
        throw new NotYetImplementedForExchangeException("getTradeHistory");
    }

    default Integer getLeverage() throws IOException {
        throw new NotYetImplementedForExchangeException("getLeverage");
    }


}
