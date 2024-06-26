package mlshopbuilder.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utilities.Driver.DriverManager.getDriver;

public class Merchant_Objects {

    public WebElement userIcon() {return getDriver().findElement(By.xpath("//img[@alt='Avatar']"));}
    public WebElement HeaderAcctOwnership(){return getDriver().findElement(By.xpath("//span[@class='font-bold']"));}
    public WebElement MLoginbtn() {return getDriver().findElement(By.xpath("//div[normalize-space()='Login']"));}
    public WebElement MLogoutbtn() {return getDriver().findElement(By.xpath("//div[normalize-space()='Logout']"));}
    public WebElement Email_add() {return getDriver().findElement(By.cssSelector("[id='email']"));}
    public WebElement Login_pass() {return getDriver().findElement(By.cssSelector("[id='password']"));}
    public WebElement Continuebtn() { return getDriver().findElement(By.xpath("(//button[contains(text(),'Continue')])"));}
    public WebElement shopbuilderbutton() {return getDriver().findElement(By.xpath("//div[normalize-space()='Shop Builder']"));}
    public WebElement TotalStore() {return getDriver().findElement(By.xpath("//div[@class='pt-3 sm:text-[16px] md:text-[20px]']"));}
    public WebElement TotalNumberStore() {return getDriver().findElement(By.xpath("//div[@class='pt-3 sm:text-[16px] md:text-[20px]']/child::b"));}
    public WebElement Searchtxtbox() {return getDriver().findElement(By.xpath("//input[@placeholder='Search store']"));}
    public WebElement ListingShop() {return getDriver().findElement(By.xpath("//img[@alt=\"Listing\"]"));}
    public WebElement StoreSearchWatches() {return getDriver().findElement(By.xpath("//div[contains(text(),'ML Shop Watch Store')]"));}
    public WebElement MLShopJewelryStore() {return getDriver().findElement(By.xpath("//div[contains(text(),'ML Shop Jewelry Store')]"));}

    //stores
    public WebElement Addproduct() {return getDriver().findElement(By.xpath("//p[normalize-space()='Add Product']"));}

    //add product
    public WebElement Amparitotickbox() {return getDriver().findElement(By.cssSelector("[for='amparito']"));}
    public WebElement ProductInfo() {return getDriver().findElement(By.xpath("//div[contains(@class, \"font-semibold text-xl ml-6\") and contains(text(), \"Product Information\")]"));}

    //Product Information
    public WebElement Quantitytxtbox(){return  getDriver().findElement(By.xpath("//input[@id='quantity']"));}
    public WebElement errorQuantitytxtbox(){return  getDriver().findElement(By.xpath("//body/div[contains(@class,'pt-15')]/div[contains(@class,'max-w-[2520px] mx-auto xl:px-20 md:px-10 sm:px-2 px-4')]/div[contains(@class,'pt-16')]/div/div/div/div/div/div[contains(@class,'')]/div[contains(@class,'ps-8 mb-3 ml-5 text-gray-900 dark:text-black-950')]/form/div[contains(@class,'m-6')]/span[1]"));}
    public WebElement ItemWeighttxtbox(){return  getDriver().findElement(By.xpath("//input[@id='weight']"));}
    public WebElement errorItemWeighttxtbox(){return  getDriver().findElement(By.xpath("//body/div[contains(@class,'pt-15')]/div[contains(@class,'max-w-[2520px] mx-auto xl:px-20 md:px-10 sm:px-2 px-4')]/div[contains(@class,'pt-16')]/div/div/div/div/div/div[contains(@class,'')]/div[contains(@class,'ps-8 mb-3 ml-5 text-gray-900 dark:text-black-950')]/form/div[contains(@class,'m-6')]/span[2]"));}
    public WebElement StyleNametxtbox(){return  getDriver().findElement(By.xpath("//input[@id='name']"));}
    public WebElement errorStyleNametxtbox(){return  getDriver().findElement(By.xpath(""));}
    public WebElement Notetxtbox(){return  getDriver().findElement(By.xpath("//textarea[@id='description']"));}
    public WebElement errorNotetxtbox(){return  getDriver().findElement(By.xpath(""));}
    public WebElement diamondweight(){return  getDriver().findElement(By.xpath("//label[@for='diamondweight']"));}


