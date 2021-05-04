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
		System.out.println("Kullan�c� bilgisi     :"+user.getFullName());
		System.out.println("Sat�n al�nan �r�n     :"+game.getGameName());
		System.out.println("Yararlan�lan kampanya :"+campaign.getCampaignName());
		System.out.println("�deme y�ntemi         :"+sale.getSaleType());
		System.out.println("Sat�n al�m tarihi     :"+sale.getSaleDate());
		System.out.println("�r�n fiyat�           :"+game.getPrice()+" TL");
		System.out.println("�ndirim oran�         :%"+campaign.getDiscount());
		System.out.println("�ndirimli �r�n fiyat� :"+priceWithDiscount+" TL");
		
	}
	
}
