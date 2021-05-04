package Concrate;
import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addData(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimli kampanya sisteme eklendi. \n"+"Kampanya baþlangýç tarihi :"+campaign.getCampaignDate()+"\n"+"Kampanya indirim oraný : %"+campaign.getDiscount()+"\n");
	}
	@Override
	public void updateData(Campaign campaign) {
		System.out.println("Kampanya bilgileri güncellendi : "+campaign.getCampaignName());
	}
	@Override
	public void deleteData(Campaign campaign) {
		System.out.println("Sistemde kayýtlý olan kampanya silindi : "+campaign.getCampaignName()+" "+campaign.getCampaignDate()+" "+campaign.getDiscount());
	}
	
}