    //sales Information
    public WebElement Barcodetxtbox(){return  getDriver().findElement(By.xpath("//input[@id='barcode']"));}
    public WebElement errorBarcodetxtbox(){return  getDriver().findElement(By.xpath("//div[contains(@class,'ps-8 mb-3 ml-10 text-gray-500 dark:text-gray-400')]//span[1]"));}
    public WebElement Lotnumbertxtbox(){return  getDriver().findElement(By.xpath("//input[@id='lotnumber']"));}
    public WebElement errorLotnumbertxtbox(){return  getDriver().findElement(By.xpath("//div[contains(@class,'ps-8 mb-3 ml-10 text-gray-500 dark:text-gray-400')]//span[2]"));}
    public WebElement Costofsalestxtbox(){return  getDriver().findElement(By.xpath("//input[@id='sales']"));}
    public WebElement errorCostofsalestxtbox(){return  getDriver().findElement(By.xpath("//div[contains(@class,'ps-8 mb-3 ml-10 text-gray-500 dark:text-gray-400')]//span[3]"));}
    public WebElement grosssalestxtbox(){return  getDriver().findElement(By.xpath("//input[@id='gprice']"));}
    public WebElement errorgrosssalestxtbox(){return  getDriver().findElement(By.xpath("//div[contains(@class,'ps-8 mb-3 ml-10 text-gray-500 dark:text-gray-400')]//span[4]"));}
    public WebElement pricetxtbox(){return  getDriver().findElement(By.xpath("//input[@id='price']"));}
    public WebElement errorpricetxtbox(){return  getDriver().findElement(By.xpath("//div[contains(@class,'ps-8 mb-3 ml-10 text-gray-500 dark:text-gray-400')]//span[5]"));}

    //View Products
    public WebElement viewproductbtn(){return  getDriver().findElement(By.xpath("//p[normalize-space()='View Products']"));}
    public WebElement Searchtxtbx(){return  getDriver().findElement(By.xpath("//input[@placeholder='Search']"));}
    public WebElement entrydropdown(){return  getDriver().findElement(By.xpath("//select[@id='entries']"));}
    public WebElement entryoption10down(){return  getDriver().findElement(By.xpath("//option[@value='10']"));}
    public WebElement entryoption25down(){return  getDriver().findElement(By.xpath("//option[@value='25' ]"));}
    public WebElement entryoption50down(){return  getDriver().findElement(By.xpath("//option[@value='50']"));}
    public WebElement entryoption75down(){return  getDriver().findElement(By.xpath("//option[@value='75']"));}
    public WebElement entryoption100down(){return  getDriver().findElement(By.xpath("//option[@value='100']"));}
    public WebElement entryoptionalldown(){return  getDriver().findElement(By.xpath("//option[@value='All']"));}

    public WebElement Viewdetailsbtn(){return  getDriver().findElement(By.xpath("(//div[contains(@class, \"jsx-9ed979a19a0f8424\")])[3]"));}
    public WebElement Amparitotickbox2(){return  getDriver().findElement(By.xpath("//label[@for='amparito']"));}
    public WebElement Viewdetailsbtn2(){return  getDriver().findElement(By.xpath("(//div[contains(@class, \"jsx-9ed979a19a0f8424\")])[1]"));}
    public WebElement Fromdateinput(){return  getDriver().findElement(By.xpath("(//input[@value=''])[2]"));}
    public WebElement Todateinput(){return  getDriver().findElement(By.xpath("//input[2]"));}

