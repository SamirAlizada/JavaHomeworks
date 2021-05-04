package Concrete;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class SaleManager implements SaleService{
	
	
	@Override
	public void sale(User user, Game game, Campaign campaign, Sale sale) {
		double priceWithDiscount = campaign.getDiscount() * (game.getPrice() / 100);
		System.out.println("Kullanýcý bilgisi     :"+user.getFullName());
		System.out.println("Satýn alýnan ürün     :"+game.getGameName());
		System.out.println("Yararlanýlan kampanya :"+campaign.getCampaignName());
		System.out.println("Ödeme yöntemi         :"+sale.getSaleType());
		System.out.println("Satýn alým tarihi     :"+sale.getSaleDate());
		System.out.println("Ürün fiyatý           :"+game.getPrice()+" TL");
		System.out.println("Ýndirim oraný         :%"+campaign.getDiscount());
		System.out.println("Ýndirimli ürün fiyatý :"+priceWithDiscount+" TL");
		
	}
	
}
