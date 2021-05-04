package Concrate;
import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addData(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimli kampanya sisteme eklendi. \n"+"Kampanya ba�lang�� tarihi :"+campaign.getCampaignDate()+"\n"+"Kampanya indirim oran� : %"+campaign.getDiscount()+"\n");
	}
	@Override
	public void updateData(Campaign campaign) {
		System.out.println("Kampanya bilgileri g�ncellendi : "+campaign.getCampaignName());
	}
	@Override
	public void deleteData(Campaign campaign) {
		System.out.println("Sistemde kay�tl� olan kampanya silindi : "+campaign.getCampaignName()+" "+campaign.getCampaignDate()+" "+campaign.getDiscount());
	}
	
}