    //file input
    public WebElement coverPhoto(){return  getDriver().findElement(By.id("cover-file"));}
    public WebElement imageContent(){return  getDriver().findElement(By.id("dropzone-file"));}
    public WebElement selectedCoverPhoto(){return getDriver().findElement(By.cssSelector("[alt='selectedCoverImage']"));}
    public WebElement inputRequiredText(){return getDriver().findElement(By.cssSelector("[class='inline-flex text-sm text-red-700 ml-3']"));}
    public WebElement selectedImageContent(){return getDriver().findElement(By.cssSelector("[class='flex flex-col items-center justify-center pt-2 pb-2 mx-3']"));}
    
    //Button
    public WebElement specifyButton(String text){return getDriver().findElement(By.xpath("//button[contains(text(), '"+text+"')]"));}
    public WebElement savebtn(){return getDriver().findElement(By.xpath("//button[normalize-space()='Save']"));}
    public WebElement publishbtn(){return getDriver().findElement(By.xpath("//button[normalize-space()='Publish']"));}

    public WebElement brouchselection(){return  getDriver().findElement(By.id("brouch"));}
    public WebElement fourteenK(){return  getDriver().findElement(By.id("14k"));}
    public WebElement whitegold(){return  getDriver().findElement(By.id("White Gold"));}
    public WebElement mens(){return  getDriver().findElement(By.id("Mens"));}
    public WebElement diamonds(){return  getDriver().findElement(By.id("Diamond"));}
    public WebElement redselection(){return  getDriver().findElement(By.id("Red"));}
    public WebElement newselection(){return  getDriver().findElement(By.id("New"));}

    //tags
    public WebElement type(){return  getDriver().findElement(By.xpath("(//button[contains(text(),'Ring')])[1]"));}
    public WebElement karat(){return  getDriver().findElement(By.xpath("//button[contains(text(),'18k')]"));}
    public WebElement goldcolors(){return  getDriver().findElement(By.xpath("//button[contains(text(),'White Gold')]"));}
    public WebElement gender(){return  getDriver().findElement(By.xpath("//button[contains(text(),'Mens')]"));}
    public WebElement stone(){return  getDriver().findElement(By.xpath("//button[contains(text(),'Diamond')]"));}

    //
    public List<WebElement> Stores(){
        return getDriver().findElements(By.cssSelector("[alt='Listing']"));
    }
    public WebElement Store(){
        return getDriver().findElement(By.cssSelector("[alt='Listing']"));
    }
    public List<WebElement> StoreNames(){
        return getDriver().findElements(By.cssSelector("[class='font-bold text-lg text-center']"));
    }
    public WebElement status(){
        return getDriver().findElement(By.cssSelector("[role='status']"));
    }
    public WebElement viewStoreProducts_pageHeader(){
        return getDriver().findElement(By.cssSelector("[class='text-[25px] font-semibold']"));
    }

    //TD
    public List <WebElement> productId_TD(){
        return getDriver().findElements(By.xpath("//tr[@class='jsx-9ed979a19a0f8424']//td[2]"));
    }

    public WebElement firstProductId(){
        return getDriver().findElement(By.xpath("//tr[1]/td[2]"));
    }
    public WebElement firstBarcode(){
        return getDriver().findElement(By.xpath("//tr[1]/td[3]"));
    }
    public WebElement firstLotNumber(){
        return getDriver().findElement(By.xpath("//tr[1]/td[4]"));
    }
    public WebElement firstStyleName(){
        return getDriver().findElement(By.xpath("//tr[1]/td[5]"));
    }
    public WebElement firstProductType(){
        return getDriver().findElement(By.xpath("//tr[1]/td[6]"));
    }
    public WebElement firstPrice(){
        return getDriver().findElement(By.xpath("//tr[1]/td[7]"));
    }
    public WebElement firstViewButton(){
        return getDriver().findElement(By.xpath("//tr[1]/td[9]"));
    }
    public WebElement typeName(){
        return getDriver().findElement(By.xpath("//div[@id='typeName']/child::div/child::div[1]/child::div[1]"));
    }
    public WebElement lotNumber(){
        return getDriver().findElement(By.id("lotNum"));
    }
    public WebElement styleName(){
        return getDriver().findElement(By.id("styleName"));
    }

}
