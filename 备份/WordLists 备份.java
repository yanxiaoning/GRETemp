package wordLists;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import db.DBParameter;

public class WordLists {
	private SQLiteDatabase dbInitial=null;
	
	
	private static final String a="adj.";
	private static final String v="v.";
	private static final String n="n.";
	private static final String d="adv.";
	
	
	
	
	private String[] TableNames;
	
	public WordLists(SQLiteDatabase dbInitial,String[] TableNames){
		this.dbInitial=dbInitial;
		this.TableNames=TableNames;
		
	}
	
    public void doList_1(){
		
String[][] v1={
		{"abandon","����,����","v./n.","0"},
		
        {"abash","ʹ����,ʹ����","v.","0"},
        {"abat","����,����","v.","0"},
        {"abbreviate","����,��д","v.","0"},
        {"abdicate","��λ","v.","0"},
        {"aberrant","Խ���","adj.","0"},
        {"abet","����","v.","0"},
       
        
        
        
        {"abeyance","��ֹ,����","n.","0"},
        {"abhor","����,�Ӷ�","v.","0"},
        {"abide","����","v.","0"},
        {"abject","��������,���µ�","adj.","0"},
        {"abjure","����","v.","0"},
        {"ablution","����,��ԡ","n.","0"},
        {"abnegate","����,����","v.","0"},
        {"abolish","��ֹ","v.","0"},
        {"abominate","ʹ��","v.","0"},
        {"aboveboard","���������","adj./adv.","0"},
        
        
        
        {"abrade","�γ�,ĥ��","v.","0"},
        {"abreast","���е�","adv.","0"},
        {"abridge","ɾ��","v.","0"},
        {"abrogate","��ֹ","v.","0"},
        {"abscission","�г�,����","v.","0"},
        {"abscond","Ǳ��","v.","0"},
        {"absenteeism","����,����","n.","0"},
        {"absolute","���Ե�,��ȫ��,�����Ƶ�","adj.","0"},
        {"absolve","����","v.","0"},
        {"absorb","����,ͬ��","v.","0"},
        
        {"abstain","����,����","v.","0"},
        {"abstemious","�н��Ƶ�","v.","0"},
        {"abstract","ժҪ,�����","n. adj.","0"},
        {"abstruse","����Ѷ���","adj.","0"},
        {"absurd","������","adj.","0"},
        {"abundant","�ḻ��","adj.","0"},
        {"abuse","����","n./v.","0"},
        {"abusive","á���,�̰���,Ű����","adj.","0"},
        {"abut","�ӽ�,����","v.","0"},
        {"abysmal","�޵׵ģ���ɲ��,������,����","adj.","0"},
        
        {"academic","ѧԺ��,ѧ����","adj.","0"},
        {"accede","ͬ��","v.","0"},
        {"accelerate","����,�ٽ�","v.","0"},
        {"accentuate","�ض�,ǿ��","v.","0"},
        {"access","ͨ·","n.","0"},
        {"accessible","�״ﵽ��,����Ӱ���","adj.","0"},
        {"accessory","������,��Ҫ��","adj.","0"},
        {"acclaim","����,����","v.","0"},
        {"acclimate","ʹ��ˮ��,ʹ��Ӧ","v.","0"},
        {"accolade","�Ƴ�","v.","0"},
        
        {"accommodate","��...һ��,�ṩʳ��","v.","0"},
        {"accomodating","�������˵�","adj.","0"},
        {"accompany","����","v.","0"},
        
        {"accomplice","ͬı,����",n,"0"},
    	{"accomplish","���,�ɹ�",v,"0"},
    	{"accord","ͬ��,һ��",v+"/"+n,"0"},
    	{"accost","��ڨ",v,"0"},
    	{"accountability","��������",n,"0"},
    	{"accrete","������",v,"0"},
    	{"accrue","����",v,"0"},
    	{"accumulate","����",v,"0"},
    	{"accurate","��ȷ��",a,"0"},
    	{"accuse","Ǵ��",v,"0"},
    	
    	{"acerbic","��ɬ��,�̱���",a,"0"},
    	{"acknowledge","����,��л",v,"0"},
    	{"acme","���㼫��",n,"0"},
    	{"acolyte","(��ʿ��)����,��ɮ",n,"0"},
    	{"acorn","����",n,"0"},
    	{"acoustic","������,�й�������",a,"0"},
    	{"acquaint","ʹ��֪",v,"0"},
    	{"acquiesce","Ĭ��",v,"0"},
    	{"acquired","����ϰ�õ�",a,"0"},
    	{"acquisitive","������,̰����",a,"0"},
    	
    	{"acquit","��������,��ж��������,����",v,"0"},
    	{"acquittal","����",n,"0"},
    	{"acrid","�����Ŀ̱���",a,"0"},
    	{"acrimony","���",n,"0"},
    	{"acrobat","�Ӽ���Ա",n,"0"},
    	{"acrophobia","�ָ�֢",n,"0"},
    	{"acuity","����",n,"0"},
    	{"acumen","����,����",n,"0"},
    	{"acute","�����",a,"0"},
    	{"adage","����",n,"0"},
    	
    	{"adamant","ǿӲ��ִ��",a,"0"},
    	{"adaptable","����Ӧ������,�ɸı��",a,"0"},
    	{"addendum","���丽¼",n,"0"},
    	{"addict","����","v./n.","0"},
    	{"additive","��Ӽ�",n,"0"},
    	{"address","����,�´�",v,"0"},
    	{"adept","������",a,"0"},
    	{"adequate","�㹻��",a,"0"},
    	{"adhere","ճ��,���",v,"0"},
    	{"adherent","ӵ����,��ͽ",n,"0"},
    	
    	{"adhesive","��ճ��,��ճ��",a+"/"+n,"0"},
    	{"adjacent","������",a,"0"},
    	{"adjourn","ʹ����",v,"0"},
    	{"adjunct","����",n,"0"},
    	{"adjust","����ʹ��Ӧ",v,"0"},
    	{"admire","����",v,"0"},
    	{"admission","���,�볡��,̹��",v+"/"+n+"/"+v,"0"},
    	{"admonish","ѵ��,����",v,"0"},
    	{"adobe","����",n,"0"},
    	{"adolescent","�ഺ�ڵ�,������",a+"/"+n,"0"},
    	
    	{"adore","���,�Ȱ�",v,"0"},
    	{"adorn","װ��",v,"0"},
    	{"adroit","�������ɵ�",a,"0"},
    	{"adulate","����",v,"0"},
    	{"adumbrate","Ԥʾ",v,"0"},
    	{"advent","����",n,"0"},
    	{"adventitious","żȻ��",a,"0"},
    	{"adverse","������,�෴��,�жԵ�",a,"0"},
    	{"advertise","�����",v,"0"},
    	{"advisable","�ʵ����е�",a,"0"},
    	
    	{"advocate","ӵ��,֧��,�Ĵ�,֧����",v+"/"+n,"0"},
    	{"aegis","��,����",n,"0"},
    	{"aerate","����",v,"0"},
    	{"aerial","���е�",a,"0"},
    	{"aesthete","������",n,"0"},
    	{"aesthetic","��ѧ��",a,"0"},
    	{"affable","�Ͱ������ڽ�̸��",a,"0"},
    	{"affectation","����",n,"0"}
};
    	
    	
    	
    	
       
      for(int i=0;i<118;i++)
		subInitial(DBParameter.pos_wl_1,v1[i]);
		
		
		
		
	
		
		
		
	}
    public void doList_2(){
	
	String[][] v1={
	{"affected","��װ������","adj.","0"},
	{"affidavit","������","n.","0"},
	{"affiliate","����,����","v.","0"},
	{"affinity","���й�ϵ,������","n.","0"},
	{"affirm","ȷ��,�϶�","v.","0"},
	{"affix","ճ��","v.","0"},
	{"afflict","��ĥ","v.","0"},
	{"affluent","�ḻ��","adj.","0"},
	{"affordable","�ܹ�֧����","adj.","0"},
	{"affront","ð��","v.","0"},
	
	{"agenda","���","n.","0"},
	{"agglomerate","����,���","v.","0"},
	{"aggrandize","����,����","v.","0"},
	{"aggravate","��","v.","0"},
	{"aggregate","����,�ϼ�","v.","0"},
	{"aggression","����,�ж���������Ϊ","n.","0"},
	{"aggressive","��ս��,��ȡ��","adj.","0"},
	{"aggressor","������","n.","0"},
	{"aggrieve","ʹʹ��","v.","0"},
	{"agile","����","adj.","0"},
	
	{"agitate","����,ʹ����","v./n.","0"},
	{"agnostic","����֪�۵�,����֪����","v./n.","0"},
	{"agog","�˷ܵ�,��Ȥǿ�ҵ�","adj.","0"},
	{"agony","�����ʹ��","n.","0"},
	{"agarian","���ص�","adj.","0"},
	{"agreeable","�������ʵ�,��Ȼͬ���","adj.","0"},
	{"agronomy","ũѧ","n.","0"},
	{"ail","����","v.","0"},
	{"airborne","����������","adj.","0"},
	{"airtight","�ܲ�͸����","adj.","0"},
	
	{"alabaster","ѩ���󻬵�","adj.","0"},
	{"alacrity","����,����","adj.","0"},
	{"albeit","��Ȼ","conj.","0"},
	{"alchemy","������","n.","0"},
	{"alcove","����","n.","0"},
	{"alert","�����,����","adj./n.","0"},
	{"alias","����,����","n.","0"},
	{"alibi","���ڳ����,֤��","n.","0"},
	{"alienate","��Զ,���","v.","0"},
	{"align","�ų�ֱ��,����","v.","0"},
	
	{"alimentary","��ʳ��,Ӫ����","adj.","0"},
	{"alkali","��","n.","0"},
	{"allay","����","v.","0"},
	{"allege","�޾�����","v.","0"},
	{"allegiance","�ҳ�,ӵ��","v./n.","0"},
	{"allegory","Ԣ��","n.","0"},
	{"allergic","������","adj.","0"},
	{"alleviate","����","v.","0"},
	{"allocate","����","v.","0"},
	{"allowance","����,����,����","n.","0"},

	
	 {"allude","����ᵽ����ָ",v,"0"},
 	{"alluring","�����˵ģ����˵�",a,"0"},
 	{"aloft","�ڿ���",d,"0"},
 	{"aloof","�䵭�ģ������",a,"0"},
 	{"alphabetical","����ĸ��˳���",a,"0"},
 	{"alter","�ı�",v,"0"},
 	{"alternate","������,����,��ѡ�ˣ����ѡ��",a+v+n,"0"},
 	{"altruism","�������壬��˽",n,"0"},
 	{"aluminium","��",n,"0"},
 	{"amalgam","�����",n,"0"},
 	
 	{"amalgamate","�ϲ������",v,"0"},
 	{"amass","����",v,"0"},
 	{"amateur","ҵ�మ����",n,"0"},
 	{"ambidextrous","ʮ�����ɵ�",a,"0"},
 	{"ambiguous","������",a,"0"},
 	{"ambivalent","��ì�ܿ�����",a,"0"},
 	{"amble","����",n+v,"0"},
 	{"ambush","���",n+v,"0"},
 	{"ameliorate","����",v,"0"},
 	{"amenable","Ը���ӵģ�ͨ������",a,"0"},
 	
 	{"amend","����",v,"0"},
 	{"amenity","���ǣ����˸е����ʵ�����",n,"0"},
 	{"amiable","�Ͱ����е�",a,"0"},
 	{"amicable","�Ѻõ�",a,"0"},
 	{"amity","�Ѻù�ϵ",n,"0"},
 	{"amnesia","����֢",n,"0"},
 	{"amnesty","����",n,"0"},
 	{"amorphous","�޶��ε�",a,"0"},
 	{"amortize","���ڳ���",v,"0"},
 	{"amphibian","���ܶ��ˮ½���÷�����",n,"0"},
 	
 	{"ample","����ģ��ḻ��",a,"0"},
 	{"amplify","�Ŵ�",v,"0"},
 	{"amplitude","���������",n,"0"},
 	{"amulet","�����",n,"0"},
 	{"amuse","ʹ��죬����",v,"0"},
 	{"anachronistic","ʱ�������",a,"0"},
 	{"anaerobic","������",a,"0"},
 	{"anagram","���δ�",n,"0"},
 	{"analgesia","��ʹ����ʹ��ɥʧ",n,"0"},
 	{"analgesic","��ʹ��",n,"0"},
 	
 	{"analogy","���ƣ����",n,"0"},
 	{"analyze","�������ֽ�",v,"0"},
 	{"anarchy","�������������ϵĻ���",n,"0"},
 	{"anathema","���䣬���������",n,"0"},
 	{"anatomical","����ѧ��",a,"0"},
 	{"ancestor","���ȣ�����",n,"0"},
 	{"ancestry","��ϵ",n,"0"},
 	{"anchor","�ȹ̣��̶�,ê",v+n,"0"},
 	{"ancillary","������",a,"0"},
 	{"anecdote","�̹��£�����",n,"0"},
 	
 	{"anemia","ƶѪ��ƶѪ֢",n,"0"},
 	{"anguish","�����ʹ��",n,"0"},
 	{"angular","�нǵģ�������",a,"0"},
 	{"anhydrous","��ˮ��",a,"0"},
 	{"animate","��ģ���������,��������",a+v,"0"},
 	{"animosity","���񣬳��",n,"0"},
 	{"animus","���⣬����",n,"0"},
 	{"annals","����ʷ",n,"0"},
 	{"annexation","�̲����ϲ�",n,"0"},
 	{"annihilate","����",v,"0"},
 	{"annotate","ע��",v,"0"},
 	{"announce","����������ͨ��...�ĵ���",v,"0"},
 	{"annoy","���գ������ɧ��",v,"0"},
 	{"annul","������Ч��ȡ��",v,"0"},
 	{"anomaly","�쳣���������쳣����",n,"0"},
 	{"anonymity","����������",n,"0"},
 	{"anorexia","��ʳ֢",n,"0"},
 	{"antagonize","ʹ�Կ�����...�Կ�",v,"0"},
 	{"Antarctic","�ϼ���",a,"0"},
 	{"antecedent","ǰ�£�ǰ��,���е�",n+a,"0"},
 	{"antediluvian","ʷǰ�ģ��¾ɵ�",a,"0"},
 	{"antenna","���ǣ�����",n,"0"},
 	{"anterior","����ģ���ǰ��",a,"0"},
 	{"anthem","ʥ�裬�����裬����",n,"0"}
};
 	
	
	
	 for(int i=0;i<124;i++)
		subInitial(DBParameter.pos_wl_2,v1[i]);
	
	}
    public void doList_3(){
    	String[] v1={"anthology","ѡ��","n.","0"};
    	String[] v2={"anthropologist","����ѧ��","n.","0"};
    	String[] v3={"antibiotic","������;������","n./adj.","0"};
    	String[] v4={"antibody","����","n.","0"};
    	String[] v5={"antic","�Źֵ�","adj.","0"};
    	String[] v6={"anticipate","Ԥ��,�ڴ�","v..","0"};
    	String[] v7={"antidote","�ⶾҩ","n.","0"};
    	String[] v8={"antihistamine","���鰷��","n.","0"};
    	String[] v9={"antipathy","����","n.","0"};
    	String[] v10={"antique","��ʱ��,���ϵ�;�Ŷ�","adj./n.","0"};
    	
    	String[] v11={"antiseptic","ɱ����;������","n./adj.","0"};
    	String[] v12={"antithesis","����","n.","0"};
    	String[] v13={"anvil","������","n.","0"};
    	String[] v14={"apex","��(���)��","n.","0"};
    	String[] v15={"aphorism","����","n.","0"};
    	String[] v16={"aplomb","����","n.","0"};
    	String[] v17={"apocalyptic","Ԥʾ����ĩ�յ�;��ʾ��","adj.","0"};
    	String[] v18={"apocrypha","α��,α��","n.","0"};
    	String[] v19={"apocryphal","��ð��","adj.","0"};
    	
    	String[] v21={"apogee","Զ�ص�","n.","0"};
    	String[] v22={"apologize","��Ǹ;���","v.","0"};
    	String[] v23={"apoplectic","�з��;��ŭ��","adj.","0"};
    	String[] v24={"apostasy","�ѵ�,���","n.","0"};
    	String[] v25={"apostate","�����","n.","0"};
    	String[] v26={"apostrophe","Ʋ��","n.","0"};
    	String[] v27={"apothecary","ҩ��ʦ","n.","0"};
    	String[] v28={"appall","ʹ����","v.","0"};
    	String[] v29={"apparatus","����,�豸","n.","0"};
    	String[] v30={"apparel","(������)�·�","n.","0"};
    	
    	String[] v31={"apparition","����;���������","n.","0"};
    	String[] v32={"appeal","����,����","v.","0"};
    	String[] v33={"appease","����,ʹƽ��","v.","0"};
    	String[] v34={"appellation","����,�ƺ�","n.","0"};
    	String[] v35={"appetite","����,ʳ��;����","n.","0"};
    	String[] v36={"appetizer","��θƷ","n.","0"};
    	String[] v37={"appetizing","��ζ�ɿڵ�","v./n.","0"};
    	String[] v38={"applaud","����","v.","0"};
    	String[] v39={"applause","�Ȳ�;����","n.","0"};
    	String[] v40={"applicable","��Ӧ�õ�,�ʺϵ�","adj.","0"};
    	
    	String[] v41={"applicant","������","n.","0"};
    	String[] v42={"appoint","����,ָ��","v.","0"};
    	String[] v43={"apposite","�ʵ���","adj.","0"};
    	String[] v44={"appraise","����","v.","0"};
    	String[] v45={"appreciable","���Ե�","adj.","0"};
    	String[] v46={"appreciate","����;�м�","v.","0"};
    	String[] v47={"apprehend","����;�־�","v.","0"};
    	String[] v48={"apprentice","ѧͽ","n.","0"};
    	String[] v49={"apprise","֪ͨ,����","v./n.","0"};
    	String[] v50={"approach","�ӽ�;���ִ���;����","v./v./n.","0"};
    	
    	String[] v51={"approbation","����;�Ͽ�","n.","0"};
    	
    	String[] v52={"appropriate","������ã�Ų��;ǡ����",v+a,"0"};
    	String[] v53={"approximate","���Ƶģ���Լ��",a,"0"};
    	String[] v54={"apron","Χȹ",n,"0"};
    	String[] v55={"apropos","���˵�(��)���й�",a+d,"0"};
    	String[] v56={"apt","���ڵģ�ǡ����",a,"0"};
    	String[] v57={"aptitude","���ˣ����ܣ�����",n,"0"};
    	String[] v58={"aquatic","ˮ���ģ�ˮ�е�",a,"0"};
    	String[] v59={"arabesque","����ͼ��",n,"0"};
    	String[] v60={"arable","�ɸ��ģ��ʺ���ֲ��",a,"0"};
    	
    	String[] v61={"arbiter","Ȩ����ʿ��̩��",n,"0"};
    	String[] v62={"arbitary","ר��ģ������ǵ�",a,"0"};
    	String[] v63={"arbitrate","�ٲã�����",v,"0"};
    	String[] v64={"arboreal","��ľ��",a,"0"};
    	String[] v65={"arboretum","ֲ��԰",n,"0"};
    	String[] v66={"arcane","���صģ����ܵ�",a,"0"};
    	String[] v67={"arch","���ţ�����;ʹ�ɹ���",n+v,"0"};
    	String[] v68={"archaeology","����ѧ",n,"0"};
    	String[] v69={"archetype","ԭ�ͣ���������",n,"0"};
    	String[] v70={"archipelago","Ⱥ��",n,"0"};
    	
    	String[] v71={"architect","����ʦ",n,"0"};
    	String[] v72={"archive","������",n,"0"};
    	String[] v73={"arctic","�����ģ��Ϻ���",a,"0"};
    	String[] v74={"ardent","���ĵģ����ҵ�",a,"0"};
    	String[] v75={"arena","������",n,"0"};
    	String[] v76={"argot","����ڻ�",n,"0"};
    	String[] v77={"aria","��������ӽ̾��",n,"0"};
    	String[] v78={"arid","�ɺ��ģ������",a,"0"};
    	String[] v79={"aristocracy","���壬����ͳ��",n,"0"};
    	String[] v80={"armada","����",n,"0"};
    	
    	String[] v81={"armistice","ͣս",n,"0"};
    	String[] v82={"armory","��е��",n,"0"};
    	String[] v83={"aroma","����",n,"0"};
    	String[] v84={"array","����;���У�����",v+n,"0"};
    	String[] v85={"arrest","��������������ֹ������",v,"0"};
    	String[] v86={"arresting","�����ģ�����ע���",a,"0"};
    	String[] v87={"arrhythmic","�޽���ģ��������",a,"0"};
    	String[] v88={"arrogant","�����ģ��Դ��",a,"0"};
    	String[] v89={"arrogate","ð�ƣ���ռ",v,"0"};
    	String[] v90={"arsenal","��е��",n,"0"};
    	
    	String[] v91={"arson","�ݻ�",n,"0"};
    	String[] v92={"artery","����",n,"0"};
    	String[] v93={"arthritis","�ؽ���",n,"0"};
    	String[] v94={"articulate","���˵�����Ӻ�",v,"0"};
    	String[] v95={"artifact","�˹���Ʒ",n,"0"};
    	String[] v96={"artifice","�ɰ취�����",n,"0"};
    	String[] v97={"artificial","����ģ��ٵ�",a,"0"};
    	String[] v98={"artistry","��������",n,"0"};
    	String[] v99={"artless","���׵ģ���Ȼ��",a,"0"};
    	String[] v100={"ascendancy","ͳ��Ȩ��֧������",n,"0"};
    	
    	String[] v101={"ascetic","������;������",a+n,"0"};
    	String[] v102={"ascribe","�鹦�ڣ������",v,"0"};
    	String[] v103={"aseptic","�ྻ�ģ��޾���",a,"0"};
    	String[] v104={"aspect","���棬��ò�����",n,"0"};
    	String[] v105={"aspen","����",n,"0"};
    	String[] v106={"asperity","�Ͽᣬ��³",n,"0"};
    	String[] v107={"aspersion","�̰�",n,"0"};
    	String[] v108={"asphyxiate","ʹ��Ϣ",v,"0"};
    	String[] v109={"aspiration","����",n,"0"};
    	String[] v110={"aspire","��־��",v,"0"};
    	String[] v111={"assail","������͹�",v,"0"};
    	String[] v112={"assault","ͻϮ",n,"0"};
    	String[] v113={"assay","���飬�ⶨ",n+v,"0"};
    	String[] v114={"assemble","���ϣ��ռ���װ�䣬��װ",v+n,"0"};
    	String[] v115={"assent","ͬ��",v,"0"};
    	String[] v116={"assert","���ԣ�����",v,"0"};
    	String[] v117={"assertive","�������ŵģ��н�ȡ�ĵ�",a,"0"};
    	String[] v118={"assess","����",v,"0"};
    	String[] v119={"assessment","���ƣ�����",n,"0"};
    	String[] v120={"asset","�ʲ����Ʋ����м�ֵ���˻����ȡ֮��",n,"0"};
    	String[] v121={"assiduous","����ģ�ר�ĵ�",a,"0"};
    	String[] v122={"assimilate","ͬ��������",v,"0"};
    	String[] v123={"associate","���ϵ�;�ϻ���;��������ϵ",a+n+v,"0"};
    	String[] v124={"assorted","���ӵ�",a,"0"};
    	String[] v125={"assuage","���ͣ�����",v,"0"};
    	String[] v126={"assume","�ٶ����е�������",v,"0"};
    	String[] v127={"assumption","���룬��ȡ",n,"0"};
    	String[] v128={"assure","��...��֤��ʹȷ��",v,"0"};
    	String[] v129={"asterisk","�Ǻ�",n,"0"};
    	String[] v130={"asteroid","С����",n,"0"};
    	String[] v131={"asthma","����",n,"0"};
    	String[] v132={"astound","ʹ��",v,"0"};
    	String[] v133={"astray","��·�ģ�������;��",a,"0"};
    	String[] v134={"astringent","ֹѪ�ģ�������;ֹѪ����������",a+n,"0"};
    	String[] v135={"astrolabe","����",n,"0"};
    	String[] v136={"astrology","ռ��ѧ",n,"0"};
    	String[] v137={"astronomical","����ѧ�ģ��Ӵ��",a,"0"};
    	String[] v138={"astute","������",a,"0"};
    	String[] v139={"asunder","�����(��)����Ϊ��Ƭ",a+d,"0"};
    	String[] v140={"asylum","������",n,"0"};
    	String[] v141={"asymmetric","���ԳƵ�",a,"0"};
    	String[] v142={"athletics","�˶�������",n,"0"};
    	String[] v143={"atonal","(����)�޵���",a,"0"};
    	String[] v144={"atrocious","���̵�",a,"0"};
    	String[] v145={"atrophy","ή����˥��",n,"0"};
    	String[] v146={"attach","��ĳ�︽��(��һ��)��",v,"0"};
    	String[] v147={"attain","�ﵽ��ʵ��",v,"0"};
    	
    	

    	subInitial(DBParameter.pos_wl_3,v1);
    	subInitial(DBParameter.pos_wl_3,v2);
    	subInitial(DBParameter.pos_wl_3,v3);
    	subInitial(DBParameter.pos_wl_3,v4);
    	subInitial(DBParameter.pos_wl_3,v5);
    	subInitial(DBParameter.pos_wl_3,v6);
    	subInitial(DBParameter.pos_wl_3,v7);
    	subInitial(DBParameter.pos_wl_3,v8);
    	subInitial(DBParameter.pos_wl_3,v9);
    	subInitial(DBParameter.pos_wl_3,v10);
    	subInitial(DBParameter.pos_wl_3,v11);
    	subInitial(DBParameter.pos_wl_3,v12);
    	subInitial(DBParameter.pos_wl_3,v13);
    	subInitial(DBParameter.pos_wl_3,v14);
    	subInitial(DBParameter.pos_wl_3,v15);
    	subInitial(DBParameter.pos_wl_3,v16);
    	subInitial(DBParameter.pos_wl_3,v17);
    	subInitial(DBParameter.pos_wl_3,v18);
    	subInitial(DBParameter.pos_wl_3,v19);
    
    	subInitial(DBParameter.pos_wl_3,v21);
    	subInitial(DBParameter.pos_wl_3,v22);
    	subInitial(DBParameter.pos_wl_3,v23);
    	subInitial(DBParameter.pos_wl_3,v24);
    	subInitial(DBParameter.pos_wl_3,v25);
    	subInitial(DBParameter.pos_wl_3,v26);
    	subInitial(DBParameter.pos_wl_3,v27);
    	subInitial(DBParameter.pos_wl_3,v28);
    	subInitial(DBParameter.pos_wl_3,v29);
    	subInitial(DBParameter.pos_wl_3,v30);
    	subInitial(DBParameter.pos_wl_3,v31);
    	subInitial(DBParameter.pos_wl_3,v32);
    	subInitial(DBParameter.pos_wl_3,v33);
    	subInitial(DBParameter.pos_wl_3,v34);
    	subInitial(DBParameter.pos_wl_3,v35);
    	subInitial(DBParameter.pos_wl_3,v36);
    	subInitial(DBParameter.pos_wl_3,v37);
    	subInitial(DBParameter.pos_wl_3,v38);
    	subInitial(DBParameter.pos_wl_3,v39);
    	subInitial(DBParameter.pos_wl_3,v40);
    	subInitial(DBParameter.pos_wl_3,v41);
    	subInitial(DBParameter.pos_wl_3,v42);
    	subInitial(DBParameter.pos_wl_3,v43);
    	subInitial(DBParameter.pos_wl_3,v44);
    	subInitial(DBParameter.pos_wl_3,v45);
    	subInitial(DBParameter.pos_wl_3,v46);
    	subInitial(DBParameter.pos_wl_3,v47);
    	subInitial(DBParameter.pos_wl_3,v48);
    	subInitial(DBParameter.pos_wl_3,v49);
    	subInitial(DBParameter.pos_wl_3,v50);
    	
    	subInitial(DBParameter.pos_wl_3,v51);
     
    	
	
		subInitial(DBParameter.pos_wl_3,v52);
		subInitial(DBParameter.pos_wl_3,v53);
		subInitial(DBParameter.pos_wl_3,v54);
		subInitial(DBParameter.pos_wl_3,v55);
		subInitial(DBParameter.pos_wl_3,v56);
		subInitial(DBParameter.pos_wl_3,v57);
		subInitial(DBParameter.pos_wl_3,v58);
		subInitial(DBParameter.pos_wl_3,v59);
		subInitial(DBParameter.pos_wl_3,v60);
		subInitial(DBParameter.pos_wl_3,v61);
		subInitial(DBParameter.pos_wl_3,v62);
		subInitial(DBParameter.pos_wl_3,v63);
		subInitial(DBParameter.pos_wl_3,v64);
		subInitial(DBParameter.pos_wl_3,v65);
		subInitial(DBParameter.pos_wl_3,v66);
		subInitial(DBParameter.pos_wl_3,v67);
		subInitial(DBParameter.pos_wl_3,v68);
		subInitial(DBParameter.pos_wl_3,v69);
		subInitial(DBParameter.pos_wl_3,v70);
		subInitial(DBParameter.pos_wl_3,v71);
		subInitial(DBParameter.pos_wl_3,v72);
		subInitial(DBParameter.pos_wl_3,v73);
		subInitial(DBParameter.pos_wl_3,v74);
		subInitial(DBParameter.pos_wl_3,v75);
		subInitial(DBParameter.pos_wl_3,v76);
		subInitial(DBParameter.pos_wl_3,v77);
		subInitial(DBParameter.pos_wl_3,v78);
		subInitial(DBParameter.pos_wl_3,v79);
		subInitial(DBParameter.pos_wl_3,v80);
		subInitial(DBParameter.pos_wl_3,v81);
		subInitial(DBParameter.pos_wl_3,v82);
		subInitial(DBParameter.pos_wl_3,v83);
		subInitial(DBParameter.pos_wl_3,v84);
		subInitial(DBParameter.pos_wl_3,v85);
		subInitial(DBParameter.pos_wl_3,v86);
		subInitial(DBParameter.pos_wl_3,v87);
		subInitial(DBParameter.pos_wl_3,v88);
		subInitial(DBParameter.pos_wl_3,v89);
		subInitial(DBParameter.pos_wl_3,v90);
		subInitial(DBParameter.pos_wl_3,v91);
		subInitial(DBParameter.pos_wl_3,v92);
		subInitial(DBParameter.pos_wl_3,v93);
		subInitial(DBParameter.pos_wl_3,v94);
		subInitial(DBParameter.pos_wl_3,v95);
		subInitial(DBParameter.pos_wl_3,v96);
		subInitial(DBParameter.pos_wl_3,v97);
		subInitial(DBParameter.pos_wl_3,v98);
		subInitial(DBParameter.pos_wl_3,v99);
		subInitial(DBParameter.pos_wl_3,v100);
		subInitial(DBParameter.pos_wl_3,v101);
		subInitial(DBParameter.pos_wl_3,v102);
		subInitial(DBParameter.pos_wl_3,v103);
		subInitial(DBParameter.pos_wl_3,v104);
		subInitial(DBParameter.pos_wl_3,v105);
		subInitial(DBParameter.pos_wl_3,v106);
		subInitial(DBParameter.pos_wl_3,v107);
		subInitial(DBParameter.pos_wl_3,v108);
		subInitial(DBParameter.pos_wl_3,v109);
		subInitial(DBParameter.pos_wl_3,v110);
		subInitial(DBParameter.pos_wl_3,v111);
		subInitial(DBParameter.pos_wl_3,v112);
		subInitial(DBParameter.pos_wl_3,v113);
		subInitial(DBParameter.pos_wl_3,v114);
		subInitial(DBParameter.pos_wl_3,v115);
		subInitial(DBParameter.pos_wl_3,v116);
		subInitial(DBParameter.pos_wl_3,v117);
		subInitial(DBParameter.pos_wl_3,v118);
	
	subInitial(DBParameter.pos_wl_3,v119);
		subInitial(DBParameter.pos_wl_3,v120);
		subInitial(DBParameter.pos_wl_3,v121);
		subInitial(DBParameter.pos_wl_3,v122);
		subInitial(DBParameter.pos_wl_3,v123);
		subInitial(DBParameter.pos_wl_3,v124);
		subInitial(DBParameter.pos_wl_3,v125);
		subInitial(DBParameter.pos_wl_3,v126);
		subInitial(DBParameter.pos_wl_3,v127);
		subInitial(DBParameter.pos_wl_3,v128);
		subInitial(DBParameter.pos_wl_3,v129);
		subInitial(DBParameter.pos_wl_3,v130);
		subInitial(DBParameter.pos_wl_3,v131);
		subInitial(DBParameter.pos_wl_3,v132);
		subInitial(DBParameter.pos_wl_3,v133);
		subInitial(DBParameter.pos_wl_3,v134);
		subInitial(DBParameter.pos_wl_3,v135);
		subInitial(DBParameter.pos_wl_3,v136);
		subInitial(DBParameter.pos_wl_3,v137);
		subInitial(DBParameter.pos_wl_3,v138);
		subInitial(DBParameter.pos_wl_3,v139);
		subInitial(DBParameter.pos_wl_3,v140);
		subInitial(DBParameter.pos_wl_3,v141);
		subInitial(DBParameter.pos_wl_3,v142);
		subInitial(DBParameter.pos_wl_3,v143);
		subInitial(DBParameter.pos_wl_3,v144);
		subInitial(DBParameter.pos_wl_3,v145);
		subInitial(DBParameter.pos_wl_3,v146);
		subInitial(DBParameter.pos_wl_3,v147);
	
}
    public void doList_4(){
	 String[] v1={"attenuate","�䱡;����",v,"0"};
		String[] v2={"attest","֤��Ϊ��",v,"0"};
		String[] v3={"attic","��¥,��¥",n,"0"};
		String[] v4={"attorney","��ʦ",n,"0"};
		String[] v5={"attribute","����,Ʒ��;��...����",v,"0"};
		String[] v6={"attune","ʹ����",v,"0"};
		String[] v7={"auction","����",n,"0"};
		String[] v8={"audacious","�󵨵�,��η��,���µ�",a,"0"};
		String[] v9={"audible","���ļ���",a,"0"};
		String[] v10={"augment","����",v,"0"};
		
		String[] v11={"augur","ռ��ʦ;ռ��","n./adj.","0"};
		String[] v12={"august","���ϸ߹��",a,"0"};
		String[] v13={"auspices","����",v,"0"};
		String[] v14={"auspicious","���׵�",a,"0"};
		String[] v15={"austere","���ص�",a,"0"};
		String[] v16={"authentic","������;����֤ʵ��",a,"0"};
		String[] v17={"authoritarian","����������;��Ȩ������",n,"0"};
		String[] v18={"autobiograghy","�Դ�",n,"0"};
		String[] v19={"autocrat","������",n,"0"};
		String[] v20={"autonomy","����,����",n,"0"};
		
		String[] v21={"auxiliary","������,Э����,���ӵ�",a,"0"};
		String[] v22={"available","���õ�",a,"0"};
		String[] v23={"avalanche","ѩ��",n,"0"};
		String[] v24={"avarice","̰��",n,"0"};
		String[] v25={"avenge","Ϊ...����",v,"0"};
		String[] v26={"aver","��������,����,ȷ֤",v,"0"};
		String[] v27={"averse","���Ե�",a,"0"};
		String[] v28={"aversion","����",n,"0"};
		String[] v29={"avert","����",v,"0"};
		String[] v30={"aviary","����",n,"0"};
		
		String[] v31={"avid","������",a,"0"};
		String[] v32={"avoid","�ܿ�",v,"0"};
		String[] v33={"avow","����",v,"0"};
		String[] v34={"awe","��η","n./v.","0"};
		String[] v35={"awe-inspiring","���˾�η��",a,"0"};
		String[] v36={"awkward","��׾��",a,"0"};
		String[] v37={"awl","����",n,"0"};
		String[] v38={"awning","������,����",n,"0"};
		String[] v39={"awry","Ť����",a,"0"};
		String[] v40={"axiom","����",n,"0"};
		
		String[] v41={"axis","��",n,"0"};
		String[] v42={"axle","����",n,"0"};
		String[] v43={"babble","��������,�ੲ���,����ѧ��",v,"0"};
		String[] v44={"backdrop","(����)����,����Ļ��",n,"0"};
		String[] v45={"backhanded","��ӵ�",a,"0"};
		String[] v46={"bacterium","ϸ��",n,"0"};
		String[] v47={"badge","����",n,"0"};
		String[] v48={"badger","�;һ�ٷ��š�Ҫ��","","0"};
		String[] v49={"badinage","��Ȥ",n,"0"};
		String[] v50={"bail","����;���ͽ�",n,"0"};
        
		String[] v52={"bait","�ն�;��Ū����ŭ",n+v,"0"};
    	String[] v53={"bale","��������ֻ�������",n,"0"};
    	String[] v54={"baleful","�к��ģ�а��ģ������",a,"0"};
    	String[] v55={"balk","��ľ��;�谭��(������)��Ըǰ��������",n+v,"0"};
    	String[] v56={"ballad","��ҥ��С��",n,"0"};
    	String[] v57={"ballast","ѹ����",n,"0"};
    	String[] v58={"ballerina","������Ů��Ա",n,"0"};
    	String[] v59={"balloon","����;��������",n+v,"0"};
    	String[] v60={"ballot","ͶƱ",v+n,"0"};
    	
    	String[] v61={"balm","���ͣ�ҩ�࣬��ʹ������ο��",n,"0"};
    	String[] v62={"balmy","�º͵ģ�����ģ���ֹʹ��",a,"0"};
    	String[] v63={"ban","����;�����ֹ",n+v,"0"};
    	String[] v64={"banal","�¸���ζ��",a,"0"};
    	String[] v65={"band","���ӣ�����������",n,"0"};
    	String[] v66={"bandage","����;�ñ�������",n+v,"0"};
    	String[] v67={"bane","����",n,"0"};
    	String[] v68={"banish","����",v,"0"};
    	String[] v69={"banister","(¥�ݵ�)����",n,"0"};
    	String[] v70={"bankrupt","�Ʋ�",a,"0"};
    	
    	String[] v71={"banquet","���",n,"0"};
    	String[] v72={"banter","��Ȥ����Ц",n,"0"};
    	String[] v73={"bar","��ֹ���赲;������",v+n,"0"};
    	String[] v74={"barb","�����������Ļ�",n,"0"};
    	String[] v75={"barbarous","Ұ���ģ����׵ģ��б���",a,"0"};
    	String[] v76={"barbecue","����ܣ�����",n,"0"};
    	String[] v77={"bard","����ʫ��",n,"0"};
    	String[] v78={"bare","��¶;�����",v+a,"0"};
    	String[] v79={"barefaced","��Ȼ�ģ������޳ܵ�",a,"0"};
    	String[] v80={"bargain","���ף����������Ķ���;�ּۻ���",n+v,"0"};
    	
    	String[] v81={"barge","ƽ�ػ���������",n,"0"};
    	String[] v82={"bark","Ȯ�ͣ���Ƥ",v+n,"0"};
    	String[] v83={"barn","�Ȳ�",n,"0"};
    	String[] v84={"barometer","��ѹ�ƣ������",n,"0"};
    	String[] v85={"baroque","���ֵ���",n+a,"0"};
    	String[] v86={"barrage","��Ļ",n,"0"};
    	String[] v87={"barren","ƶ�ģ������ģ������ʵ��",a,"0"};
    	String[] v88={"barricade","��դ�赲;դ��",v+n,"0"};
    	String[] v89={"barrier","·�ϣ��ϰ�",n,"0"};
    	String[] v90={"barter","�׻�ó��",v,"0"};
    	
    	String[] v91={"base","���ɵ�",a,"0"};
    	String[] v92={"bask","ɹ̫����ȡů",v,"0"};
    	String[] v93={"baste","����֬��..",v,"0"};
    	String[] v94={"batch","һ����һ¯",n,"0"};
    	String[] v95={"bathetic","�������˵ģ��¸���",a,"0"};
    	String[] v96={"baton","ָ�Ӱ�������",n,"0"};
    	String[] v97={"battalion","��Ӫ������",n,"0"};
    	String[] v98={"bauxite","������",n,"0"};
    	String[] v99={"bawdy","��⫵ģ���ɫ��",a,"0"};
    	String[] v100={"bazzar","���У��̵꼯����",n,"0"};
    	
    	String[] v101={"beacon","��𣬵���",n,"0"};
    	String[] v102={"beam","����������",n,"0"};
    	String[] v103={"bearing","��ϵ�����壬��λ",n,"0"};
    	String[] v104={"beat","����������",v,"0"};
    	String[] v105={"bedeck","װ�Σ�����",v,"0"};
    	String[] v106={"bedlam","���ң�ɧ��",n,"0"};
    	String[] v107={"befuddlement","�Ի󲻽�",n,"0"};
    	String[] v108={"begrudge","���ģ���ǿ��",v,"0"};
    	String[] v109={"beholder","�Թ��ߣ�Ŀ����",n,"0"};
    	String[] v110={"behoove","��Ӧ��������",v,"0"};
    	String[] v111={"belabor","�����߳�������˵��ʹ��",v,"0"};
    	String[] v112={"belated","����̫�ٵ�",a,"0"};
    	String[] v113={"beleaguer","Χ����ɧ��",v,"0"};
    	String[] v114={"belie","���Σ�֤��Ϊ��",v,"0"};
    	String[] v115={"belittle","���ӣ�����",v,"0"};
    	String[] v116={"bellicose","��ս��",a,"0"};
    	String[] v117={"belligerence","��ս����ս��",n,"0"};
    	String[] v118={"bellwether","��ͷ���쵼��",n,"0"};
    	String[] v119={"bench","����ϯ������",n,"0"};
    	String[] v120={"bend","����������",v,"0"};
    	String[] v121={"benediction","ף������",n,"0"};
    	String[] v122={"benefactor","�����ߣ�������",n,"0"};
    	String[] v123={"benevolent","���ĵģ����ĵ�",a,"0"};
    	String[] v124={"benign","�����",a,"0"};
    	String[] v125={"benison","ף�����͸�",n,"0"};
    	String[] v126={"bent","�س�����;������",n+a,"0"};
    	String[] v127={"bequeath","����",v,"0"};
    	String[] v128={"bequest","�Ų���������",n,"0"};
    	String[] v129={"berate","��������",v,"0"};
    	String[] v130={"bereft","������ģ�ɥʧ�ģ�ȱ�ٵ�",a,"0"};
    	String[] v131={"beset","��Ƕ������",v,"0"};
    	String[] v132={"besiege","Χ��������",v,"0"};
    	String[] v133={"besmirch","�̰�",v,"0"};
    	String[] v134={"bestial","Ұ�޵ģ����̵�",a,"0"};
    	String[] v135={"bestow","���裬����",v,"0"};
    	String[] v136={"betray","���ѣ���¶",v,"0"};
    	String[] v137={"betroth","���䣬��...����",v,"0"};
    	String[] v138={"beverage","����",n,"0"};
    	

		subInitial(DBParameter.pos_wl_4,v1);
		subInitial(DBParameter.pos_wl_4,v2);
		subInitial(DBParameter.pos_wl_4,v3);
		subInitial(DBParameter.pos_wl_4,v4);
		subInitial(DBParameter.pos_wl_4,v5);
		subInitial(DBParameter.pos_wl_4,v6);
		subInitial(DBParameter.pos_wl_4,v7);
		subInitial(DBParameter.pos_wl_4,v8);
		subInitial(DBParameter.pos_wl_4,v9);
		subInitial(DBParameter.pos_wl_4,v10);
		subInitial(DBParameter.pos_wl_4,v11);
		subInitial(DBParameter.pos_wl_4,v12);
		subInitial(DBParameter.pos_wl_4,v13);
		subInitial(DBParameter.pos_wl_4,v14);
		subInitial(DBParameter.pos_wl_4,v15);
		subInitial(DBParameter.pos_wl_4,v16);
		subInitial(DBParameter.pos_wl_4,v17);
		subInitial(DBParameter.pos_wl_4,v18);
		subInitial(DBParameter.pos_wl_4,v19);
		subInitial(DBParameter.pos_wl_4,v20);
		subInitial(DBParameter.pos_wl_4,v21);
		subInitial(DBParameter.pos_wl_4,v22);
		subInitial(DBParameter.pos_wl_4,v23);
		subInitial(DBParameter.pos_wl_4,v24);
		subInitial(DBParameter.pos_wl_4,v25);
		subInitial(DBParameter.pos_wl_4,v26);
		subInitial(DBParameter.pos_wl_4,v27);
		subInitial(DBParameter.pos_wl_4,v28);
		subInitial(DBParameter.pos_wl_4,v29);
		subInitial(DBParameter.pos_wl_4,v30);
		subInitial(DBParameter.pos_wl_4,v31);
		subInitial(DBParameter.pos_wl_4,v32);
		subInitial(DBParameter.pos_wl_4,v33);
		subInitial(DBParameter.pos_wl_4,v34);
		subInitial(DBParameter.pos_wl_4,v35);
		subInitial(DBParameter.pos_wl_4,v36);
		subInitial(DBParameter.pos_wl_4,v37);
		subInitial(DBParameter.pos_wl_4,v38);
		subInitial(DBParameter.pos_wl_4,v39);
		subInitial(DBParameter.pos_wl_4,v40);
		subInitial(DBParameter.pos_wl_4,v41);
		subInitial(DBParameter.pos_wl_4,v42);
		subInitial(DBParameter.pos_wl_4,v43);
		subInitial(DBParameter.pos_wl_4,v44);
		subInitial(DBParameter.pos_wl_4,v45);
		subInitial(DBParameter.pos_wl_4,v46);
		subInitial(DBParameter.pos_wl_4,v47);
		subInitial(DBParameter.pos_wl_4,v48);
		subInitial(DBParameter.pos_wl_4,v49);
		subInitial(DBParameter.pos_wl_4,v50);
		
		subInitial(DBParameter.pos_wl_4,v52);
		subInitial(DBParameter.pos_wl_4,v53);
		subInitial(DBParameter.pos_wl_4,v54);
		subInitial(DBParameter.pos_wl_4,v55);
		subInitial(DBParameter.pos_wl_4,v56);
		subInitial(DBParameter.pos_wl_4,v57);
		subInitial(DBParameter.pos_wl_4,v58);
		subInitial(DBParameter.pos_wl_4,v59);
		subInitial(DBParameter.pos_wl_4,v60);
		subInitial(DBParameter.pos_wl_4,v61);
		subInitial(DBParameter.pos_wl_4,v62);
		subInitial(DBParameter.pos_wl_4,v63);
		subInitial(DBParameter.pos_wl_4,v64);
		subInitial(DBParameter.pos_wl_4,v65);
		subInitial(DBParameter.pos_wl_4,v66);
		subInitial(DBParameter.pos_wl_4,v67);
		subInitial(DBParameter.pos_wl_4,v68);
		subInitial(DBParameter.pos_wl_4,v69);
		subInitial(DBParameter.pos_wl_4,v70);
		subInitial(DBParameter.pos_wl_4,v71);
		subInitial(DBParameter.pos_wl_4,v72);
		subInitial(DBParameter.pos_wl_4,v73);
		subInitial(DBParameter.pos_wl_4,v74);
		subInitial(DBParameter.pos_wl_4,v75);
		subInitial(DBParameter.pos_wl_4,v76);
		subInitial(DBParameter.pos_wl_4,v77);
		subInitial(DBParameter.pos_wl_4,v78);
		subInitial(DBParameter.pos_wl_4,v79);
		subInitial(DBParameter.pos_wl_4,v80);
		subInitial(DBParameter.pos_wl_4,v81);
		subInitial(DBParameter.pos_wl_4,v82);
		subInitial(DBParameter.pos_wl_4,v83);
		subInitial(DBParameter.pos_wl_4,v84);
		subInitial(DBParameter.pos_wl_4,v85);
		subInitial(DBParameter.pos_wl_4,v86);
		subInitial(DBParameter.pos_wl_4,v87);
		subInitial(DBParameter.pos_wl_4,v88);
		subInitial(DBParameter.pos_wl_4,v89);
		subInitial(DBParameter.pos_wl_4,v90);
		subInitial(DBParameter.pos_wl_4,v91);
		subInitial(DBParameter.pos_wl_4,v92);
		subInitial(DBParameter.pos_wl_4,v93);
		subInitial(DBParameter.pos_wl_4,v94);
		subInitial(DBParameter.pos_wl_4,v95);
		subInitial(DBParameter.pos_wl_4,v96);
		subInitial(DBParameter.pos_wl_4,v97);
		subInitial(DBParameter.pos_wl_4,v98);
		subInitial(DBParameter.pos_wl_4,v99);
		subInitial(DBParameter.pos_wl_4,v100);
		subInitial(DBParameter.pos_wl_4,v101);
		subInitial(DBParameter.pos_wl_4,v102);
		subInitial(DBParameter.pos_wl_4,v103);
		subInitial(DBParameter.pos_wl_4,v104);
		subInitial(DBParameter.pos_wl_4,v105);
		subInitial(DBParameter.pos_wl_4,v106);
		subInitial(DBParameter.pos_wl_4,v107);
		subInitial(DBParameter.pos_wl_4,v108);
		subInitial(DBParameter.pos_wl_4,v109);
		subInitial(DBParameter.pos_wl_4,v110);
		subInitial(DBParameter.pos_wl_4,v111);
		subInitial(DBParameter.pos_wl_4,v112);
		subInitial(DBParameter.pos_wl_4,v113);
		subInitial(DBParameter.pos_wl_4,v114);
		subInitial(DBParameter.pos_wl_4,v115);
		subInitial(DBParameter.pos_wl_4,v116);
		subInitial(DBParameter.pos_wl_4,v117);
		subInitial(DBParameter.pos_wl_4,v118);
	
		subInitial(DBParameter.pos_wl_4,v119);
		subInitial(DBParameter.pos_wl_4,v120);
		subInitial(DBParameter.pos_wl_4,v121);
		subInitial(DBParameter.pos_wl_4,v122);
		subInitial(DBParameter.pos_wl_4,v123);
		subInitial(DBParameter.pos_wl_4,v124);
		subInitial(DBParameter.pos_wl_4,v125);
		subInitial(DBParameter.pos_wl_4,v126);
		subInitial(DBParameter.pos_wl_4,v127);
		subInitial(DBParameter.pos_wl_4,v128);
		subInitial(DBParameter.pos_wl_4,v129);
		subInitial(DBParameter.pos_wl_4,v130);
		subInitial(DBParameter.pos_wl_4,v131);
		subInitial(DBParameter.pos_wl_4,v132);
		subInitial(DBParameter.pos_wl_4,v133);
		subInitial(DBParameter.pos_wl_4,v134);
		subInitial(DBParameter.pos_wl_4,v135);
		subInitial(DBParameter.pos_wl_4,v136);
		subInitial(DBParameter.pos_wl_4,v137);
		subInitial(DBParameter.pos_wl_4,v138);
}
    public void doList_5(){
    	String[] v1={"bewilder","ʹ�Ի�",v,"0"};
    	String[] v2={"bewildering","�ѽ��",a,"0"};
    	String[] v3={"bibliography","����ѧ���ο���Ŀ",n,"0"};
    	String[] v4={"bibliophile","�����ߣ������",n,"0"};
    	String[] v5={"bicker","ΪС������",v,"0"};
    	String[] v6={"bid","����",v,"0"};
    	String[] v7={"bifurcate","�ֲ�",v,"0"};
    	String[] v8={"bigot","(�ڽ�)���ä���ߣ�ƫִ��",n,"0"};
    	String[] v9={"bile","��֭����ŭ",n,"0"};
    	String[] v10={"bilingual","˵�������Ե�",a,"0"};
    	
    	String[] v11={"bilk","��ծ��ƭȡ",v,"0"};
    	String[] v12={"billowy","�粨�˰㷭����",a,"0"};
    	String[] v13={"bin","������",n,"0"};
    	String[] v14={"biosphere","����Ȧ",n,"0"};
    	String[] v15={"biped","���㶯��",n,"0"};
    	String[] v16={"bit","��ͷ",n,"0"};
    	String[] v17={"bizarre","�����",a,"0"};
    	String[] v18={"blade","����",n,"0"};
    	String[] v19={"blanch","ʹ��ף�ʹ(��ɫ)��԰�",v,"0"};
    	String[] v20={"bland","����ƽ�ȵ�",a,"0"};
    	
    	String[] v21={"blandishment","���",n,"0"};
    	String[] v22={"blasphemy","����",n,"0"};
    	String[] v23={"blast","һ��(���)�������;���ƣ���ή",n+v,"0"};
    	String[] v24={"blatant","�����޳ܵģ����۵ģ���ҫ��",a,"0"};
    	String[] v25={"blazon","���£�װ��;��ȷ���",n+v,"0"};
    	String[] v26={"bleach","Ư��;Ư�׼�",v+n,"0"};
    	String[] v27={"bleak","����ģ������ģ�������",a,"0"};
    	String[] v28={"blemish","�𺦣�����;覴�",v+n,"0"};
    	String[] v29={"blight","��ή��;ʹ��ή",n+v,"0"};
    	String[] v30={"bliss","��ϲ��������Ҹ������֮��",n,"0"};
    	
    	String[] v31={"blithe","���ֵģ��������ǵ�",a,"0"};
    	String[] v32={"blizzard","����ѩ",n,"0"};
    	String[] v33={"blockade","����",v+n,"0"};
    	String[] v34={"blockage","�ϰ���",n,"0"};
    	String[] v35={"blooming","�л��ģ�������ʢ��",a,"0"};
    	String[] v36={"blotch","(Ƥ��)�ߵ㣬ī��",n,"0"};
    	String[] v37={"blowhard","�Դ�������",n,"0"};
    	String[] v38={"blue","���˵ģ���ɥ��",a,"0"};
    	String[] v39={"blueprint","��ͼ������",n,"0"};
    	String[] v40={"blunder","�������׾����;�޴�֮��",v+n
    			,"0"};
    	
    	String[] v41={"blunt","�۵ģ�ֱ�ʵ�;���",a+v,"0"};
    	String[] v42={"blur","ģ�����������;ʹģ��",n+v,"0"};
    	String[] v43={"blurb","��飬�鼮���ϵ��Ƽ����",n,"0"};
    	String[] v44={"blurt","�ѿڶ���",v,"0"};
    	String[] v45={"blush","��ĳ������;(��)����",v+n,"0"};
    	String[] v46={"bluster","(��)�͹�",v,"0"};
    	String[] v47={"blustering","�󳳴��ֵ�",a,"0"};
    	String[] v48={"boast","�Կ�",v+n,"0"};
    	String[] v49={"bodyguard","���ڣ�����",n,"0"};
    	String[] v50={"bog","����;ʹ��������",n+v,"0"};
     
           String[] v51={"boggle","η����ǰ��ʹ����",v,"0"};
        	String[] v52={"bogus","�ٵ�",a,"0"};
        	String[] v53={"boisterous","���ֵģ����ҵ�",a,"0"};
        	String[] v54={"bolster","���;֧�֣�����",n+v,"0"};
        	String[] v55={"bolt","����;��˨������",v+n,"0"};
        	String[] v56={"bombast","�ߵ������֮��",n,"0"};
        	String[] v57={"bondage","ū�ۣ�����",n,"0"};
        	String[] v58={"bonnet","Բñ����ƽ��ñ",n,"0"};
        	String[] v59={"boom","����ʱ��;��������л��������",n+v,"0"};
        	String[] v60={"boon","���ݣ���͸���",n,"0"};
        	
        	String[] v61={"boor","�����",n,"0"};
        	String[] v62={"boost","�����ƣ����ӣ�����",v,"0"};
        	String[] v63={"bootless","���洦�ģ����õ�",a,"0"};
        	String[] v64={"bore","��ף�ʹ�ᷳ;�ף������ᷳ����",v+n,"0"};
        	String[] v65={"boredom","�ᷳ�������ᷳ������",n,"0"};
        	String[] v66={"botany","ֲ��ѧ",n,"0"};
        	String[] v67={"boulder","����",n,"0"};
        	String[] v68={"bouquet","����������",n,"0"};
        	String[] v69={"bourgeois","�в��׼��ģ�С�����",a,"0"};
        	String[] v70={"bout","һ�غϣ�һ��",n,"0"};
        	
        	String[] v71={"boycott","����",v,"0"};
        	String[] v72={"brace","ʹ�ȹ�;֧����",v+n,"0"};
        	String[] v73={"bracelet","����",n,"0"};
        	String[] v74={"bracing","������ܵ�",a,"0"};
        	String[] v75={"bracket","֧��",n,"0"};
        	String[] v76={"brag","����",v,"0"};
        	String[] v77={"braggadocio","��ţ�������󴵴���",n,"0"};
        	String[] v78={"braggart","��ţ��",n,"0"};
        	String[] v79={"braid","���ӣ�����;��ɱ���",n+v,"0"};
        	String[] v80={"brake","ɲ��;����",v+n,"0"};
        	
        	String[] v81={"brandish","(��в�Ե�)����",v,"0"};
        	String[] v82={"brash","�Լ��ģ������",a,"0"};
        	String[] v83={"brassy","����Ƥ�ģ������",a,"0"};
        	String[] v84={"brat","���ӣ���ͯ",n,"0"};
        	String[] v85={"bravado","�����¸ң���������",n,"0"};
        	String[] v86={"bravura","�����ֶ�;�����ģ���ʾ���ɵ�",n+a,"0"};
        	String[] v87={"brawl","���������",v+n,"0"};
        	String[] v88={"brazen","����Ƥ��",a,"0"};
        	String[] v89={"breach","�ѷ죬ȱ��;���ƣ��ѿ���Υ��",n+v,"0"};
        	String[] v90={"breadth","���",n,"0"};
        	
        	String[] v91={"breed","��ֳ������;Ʒ��",v+n,"0"};
        	String[] v92={"bribe","��¸",v,"0"};
        	String[] v93={"bricklayer","���߽�",n,"0"};
        	String[] v94={"bridle","����ͷ",n,"0"};
        	String[] v95={"brink","(�ͱڵ�)����",n,"0"};
        	String[] v96={"brisk","���ݻ��õģ����½�����",a,"0"};
        	String[] v97={"bristle","�̶�Ӳ��ë��;���𣬷�ŭ",n+v,"0"};
        	String[] v98={"brittle","����ģ�������",a,"0"};
        	String[] v99={"broach","��(ƿ)�����(����)",v,"0"};
        	String[] v100={"brochure","С���ӣ�˵����",n,"0"};
        	
        	String[] v101={"broker","������",n,"0"};
        	String[] v102={"bromide","ƽӹ���˻򻰣��򾲼�������ҩ",n,"0"};
        	String[] v103={"brood","һ������;������ڤ��",n+v,"0"};
        	String[] v104={"brook","С��",n,"0"};
        	String[] v105={"browbeat","���꣬�Ż�",v,"0"};
        	String[] v106={"bruise","���ˣ�����",v,"0"};
        	String[] v107={"bruit","ɢ��(ҥ��)",v,"0"};
        	String[] v108={"brunt","��Ҫ�������Ӱ��",n,"0"};
        	String[] v109={"brusque","��ͻ�ģ�³ç��",a,"0"};
        	String[] v110={"brutal","���̵ģ��Ͽ��",a,"0"};
        	String[] v111={"buck","����;��¹������",v+n,"0"};
        	String[] v112={"bucket","ԲͰ",n,"0"};
        	String[] v113={"bucolic","���ģ������",a,"0"};
        	String[] v114={"bud","ѿ��",n,"0"};
        	String[] v115={"budge","�ƶ�һ�㣬�ı�����",v,"0"};
        	String[] v116={"budget","Ԥ��",n,"0"};
        	String[] v117={"buffoon","��ǣ��ֱ�����",n,"0"};
        	String[] v118={"bulb","ֲ����򾥣�����",n,"0"};
        	String[] v119={"bulge","���ͣ�����",n+v,"0"};
        	String[] v120={"bulk","����������������",n,"0"};
        	String[] v121={"bully","��ǿ���������;�۸�������",v+n,"0"};
        	String[] v122={"bumptious","�����ģ��Կ��",a,"0"};
        	String[] v123={"bungle","��׾����",v,"0"};
        	String[] v124={"buoy","���꣬����Ȧ;֧�֣�����",n+v,"0"};
        	String[] v125={"buoyant","�и����ģ����ֵ�",a,"0"};
        	String[] v126={"bureaucracy","��������",n,"0"};
        	String[] v127={"burgeon","Ѹ�ٳɳ�����չ",v,"0"};
        	String[] v128={"burial","���ᣬ���",n,"0"};
        	String[] v129={"burlesque","��̻򻬻���Ϸ��",n,"0"};
        	String[] v130={"burnish","������ĥ��",v,"0"};
        	String[] v131={"bust","����(��)��",n,"0"};
        	String[] v132={"butt","��ͷ��ײ����ײ;�ִ��һ�ˣ��̵�",v+n,"0"};
        	String[] v133={"buttress","��ǽ;֧��",n+v,"0"};
        	String[] v134={"byline","(���������ֵ�)������������",n,"0"};
        	String[] v135={"byproduct","����Ʒ��������",n,"0"};
        	String[] v136={"bystander","�Թ���",n,"0"};
        	String[] v137={"byzantine","�Թ��Ƶģ��ѱ����",a,"0"};
        	String[] v138={"cabal","������ıС����",n,"0"};
        	String[] v139={"cabinet","�����ڸ�",n,"0"};
        	String[] v140={"cache","���ش�;��...����",n+v,"0"};
        	String[] v141={"cacophony","����������",n,"0"};
        	String[] v142={"cadet","��У��У��ѧԱ",n,"0"};
        	String[] v143={"cadge","���֣�ռ����",v,"0"};
        	String[] v144={"cajole","��ƭ",v,"0"};
        	
	
        	
        	subInitial(DBParameter.pos_wl_5,v1);
    		subInitial(DBParameter.pos_wl_5,v2);
    		subInitial(DBParameter.pos_wl_5,v3);
    		subInitial(DBParameter.pos_wl_5,v4);
    		subInitial(DBParameter.pos_wl_5,v5);
    		subInitial(DBParameter.pos_wl_5,v6);
    		subInitial(DBParameter.pos_wl_5,v7);
    		subInitial(DBParameter.pos_wl_5,v8);
    		subInitial(DBParameter.pos_wl_5,v9);
    		subInitial(DBParameter.pos_wl_5,v10);
    		subInitial(DBParameter.pos_wl_5,v11);
    		subInitial(DBParameter.pos_wl_5,v12);
    		subInitial(DBParameter.pos_wl_5,v13);
    		subInitial(DBParameter.pos_wl_5,v14);
    		subInitial(DBParameter.pos_wl_5,v15);
    		subInitial(DBParameter.pos_wl_5,v16);
    		subInitial(DBParameter.pos_wl_5,v17);
    		subInitial(DBParameter.pos_wl_5,v18);
    		subInitial(DBParameter.pos_wl_5,v19);
    		subInitial(DBParameter.pos_wl_5,v20);
    		subInitial(DBParameter.pos_wl_5,v21);
    		subInitial(DBParameter.pos_wl_5,v22);
    		subInitial(DBParameter.pos_wl_5,v23);
    		subInitial(DBParameter.pos_wl_5,v24);
    		subInitial(DBParameter.pos_wl_5,v25);
    		subInitial(DBParameter.pos_wl_5,v26);
    		subInitial(DBParameter.pos_wl_5,v27);
    		subInitial(DBParameter.pos_wl_5,v28);
    		subInitial(DBParameter.pos_wl_5,v29);
    		subInitial(DBParameter.pos_wl_5,v30);
    		subInitial(DBParameter.pos_wl_5,v31);
    		subInitial(DBParameter.pos_wl_5,v32);
    		subInitial(DBParameter.pos_wl_5,v33);
    		subInitial(DBParameter.pos_wl_5,v34);
    		subInitial(DBParameter.pos_wl_5,v35);
    		subInitial(DBParameter.pos_wl_5,v36);
    		subInitial(DBParameter.pos_wl_5,v37);
    		subInitial(DBParameter.pos_wl_5,v38);
    		subInitial(DBParameter.pos_wl_5,v39);
    		subInitial(DBParameter.pos_wl_5,v40);
    		subInitial(DBParameter.pos_wl_5,v41);
    		subInitial(DBParameter.pos_wl_5,v42);
    		subInitial(DBParameter.pos_wl_5,v43);
    		subInitial(DBParameter.pos_wl_5,v44);
    		subInitial(DBParameter.pos_wl_5,v45);
    		subInitial(DBParameter.pos_wl_5,v46);
    		subInitial(DBParameter.pos_wl_5,v47);
    		subInitial(DBParameter.pos_wl_5,v48);
    		subInitial(DBParameter.pos_wl_5,v49);
    		subInitial(DBParameter.pos_wl_5,v50);
    		
    		subInitial(DBParameter.pos_wl_5,v51);
    		subInitial(DBParameter.pos_wl_5,v52);
    		subInitial(DBParameter.pos_wl_5,v53);
    		subInitial(DBParameter.pos_wl_5,v54);
    		subInitial(DBParameter.pos_wl_5,v55);
    		subInitial(DBParameter.pos_wl_5,v56);
    		subInitial(DBParameter.pos_wl_5,v57);
    		subInitial(DBParameter.pos_wl_5,v58);
    		subInitial(DBParameter.pos_wl_5,v59);
    		subInitial(DBParameter.pos_wl_5,v60);
    		subInitial(DBParameter.pos_wl_5,v61);
    		subInitial(DBParameter.pos_wl_5,v62);
    		subInitial(DBParameter.pos_wl_5,v63);
    		subInitial(DBParameter.pos_wl_5,v64);
    		subInitial(DBParameter.pos_wl_5,v65);
    		subInitial(DBParameter.pos_wl_5,v66);
    		subInitial(DBParameter.pos_wl_5,v67);
    		subInitial(DBParameter.pos_wl_5,v68);
    		subInitial(DBParameter.pos_wl_5,v69);
    		subInitial(DBParameter.pos_wl_5,v70);
    		subInitial(DBParameter.pos_wl_5,v71);
    		subInitial(DBParameter.pos_wl_5,v72);
    		subInitial(DBParameter.pos_wl_5,v73);
    		subInitial(DBParameter.pos_wl_5,v74);
    		subInitial(DBParameter.pos_wl_5,v75);
    		subInitial(DBParameter.pos_wl_5,v76);
    		subInitial(DBParameter.pos_wl_5,v77);
    		subInitial(DBParameter.pos_wl_5,v78);
    		subInitial(DBParameter.pos_wl_5,v79);
    		subInitial(DBParameter.pos_wl_5,v80);
    		subInitial(DBParameter.pos_wl_5,v81);
    		subInitial(DBParameter.pos_wl_5,v82);
    		subInitial(DBParameter.pos_wl_5,v83);
    		subInitial(DBParameter.pos_wl_5,v84);
    		subInitial(DBParameter.pos_wl_5,v85);
    		subInitial(DBParameter.pos_wl_5,v86);
    		subInitial(DBParameter.pos_wl_5,v87);
    		subInitial(DBParameter.pos_wl_5,v88);
    		subInitial(DBParameter.pos_wl_5,v89);
    		subInitial(DBParameter.pos_wl_5,v90);
    		subInitial(DBParameter.pos_wl_5,v91);
    		subInitial(DBParameter.pos_wl_5,v92);
    		subInitial(DBParameter.pos_wl_5,v93);
    		subInitial(DBParameter.pos_wl_5,v94);
    		subInitial(DBParameter.pos_wl_5,v95);
    		subInitial(DBParameter.pos_wl_5,v96);
    		subInitial(DBParameter.pos_wl_5,v97);
    		subInitial(DBParameter.pos_wl_5,v98);
    		subInitial(DBParameter.pos_wl_5,v99);
    		subInitial(DBParameter.pos_wl_5,v100);
    		subInitial(DBParameter.pos_wl_5,v101);
    		subInitial(DBParameter.pos_wl_5,v102);
    		subInitial(DBParameter.pos_wl_5,v103);
    		subInitial(DBParameter.pos_wl_5,v104);
    		subInitial(DBParameter.pos_wl_5,v105);
    		subInitial(DBParameter.pos_wl_5,v106);
    		subInitial(DBParameter.pos_wl_5,v107);
    		subInitial(DBParameter.pos_wl_5,v108);
    		subInitial(DBParameter.pos_wl_5,v109);
    		subInitial(DBParameter.pos_wl_5,v110);
    		subInitial(DBParameter.pos_wl_5,v111);
    		subInitial(DBParameter.pos_wl_5,v112);
    		subInitial(DBParameter.pos_wl_5,v113);
    		subInitial(DBParameter.pos_wl_5,v114);
    		subInitial(DBParameter.pos_wl_5,v115);
    		subInitial(DBParameter.pos_wl_5,v116);
    		subInitial(DBParameter.pos_wl_5,v117);
    		subInitial(DBParameter.pos_wl_5,v118);
    	
    	subInitial(DBParameter.pos_wl_5,v119);
    		subInitial(DBParameter.pos_wl_5,v120);
    		subInitial(DBParameter.pos_wl_5,v121);
    		subInitial(DBParameter.pos_wl_5,v122);
    		subInitial(DBParameter.pos_wl_5,v123);
    		subInitial(DBParameter.pos_wl_5,v124);
    		subInitial(DBParameter.pos_wl_5,v125);
    		subInitial(DBParameter.pos_wl_5,v126);
    		subInitial(DBParameter.pos_wl_5,v127);
    		subInitial(DBParameter.pos_wl_5,v128);
    		subInitial(DBParameter.pos_wl_5,v129);
    		subInitial(DBParameter.pos_wl_5,v130);
    		subInitial(DBParameter.pos_wl_5,v131);
    		subInitial(DBParameter.pos_wl_5,v132);
    		subInitial(DBParameter.pos_wl_5,v133);
    		subInitial(DBParameter.pos_wl_5,v134);
    		subInitial(DBParameter.pos_wl_5,v135);
    		subInitial(DBParameter.pos_wl_5,v136);
    		subInitial(DBParameter.pos_wl_5,v137);
    		subInitial(DBParameter.pos_wl_5,v138);
    		subInitial(DBParameter.pos_wl_5,v139);
    		subInitial(DBParameter.pos_wl_5,v140);
    		subInitial(DBParameter.pos_wl_5,v141);
    		subInitial(DBParameter.pos_wl_5,v142);
    		subInitial(DBParameter.pos_wl_5,v143);
    		subInitial(DBParameter.pos_wl_5,v144);
    		
}
    public void doList_6(){
    	String[] v1={"calamity","����",n,"0"};
    	String[] v2={"calcium","��",n,"0"};
    	String[] v3={"calculated","�����",a,"0"};
    	String[] v4={"calculating","��ıԶ�ǵ�",a,"0"};
    	String[] v5={"calculus","΢���֣���ʯ",n,"0"};
    	String[] v6={"caldron","���",n,"0"};
    	String[] v7={"calibrate","���ھ���У׼",v,"0"};
    	String[] v8={"calipers","�⾶˫�Ź�",n,"0"};
    	String[] v9={"calligraphy","�鷨",n,"0"};
    	String[] v10={"callous","��Ӳ���",a,"0"};
    	
    	String[] v11={"callow","(��)δ����ë�ģ�(��)δ�����",a,"0"};
    	String[] v12={"calorie","��·��",n,"0"};
    	String[] v13={"calumniate","�̰�",v,"0"};
    	String[] v14={"calumny","�̰�",n,"0"};
    	String[] v15={"cameo","����ʯ�������̻�������",n,"0"};
    	String[] v16={"camouflage","αװ",n+v,"0"};
    	String[] v17={"campaign","ս�ۣ���ѡ�",n,"0"};
    	String[] v18={"canary","��˿ȸ��Ů����",n,"0"};
    	String[] v19={"candid","��ֱ��",a,"0"};
    	String[] v20={"candidacy","��ѡ���ʸ�",n,"0"};
    	
    	String[] v21={"candor","̹�ף���ֱ",n,"0"};
    	String[] v22={"cane","����",n,"0"};
    	String[] v23={"canine","Ȯ�ģ���Ȯ��",a,"0"};
    	String[] v24={"canny","������ϸ��",a,"0"};
    	String[] v25={"canon","����",n,"0"};
    	String[] v26={"canonical","���ս̹��",a,"0"};
    	String[] v27={"canopy","����",n,"0"};
    	String[] v28={"cant","б�棬����ڻ�;ʹ��б",n+v,"0"};
    	String[] v29={"cantankerous","Ƣ�����ģ���������",a,"0"};
    	String[] v30={"canto","(��ʫ��)ƪ",n,"0"};
    	
    	String[] v31={"canvas","����������",n,"0"};
    	String[] v32={"canvass","ϸ�飬��ѡƱ",v,"0"};
    	String[] v33={"canyon","Ͽ��",n,"0"};
    	String[] v34={"cape","���磬����",n,"0"};
    	String[] v35={"capillary","ëϸѪ��",n,"0"};
    	String[] v36={"capitulate","Ͷ��",v,"0"};
    	String[] v37={"caprice","��˼���룬�仯�޳�������",n,"0"};
    	String[] v38={"capsule","�ԣ�����",n,"0"};
    	String[] v39={"caption","����",n,"0"};
    	String[] v40={"captious","��ë��õ�",a,"0"};
    	
    	String[] v41={"captivate","�Ի�����",v,"0"};
    	String[] v42={"capture","����Ӯ��;ս��Ʒ",v+n,"0"};
    	String[] v43={"carafe","����ƿ",n,"0"};
    	String[] v44={"carapace","�׿�",n,"0"};
    	String[] v45={"carbohydrate","̼ˮ������",n,"0"};
    	String[] v46={"carcinogen","�°���",n,"0"};
    	String[] v47={"cardinal","����Ҫ��;��������",a+n,"0"};
    	String[] v48={"cardiologist","���ಡר��",n,"0"};
    	String[] v49={"caress","����",n+v,"0"};
    	String[] v50={"careworn","������ĥ��",a,"0"};
     
           String[] v51={"cargo","����",n,"0"};
        	String[] v52={"caricature","��̻�������ģ��",n,"0"};
        	String[] v53={"carnivorous","��ʳ��",a,"0"};
        	String[] v54={"carol","�̸�;����",n+v,"0"};
        	String[] v55={"carouse","Ѱ������",n,"0"};
        	String[] v56={"carp","����;��ë���",n+v,"0"};
        	String[] v57={"carpenter","ľ��",n,"0"};
        	String[] v58={"carrion","����",n,"0"};
        	String[] v59={"cartographer","���Ƶ�ͼ��",n,"0"};
        	String[] v60={"carve","��̣��г�Ƭ",v,"0"};
        	
        	String[] v61={"cast","��Ա���ݣ�����;�ӣ�����",n+v,"0"};
        	String[] v62={"caste","���ȼ�",n,"0"};
        	String[] v63={"castigate","���Σ�����",v,"0"};
        	String[] v64={"casual","żȻ��",a,"0"};
        	String[] v65={"casualty","�����¹�",n,"0"};
        	String[] v66={"cataclysm","��䣬����",n,"0"};
        	String[] v67={"catalyst","�߻�������ʹ���鷢չ������",n,"0"};
        	String[] v68={"catastrophe","ͻ�������Ĵ�����",n,"0"};
        	String[] v69={"categorical","��������;�����",a,"0"};
        	String[] v70={"cater","ӭ�ϣ��ṩ��ʳ������",v,"0"};
        	
        	String[] v71={"caterpillar","ëë��",n,"0"};
        	String[] v72={"catharsis","��й������",n,"0"};
        	String[] v73={"cathedral","������",n,"0"};
        	String[] v74={"catholic","�ձ�ģ��㷺�ģ�����",a,"0"};
        	String[] v75={"caucus","�����߲����",n,"0"};
        	String[] v76={"caulk","����",v,"0"};
        	String[] v77={"causal","�����ϵ��",a,"0"};
        	String[] v78={"caustic","��ʴ�ģ��̱���;��ʴ��",a+n,"0"};
        	String[] v79={"cauterize","������������ֹѪ",v,"0"};
        	String[] v80={"cavalier","��ʿ",n,"0"};
        	
        	String[] v81={"cavalry","������ӣ�װ�ײ���",n,"0"};
        	String[] v82={"caveat","����",n,"0"};
        	String[] v83={"cavern","��Ѩ",n,"0"};
        	String[] v84={"cavil","��ë������ë���",v,"0"};
        	String[] v85={"cavity","����ǻ",n,"0"};
        	String[] v86={"cavort","��Ծ",v,"0"};
        	String[] v87={"cede","���ã�����",v,"0"};
        	String[] v88={"celebrated","������",a,"0"};
        	String[] v89={"celebrity","������֪����ʿ",n,"0"};
        	String[] v90={"celestial","����ģ����ϵ�",a,"0"};
        	
        	String[] v91={"cellar","�����ң��ƽ�",n,"0"};
        	String[] v92={"cello","������",n,"0"};
        	String[] v93={"cement","ˮ�࣬��ճ��;ճ�ϣ�����",n+v,"0"};
        	String[] v94={"censor","���",v,"0"};
        	String[] v95={"census","�˿�ͳ��",n,"0"};
        	String[] v96={"centaur","��ͷ��",n,"0"};
        	String[] v97={"centigrade","���϶ȵ�",a,"0"};
        	String[] v98={"centralization","���У���Ȩ",n,"0"};
        	String[] v99={"centurion","������İ��˶ӳ�",n,"0"};
        	String[] v100={"ceramic","�մ���Ʒ;������",n+a,"0"};
        	
        	String[] v101={"cereal","���࣬����ʳƷ",n,"0"};
        	String[] v102={"cerebral","���Եģ���˼��",a,"0"};
        	String[] v103={"ceremonious","��ʽ¡�ص�",a,"0"};
        	String[] v104={"ceremony","������ʽ",n,"0"};
        	String[] v105={"certainty","ȷ��������",n,"0"};
        	String[] v106={"certification","֤��",n,"0"};
        	String[] v107={"certitude","ȷ������",n,"0"};
        	String[] v108={"cessation","��ֹ",n,"0"};
        	String[] v109={"cession","����",n,"0"};
        	String[] v110={"chafe","���ȣ���ʹ����ŭ",v,"0"};
        	String[] v111={"chaff","�ȿǣ��׿�",n,"0"};
        	String[] v112={"chagrin","ʧ��������",n+v,"0"};
        	String[] v113={"chalice","��Ʊ���ʥ�ͱ�",n,"0"};
        	String[] v114={"chameleon","��ɫ�����Ʊ�֮��",n,"0"};
        	String[] v115={"champion","�ھ�����ʿ��ӵ����;ӵ��",n+v,"0"};
        	String[] v116={"championship","�ھ�ͷ�Σ�������",n,"0"};
        	String[] v117={"chancellor","�󳼣�������ϯ���٣���ѧУ��",n,"0"};
        	String[] v118={"chandelier","֦�ε���",n,"0"};
        	String[] v119={"chant","ʥ��;�質������",n+v,"0"};
        	String[] v120={"chaos","����",n,"0"};
        	String[] v121={"chapel","С����",n,"0"};
        	String[] v122={"char","�ս�",v,"0"};
        	String[] v123={"characteristic","����ɫ�ģ����͵�;����",a+n,"0"};
        	String[] v124={"characterization","��棬�̻�",n,"0"};
        	String[] v125={"characterize","��棬�̻�",v,"0"};
        	String[] v126={"charade","�ö������ݵ�������Ϸ",n,"0"};
        	String[] v127={"charisma","�������ʣ�����",n,"0"};
        	String[] v128={"charity","�ʴȣ�ʩ��",n,"0"};
        	String[] v129={"charlatan","�������У�ƭ��",n,"0"};
        	String[] v130={"charm","���������;��������ס",n+v,"0"};
        	String[] v131={"charter","��Ȩ������Ȩ",n,"0"};
        	String[] v132={"chary","С�ĵ�",a,"0"};
        	String[] v133={"chase","���Σ�׷��",v,"0"};
        	String[] v134={"chasm","��Ԩ���󹵣�����",n,"0"};
        	String[] v135={"chaste","���ģ���ʵ��",a,"0"};
        	String[] v136={"chastise","�����ͷ���Ǵ��",v,"0"};
        	String[] v137={"chauvinistic","ɳ�������",a,"0"};
        	String[] v138={"check","ͻȻֹͣ����ֹ",v,"0"};
        	String[] v139={"chef","��ʦ",n,"0"};
        	String[] v140={"cherubic","�ֺ�����������а��",a,"0"};
        	String[] v141={"chicanery","�켣����թ",n,"0"};
        	String[] v142={"chide","߳��",v,"0"};
        	String[] v143={"chimera","�񻰹���λ�",n,"0"};
        	String[] v144={"chip","��Ƭ����Ƭ�����ɵ�·Ƭ",n,"0"};
        	String[] v145={"chipmunk","������",n,"0"};
        	String[] v146={"chisel","��",n+v,"0"};
        	String[] v147={"chivalrous","��ʿ����ģ���Ů�˱�������",a,"0"};
        	String[] v148={"choice","�ϵȵ�",a,"0"};
        	String[] v149={"choir","��ʫ��",n,"0"};
        	String[] v150={"choke","��Ϣ������",v,"0"};
        	String[] v151={"choleric","�����",a,"0"};
        	String[] v152={"chord","����",n,"0"};
        	String[] v153={"choreography","�赸������",n,"0"};
        	String[] v154={"chorus","�ϳ���",n,"0"};
        	
			subInitial(DBParameter.pos_wl_6,v1);
			subInitial(DBParameter.pos_wl_6,v2);
			subInitial(DBParameter.pos_wl_6,v3);
			subInitial(DBParameter.pos_wl_6,v4);
			subInitial(DBParameter.pos_wl_6,v5);
			subInitial(DBParameter.pos_wl_6,v6);
			subInitial(DBParameter.pos_wl_6,v7);
			subInitial(DBParameter.pos_wl_6,v8);
			subInitial(DBParameter.pos_wl_6,v9);
			subInitial(DBParameter.pos_wl_6,v10);
			subInitial(DBParameter.pos_wl_6,v11);
			subInitial(DBParameter.pos_wl_6,v12);
			subInitial(DBParameter.pos_wl_6,v13);
			subInitial(DBParameter.pos_wl_6,v14);
			subInitial(DBParameter.pos_wl_6,v15);
			subInitial(DBParameter.pos_wl_6,v16);
			subInitial(DBParameter.pos_wl_6,v17);
			subInitial(DBParameter.pos_wl_6,v18);
			subInitial(DBParameter.pos_wl_6,v19);
			subInitial(DBParameter.pos_wl_6,v20);
			subInitial(DBParameter.pos_wl_6,v21);
			subInitial(DBParameter.pos_wl_6,v22);
			subInitial(DBParameter.pos_wl_6,v23);
			subInitial(DBParameter.pos_wl_6,v24);
			subInitial(DBParameter.pos_wl_6,v25);
			subInitial(DBParameter.pos_wl_6,v26);
			subInitial(DBParameter.pos_wl_6,v27);
			subInitial(DBParameter.pos_wl_6,v28);
			subInitial(DBParameter.pos_wl_6,v29);
			subInitial(DBParameter.pos_wl_6,v30);
			subInitial(DBParameter.pos_wl_6,v31);
			subInitial(DBParameter.pos_wl_6,v32);
			subInitial(DBParameter.pos_wl_6,v33);
			subInitial(DBParameter.pos_wl_6,v34);
			subInitial(DBParameter.pos_wl_6,v35);
			subInitial(DBParameter.pos_wl_6,v36);
			subInitial(DBParameter.pos_wl_6,v37);
			subInitial(DBParameter.pos_wl_6,v38);
			subInitial(DBParameter.pos_wl_6,v39);
			subInitial(DBParameter.pos_wl_6,v40);
			subInitial(DBParameter.pos_wl_6,v41);
			subInitial(DBParameter.pos_wl_6,v42);
			subInitial(DBParameter.pos_wl_6,v43);
			subInitial(DBParameter.pos_wl_6,v44);
			subInitial(DBParameter.pos_wl_6,v45);
			subInitial(DBParameter.pos_wl_6,v46);
			subInitial(DBParameter.pos_wl_6,v47);
			subInitial(DBParameter.pos_wl_6,v48);
			subInitial(DBParameter.pos_wl_6,v49);
			subInitial(DBParameter.pos_wl_6,v50);
			
			subInitial(DBParameter.pos_wl_6,v51);
			subInitial(DBParameter.pos_wl_6,v52);
			subInitial(DBParameter.pos_wl_6,v53);
			subInitial(DBParameter.pos_wl_6,v54);
			subInitial(DBParameter.pos_wl_6,v55);
			subInitial(DBParameter.pos_wl_6,v56);
			subInitial(DBParameter.pos_wl_6,v57);
			subInitial(DBParameter.pos_wl_6,v58);
			subInitial(DBParameter.pos_wl_6,v59);
			subInitial(DBParameter.pos_wl_6,v60);
			subInitial(DBParameter.pos_wl_6,v61);
			subInitial(DBParameter.pos_wl_6,v62);
			subInitial(DBParameter.pos_wl_6,v63);
			subInitial(DBParameter.pos_wl_6,v64);
			subInitial(DBParameter.pos_wl_6,v65);
			subInitial(DBParameter.pos_wl_6,v66);
			subInitial(DBParameter.pos_wl_6,v67);
			subInitial(DBParameter.pos_wl_6,v68);
			subInitial(DBParameter.pos_wl_6,v69);
			subInitial(DBParameter.pos_wl_6,v70);
			subInitial(DBParameter.pos_wl_6,v71);
			subInitial(DBParameter.pos_wl_6,v72);
			subInitial(DBParameter.pos_wl_6,v73);
			subInitial(DBParameter.pos_wl_6,v74);
			subInitial(DBParameter.pos_wl_6,v75);
			subInitial(DBParameter.pos_wl_6,v76);
			subInitial(DBParameter.pos_wl_6,v77);
			subInitial(DBParameter.pos_wl_6,v78);
			subInitial(DBParameter.pos_wl_6,v79);
			subInitial(DBParameter.pos_wl_6,v80);
			subInitial(DBParameter.pos_wl_6,v81);
			subInitial(DBParameter.pos_wl_6,v82);
			subInitial(DBParameter.pos_wl_6,v83);
			subInitial(DBParameter.pos_wl_6,v84);
			subInitial(DBParameter.pos_wl_6,v85);
			subInitial(DBParameter.pos_wl_6,v86);
			subInitial(DBParameter.pos_wl_6,v87);
			subInitial(DBParameter.pos_wl_6,v88);
			subInitial(DBParameter.pos_wl_6,v89);
			subInitial(DBParameter.pos_wl_6,v90);
			subInitial(DBParameter.pos_wl_6,v91);
			subInitial(DBParameter.pos_wl_6,v92);
			subInitial(DBParameter.pos_wl_6,v93);
			subInitial(DBParameter.pos_wl_6,v94);
			subInitial(DBParameter.pos_wl_6,v95);
			subInitial(DBParameter.pos_wl_6,v96);
			subInitial(DBParameter.pos_wl_6,v97);
			subInitial(DBParameter.pos_wl_6,v98);
			subInitial(DBParameter.pos_wl_6,v99);
			subInitial(DBParameter.pos_wl_6,v100);
			subInitial(DBParameter.pos_wl_6,v101);
			subInitial(DBParameter.pos_wl_6,v102);
			subInitial(DBParameter.pos_wl_6,v103);
			subInitial(DBParameter.pos_wl_6,v104);
			subInitial(DBParameter.pos_wl_6,v105);
			subInitial(DBParameter.pos_wl_6,v106);
			subInitial(DBParameter.pos_wl_6,v107);
			subInitial(DBParameter.pos_wl_6,v108);
			subInitial(DBParameter.pos_wl_6,v109);
			subInitial(DBParameter.pos_wl_6,v110);
			subInitial(DBParameter.pos_wl_6,v111);
			subInitial(DBParameter.pos_wl_6,v112);
			subInitial(DBParameter.pos_wl_6,v113);
			subInitial(DBParameter.pos_wl_6,v114);
			subInitial(DBParameter.pos_wl_6,v115);
			subInitial(DBParameter.pos_wl_6,v116);
			subInitial(DBParameter.pos_wl_6,v117);
			subInitial(DBParameter.pos_wl_6,v118);
		
			subInitial(DBParameter.pos_wl_6,v119);
			subInitial(DBParameter.pos_wl_6,v120);
			subInitial(DBParameter.pos_wl_6,v121);
			subInitial(DBParameter.pos_wl_6,v122);
			subInitial(DBParameter.pos_wl_6,v123);
			subInitial(DBParameter.pos_wl_6,v124);
			subInitial(DBParameter.pos_wl_6,v125);
			subInitial(DBParameter.pos_wl_6,v126);
			subInitial(DBParameter.pos_wl_6,v127);
			subInitial(DBParameter.pos_wl_6,v128);
			subInitial(DBParameter.pos_wl_6,v129);
			subInitial(DBParameter.pos_wl_6,v130);
			subInitial(DBParameter.pos_wl_6,v131);
			subInitial(DBParameter.pos_wl_6,v132);
			subInitial(DBParameter.pos_wl_6,v133);
			subInitial(DBParameter.pos_wl_6,v134);
			subInitial(DBParameter.pos_wl_6,v135);
			subInitial(DBParameter.pos_wl_6,v136);
			subInitial(DBParameter.pos_wl_6,v137);
			subInitial(DBParameter.pos_wl_6,v138);
			subInitial(DBParameter.pos_wl_6,v139);
			subInitial(DBParameter.pos_wl_6,v140);
			subInitial(DBParameter.pos_wl_6,v141);
			subInitial(DBParameter.pos_wl_6,v142);
			subInitial(DBParameter.pos_wl_6,v143);
			subInitial(DBParameter.pos_wl_6,v144);
			subInitial(DBParameter.pos_wl_6,v145);
			subInitial(DBParameter.pos_wl_6,v146);
			subInitial(DBParameter.pos_wl_6,v147);
			subInitial(DBParameter.pos_wl_6,v148);
			subInitial(DBParameter.pos_wl_6,v149);
			subInitial(DBParameter.pos_wl_6,v150);
			subInitial(DBParameter.pos_wl_6,v151);
			subInitial(DBParameter.pos_wl_6,v152);
			subInitial(DBParameter.pos_wl_6,v153);
			subInitial(DBParameter.pos_wl_6,v154);

}
    public void doList_7(){
    	    String[] v1={"chromatic","��ɫ��",a,"0"};
    		String[] v2={"chromosome","Ⱦɫ��",n,"0"};
    		String[] v3={"chronic","���Ե�",a,"0"};
    		String[] v4={"chrysanthemum","�ջ�",n,"0"};
    		String[] v5={"chuckle","����Ц",v,"0"};
    		String[] v6={"churl","�ֱ�֮��",n,"0"};
    		String[] v7={"cinder","�����ú��",n,"0"};
    		String[] v8={"cipher","�㣬��Ӱ�������ˣ�����",n,"0"};
    		String[] v9={"circuit","���У���·����·",n,"0"};
    		String[] v10={"circuitous","��Ȧ�ӵ�",a,"0"};
    		
    		String[] v11={"circulate","ѭ������ͨ",v,"0"};
    		String[] v12={"circumference","��Χ��Բ�ܣ��ܳ�",n,"0"};
    		String[] v13={"circumlocution","�ػ���׸�ĳ���",n,"0"};
    		String[] v14={"circumscribe","����",v,"0"};
    		String[] v15={"circumstantial","����Ҫ�ģ�żȻ�ģ�������ϸ��",a,"0"};
    		String[] v16={"circumvent","�رܣ��ü�ı���",v,"0"};
    		String[] v17={"cistern","��ˮ��",n,"0"};
    		String[] v18={"cite","����",v,"0"};
    		String[] v19={"civil","���ڵģ�����ģ�������",a,"0"};
    		String[] v20={"civilian","ƽ��",n,"0"};
    		
    		String[] v21={"civility","˹��",n,"0"};
    		String[] v22={"claim","Ҫ����Ҫ",v,"0"};
    		String[] v23={"clairvoyance","���˵Ķ�����",n,"0"};
    		String[] v24={"clam","���ã������ܵ���",n,"0"};
    		String[] v25={"clamor","����",n,"0"};
    		String[] v26={"clamp","ǯ��",n,"0"};
    		String[] v27={"clandestine","���ܵ�",a,"0"};
    		String[] v28={"clannish","������",a,"0"};
    		String[] v29={"clarify","����",v,"0"};
    		String[] v30={"clash","��ͻ��ײ��",v,"0"};
    		
    		String[] v31={"clasp","���ӣ����ӣ�����",n,"0"};
    		String[] v32={"classify","���࣬����",v,"0"};
    		String[] v33={"clause","�Ӿ�;����",n,"0"};
    		String[] v34={"clay","���",n,"0"};
    		String[] v35={"cleft","�ѷ�;������",n+a,"0"};
    		String[] v36={"clemency","�ºͣ��ʴȿ��",n,"0"};
    		String[] v37={"clement","�ʴȵ�",a,"0"};
    		String[] v38={"climax","���㣬�߳�",n,"0"};
    		String[] v39={"clinch","����;���ȷ��",v,"0"};
    		String[] v40={"cling","��ץס���᲻�÷���",v,"0"};
    		
    		String[] v41={"clinical","�ٴ��ģ��侲�͹۵�",a,"0"};
    		String[] v42={"clip","���ӣ�����;�޼�",n+v,"0"};
    		String[] v43={"clipper","����������ٷ���",n,"0"};
    		String[] v44={"clique","����ϵ",n,"0"};
    		String[] v45={"clog","�ϰ�;����",n+v,"0"};
    		String[] v46={"cloister","�޵�Ժ",n,"0"};
    		String[] v47={"closet","�ڳ�;���ܵ�",n+a,"0"};
    		String[] v48={"clot","����;ʹ����",n+v,"0"};
    		String[] v49={"cloture","���۵��ս�",n,"0"};
    		String[] v50={"cloudburst","����",n,"0"};
    	 
    	       String[] v51={"clout","�����ͻ���Ȩ����Ӱ����",n,"0"};
    	    	String[] v52={"clown","С��;��С��",n+v,"0"};
    	    	String[] v53={"cloying","��÷����",a,"0"};
    	    	String[] v54={"clumsy","��׾�ģ�׾�ӵ�",a,"0"};
    	    	String[] v55={"cluster","����Ⱥ;��Ⱥ",n+v,"0"};
    	    	String[] v56={"coagulant","���������Ѫ��",n,"0"};
    	    	String[] v57={"coagulate","ʹ����",v,"0"};
    	    	String[] v58={"coalesce","���ϣ��ϲ�",v,"0"};
    	    	String[] v59={"coalition","���ϣ����",n,"0"};
    	    	String[] v60={"coarse","�ֲڵģ����ӵĴ��׵�",a,"0"};
    	    	
    	    	String[] v61={"coarsen","ʹ�ֲ�",v,"0"};
    	    	String[] v62={"coax","�壬��",v,"0"};
    	    	String[] v63={"cob","���װ��ӣ������",n,"0"};
    	    	String[] v64={"cobbler","��Ь��",n,"0"};
    	    	String[] v65={"cocoon","��",n,"0"};
    	    	String[] v66={"coda","������β��",n,"0"};
    	    	String[] v67={"coddle","�簮��Ϥ������",v,"0"};
    	    	String[] v68={"code","���룬����;����",n+v,"0"};
    	    	String[] v69={"codify","�����ɱ�ɷ���",v,"0"};
    	    	String[] v70={"coerce","ǿ�ȣ�ѹ��",v,"0"};
    	    	
    	    	String[] v71={"coercion","ǿ�ƣ���ѹͳ��",n,"0"};
    	    	String[] v72={"coeval","ͬ�����",a,"0"};
    	    	String[] v73={"congent","��˵������",a,"0"};
    	    	String[] v74={"cogitate","����˼��",v,"0"};
    	    	String[] v75={"cognizance","��ʶ",n,"0"};
    	    	String[] v76={"cognizant","��ʶ��",a,"0"};
    	    	String[] v77={"cohabit","����",v,"0"};
    	    	String[] v78={"coherent","����ģ�һ�µ�",a,"0"};
    	    	String[] v79={"cohesion","������",n,"0"};
    	    	String[] v80={"cohesive","���۵�",a,"0"};
    	    	
    	    	String[] v81={"coincide","�ɺϣ�һ��",v,"0"};
    	    	String[] v82={"colander","©��",n,"0"};
    	    	String[] v83={"cold-blooded","��Ѫ�п��",a,"0"};
    	    	String[] v84={"collaborate","������ͨ��",v,"0"};
    	    	String[] v85={"collage","ƴ����",n,"0"};
    	    	String[] v86={"collapse","̮��������",v,"0"};
    	    	String[] v87={"collar","���죬���ڶ��ﾱ������Ȧ",n,"0"};
    	    	String[] v88={"collate","���գ��˶�",v,"0"};
    	    	String[] v89={"collateral","ƽ�еģ���ϵ��;����Ʒ",a+n,"0"};
    	    	String[] v90={"collected","̩Ȼ������",a,"0"};
    	    	
    	    	String[] v91={"collection","�ղ�Ʒ",n,"0"};
    	    	String[] v92={"collision","��ײ����ͻ",n,"0"};
    	    	String[] v93={"colloquial","����ģ���ͷ��",a,"0"};
    	    	String[] v94={"colloquium","ѧ�����ۻ�",n,"0"};
    	    	String[] v95={"collude","��ͨ",v,"0"};
    	    	String[] v96={"colon","ð��",n,"0"};
    	    	String[] v97={"colonize","����ֳ���",v,"0"};
    	    	String[] v98={"colonnade","����",n,"0"};
    	    	String[] v99={"colony","��Ⱥ",n,"0"};
    	    	String[] v100={"coloration","��ɫ������ɫ��ɫ��",n,"0"};
    	    	
    	    	String[] v101={"colossal","�޴�ģ��Ӵ��",a,"0"};
    	    	String[] v102={"colossus","���ˣ����͵���",n,"0"};
    	    	String[] v103={"coltish","��С��ģ����ܾ�����",a,"0"};
    	    	String[] v104={"coma","����״̬",n,"0"};
    	    	String[] v105={"comatose","���Ե�",a,"0"};
    	    	String[] v106={"combat","����",n+v,"0"};
    	    	String[] v107={"combustible","��ȼ�ģ��׼�����",a,"0"};
    	    	String[] v108={"comedienne","Ůг��",n,"0"};
    	    	String[] v109={"comely","���˵ģ�������",a,"0"};
    	    	String[] v110={"comic","��Ц�ģ�ϲ���",a,"0"};
    	    	String[] v111={"comity","���ã�����",n,"0"};
    	    	String[] v112={"comma","����",n,"0"};
    	    	String[] v113={"commemorate","����(ΰ��,���¼�)",v,"0"};
    	    	String[] v114={"commence","��ʼ������",v,"0"};
    	    	String[] v115={"commencement","��ʼ����ѧ��ҵ����",n,"0"};
    	    	String[] v116={"commensurate","�ȴ�ģ���Ƶ�",a,"0"};
    	    	String[] v117={"commentary","ʵ��������(���)��ע",n,"0"};
    	    	String[] v118={"commingle","���ͣ����",v,"0"};
    	    	String[] v119={"commission","ί�У�Ӷ��",n,"0"};
    	    	String[] v120={"commit","�и�����ŵ������",v,"0"};
    	    	String[] v121={"commited","���ҵ�",a,"0"};
    	    	String[] v122={"commodious","����",a,"0"};
    	    	String[] v123={"commodity","��Ʒ",n,"0"};
    	    	String[] v124={"commonplace","ƽ����",a,"0"};
    	    	String[] v125={"commonwealth","���͹�",n,"0"};
    	    	String[] v126={"commotion","ɧ��",n,"0"};
    	    	String[] v127={"communal","�����",a,"0"};
    	    	String[] v128={"commune","����;��...���ܽ�̸",n+v,"0"};
    	    	String[] v129={"communicate","������Ϣ����ͨ",v,"0"};
    	    	String[] v130={"commute","����",v,"0"};
    	    	String[] v131={"compact","��ʵ�ģ�����;��ͬ",a+n,"0"};
    	    	String[] v132={"companion","�Ƚϣ�����",n,"0"};
    	    	String[] v133={"compartment","���䣬����",n,"0"};
    	    	String[] v134={"compass","ָ���룬���ޣ���Χ",n,"0"};
    	    	String[] v135={"compassion","ͬ��",n,"0"};
    	    	String[] v136={"compatible","���ݵ�",a,"0"};
    	    	String[] v137={"compatriot","ͬ��",n,"0"};
    	    	String[] v138={"compel","ǿ��",v,"0"};
    	    	String[] v139={"compelling","������Ȥ��",a,"0"};
    	    	String[] v140={"compendium","��Ҫ������",n,"0"};
    	    	String[] v141={"compensate","�������⳥",v,"0"};
    	    	String[] v142={"competence","ʤ�Σ�����",n,"0"};
    	    	String[] v143={"compile","�㼯���༭",v,"0"};
    	    	
    	    	

    	subInitial(DBParameter.pos_wl_7,v1);
		subInitial(DBParameter.pos_wl_7,v2);
		subInitial(DBParameter.pos_wl_7,v3);
		subInitial(DBParameter.pos_wl_7,v4);
		subInitial(DBParameter.pos_wl_7,v5);
		subInitial(DBParameter.pos_wl_7,v6);
		subInitial(DBParameter.pos_wl_7,v7);
		subInitial(DBParameter.pos_wl_7,v8);
		subInitial(DBParameter.pos_wl_7,v9);
		subInitial(DBParameter.pos_wl_7,v10);
		subInitial(DBParameter.pos_wl_7,v11);
		subInitial(DBParameter.pos_wl_7,v12);
		subInitial(DBParameter.pos_wl_7,v13);
		subInitial(DBParameter.pos_wl_7,v14);
		subInitial(DBParameter.pos_wl_7,v15);
		subInitial(DBParameter.pos_wl_7,v16);
		subInitial(DBParameter.pos_wl_7,v17);
		subInitial(DBParameter.pos_wl_7,v18);
		subInitial(DBParameter.pos_wl_7,v19);
		subInitial(DBParameter.pos_wl_7,v20);
		subInitial(DBParameter.pos_wl_7,v21);
		subInitial(DBParameter.pos_wl_7,v22);
		subInitial(DBParameter.pos_wl_7,v23);
		subInitial(DBParameter.pos_wl_7,v24);
		subInitial(DBParameter.pos_wl_7,v25);
		subInitial(DBParameter.pos_wl_7,v26);
		subInitial(DBParameter.pos_wl_7,v27);
		subInitial(DBParameter.pos_wl_7,v28);
		subInitial(DBParameter.pos_wl_7,v29);
		subInitial(DBParameter.pos_wl_7,v30);
		subInitial(DBParameter.pos_wl_7,v31);
		subInitial(DBParameter.pos_wl_7,v32);
		subInitial(DBParameter.pos_wl_7,v33);
		subInitial(DBParameter.pos_wl_7,v34);
		subInitial(DBParameter.pos_wl_7,v35);
		subInitial(DBParameter.pos_wl_7,v36);
		subInitial(DBParameter.pos_wl_7,v37);
		subInitial(DBParameter.pos_wl_7,v38);
		subInitial(DBParameter.pos_wl_7,v39);
		subInitial(DBParameter.pos_wl_7,v40);
		subInitial(DBParameter.pos_wl_7,v41);
		subInitial(DBParameter.pos_wl_7,v42);
		subInitial(DBParameter.pos_wl_7,v43);
		subInitial(DBParameter.pos_wl_7,v44);
		subInitial(DBParameter.pos_wl_7,v45);
		subInitial(DBParameter.pos_wl_7,v46);
		subInitial(DBParameter.pos_wl_7,v47);
		subInitial(DBParameter.pos_wl_7,v48);
		subInitial(DBParameter.pos_wl_7,v49);
		subInitial(DBParameter.pos_wl_7,v50);
	
		subInitial(DBParameter.pos_wl_7,v51);
		subInitial(DBParameter.pos_wl_7,v52);
		subInitial(DBParameter.pos_wl_7,v53);
		subInitial(DBParameter.pos_wl_7,v54);
		subInitial(DBParameter.pos_wl_7,v55);
		subInitial(DBParameter.pos_wl_7,v56);
		subInitial(DBParameter.pos_wl_7,v57);
		subInitial(DBParameter.pos_wl_7,v58);
		subInitial(DBParameter.pos_wl_7,v59);
		subInitial(DBParameter.pos_wl_7,v60);
		subInitial(DBParameter.pos_wl_7,v61);
		subInitial(DBParameter.pos_wl_7,v62);
		subInitial(DBParameter.pos_wl_7,v63);
		subInitial(DBParameter.pos_wl_7,v64);
		subInitial(DBParameter.pos_wl_7,v65);
		subInitial(DBParameter.pos_wl_7,v66);
		subInitial(DBParameter.pos_wl_7,v67);
		subInitial(DBParameter.pos_wl_7,v68);
		subInitial(DBParameter.pos_wl_7,v69);
		subInitial(DBParameter.pos_wl_7,v70);
		subInitial(DBParameter.pos_wl_7,v71);
		subInitial(DBParameter.pos_wl_7,v72);
		subInitial(DBParameter.pos_wl_7,v73);
		subInitial(DBParameter.pos_wl_7,v74);
		subInitial(DBParameter.pos_wl_7,v75);
		subInitial(DBParameter.pos_wl_7,v76);
		subInitial(DBParameter.pos_wl_7,v77);
		subInitial(DBParameter.pos_wl_7,v78);
		subInitial(DBParameter.pos_wl_7,v79);
		subInitial(DBParameter.pos_wl_7,v80);
		subInitial(DBParameter.pos_wl_7,v81);
		subInitial(DBParameter.pos_wl_7,v82);
		subInitial(DBParameter.pos_wl_7,v83);
		subInitial(DBParameter.pos_wl_7,v84);
		subInitial(DBParameter.pos_wl_7,v85);
		subInitial(DBParameter.pos_wl_7,v86);
		subInitial(DBParameter.pos_wl_7,v87);
		subInitial(DBParameter.pos_wl_7,v88);
		subInitial(DBParameter.pos_wl_7,v89);
		subInitial(DBParameter.pos_wl_7,v90);
		subInitial(DBParameter.pos_wl_7,v91);
		subInitial(DBParameter.pos_wl_7,v92);
		subInitial(DBParameter.pos_wl_7,v93);
		subInitial(DBParameter.pos_wl_7,v94);
		subInitial(DBParameter.pos_wl_7,v95);
		subInitial(DBParameter.pos_wl_7,v96);
		subInitial(DBParameter.pos_wl_7,v97);
		subInitial(DBParameter.pos_wl_7,v98);
		subInitial(DBParameter.pos_wl_7,v99);
		subInitial(DBParameter.pos_wl_7,v100);
		subInitial(DBParameter.pos_wl_7,v101);
		subInitial(DBParameter.pos_wl_7,v102);
		subInitial(DBParameter.pos_wl_7,v103);
		subInitial(DBParameter.pos_wl_7,v104);
		subInitial(DBParameter.pos_wl_7,v105);
		subInitial(DBParameter.pos_wl_7,v106);
		subInitial(DBParameter.pos_wl_7,v107);
		subInitial(DBParameter.pos_wl_7,v108);
		subInitial(DBParameter.pos_wl_7,v109);
		subInitial(DBParameter.pos_wl_7,v110);
		subInitial(DBParameter.pos_wl_7,v111);
		subInitial(DBParameter.pos_wl_7,v112);
		subInitial(DBParameter.pos_wl_7,v113);
		subInitial(DBParameter.pos_wl_7,v114);
		subInitial(DBParameter.pos_wl_7,v115);
		subInitial(DBParameter.pos_wl_7,v116);
		subInitial(DBParameter.pos_wl_7,v117);
		subInitial(DBParameter.pos_wl_7,v118);
	
		subInitial(DBParameter.pos_wl_7,v119);
		subInitial(DBParameter.pos_wl_7,v120);
		subInitial(DBParameter.pos_wl_7,v121);
		subInitial(DBParameter.pos_wl_7,v122);
		subInitial(DBParameter.pos_wl_7,v123);
		subInitial(DBParameter.pos_wl_7,v124);
		subInitial(DBParameter.pos_wl_7,v125);
		subInitial(DBParameter.pos_wl_7,v126);
		subInitial(DBParameter.pos_wl_7,v127);
		subInitial(DBParameter.pos_wl_7,v128);
		subInitial(DBParameter.pos_wl_7,v129);
		subInitial(DBParameter.pos_wl_7,v130);
		subInitial(DBParameter.pos_wl_7,v131);
		subInitial(DBParameter.pos_wl_7,v132);
		subInitial(DBParameter.pos_wl_7,v133);
		subInitial(DBParameter.pos_wl_7,v134);
		subInitial(DBParameter.pos_wl_7,v135);
		subInitial(DBParameter.pos_wl_7,v136);
		subInitial(DBParameter.pos_wl_7,v137);
		subInitial(DBParameter.pos_wl_7,v138);
		subInitial(DBParameter.pos_wl_7,v139);
		subInitial(DBParameter.pos_wl_7,v140);
		subInitial(DBParameter.pos_wl_7,v141);
		subInitial(DBParameter.pos_wl_7,v142);
		subInitial(DBParameter.pos_wl_7,v143);
		
	
}
    public void doList_8(){
    	String[] v1={"comlacency","���㣬����",n,"0"};
    	String[] v2={"complaisance","����������ڣ���˳",n,"0"};
    	String[] v3={"complaisant","˳�ӵģ��ֺõ�",a,"0"};
    	String[] v4={"complementary","������",a,"0"};
    	String[] v5={"comliant","˳�ӵ�",a,"0"};
    	String[] v6={"complicate","ʹ���ӻ�",v,"0"};
    	String[] v7={"compliment","��ά",v+n,"0"};
    	String[] v8={"component","�ɷ֣��㲿��",n,"0"};
    	String[] v9={"compose","д������;���",v,"0"};
    	String[] v10={"composed","�򶨵�",a,"0"};
    	
    	String[] v11={"compost","��Ϸ���",n,"0"};
    	String[] v12={"compsure","��������",n,"0"};
    	String[] v13={"compound","������",n,"0"};
    	String[] v14={"comprehend","���;����",v,"0"};
    	String[] v15={"comprehensible","�ܳ������",a,"0"};
    	String[] v16={"comprehensive","ȫ���ۺϵ�",a,"0"};
    	String[] v17={"compress","ѹ����Ũ��",v,"0"};
    	String[] v18={"compromise","��Э;Σ��",v,"0"};
    	String[] v19={"compulsion","ǿ��;���Կ��ܵĳ嶯",n,"0"};
    	String[] v20={"compunction","���Ĳ������û�",n,"0"};
    	
    	String[] v21={"concatenate","����",v,"0"};
    	String[] v22={"concave","����",a,"0"};
    	String[] v23={"conceal","���أ�����",v,"0"};
    	String[] v24={"concede","���ϣ��ò�",v,"0"};
    	String[] v25={"conceit","�Ը�",n,"0"};
    	String[] v26={"conceive","���룬���󣬻���",v,"0"};
    	String[] v27={"concentrate","�ۼ���Ũ��",v,"0"};
    	String[] v28={"conception","����",n,"0"};
    	String[] v29={"concerto","Э����",n,"0"};
    	String[] v30={"concession","�ò�",n,"0"};
    	
    	String[] v31={"conciliate","������ѱ��",v,"0"};
    	String[] v32={"conciliatory","���͵ģ���ο��",a,"0"};
    	String[] v33={"concise","����",a,"0"};
    	String[] v34={"conclave","���ܻ���",n,"0"};
    	String[] v35={"conclusive","���ģ����۵�;ȷ���",a,"0"};
    	String[] v36={"concomitant","���������",a,"0"};
    	String[] v37={"concord","��Լ;����",n,"0"};
    	String[] v38={"concrete","������ڵ�;������",a+n,"0"};
    	String[] v39={"concur","�����ͬ��һ��",v,"0"};
    	String[] v40={"concussion","���𵴣�ǿ����",n,"0"};
    	
    	String[] v41={"condemn","����Ǵ������",v,"0"};
    	String[] v42={"condense","Ũ��",v,"0"};
    	String[] v43={"condescend","������������Խ��",v,"0"};
    	String[] v44={"condone","��ˡ",v,"0"};
    	String[] v45={"conducive","������...��",a,"0"};
    	String[] v46={"conduct","��Ϊ��Ʒ��",n,"0"};
    	String[] v47={"conduit","����;ˮ����ˮ��",n,"0"};
    	String[] v48={"cone","�ɹ�;Բ׶��",n,"0"};
    	String[] v49={"confection","��ʳ",n,"0"};
    	String[] v50={"confederacy","���ˣ�ͬ��",n,"0"};
     
           String[] v51={"confer","��̸������",v,"0"};
        	String[] v52={"conference","���ֻ�",n,"0"};
        	String[] v53={"confess","����",v,"0"};
        	String[] v54={"confide","��¶",v,"0"};
        	String[] v55={"confidence","����",n,"0"};
        	String[] v56={"confidential","���ܵ�",a,"0"};
        	String[] v57={"configuration","����",n,"0"};
        	String[] v58={"confine","���ƣ�����",v,"0"};
        	String[] v59={"confirm","֤ʵ",v,"0"};
        	String[] v60={"confiscate","û�գ��乫",v,"0"};
        	
        	String[] v61={"conflagration","�������ɭ����",n,"0"};
        	String[] v62={"conflate","�ϲ�",v,"0"};
        	String[] v63={"conflict","��������ͻ",v+n,"0"};
        	String[] v64={"conformist","��ͳ��",n,"0"};
        	String[] v65={"confound","ʹ�Ի�",v,"0"};
        	String[] v66={"confront","���٣��Կ�",v,"0"};
        	String[] v67={"congeal","���ᣬ����",v,"0"};
        	String[] v68={"congenial","������Ͷ�ģ�����õ�",a,"0"};
        	String[] v69={"congest","ʹӵ������Ѫ",v,"0"};
        	String[] v70={"conglomerate","����",v,"0"};
        	
        	String[] v71={"congregate","�ۼ�",v,"0"};
        	String[] v72={"congruent","ȫ�ȵģ�һ�µ�",a,"0"};
        	String[] v73={"congruous","ȫ�ȵģ�һ�µģ����ϵ�",a,"0"};
        	String[] v74={"conifer","��Ҷ��",n,"0"};
        	String[] v75={"conjecture","�ܲ�",v+n,"0"};
        	String[] v76={"conjoin","ʹ���",v,"0"};
        	String[] v77={"conjunction","���ϣ�����",n,"0"};
        	String[] v78={"conjure","�ٻ�������",v,"0"};
        	String[] v79={"connive","Ĭ�����ݣ���ı",v,"0"};
        	String[] v80={"connoisseur","���ͼң��м�",n,"0"};
        	
        	String[] v81={"connotation","����֮�⣬�ں�",n,"0"};
        	String[] v82={"conquer","����������",v,"0"};
        	String[] v83={"conquest","������ս��Ʒ",n,"0"};
        	String[] v84={"conscience","���ģ��ǷǸ�",n,"0"};
        	String[] v85={"conscientious","����ģ�С�Ľ�����",a,"0"};
        	String[] v86={"conscript","����",v,"0"};
        	String[] v87={"consensus","���һ��",n,"0"};
        	String[] v88={"consent","ͬ�⣬����",v,"0"};
        	String[] v89={"consequence","������������Ҫ�ԣ���ֵ",n,"0"};
        	String[] v90={"consequential","�����ģ�����Ϊ�ǵ�",a,"0"};
        	
        	String[] v91={"conservative","���صģ��ؾɵ�",a,"0"};
        	String[] v92={"conservatory","���ң�����ѧԺ",n,"0"};
        	String[] v93={"conserve","��ȫ������",v,"0"};
        	String[] v94={"considerable","�൱��ģ�ֵ�ÿ��ǵ�",a,"0"};
        	String[] v95={"consign","���ˣ��й�",v,"0"};
        	String[] v96={"consistent","ǰ��һ�µģ�������",a,"0"};
        	String[] v97={"console","��ο",v,"0"};
        	String[] v98={"consolidate","���̣��ϲ�",v,"0"};
        	String[] v99={"consolidation","���̣��ϲ�",n,"0"};
        	String[] v100={"consonant","����һ�µ�",a,"0"};
        	
        	String[] v101={"conspicuous","������",a,"0"};
        	String[] v102={"conspire","��ı����ı",v,"0"};
        	String[] v103={"constant","�ȶ������;����",a+n,"0"};
        	String[] v104={"constellation","��������Ⱥ",n,"0"};
        	String[] v105={"consternation","����",n,"0"};
        	String[] v106={"constituent","�ɷ֣�ѡ���ڵ�ѡ��",n,"0"};
        	String[] v107={"constitute","���ɣ���ɣ�����",v,"0"};
        	String[] v108={"constitution","�ܷ�;����",n,"0"};
        	String[] v109={"constitutional","�³̵ģ����ʵ�",a,"0"};
        	String[] v110={"constrain","������ǿ�ȣ�����",v,"0"};
        	String[] v111={"constraint","ǿ�ƣ�ǿ�ȣ��Ը����ѹ��",n,"0"};
        	String[] v112={"constrict","ѹ��������",v,"0"};
        	String[] v113={"construct","���죬����",v,"0"};
        	String[] v114={"construe","���ͣ�����",v,"0"};
        	String[] v115={"consul","����",n,"0"};
        	String[] v116={"consummate","��ȫ��;���",a+v,"0"};
        	String[] v117={"contact","�Ӵ�����ͨ��Ϣ",v,"0"};
        	String[] v118={"contagious","��Ⱦ��",a,"0"};
        	String[] v119={"contain","����;���ƣ���ֹ",v,"0"};
        	String[] v120={"containment","��ֹ",n,"0"};
        	String[] v121={"contaminate","��Ⱦ",v,"0"};
        	String[] v122={"contemplate","��˼",v,"0"};
        	String[] v123={"contempt","����",n+v,"0"};
        	String[] v124={"contemptible","�������ӵ�",a,"0"};
        	String[] v125={"contemptuous","���ӵ�",a,"0"};
        	String[] v126={"contend","���ᣬ��������������",v,"0"};
        	
        	subInitial(DBParameter.pos_wl_8,v1);
    		subInitial(DBParameter.pos_wl_8,v2);
    		subInitial(DBParameter.pos_wl_8,v3);
    		subInitial(DBParameter.pos_wl_8,v4);
    		subInitial(DBParameter.pos_wl_8,v5);
    		subInitial(DBParameter.pos_wl_8,v6);
    		subInitial(DBParameter.pos_wl_8,v7);
    		subInitial(DBParameter.pos_wl_8,v8);
    		subInitial(DBParameter.pos_wl_8,v9);
    		subInitial(DBParameter.pos_wl_8,v10);
    		subInitial(DBParameter.pos_wl_8,v11);
    		subInitial(DBParameter.pos_wl_8,v12);
    		subInitial(DBParameter.pos_wl_8,v13);
    		subInitial(DBParameter.pos_wl_8,v14);
    		subInitial(DBParameter.pos_wl_8,v15);
    		subInitial(DBParameter.pos_wl_8,v16);
    		subInitial(DBParameter.pos_wl_8,v17);
    		subInitial(DBParameter.pos_wl_8,v18);
    		subInitial(DBParameter.pos_wl_8,v19);
    		subInitial(DBParameter.pos_wl_8,v20);
    		subInitial(DBParameter.pos_wl_8,v21);
    		subInitial(DBParameter.pos_wl_8,v22);
    		subInitial(DBParameter.pos_wl_8,v23);
    		subInitial(DBParameter.pos_wl_8,v24);
    		subInitial(DBParameter.pos_wl_8,v25);
    		subInitial(DBParameter.pos_wl_8,v26);
    		subInitial(DBParameter.pos_wl_8,v27);
    		subInitial(DBParameter.pos_wl_8,v28);
    		subInitial(DBParameter.pos_wl_8,v29);
    		subInitial(DBParameter.pos_wl_8,v30);
    		subInitial(DBParameter.pos_wl_8,v31);
    		subInitial(DBParameter.pos_wl_8,v32);
    		subInitial(DBParameter.pos_wl_8,v33);
    		subInitial(DBParameter.pos_wl_8,v34);
    		subInitial(DBParameter.pos_wl_8,v35);
    		subInitial(DBParameter.pos_wl_8,v36);
    		subInitial(DBParameter.pos_wl_8,v37);
    		subInitial(DBParameter.pos_wl_8,v38);
    		subInitial(DBParameter.pos_wl_8,v39);
    		subInitial(DBParameter.pos_wl_8,v40);
    		subInitial(DBParameter.pos_wl_8,v41);
    		subInitial(DBParameter.pos_wl_8,v42);
    		subInitial(DBParameter.pos_wl_8,v43);
    		subInitial(DBParameter.pos_wl_8,v44);
    		subInitial(DBParameter.pos_wl_8,v45);
    		subInitial(DBParameter.pos_wl_8,v46);
    		subInitial(DBParameter.pos_wl_8,v47);
    		subInitial(DBParameter.pos_wl_8,v48);
    		subInitial(DBParameter.pos_wl_8,v49);
    		subInitial(DBParameter.pos_wl_8,v50);
    	
    	subInitial(DBParameter.pos_wl_8,v51);
    		subInitial(DBParameter.pos_wl_8,v52);
    		subInitial(DBParameter.pos_wl_8,v53);
    		subInitial(DBParameter.pos_wl_8,v54);
    		subInitial(DBParameter.pos_wl_8,v55);
    		subInitial(DBParameter.pos_wl_8,v56);
    		subInitial(DBParameter.pos_wl_8,v57);
    		subInitial(DBParameter.pos_wl_8,v58);
    		subInitial(DBParameter.pos_wl_8,v59);
    		subInitial(DBParameter.pos_wl_8,v60);
    		subInitial(DBParameter.pos_wl_8,v61);
    		subInitial(DBParameter.pos_wl_8,v62);
    		subInitial(DBParameter.pos_wl_8,v63);
    		subInitial(DBParameter.pos_wl_8,v64);
    		subInitial(DBParameter.pos_wl_8,v65);
    		subInitial(DBParameter.pos_wl_8,v66);
    		subInitial(DBParameter.pos_wl_8,v67);
    		subInitial(DBParameter.pos_wl_8,v68);
    		subInitial(DBParameter.pos_wl_8,v69);
    		subInitial(DBParameter.pos_wl_8,v70);
    		subInitial(DBParameter.pos_wl_8,v71);
    		subInitial(DBParameter.pos_wl_8,v72);
    		subInitial(DBParameter.pos_wl_8,v73);
    		subInitial(DBParameter.pos_wl_8,v74);
    		subInitial(DBParameter.pos_wl_8,v75);
    		subInitial(DBParameter.pos_wl_8,v76);
    		subInitial(DBParameter.pos_wl_8,v77);
    		subInitial(DBParameter.pos_wl_8,v78);
    		subInitial(DBParameter.pos_wl_8,v79);
    		subInitial(DBParameter.pos_wl_8,v80);
    		subInitial(DBParameter.pos_wl_8,v81);
    		subInitial(DBParameter.pos_wl_8,v82);
    		subInitial(DBParameter.pos_wl_8,v83);
    		subInitial(DBParameter.pos_wl_8,v84);
    		subInitial(DBParameter.pos_wl_8,v85);
    		subInitial(DBParameter.pos_wl_8,v86);
    		subInitial(DBParameter.pos_wl_8,v87);
    		subInitial(DBParameter.pos_wl_8,v88);
    		subInitial(DBParameter.pos_wl_8,v89);
    		subInitial(DBParameter.pos_wl_8,v90);
    		subInitial(DBParameter.pos_wl_8,v91);
    		subInitial(DBParameter.pos_wl_8,v92);
    		subInitial(DBParameter.pos_wl_8,v93);
    		subInitial(DBParameter.pos_wl_8,v94);
    		subInitial(DBParameter.pos_wl_8,v95);
    		subInitial(DBParameter.pos_wl_8,v96);
    		subInitial(DBParameter.pos_wl_8,v97);
    		subInitial(DBParameter.pos_wl_8,v98);
    		subInitial(DBParameter.pos_wl_8,v99);
    		subInitial(DBParameter.pos_wl_8,v100);
    		subInitial(DBParameter.pos_wl_8,v101);
    		subInitial(DBParameter.pos_wl_8,v102);
    		subInitial(DBParameter.pos_wl_8,v103);
    		subInitial(DBParameter.pos_wl_8,v104);
    		subInitial(DBParameter.pos_wl_8,v105);
    		subInitial(DBParameter.pos_wl_8,v106);
    		subInitial(DBParameter.pos_wl_8,v107);
    		subInitial(DBParameter.pos_wl_8,v108);
    		subInitial(DBParameter.pos_wl_8,v109);
    		subInitial(DBParameter.pos_wl_8,v110);
    		subInitial(DBParameter.pos_wl_8,v111);
    		subInitial(DBParameter.pos_wl_8,v112);
    		subInitial(DBParameter.pos_wl_8,v113);
    		subInitial(DBParameter.pos_wl_8,v114);
    		subInitial(DBParameter.pos_wl_8,v115);
    		subInitial(DBParameter.pos_wl_8,v116);
    		subInitial(DBParameter.pos_wl_8,v117);
    		subInitial(DBParameter.pos_wl_8,v118);
    	
    	subInitial(DBParameter.pos_wl_8,v119);
    		subInitial(DBParameter.pos_wl_8,v120);
    		subInitial(DBParameter.pos_wl_8,v121);
    		subInitial(DBParameter.pos_wl_8,v122);
    		subInitial(DBParameter.pos_wl_8,v123);
    		subInitial(DBParameter.pos_wl_8,v124);
    		subInitial(DBParameter.pos_wl_8,v125);
    		subInitial(DBParameter.pos_wl_8,v126);
    	
}

    public void doList_9(){
	 String[] v1={"content","�����;����;����",a+"/"+n+"/"+n,"0"};
		String[] v2={"contented","���������",a,"0"};
		String[] v3={"contention","����",n,"0"};
		String[] v4={"contentious","�ñ��",a,"0"};
		String[] v5={"contest","����;����",v,"0"};
		String[] v6={"context","������",n,"0"};
		String[] v7={"contigious","������,�ӽ���",a,"0"};
		String[] v8={"continent","���Ƶ�;��½",a+"/"+n,"0"};
		String[] v9={"contingent","�����;���������������",a,"0"};
		String[] v10={"contort","ʹŤ��;����",v,"0"};
		
		String[] v11={"contraband","Υ��Ʒ;��˽��",n,"0"};
		String[] v12={"contract","��ͬ;����ͬ;����",n+"/"+v+"/"+v,"0"};
		String[] v13={"contradict","����",v,"0"};
		String[] v14={"contrast","�Ա�",n+"/"+v,"0"};
		String[] v15={"contravene","Υ��",v,"0"};
		String[] v16={"contrite","�����",a,"0"};
		String[] v17={"contrive","�ƻ�,���",v,"0"};
		String[] v18={"contrived","����Ȼ��,������",a,"0"};
		String[] v19={"control","ʵ�������",n,"0"};
		String[] v20={"controversial","�����",a,"0"};
		
		String[] v21={"controvert","����",v,"0"};
		String[] v22={"contumacious","�����ӵ�",a,"0"};
		String[] v23={"conundrum","����,����",n,"0"};
		String[] v24={"convalesce","����",v,"0"};
		String[] v25={"convalescent","��������",n,"0"};
		String[] v26={"convenience","����",n,"0"};
		String[] v27={"conventional","��ͳ��",a,"0"};
		String[] v28={"converge","���,����",v,"0"};
		String[] v29={"convergent","��۵�",a,"0"};
		String[] v30={"conversant","��ͨ��",a,"0"};
		
		String[] v31={"converse","̸��;�����;�෴������",v+"/"+a+"/"+n,"0"};
		String[] v32={"convert","ʹ�ı�;�ı���������",v+"/"+n,"0"};
		String[] v33={"convertible","��ת����;����",a+"/"+n,"0"};
		String[] v34={"convey","����;���",v,"0"};
		String[] v35={"convict","����;�ﷸ",v+"/"+n,"0"};
		String[] v36={"conviction","����;����",n,"0"};
		String[] v37={"convince","ʹȷ��;˵��",v,"0"};
		String[] v38={"convivial","�񻶵�",a,"0"};
		String[] v39={"conviviality","����;�����Ը�",n,"0"};
		String[] v40={"convoke","�ټ�",v,"0"};
		
		String[] v41={"convoluted","���Ƶ�;�ѽ��",a,"0"};
		String[] v42={"convulse","ʹ��;ʹ��",v,"0"};
		String[] v43={"convulsion","ɧ��;����",n,"0"};
		String[] v44={"coop","����",n,"0"};
		String[] v45={"cooperate","�����˺���",v,"0"};
		String[] v46={"coordinate","ͬ����;����;ʹ������Э��;ͬ�ȵ�",n+"/"+n+"/"+v+"/"+a,"0"};
		String[] v47={"copious","�ḻ��;�����",a,"0"};
		String[] v48={"cord","����(�����λ);����",n,"0"};
		String[] v49={"core","����;��ȥ���Ĳ���",n+"/"+v,"0"};
		String[] v50={"cornucopia","�������յ����",n,"0"};
	 
	       String[] v51={"coronation","����",n,"0"};
	    	String[] v52={"corporate","�����;��ͬ��",a,"0"};
	    	String[] v53={"corporeal","�����;���ʵ�",a,"0"};
	    	String[] v54={"corpuscle","Ѫ��;ϸ��",n,"0"};
	    	String[] v55={"corral","����",n,"0"};
	    	String[] v56={"correspondent","���ϵ�;����",a+"/"+n,"0"};
	    	String[] v57={"corroborate","֧��;֤ʵ;ǿ��",v,"0"};
	    	String[] v58={"corrode","��ʴ;��ʴ",v,"0"};
	    	String[] v59={"corrosive","��ʴ��;ʴ����",a,"0"};
	    	String[] v60={"corrugate","��;����",v,"0"};
	    	
	    	String[] v61={"corrupt","������;��������",a,"0"};
	    	String[] v62={"cosmic","�����",a,"0"};
	    	String[] v63={"cosmopolitan","����������;�ĺ�Ϊ�ҵ���",n,"0"};
	    	String[] v64={"cosmopotitanism","������;��������",n,"0"};
	    	String[] v65={"cosmos","����",n,"0"};
	    	String[] v66={"cosset","�谮",v,"0"};
	    	String[] v67={"costume","��װ;��װ",n,"0"};
	    	String[] v68={"coterie","��ȤС��",n,"0"};
	    	String[] v69={"coterminous","������",a,"0"};
	    	String[] v70={"cougar","���ޱ�",n,"0"};
	    	
	    	String[] v71={"countenance","֧��;����;����",v+"/"+v+"/"+n,"0"};
	    	String[] v72={"counteract","����",v,"0"};
	    	String[] v73={"counterbalance","��ƽ������",v,"0"};
	    	String[] v74={"counterfeit","α��",v,"0"};
	    	String[] v75={"countermand","����;ȡ��",v,"0"};
	    	String[] v76={"counterpart","���Ӧ����(��)",n,"0"};
	    	String[] v77={"counterproductive","����ԸΥ��",a,"0"};
	    	String[] v78={"coup","������ɹ����ж�",n,"0"};
	    	String[] v79={"court","��ͥ;������;׷��",n+"/"+v+"/"+v,"0"};
	    	String[] v80={"covenant","��Լ;���鱣֤",n+"/"+v,"0"};
	    	
	    	String[] v81={"covert","���ܵ�",a,"0"};
	    	String[] v82={"covet","̰��;����",v,"0"};
	    	String[] v83={"cow","��в",v,"0"};
	    	String[] v84={"coward","��С��",n,"0"};
	    	String[] v85={"cower","����;η��",v,"0"};
	    	String[] v86={"coy","�����",a,"0"};
	    	String[] v87={"cozen","��ƭ",v,"0"};
	    	String[] v88={"crab","�з;��Թ",n+"/"+v,"0"};
	    	String[] v89={"crabbed","�����",a,"0"};
	    	String[] v90={"crack","������;�ѷ�;�ƽ�",n+"/"+n+"/"+v,"0"};
	    	
	    	String[] v91={"craft","��ҵ;����",n,"0"};
	    	String[] v92={"cram","����;�����;��ǰͻ��",v,"0"};
	    	String[] v93={"cramp","����;����",n+"/"+v,"0"};
	    	String[] v94={"cranky","���Թ���",a,"0"};
	    	String[] v95={"crass","�޶۵ģ��ֲڵ�",a,"0"};
	    	String[] v96={"crate","������",n,"0"};
	    	String[] v97={"crater","��ɽ��",n,"0"};
	    	String[] v98={"cravat","���",n,"0"};
	    	String[] v99={"craven","ų����",a,"0"};
	    	String[] v100={"craving","ǿ�ҵ�Ը��",n,"0"};
	    	
	    	String[] v101={"crayon","����;���ʻ�",n,"0"};
	    	String[] v102={"crease","�ۺ�",n,"0"};
	    	String[] v103={"credence","����",n,"0"};
	    	String[] v104={"credible","���ŵ�",a,"0"};
	    	String[] v105={"credit","�޹�;����;Ƭͷ��Ļ",n,"0"};
	    	String[] v106={"credulous","���ŵ�",a,"0"};
	    	String[] v107={"creek","СϪ",n,"0"};
	    	String[] v108={"creep","����ǰ��;�����ƶ�",v,"0"};
	    	String[] v109={"crescendo","��ǿ;�߳�",n,"0"};
	    	String[] v110={"crest","ɽ��;�˼�;���",n,"0"};
	    	String[] v111={"crestfallen","��ܵ�",a,"0"};
	    	String[] v112={"cringe","η��;����",v,"0"};
	    	String[] v113={"cringing","η���ģ����ĵ�",a,"0"};
	    	String[] v114={"criteria","���б�׼",a,"0"};
	    	String[] v115={"criterion","���б�׼���߶�",a,"0"};
	    	String[] v116={"critic","������",a,"0"};
	    	String[] v117={"critical","��ë����;�ؼ���;Σ����",a,"0"};
	    	String[] v118={"critique","�����Է���",n,"0"};
	    	String[] v119={"croak","������;��Թ",n+"/"+v,"0"};
	    	String[] v120={"crochet","����֯��",n,"0"};
	    	String[] v121={"crockery","����",n,"0"};
	    	String[] v122={"cronyism","����Ψ��;������ƫ̻",n,"0"};
	    	String[] v123={"crook","ʹ����;��״��",v+"/"+n,"0"};
	    	String[] v124={"cross","������",a,"0"};
	    	String[] v125={"crouch","����;�׷�",v,"0"};
	    	String[] v126={"crucial","�����Ե�",a,"0"};
	    	String[] v127={"crudity","�ֲ�;��Ӳ",n,"0"};
	    	String[] v128={"crumb","��м;���м",n,"0"};
	    	String[] v129={"crumble","Ū��",v,"0"};
	    	String[] v130={"crumple","Ū��",v,"0"};
	    	String[] v131={"crusade","���������ԭ��Ķ���",n,"0"};
	    	String[] v132={"crust","Ӳ�����Ƭ���ؿ�",n,"0"};
	    	String[] v133={"crutch","����;֧��",n+"/"+v,"0"};
	    	String[] v134={"crux","֢�����ڵĹؼ�",n,"0"};
	    	String[] v135={"cryptic","���ص�",a,"0"};
	    	String[] v136={"cub","����;�����޾������",n,"0"};
	    	String[] v137={"cubicle","С����",n,"0"};
	    	String[] v138={"cue","��ʾ;��ʾ",v+"/"+n,"0"};
	    	String[] v139={"cuisine","���",n,"0"};
	    	String[] v140={"culinary","������;�����",a,"0"};
	    	String[] v141={"culmination","����;���",n,"0"};
	    	String[] v142={"culpable","�����;Ӧ��Ǵ���",a,"0"};
	    	String[] v143={"cult","����;���",n,"0"};
	    	String[] v144={"cultivate","��ֲ���ֺ�",v,"0"};
	    	String[] v145={"cultivated","��ֲ�ģ���������",a,"0"};
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    			subInitial(DBParameter.pos_wl_9,v1);
			subInitial(DBParameter.pos_wl_9,v2);
			subInitial(DBParameter.pos_wl_9,v3);
			subInitial(DBParameter.pos_wl_9,v4);
			subInitial(DBParameter.pos_wl_9,v5);
			subInitial(DBParameter.pos_wl_9,v6);
			subInitial(DBParameter.pos_wl_9,v7);
			subInitial(DBParameter.pos_wl_9,v8);
			subInitial(DBParameter.pos_wl_9,v9);
			subInitial(DBParameter.pos_wl_9,v10);
			subInitial(DBParameter.pos_wl_9,v11);
			subInitial(DBParameter.pos_wl_9,v12);
			subInitial(DBParameter.pos_wl_9,v13);
			subInitial(DBParameter.pos_wl_9,v14);
			subInitial(DBParameter.pos_wl_9,v15);
			subInitial(DBParameter.pos_wl_9,v16);
			subInitial(DBParameter.pos_wl_9,v17);
			subInitial(DBParameter.pos_wl_9,v18);
			subInitial(DBParameter.pos_wl_9,v19);
			subInitial(DBParameter.pos_wl_9,v20);
			subInitial(DBParameter.pos_wl_9,v21);
			subInitial(DBParameter.pos_wl_9,v22);
			subInitial(DBParameter.pos_wl_9,v23);
			subInitial(DBParameter.pos_wl_9,v24);
			subInitial(DBParameter.pos_wl_9,v25);
			subInitial(DBParameter.pos_wl_9,v26);
			subInitial(DBParameter.pos_wl_9,v27);
			subInitial(DBParameter.pos_wl_9,v28);
			subInitial(DBParameter.pos_wl_9,v29);
			subInitial(DBParameter.pos_wl_9,v30);
			subInitial(DBParameter.pos_wl_9,v31);
			subInitial(DBParameter.pos_wl_9,v32);
			subInitial(DBParameter.pos_wl_9,v33);
			subInitial(DBParameter.pos_wl_9,v34);
			subInitial(DBParameter.pos_wl_9,v35);
			subInitial(DBParameter.pos_wl_9,v36);
			subInitial(DBParameter.pos_wl_9,v37);
			subInitial(DBParameter.pos_wl_9,v38);
			subInitial(DBParameter.pos_wl_9,v39);
			subInitial(DBParameter.pos_wl_9,v40);
			subInitial(DBParameter.pos_wl_9,v41);
			subInitial(DBParameter.pos_wl_9,v42);
			subInitial(DBParameter.pos_wl_9,v43);
			subInitial(DBParameter.pos_wl_9,v44);
			subInitial(DBParameter.pos_wl_9,v45);
			subInitial(DBParameter.pos_wl_9,v46);
			subInitial(DBParameter.pos_wl_9,v47);
			subInitial(DBParameter.pos_wl_9,v48);
			subInitial(DBParameter.pos_wl_9,v49);
			subInitial(DBParameter.pos_wl_9,v50);
			
			subInitial(DBParameter.pos_wl_9,v51);
			subInitial(DBParameter.pos_wl_9,v52);
			subInitial(DBParameter.pos_wl_9,v53);
			subInitial(DBParameter.pos_wl_9,v54);
			subInitial(DBParameter.pos_wl_9,v55);
			subInitial(DBParameter.pos_wl_9,v56);
			subInitial(DBParameter.pos_wl_9,v57);
			subInitial(DBParameter.pos_wl_9,v58);
			subInitial(DBParameter.pos_wl_9,v59);
			subInitial(DBParameter.pos_wl_9,v60);
			subInitial(DBParameter.pos_wl_9,v61);
			subInitial(DBParameter.pos_wl_9,v62);
			subInitial(DBParameter.pos_wl_9,v63);
			subInitial(DBParameter.pos_wl_9,v64);
			subInitial(DBParameter.pos_wl_9,v65);
			subInitial(DBParameter.pos_wl_9,v66);
			subInitial(DBParameter.pos_wl_9,v67);
			subInitial(DBParameter.pos_wl_9,v68);
			subInitial(DBParameter.pos_wl_9,v69);
			subInitial(DBParameter.pos_wl_9,v70);
			subInitial(DBParameter.pos_wl_9,v71);
			subInitial(DBParameter.pos_wl_9,v72);
			subInitial(DBParameter.pos_wl_9,v73);
			subInitial(DBParameter.pos_wl_9,v74);
			subInitial(DBParameter.pos_wl_9,v75);
			subInitial(DBParameter.pos_wl_9,v76);
			subInitial(DBParameter.pos_wl_9,v77);
			subInitial(DBParameter.pos_wl_9,v78);
			subInitial(DBParameter.pos_wl_9,v79);
			subInitial(DBParameter.pos_wl_9,v80);
			subInitial(DBParameter.pos_wl_9,v81);
			subInitial(DBParameter.pos_wl_9,v82);
			subInitial(DBParameter.pos_wl_9,v83);
			subInitial(DBParameter.pos_wl_9,v84);
			subInitial(DBParameter.pos_wl_9,v85);
			subInitial(DBParameter.pos_wl_9,v86);
			subInitial(DBParameter.pos_wl_9,v87);
			subInitial(DBParameter.pos_wl_9,v88);
			subInitial(DBParameter.pos_wl_9,v89);
			subInitial(DBParameter.pos_wl_9,v90);
			subInitial(DBParameter.pos_wl_9,v91);
			subInitial(DBParameter.pos_wl_9,v92);
			subInitial(DBParameter.pos_wl_9,v93);
			subInitial(DBParameter.pos_wl_9,v94);
			subInitial(DBParameter.pos_wl_9,v95);
			subInitial(DBParameter.pos_wl_9,v96);
			subInitial(DBParameter.pos_wl_9,v97);
			subInitial(DBParameter.pos_wl_9,v98);
			subInitial(DBParameter.pos_wl_9,v99);
			subInitial(DBParameter.pos_wl_9,v100);
			subInitial(DBParameter.pos_wl_9,v101);
			subInitial(DBParameter.pos_wl_9,v102);
			subInitial(DBParameter.pos_wl_9,v103);
			subInitial(DBParameter.pos_wl_9,v104);
			subInitial(DBParameter.pos_wl_9,v105);
			subInitial(DBParameter.pos_wl_9,v106);
			subInitial(DBParameter.pos_wl_9,v107);
			subInitial(DBParameter.pos_wl_9,v108);
			subInitial(DBParameter.pos_wl_9,v109);
			subInitial(DBParameter.pos_wl_9,v110);
			subInitial(DBParameter.pos_wl_9,v111);
			subInitial(DBParameter.pos_wl_9,v112);
			subInitial(DBParameter.pos_wl_9,v113);
			subInitial(DBParameter.pos_wl_9,v114);
			subInitial(DBParameter.pos_wl_9,v115);
			subInitial(DBParameter.pos_wl_9,v116);
			subInitial(DBParameter.pos_wl_9,v117);
			subInitial(DBParameter.pos_wl_9,v118);
			subInitial(DBParameter.pos_wl_9,v119);
			subInitial(DBParameter.pos_wl_9,v120);
			subInitial(DBParameter.pos_wl_9,v121);
			subInitial(DBParameter.pos_wl_9,v122);
			subInitial(DBParameter.pos_wl_9,v123);
			subInitial(DBParameter.pos_wl_9,v124);
			subInitial(DBParameter.pos_wl_9,v125);
			subInitial(DBParameter.pos_wl_9,v126);
			subInitial(DBParameter.pos_wl_9,v127);
			subInitial(DBParameter.pos_wl_9,v128);
			subInitial(DBParameter.pos_wl_9,v129);
			subInitial(DBParameter.pos_wl_9,v130);
			subInitial(DBParameter.pos_wl_9,v131);
			subInitial(DBParameter.pos_wl_9,v132);
			subInitial(DBParameter.pos_wl_9,v133);
			subInitial(DBParameter.pos_wl_9,v134);
			subInitial(DBParameter.pos_wl_9,v135);
			subInitial(DBParameter.pos_wl_9,v136);
			subInitial(DBParameter.pos_wl_9,v137);
			subInitial(DBParameter.pos_wl_9,v138);
			subInitial(DBParameter.pos_wl_9,v139);
			subInitial(DBParameter.pos_wl_9,v140);
			subInitial(DBParameter.pos_wl_9,v141);
			subInitial(DBParameter.pos_wl_9,v142);
			subInitial(DBParameter.pos_wl_9,v143);
			subInitial(DBParameter.pos_wl_9,v144);
			subInitial(DBParameter.pos_wl_9,v145);

}

    public void doList_10(){
    	String[] v1={"cumbersome","���ص�","adj.","0"};
        String[] v2={"cumulus","����","n.","0"};
        String[] v3={"cunning","����ƭ�˵ģ���թ��Ϊ",a+n,"0"};
        String[] v4={"cupidity","̰��","n.","0"};
        String[] v5={"curator","������ݵȣ��ݳ�","n.","0"};
        String[] v6={"curb","·Ե�����ֵ��ģ����ʯ�����գ�����",n+v,"0"};
        String[] v7={"curdle","ʹ���ᣬ���","v.","0"};
        String[] v8={"curmudgeon","Ƣ������֮��","n.","0"};
        String[] v9={"curriculum","��ȫ���ģ��γ�","n.","0"};

        String[] v10={"cursory","���Եģ����ʵ�","adj.","0"};
        String[] v11={"curt","�����С���Ϊ�����Զ����ʵ�","adj.","0"};
        String[] v12={"curtail","����������","v.","0"};
        String[] v13={"cushion","����","n.","0"};
        String[] v14={"custodian","����Ա���໤��","n.","0"};
        String[] v15={"custody","��ܣ�����","n.","0"};
        String[] v16={"customary","�Ϻ�ϰ�׵�","adj.","0"};
        String[] v17={"cuticle","��Ƥ","n.","0"};
        String[] v18={"cutlery","�������桢�׵ȣ��;�","n.","0"};
        String[] v19={"cyclical","ѭ����","adj.","0"};
        String[] v20={"cyclone","������쫷�","n.","0"};

        String[] v21={"cylinder","Բ��","n.","0"};
        String[] v22={"cynic","Ȯ������ģ�����������","n.","0"};
        String[] v23={"cypress","����","n.","0"};
        String[] v24={"cytology","[��]ϸ��ѧ","n.","0"};
        String[] v25={"dabble","���㣬ǳ��","v.","0"};
        String[] v26={"daft","ɵ��","adj.","0"};
        String[] v27={"dagger","�̽���ذ��","n.","0"};
        String[] v28={"daguerreotype","�����ڣ�������Ƭ","n.","0"};
        String[] v29={"dainty","���ٶ���ζ��ʳ��","n.","0"};
        String[] v30={"dally","�е�����Ϸ","v.","0"};
        String[] v31={"damp","���������ƣ���ʪ��",v+a,"0"};
        String[] v32={"damped","����ģ�ѹ�ͣ���������","adj.","0"};
        String[] v33={"dampen","��ʹ����ʪ��ʹ��ɥ������ˮ","v.","0"};
        String[] v34={"dandy","�������ӣ��ô�����","n.","0"};

        String[] v35={"dapper","����Ư����","adj.","0"};
        String[] v36={"dappled","�аߵ�ģ��߲���","adj.","0"};
        String[] v37={"daredevil","����ģ��ˣ���ðʧ�ģ��ˣ�","adj./n.","0"};
        String[] v38={"dart","����","n.","0"};
        String[] v39={"daunt","ʹ���ӣ�ʹη��","v.","0"};
        String[] v40={"dawdle","�е������","v.","0"};
        String[] v41={"deaden","����ĳ���������ǿ��","v.","0"};
        String[] v42={"deadlock","��ֲ��£�����","n.","0"};
        String[] v43={"deadpan","�ޱ���ģ�����","adj./n.","0"};
        String[] v44={"dealing","������Ϊ������","n.","0"};
        String[] v45={"dearth","ȱ������ȱ","n.","0"};
        String[] v46={"debacle","�ⶳ","n.","0"};

        String[] v47={"debark","�´����·ɻ����³���ж��","v.","0"};
        String[] v48={"debase","��ͣ�����","v.","0"};
        String[] v49={"debate","��ʽ�ı��ۣ�����","n.","0"};
        String[] v50={"debilitate","ʹ˥��","v.","0"};
        String[] v51={"debouch","����������","v.","0"};
        String[] v52={"debrief","��...ѯ���������ȡ�㱨","v.","0"};
        String[] v53={"debris","���棬�к�","n.","0"};
        String[] v54={"debunk","�Ҵ����࣬��¶","v.","0"};
        String[] v55={"debut","���ε�̨������¶��","n.","0"};
        String[] v56={"decadence","˥�䣬�Ƿ�","n.","0"};
        String[] v57={"deveit","��ƭ����թ","n.","0"};
        String[] v58={"decency","���ɣ���ׯ","n.","0"};
        String[] v59={"deception","��ƭ�ֶ�","n.","0"};

        String[] v60={"decible","�ֱ�","n.","0"};
        String[] v61={"deciduous","���þɵģ����ݵģ�����ģ�ÿ����Ҷ��","adj.","0"};
        String[] v62={"decimate","�ٵ��󲿷֣�����ɱ��","v.","0"};
        String[] v63={"decipher","�⿪","v.","0"};
        String[] v64={"declaim","��̸����","v.","0"};
        String[] v65={"declamation","�۱磬�ߵ�","n.","0"};
        String[] v66={"decline","�ܾ�����������С������",v+n,"0"};
        String[] v67={"decode","��⣨���룩","v.","0"};
        String[] v68={"decompose","��ʹ������","v.","0"};
        String[] v69={"decomposition","�ֽ⣬���ã�����","n.","0"};
        String[] v70={"decorate","װ��ĳ����","v.","0"};
        String[] v71={"decorum","��ڣ���ò","n.","0"};
        String[] v72={"decrepit","˥�ϵģ��ƾɵ�","adj.","0"};

        String[] v73={"decry","���ѣ���ͣ���ֵ��","v.","0"};
        String[] v74={"dedication","��ĳ��ҵ��Ŀ�ĵ��ҳ�","n.","0"};
        String[] v75={"deduce","����ƶ�","v.","0"};
        String[] v76={"deduct","��ȥ���۳�","v.","0"};
        String[] v77={"deductive","����ģ������","adj.","0"};
        String[] v78={"deed","��Ϊ�������ػ�����ģ�ת����Լ��֤��","n.","0"};
        String[] v79={"deface","��","v.","0"};
        String[] v80={"default","��ծ��δ�������ε�","n.","0"};
        String[] v81={"defeatist","ʧ��������","n.","0"};
        String[] v82={"defect","ȱ�㣬覴ã���ڣ��ѵ�",n+v,"0"};
        String[] v83={"defendant","����","n.","0"};
        String[] v84={"defense","����������","n.","0"};
        String[] v85={"defer","���ӣ�����","v.","0"};
        String[] v86={"deference","���أ�����","n.","0"};
        String[] v87={"deferential","˳�ӵģ���˳��","adj.","0"};

        String[] v88={"defiance","��ս��Υ��������","n.","0"};
        String[] v89={"deficiency","ȱ�ݣ�����","n.","0"};
        String[] v90={"deficit","���㣻����","n.","0"};
        String[] v91={"defile","Ū�ۣ�Ū�ࣻ��ɽ�䣩С��",v+n,"0"};
        String[] v92={"definitive","��ȷ�ģ���Ȩ���ģ����յ�","adj.","0"};
        String[] v93={"deflated","����ɥ����","adj.","0"};
        String[] v94={"deflect","ƫ�룬ת��","v.","0"};
        String[] v95={"defoliator","��Ҷ��","n.","0"};
        String[] v96={"defraud","��ƭĳ�˵�","v.","0"};
        String[] v97={"deft","���ɵģ�������","adj.","0"};

        String[] v98={"defuse","�ӣ�����װ�ã���ж�����ţ����ͽ���״̬��Σ������","v.","0"};
        String[] v99={"defy","Υ��������","v.","0"};
        String[] v100={"degradation","������ݣ�����","n.","0"};
        String[] v101={"dehydrate","��ȥˮ�֣���ˮ","v.","0"};
        String[] v102={"deify","��Ϊ�񣻳��","v.","0"};
        String[] v103={"deign","���𣻻��ʣ���ĳ�£�","v.","0"};
        String[] v104={"dejected","��ɥ�ģ�ʧ����","adj.","0"};
        String[] v105={"delectable","������Ŀ��","adj.","0"};
        String[] v106={"delegate","����ί��...Ϊ������Ȩ",n+v,"0"};
        String[] v107={"deleterious","�������ģ��к��ģ��ж���","adj.","0"};

        String[] v108={"deliberate","��˼���ǵģ�����ģ����ؿ��ǵ�",a+v,"0"};
        String[] v109={"delicacy","ϸ�ۣ����£�����","n.","0"};
        String[] v110={"delicate","���۵ģ����µģ�������","adj.","0"};
        String[] v111={"delimit","���磬����","v.","0"};
        String[] v112={"delineate","�軭","v.","0"};
        String[] v113={"delinquency","ʧְ����ʧ","n.","0"};
        String[] v114={"delinquent","���ְ���","adj.","0"};
        String[] v115={"delirious","������ҵ�","adj.","0"};
        String[] v116={"delirium","�������","n.","0"};
        String[] v117={"delta","������","n.","0"};
        String[] v118={"delude","��ƭ����ƭ","v.","0"};
        String[] v119={"deluge","���ˮ������","n.","0"};

        String[] v120={"delusion","��ƭ������","n.","0"};
        String[] v121={"delve","�����о�������","v.","0"};
        String[] v122={"demagogue","�ƻ����ĵ�����","n.","0"};
        String[] v123={"demand","Ҫ�󣬿���","v.","0"};
        String[] v124={"demean","���֣�����","v.","0"};
        String[] v125={"demise","�������Ʋ�ת��","n.","0"};
        String[] v126={"demography","�˿�ͳ�ƣ��˿�ѧ","n.","0"};
        String[] v127={"demolish","�ƻ������","v.","0"};
        String[] v128={"demolition","�ƻ����ٻ�","n.","0"};
        String[] v129={"demonstrate","֤������֤��ʾ��","v.","0"};
        String[] v130={"demonstrative","֤���Ե�;ϲŭ����ɫ��","adj.","0"};
        String[] v131={"demoralize","ʹʿ������","v.","0"};
        String[] v132={"demote","��������ְ","v.","0"};

        String[] v133={"demotic","���ڵģ�ͨ�׵�","adj.","0"};
        String[] v134={"demur","��ʾ���飬����","v.","0"};
        String[] v135={"demystify","Ū���","v.","0"};
        String[] v136={"den","��Ѩ����","n.","0"};
        String[] v137={"denigrate","����̰�","v.","0"};
        String[] v138={"denizen","�����⼮����","n.","0"};
        String[] v139={"denomination","�����������ȡ���ֵ�ģ���λ","n.","0"};
        String[] v140={"denote","��ʾ��ָʾ����","v.","0"};
        String[] v141={"denouement","��С˵�ģ���β�����","n.","0"};
        String[] v142={"denounce","ָ��","v.","0"};
        
        
        
        
        
        
        
        subInitial(DBParameter.pos_wl_10,v1);
		subInitial(DBParameter.pos_wl_10,v2);
		subInitial(DBParameter.pos_wl_10,v3);
		subInitial(DBParameter.pos_wl_10,v4);
		subInitial(DBParameter.pos_wl_10,v5);
		subInitial(DBParameter.pos_wl_10,v6);
		subInitial(DBParameter.pos_wl_10,v7);
		subInitial(DBParameter.pos_wl_10,v8);
		subInitial(DBParameter.pos_wl_10,v9);
		subInitial(DBParameter.pos_wl_10,v10);
		subInitial(DBParameter.pos_wl_10,v11);
		subInitial(DBParameter.pos_wl_10,v12);
		subInitial(DBParameter.pos_wl_10,v13);
		subInitial(DBParameter.pos_wl_10,v14);
		subInitial(DBParameter.pos_wl_10,v15);
		subInitial(DBParameter.pos_wl_10,v16);
		subInitial(DBParameter.pos_wl_10,v17);
		subInitial(DBParameter.pos_wl_10,v18);
		subInitial(DBParameter.pos_wl_10,v19);
		subInitial(DBParameter.pos_wl_10,v20);
		subInitial(DBParameter.pos_wl_10,v21);
		subInitial(DBParameter.pos_wl_10,v22);
		subInitial(DBParameter.pos_wl_10,v23);
		subInitial(DBParameter.pos_wl_10,v24);
		subInitial(DBParameter.pos_wl_10,v25);
		subInitial(DBParameter.pos_wl_10,v26);
		subInitial(DBParameter.pos_wl_10,v27);
		subInitial(DBParameter.pos_wl_10,v28);
		subInitial(DBParameter.pos_wl_10,v29);
		subInitial(DBParameter.pos_wl_10,v30);
		subInitial(DBParameter.pos_wl_10,v31);
		subInitial(DBParameter.pos_wl_10,v32);
		subInitial(DBParameter.pos_wl_10,v33);
		subInitial(DBParameter.pos_wl_10,v34);
		subInitial(DBParameter.pos_wl_10,v35);
		subInitial(DBParameter.pos_wl_10,v36);
		subInitial(DBParameter.pos_wl_10,v37);
		subInitial(DBParameter.pos_wl_10,v38);
		subInitial(DBParameter.pos_wl_10,v39);
		subInitial(DBParameter.pos_wl_10,v40);
		subInitial(DBParameter.pos_wl_10,v41);
		subInitial(DBParameter.pos_wl_10,v42);
		subInitial(DBParameter.pos_wl_10,v43);
		subInitial(DBParameter.pos_wl_10,v44);
		subInitial(DBParameter.pos_wl_10,v45);
		subInitial(DBParameter.pos_wl_10,v46);
		subInitial(DBParameter.pos_wl_10,v47);
		subInitial(DBParameter.pos_wl_10,v48);
		subInitial(DBParameter.pos_wl_10,v49);
		subInitial(DBParameter.pos_wl_10,v50);
		
		subInitial(DBParameter.pos_wl_10,v51);
		subInitial(DBParameter.pos_wl_10,v52);
		subInitial(DBParameter.pos_wl_10,v53);
		subInitial(DBParameter.pos_wl_10,v54);
		subInitial(DBParameter.pos_wl_10,v55);
		subInitial(DBParameter.pos_wl_10,v56);
		subInitial(DBParameter.pos_wl_10,v57);
		subInitial(DBParameter.pos_wl_10,v58);
		subInitial(DBParameter.pos_wl_10,v59);
		subInitial(DBParameter.pos_wl_10,v60);
		subInitial(DBParameter.pos_wl_10,v61);
		subInitial(DBParameter.pos_wl_10,v62);
		subInitial(DBParameter.pos_wl_10,v63);
		subInitial(DBParameter.pos_wl_10,v64);
		subInitial(DBParameter.pos_wl_10,v65);
		subInitial(DBParameter.pos_wl_10,v66);
		subInitial(DBParameter.pos_wl_10,v67);
		subInitial(DBParameter.pos_wl_10,v68);
		subInitial(DBParameter.pos_wl_10,v69);
		subInitial(DBParameter.pos_wl_10,v70);
		subInitial(DBParameter.pos_wl_10,v71);
		subInitial(DBParameter.pos_wl_10,v72);
		subInitial(DBParameter.pos_wl_10,v73);
		subInitial(DBParameter.pos_wl_10,v74);
		subInitial(DBParameter.pos_wl_10,v75);
		subInitial(DBParameter.pos_wl_10,v76);
		subInitial(DBParameter.pos_wl_10,v77);
		subInitial(DBParameter.pos_wl_10,v78);
		subInitial(DBParameter.pos_wl_10,v79);
		subInitial(DBParameter.pos_wl_10,v80);
		subInitial(DBParameter.pos_wl_10,v81);
		subInitial(DBParameter.pos_wl_10,v82);
		subInitial(DBParameter.pos_wl_10,v83);
		subInitial(DBParameter.pos_wl_10,v84);
		subInitial(DBParameter.pos_wl_10,v85);
		subInitial(DBParameter.pos_wl_10,v86);
		subInitial(DBParameter.pos_wl_10,v87);
		subInitial(DBParameter.pos_wl_10,v88);
		subInitial(DBParameter.pos_wl_10,v89);
		subInitial(DBParameter.pos_wl_10,v90);
		subInitial(DBParameter.pos_wl_10,v91);
		subInitial(DBParameter.pos_wl_10,v92);
		subInitial(DBParameter.pos_wl_10,v93);
		subInitial(DBParameter.pos_wl_10,v94);
		subInitial(DBParameter.pos_wl_10,v95);
		subInitial(DBParameter.pos_wl_10,v96);
		subInitial(DBParameter.pos_wl_10,v97);
		subInitial(DBParameter.pos_wl_10,v98);
		subInitial(DBParameter.pos_wl_10,v99);
		subInitial(DBParameter.pos_wl_10,v100);
		subInitial(DBParameter.pos_wl_10,v101);
		subInitial(DBParameter.pos_wl_10,v102);
		subInitial(DBParameter.pos_wl_10,v103);
		subInitial(DBParameter.pos_wl_10,v104);
		subInitial(DBParameter.pos_wl_10,v105);
		subInitial(DBParameter.pos_wl_10,v106);
		subInitial(DBParameter.pos_wl_10,v107);
		subInitial(DBParameter.pos_wl_10,v108);
		subInitial(DBParameter.pos_wl_10,v109);
		subInitial(DBParameter.pos_wl_10,v110);
		subInitial(DBParameter.pos_wl_10,v111);
		subInitial(DBParameter.pos_wl_10,v112);
		subInitial(DBParameter.pos_wl_10,v113);
		subInitial(DBParameter.pos_wl_10,v114);
		subInitial(DBParameter.pos_wl_10,v115);
		subInitial(DBParameter.pos_wl_10,v116);
		subInitial(DBParameter.pos_wl_10,v117);
		subInitial(DBParameter.pos_wl_10,v118);
		
		subInitial(DBParameter.pos_wl_10,v119);
		subInitial(DBParameter.pos_wl_10,v120);
		subInitial(DBParameter.pos_wl_10,v121);
		subInitial(DBParameter.pos_wl_10,v122);
		subInitial(DBParameter.pos_wl_10,v123);
		subInitial(DBParameter.pos_wl_10,v124);
		subInitial(DBParameter.pos_wl_10,v125);
		subInitial(DBParameter.pos_wl_10,v126);
		subInitial(DBParameter.pos_wl_10,v127);
		subInitial(DBParameter.pos_wl_10,v128);
		subInitial(DBParameter.pos_wl_10,v129);
		subInitial(DBParameter.pos_wl_10,v130);
		subInitial(DBParameter.pos_wl_10,v131);
		subInitial(DBParameter.pos_wl_10,v132);
		subInitial(DBParameter.pos_wl_10,v133);
		subInitial(DBParameter.pos_wl_10,v134);
		subInitial(DBParameter.pos_wl_10,v135);
		subInitial(DBParameter.pos_wl_10,v136);
		subInitial(DBParameter.pos_wl_10,v137);
		subInitial(DBParameter.pos_wl_10,v138);
		subInitial(DBParameter.pos_wl_10,v139);
		subInitial(DBParameter.pos_wl_10,v140);
		subInitial(DBParameter.pos_wl_10,v141);
		subInitial(DBParameter.pos_wl_10,v142);
		
    }
    public void doList_11(){
	
}
    public void doList_12(){
	
}
    public void doList_13(){
	
}
    public void doList_14(){
	
}
    public void doList_15(){
	
}
    public void doList_16(){
	
}
    public void doList_17(){
	
}
    public void doList_18(){
	
}
    public void doList_19(){
	
}
    public void doList_20(){
	
}
    
    
    
    public void doList_21(){
        String[] v1={"instrumentalist","����������",n,"0"};
    	String[] v2={"insular","������խ��",a,"0"};
    	String[] v3={"insularity","����״̬��������״����ƫ��",n,"0"};
    	String[] v4={"insulate","ʹ������ʹ��Ե",v,"0"};
    	String[] v5={"insulin","�ȵ���",n,"0"};
    	String[] v6={"insurgent","���ҵģ����µģ����ҷ���",a+n,"0"};
    	String[] v7={"insurrection","�췴",n,"0"};
    	String[] v8={"intact","�����ģ�û������",a,"0"};
    	String[] v9={"intangible","���ɴ�����",a,"0"};
    	String[] v10={"integral","�����ģ����������������",a,"0"};
    	String[] v11={"integrate","����",v,"0"};
    	String[] v12={"integrity","��ʵ����ֱ������",n,"0"};
    	String[] v13={"intellect","������˼ά����",n,"0"};
    	String[] v14={"intellectual","�����ģ�֪ʶ����",a+n,"0"};
    	String[] v15={"intelligible","���˽�ģ�������",a,"0"};
    	String[] v16={"intensify","�Ӿ�",v,"0"};
    	String[] v17={"intent","ר�ĵģ�Ŀ��",a+n,"0"};
    	String[] v18={"intentional","���ĵģ������",a,"0"};
    	String[] v19={"inter","����",v,"0"};
    	String[] v20={"interaction","�໥����",n,"0"};
    	String[] v21={"intercede","˵�û�����Ϊ����",v,"0"};
    	String[] v22={"intercept","����",v,"0"};
    	String[] v23={"intercessor","�ٲ���",n,"0"};
    	String[] v24={"interchangeable","�ɻ�����",a,"0"};
    	String[] v25={"interdict","��ֹ���ж�",v,"0"};
    	String[] v26={"interference","����",n,"0"};
    	String[] v27={"interim","�м䡢����ʱ��",n,"0"};
    	String[] v28={"interjection","�������̾��",n,"0"};
    	String[] v29={"interlock","����",v,"0"};
    	String[] v30={"interlooking","������",a,"0"};
    	String[] v31={"interlude","��ʱ��Ϣ",n,"0"};
    	String[] v32={"intermediary","�ٲ��ߣ��м���м�ģ�ý���",n+a,"0"};
    	String[] v33={"interminable","�޾�ͷ��",a,"0"};
    	String[] v34={"intermingle","���",v,"0"};
    	String[] v35={"intermission","��ͣ",n,"0"};
    	String[] v36={"intermittent","�϶�������",a,"0"};
    	String[] v37={"intern","�н��������ʵϰ��",v+n,"0"};
    	String[] v38={"internecine","��ڧ�ģ����ܾ��˵�",a,"0"};
    	String[] v39={"interplay","�໥Ӱ��",v+n,"0"};
    	String[] v40={"interpolate","���룬�۸�",v,"0"};
    	String[] v41={"interpose","����...֮��",v,"0"};
    	String[] v42={"interregnum","����ʱ��",n,"0"};
    	String[] v43={"interrogate","���ʣ���Ѷ",v,"0"};
    	String[] v44={"interrupt","��ʱ��ֹ����ϣ�����",v,"0"};
    	String[] v45={"intersect","��أ����",v,"0"};
    	String[] v46={"intersperse","ɢ������׺",v,"0"};
    	String[] v47={"interwine","����",v,"0"};
    	String[] v48={"intervene","���棬����",v,"0"};
    	String[] v49={"intimate","���ܵģ�����",a+n,"0"};
    	String[] v50={"intimidate","���ţ�в��",v,"0"};
    	String[] v51={"intoxicate","ʹ����ʹ��ϲ��ʹ����",v,"0"};
        String[] v52={"intractable","��ǿ�ģ��ѹܵ�",a,"0"};
        String[] v53={"intransigent","����Э��",a,"0"};
        String[] v54={"intrepid","��η�ģ������",a,"0"};
        String[] v55={"intricacy","���۸���",n,"0"};
        String[] v56={"intricate","���ӵ�",a,"0"};
        String[] v57={"intrigue","��ı�����𼫴���Ȥ",v,"0"};
        String[] v58={"introspective","��ʡ��",a,"0"};
        String[] v59={"intrude","��...ǿ���ڣ�����",v,"0"};
        String[] v60={"intuition","ֱ������ֱ����ȡ��֪ʶ",n,"0"};		
    	String[] v61={"intuitive","ֱ����",a,"0"};
        String[] v62={"inundate","��û������",v,"0"};
       	String[] v63={"inured","ϰ�ߵ�",a,"0"};
       	String[] v64={"invade","�ַ�������",v,"0"};
       	String[] v65={"invective","���������ʹ��",n,"0"};
       	String[] v66={"inveigh","ʹ����",v,"0"};
        String[] v67={"inveigle","��ƭ����ʹ",v,"0"};
        String[] v68={"inventory","��ϸĿ¼������嵥",n,"0"};
        String[] v69={"inverse","�෴�ģ���ת��",a,"0"};
        String[] v70={"invert","���µ���",v,"0"};
    	String[] v71={"invertebrate","�޼�׵��(����)",a+n,"0"};
        String[] v72={"investigate","����",v,"0"};
       	String[] v73={"inveterate","��ϰ�����",a,"0"};
       	String[] v74={"invidious","���˼��ʡ����еģ������˺�����޵�",a,"0"};
       	String[] v75={"invigorate","���裬����",v,"0"};
        String[] v76={"invigorating","ʹ���о���ģ�ʹ�˽�׳��",a,"0"};
        String[] v77={"inviolable","�����ַ��ģ��������µ�",a,"0"};
        String[] v78={"invoke","���󣬿���(����)��Ч",v,"0"};
        String[] v79={"involuntary","�����",a,"0"};
        String[] v80={"invulnerable","�޷��˺���",a,"0"};
    	String[] v81={"iodine","�⣬���",n,"0"};
        String[] v82={"iota","��С������С",n,"0"};
        String[] v83={"irascible","��ŭ��",a,"0"};
        String[] v84={"irate","��ŭ��",a,"0"};
        String[] v85={"ire","��ŭ����ŭ",v,"0"};
        String[] v86={"iridescent","���ʹ��",a,"0"};
        String[] v87={"irk","ʹ����",v,"0"};
        String[] v88={"irksome","���˲�ˬ��",a,"0"};
        String[] v89={"ironclad","װ���׵�",a,"0"};
        String[] v90={"ironic","�ڿ�ģ��������ϵ�",a,"0"};
        String[] v91={"irony","�������������ϵ������״��",n,"0"};
        String[] v92={"irradicable","���ܸ�����",a,"0"};
        String[] v93={"irreconcilable","����Э���ģ�ì�ܵ�",a,"0"};
        String[] v94={"irredeemable","�޷���ص�",a,"0"};
        String[] v95={"irreducible","(��)����Լ��",a,"0"};
        String[] v96={"irremediable","�޷�������",a,"0"};
        String[] v97={"irrepressible","�޷�Լ������ֹ��",a,"0"};
        String[] v98={"irrevocable","�޷�ȡ����",a,"0"};
        String[] v99={"irrigate","��ȣ���ϴ�˿�",v,"0"};
        String[] v100={"irritable","��ŭ�ģ����ܴ̼���",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"irritate","��ŭ���̼�",v,"0"};
        	String[] v102={"isolate","��������...����Ⱥ�и���",v,"0"};
        	String[] v103={"issue","�������������������ַ���(����)��",v+n,"0"};
        	String[] v104={"isthmus","��Ͽ",n,"0"};
        	String[] v105={"itinerant","Ѳ�صģ�������",a,"0"};
        	String[] v106={"itineracy","�г̱�����·��",n,"0"};
        	String[] v107={"ivory","����������",n,"0"};
        	String[] v108={"jabber","����������˵",v,"0"};
        	String[] v109={"jade","ƣ�������������",n,"0"};
        	String[] v110={"jaded","ƣ���ģ�����",a,"0"};
        	String[] v111={"jagged","���״�ģ��������",a,"0"};
        	String[] v112={"jamb","�Ŵ��Ĳ���",n,"0"};
        	String[] v113={"jar","��ͻ���ִ����𾪣������̶���",v,"0"};
        	String[] v114={"jargon","����л�",n,"0"};
        	String[] v115={"jarring","�����̶���",a,"0"};
        	String[] v116={"jaundice","ƫ��������",n,"0"};
        	String[] v117={"jaunt","�̳�����",n+v,"0"};
        	String[] v118={"jaunty","���ģ������",a,"0"};
        	String[] v119={"jazz","��ʿ�֣�����",n,"0"};
        	String[] v120={"jealousy","�¼ɣ�����",n,"0"};
        	String[] v121={"jeer","��Ц",v,"0"};
        	String[] v122={"jejune","�ն��ģ��������",a,"0"};
        	String[] v123={"jerk","ͻȻ����",v,"0"};
        	String[] v124={"jeopardize","Σ����Σ��",v,"0"};
        	String[] v125={"jeopardy","Σ��",n,"0"};
        	String[] v126={"jest","˵Ц����Ц",v,"0"};
        	String[] v127={"jettison","(��)�����׶����������Ļ���",v+n,"0"};
        	String[] v128={"jibe","��...һ�£�����",v,"0"};
        	String[] v129={"jigsaw puzzle","ƴͼ��Ϸ",n,"0"};
        	String[] v130={"jingoism","ɳ�����壬��������",n,"0"};
        	String[] v131={"jockey","��ʦ���üƻ�ȡ",n+v,"0"};
        	String[] v132={"jocular","�����ģ���Ϸ��",a,"0"};
        	String[] v133={"jocund","���ֵ�",a,"0"};
        	String[] v134={"jog","����ƽ����ǰ��",v,"0"};
        	String[] v135={"jolt","�������ƶ����𶯣�ҡ��",v+n,"0"};
        	String[] v136={"jot","ժҪ��¼",v,"0"};
        	String[] v137={"jovial","����",a,"0"};
        	String[] v138={"jubilation","���죬����",n,"0"};
        	String[] v139={"judical","��ͥ�ģ����ٵ�",a,"0"};
        	String[] v140={"judicious","���ж����ģ����ǵ�",a,"0"};
        	String[] v141={"juggernaut","�ݻ�һ�е�ǿ������",n,"0"};
        	String[] v142={"jumble","���ӣ�����",v+n,"0"};
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_21,v1);
    		subInitial(DBParameter.pos_wl_21,v2);
    		subInitial(DBParameter.pos_wl_21,v3);
    		subInitial(DBParameter.pos_wl_21,v4);
    		subInitial(DBParameter.pos_wl_21,v5);
    		subInitial(DBParameter.pos_wl_21,v6);
    		subInitial(DBParameter.pos_wl_21,v7);
    		subInitial(DBParameter.pos_wl_21,v8);
    		subInitial(DBParameter.pos_wl_21,v9);
    		subInitial(DBParameter.pos_wl_21,v10);
    		subInitial(DBParameter.pos_wl_21,v11);
    		subInitial(DBParameter.pos_wl_21,v12);
    		subInitial(DBParameter.pos_wl_21,v13);
    		subInitial(DBParameter.pos_wl_21,v14);
    		subInitial(DBParameter.pos_wl_21,v15);
    		subInitial(DBParameter.pos_wl_21,v16);
    		subInitial(DBParameter.pos_wl_21,v17);
    		subInitial(DBParameter.pos_wl_21,v18);
    		subInitial(DBParameter.pos_wl_21,v19);
    		subInitial(DBParameter.pos_wl_21,v20);
    		subInitial(DBParameter.pos_wl_21,v21);
    		subInitial(DBParameter.pos_wl_21,v22);
    		subInitial(DBParameter.pos_wl_21,v23);
    		subInitial(DBParameter.pos_wl_21,v24);
    		subInitial(DBParameter.pos_wl_21,v25);
    		subInitial(DBParameter.pos_wl_21,v26);
    		subInitial(DBParameter.pos_wl_21,v27);
    		subInitial(DBParameter.pos_wl_21,v28);
    		subInitial(DBParameter.pos_wl_21,v29);
    		subInitial(DBParameter.pos_wl_21,v30);
    		subInitial(DBParameter.pos_wl_21,v31);
    		subInitial(DBParameter.pos_wl_21,v32);
    		subInitial(DBParameter.pos_wl_21,v33);
    		subInitial(DBParameter.pos_wl_21,v34);
    		subInitial(DBParameter.pos_wl_21,v35);
    		subInitial(DBParameter.pos_wl_21,v36);
    		subInitial(DBParameter.pos_wl_21,v37);
    		subInitial(DBParameter.pos_wl_21,v38);
    		subInitial(DBParameter.pos_wl_21,v39);
    		subInitial(DBParameter.pos_wl_21,v40);
    		subInitial(DBParameter.pos_wl_21,v41);
    		subInitial(DBParameter.pos_wl_21,v42);
    		subInitial(DBParameter.pos_wl_21,v43);
    		subInitial(DBParameter.pos_wl_21,v44);
    		subInitial(DBParameter.pos_wl_21,v45);
    		subInitial(DBParameter.pos_wl_21,v46);
    		subInitial(DBParameter.pos_wl_21,v47);
    		subInitial(DBParameter.pos_wl_21,v48);
    		subInitial(DBParameter.pos_wl_21,v49);
    		subInitial(DBParameter.pos_wl_21,v50);
    		
    		subInitial(DBParameter.pos_wl_21,v51);
    		subInitial(DBParameter.pos_wl_21,v52);
    		subInitial(DBParameter.pos_wl_21,v53);
    		subInitial(DBParameter.pos_wl_21,v54);
    		subInitial(DBParameter.pos_wl_21,v55);
    		subInitial(DBParameter.pos_wl_21,v56);
    		subInitial(DBParameter.pos_wl_21,v57);
    		subInitial(DBParameter.pos_wl_21,v58);
    		subInitial(DBParameter.pos_wl_21,v59);
    		subInitial(DBParameter.pos_wl_21,v60);
    		subInitial(DBParameter.pos_wl_21,v61);
    		subInitial(DBParameter.pos_wl_21,v62);
    		subInitial(DBParameter.pos_wl_21,v63);
    		subInitial(DBParameter.pos_wl_21,v64);
    		subInitial(DBParameter.pos_wl_21,v65);
    		subInitial(DBParameter.pos_wl_21,v66);
    		subInitial(DBParameter.pos_wl_21,v67);
    		subInitial(DBParameter.pos_wl_21,v68);
    		subInitial(DBParameter.pos_wl_21,v69);
    		subInitial(DBParameter.pos_wl_21,v70);
    		subInitial(DBParameter.pos_wl_21,v71);
    		subInitial(DBParameter.pos_wl_21,v72);
    		subInitial(DBParameter.pos_wl_21,v73);
    		subInitial(DBParameter.pos_wl_21,v74);
    		subInitial(DBParameter.pos_wl_21,v75);
    		subInitial(DBParameter.pos_wl_21,v76);
    		subInitial(DBParameter.pos_wl_21,v77);
    		subInitial(DBParameter.pos_wl_21,v78);
    		subInitial(DBParameter.pos_wl_21,v79);
    		subInitial(DBParameter.pos_wl_21,v80);
    		subInitial(DBParameter.pos_wl_21,v81);
    		subInitial(DBParameter.pos_wl_21,v82);
    		subInitial(DBParameter.pos_wl_21,v83);
    		subInitial(DBParameter.pos_wl_21,v84);
    		subInitial(DBParameter.pos_wl_21,v85);
    		subInitial(DBParameter.pos_wl_21,v86);
    		subInitial(DBParameter.pos_wl_21,v87);
    		subInitial(DBParameter.pos_wl_21,v88);
    		subInitial(DBParameter.pos_wl_21,v89);
    		subInitial(DBParameter.pos_wl_21,v90);
    		subInitial(DBParameter.pos_wl_21,v91);
    		subInitial(DBParameter.pos_wl_21,v92);
    		subInitial(DBParameter.pos_wl_21,v93);
    		subInitial(DBParameter.pos_wl_21,v94);
    		subInitial(DBParameter.pos_wl_21,v95);
    		subInitial(DBParameter.pos_wl_21,v96);
    		subInitial(DBParameter.pos_wl_21,v97);
    		subInitial(DBParameter.pos_wl_21,v98);
    		subInitial(DBParameter.pos_wl_21,v99);
    		subInitial(DBParameter.pos_wl_21,v100);
    		subInitial(DBParameter.pos_wl_21,v101);
    		subInitial(DBParameter.pos_wl_21,v102);
    		subInitial(DBParameter.pos_wl_21,v103);
    		subInitial(DBParameter.pos_wl_21,v104);
    		subInitial(DBParameter.pos_wl_21,v105);
    		subInitial(DBParameter.pos_wl_21,v106);
    		subInitial(DBParameter.pos_wl_21,v107);
    		subInitial(DBParameter.pos_wl_21,v108);
    		subInitial(DBParameter.pos_wl_21,v109);
    		subInitial(DBParameter.pos_wl_21,v110);
    		subInitial(DBParameter.pos_wl_21,v111);
    		subInitial(DBParameter.pos_wl_21,v112);
    		subInitial(DBParameter.pos_wl_21,v113);
    		subInitial(DBParameter.pos_wl_21,v114);
    		subInitial(DBParameter.pos_wl_21,v115);
    		subInitial(DBParameter.pos_wl_21,v116);
    		subInitial(DBParameter.pos_wl_21,v117);
    		subInitial(DBParameter.pos_wl_21,v118);
    		
    		subInitial(DBParameter.pos_wl_21,v119);
    		subInitial(DBParameter.pos_wl_21,v120);
    		subInitial(DBParameter.pos_wl_21,v121);
    		subInitial(DBParameter.pos_wl_21,v122);
    		subInitial(DBParameter.pos_wl_21,v123);
    		subInitial(DBParameter.pos_wl_21,v124);
    		subInitial(DBParameter.pos_wl_21,v125);
    		subInitial(DBParameter.pos_wl_21,v126);
    		subInitial(DBParameter.pos_wl_21,v127);
    		subInitial(DBParameter.pos_wl_21,v128);
    		subInitial(DBParameter.pos_wl_21,v129);
    		subInitial(DBParameter.pos_wl_21,v130);
    		subInitial(DBParameter.pos_wl_21,v131);
    		subInitial(DBParameter.pos_wl_21,v132);
    		subInitial(DBParameter.pos_wl_21,v133);
    		subInitial(DBParameter.pos_wl_21,v134);
    		subInitial(DBParameter.pos_wl_21,v135);
    		subInitial(DBParameter.pos_wl_21,v136);
    		subInitial(DBParameter.pos_wl_21,v137);
    		subInitial(DBParameter.pos_wl_21,v138);
    		subInitial(DBParameter.pos_wl_21,v139);
    		subInitial(DBParameter.pos_wl_21,v140);
    		subInitial(DBParameter.pos_wl_21,v141);
    		subInitial(DBParameter.pos_wl_21,v142);
    	
        	
    }
    public void doList_22(){
    	
    	String[] v1={"junction","����·�ڣ�����",n,"0"};
    	String[] v2={"justifiable","�����ɵģ��޿ɷ����",a,"0"};
    	String[] v3={"justification","�������ɣ�����ԭ�򣬱绤",n,"0"};
    	String[] v4={"justify","֤��...����",v,"0"};
    	String[] v5={"juvenile","�����",a,"0"};
    	String[] v6={"juxtapose","����",v,"0"};
    	String[] v7={"kaleidoscope","��Ͳ��������Ȥ�ĶԳ�Ч��",n,"0"};
    	String[] v8={"kangaroo","����",n,"0"};
    	String[] v9={"ken","��Ұ��Χ��֪ʶ��Χ",n,"0"};
    	String[] v10={"kennel","����",n,"0"};
    	String[] v11={"kernel","���ʣ�����",n,"0"};
    	String[] v12={"kidnap","�չգ���ܣ�����",v,"0"};
    	String[] v13={"kidney","��",n,"0"};
    	String[] v14={"killjoy","ɨ��֮��",n,"0"};
    	String[] v15={"kin","����",n,"0"};
    	String[] v16={"kindle","�Ż𣬵�ȼ",v,"0"};
    	String[] v17={"kinetic","�˶���",a,"0"};
    	String[] v18={"knack","��������������",n,"0"};
    	String[] v19={"knave","��å",n,"0"};
    	String[] v20={"knead","���ƣ�����",v,"0"};
    	String[] v21={"knit","��֯",v,"0"};
    	String[] v22={"knotty","�нڰ̵ģ����ѵ�",a,"0"};
    	String[] v23={"know-how","רҵ���ܣ�֪ʶ",n,"0"};
    	String[] v24={"kudos","����",n,"0"};
    	String[] v25={"labile","���ȶ���",a,"0"};
    	String[] v26={"labored","�����ģ�����Ȼ��",a,"0"};
    	String[] v27={"labyrinth","�Թ�",n,"0"};
    	String[] v28={"lace","Ь����ϵ�������ۻ��ߣ�͸��֯Ʒ",n,"0"};
    	String[] v29={"lacerate","˺�ѣ������˺�",v,"0"};
    	String[] v30={"lachrymose","������ģ����������",a,"0"};
    	String[] v31={"lackadaisical","�޾���ɵģ�����Ȥ��",a,"0"};
    	String[] v32={"lackluster","�޹���ģ����͵�",a,"0"};
    	String[] v33={"laconic","����",a,"0"};
    	String[] v34={"lactic","��֭��",a,"0"};
    	String[] v35={"lag","�������",v,"0"};
    	String[] v36={"lair","Ұ�޳�Ѩ",n,"0"};
    	String[] v37={"laity","�׼���ͽ�����˽׼�������",n,"0"};
    	String[] v38={"lambaste","ʹ��ʹ��",v,"0"};
    	String[] v39={"lament","���ˣ�����",n+v,"0"};
    	String[] v40={"lampoon","������£����",n+v,"0"};
    	String[] v41={"lance","��ì�����",n,"0"};
    	String[] v42={"lancet","������",n,"0"};
    	String[] v43={"landfill","������",n,"0"};
    	String[] v44={"landlocked","��½�ذ�Χ��",a,"0"};
    	String[] v45={"landmark","·�꣬��̱�",n,"0"};
    	String[] v46={"landslide","ɽ����ѹ����ʤ��",n,"0"};
    	String[] v47={"languid","û����ɵģ��뵡��",a,"0"};
    	String[] v48={"languish","������ݣ�˥��",v,"0"};
    	String[] v49={"languor","����ƣ��",n,"0"};
    	String[] v50={"lank","�����ģ��������",a,"0"};
    	String[] v51={"lap","��ʳ",v,"0"};
        String[] v52={"lapse","���(ʱ��)����",n,"0"};
        String[] v53={"larder","ʳƷ��",n,"0"};
        String[] v54={"largess","����",n,"0"};
        String[] v55={"lark","����",v,"0"};
        String[] v56={"larva","�׳�",n,"0"};
        String[] v57={"lash","���ӣ��޴���ס",n+v,"0"};
        String[] v58={"lassitude","������û�����",n,"0"};
        String[] v59={"lasso","����",n,"0"};
        String[] v60={"lasting","�־õ�",a,"0"};		
    	String[] v61={"latency","Ǳ����",n,"0"};
        String[] v62={"latent","Ǳ����",a,"0"};
       	String[] v63={"lateral","�����",a,"0"};
       	String[] v64={"latitude","��������",n,"0"};
       	String[] v65={"lattice","(��ʵ�)���Ӽ�",n,"0"};
       	String[] v66={"laud","����",v,"0"};
        String[] v67={"lava","����",n,"0"};
        String[] v68={"lave","ϴԡ��������ˢ",v,"0"};
        String[] v69={"lavish","�˷ѵģ��ḻ��",a,"0"};
        String[] v70={"laxative","ͨ��ģ����ɵģ���кҩ",a+n,"0"};
    	String[] v71={"leak","й©��й©©������©��",v+n,"0"};
        String[] v72={"leakage","��©",n,"0"};
       	String[] v73={"lease","��Լ�����ڣ�����",n+v,"0"};
       	String[] v74={"leaven","���ͼ���Ӱ���������ͣ�Ӱ��",n+v,"0"};
       	String[] v75={"lectern","���õĶ���̨",n,"0"};
        String[] v76={"ledger","�˲�",n,"0"};
        String[] v77={"leer","б�ۿ������ﲨ",v,"0"};
        String[] v78={"leery","�����ģ����ɵ�",a,"0"};
        String[] v79={"legacy","�Ų�������֮��",n,"0"};
        String[] v80={"legend","��ͼ�˵�˵�����ֻ�ͼ��",n,"0"};
    	String[] v81={"legerdermain","�ַ���Ϸ��",n,"0"};
        String[] v82={"legion","���ţ�һ��Ⱥ",n,"0"};
        String[] v83={"legislate","�ƶ�����",v,"0"};
        String[] v84={"legitimate","�Ϸ���",a,"0"};
        String[] v85={"leisureliness","��Ȼ������",n,"0"};
        String[] v86={"leniency","�ºͣ�����",n,"0"};
        String[] v87={"lenient","���ģ��ʴȵ�",a,"0"};
        String[] v88={"lethal","������",a,"0"};
        String[] v89={"lethargic","��˯��",a,"0"};
        String[] v90={"lethargy","��˯���뵡����ɢ",n,"0"};
        String[] v91={"levee","����̣��̰�",n,"0"};
        String[] v92={"levelheaded","ͷ���侲�ģ��Ƚ���",a,"0"};
        String[] v93={"lever","�ܸˣ��˶�",n+v,"0"};
        String[] v94={"levity","���ʣ��ḡ",n,"0"};
        String[] v95={"levy","��˰",n+v,"0"};
        String[] v96={"lexicographer","�ʵ������",n,"0"};
        String[] v97={"liability","���Σ�ծ��",n,"0"};
        String[] v98={"liaison","��ϵ��������ϵ",n,"0"};
        String[] v99={"libel","(����)�̰�",n+v,"0"};
        String[] v100={"liberality","���������ؿ���",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"liberate","�ͷţ����",v,"0"};
        	String[] v102={"libertine","�˵�֮��",n,"0"};
        	String[] v103={"liberty","���⣬ðʧ",n,"0"};
        	String[] v104={"libretto","��ʣ��籾",n,"0"};
        	String[] v105={"license","���������ɣ����֤��ִ��",n,"0"};
        	String[] v106={"licentious","�����ģ�������",a,"0"};
        	String[] v107={"lien","��ѺȨ������Ȩ",n,"0"};
        	String[] v108={"ligneous","ľ�Ƶģ�ľͷ��",a,"0"};
        	String[] v109={"liken","��...����",v,"0"};
        	String[] v110={"limb","֫����",n,"0"};
        	String[] v111={"limber","�������ģ����ݵ�",a,"0"};
        	String[] v112={"limerick","���д���ʫ",n,"0"};
        	String[] v113={"limestone","ʯ����",n,"0"};
        	String[] v114={"limn","��д����",v,"0"};
        	String[] v115={"limousine","���ͽγ�����ͳ�",n,"0"};
        	String[] v116={"limp","ȳ�У������ģ������",v+a,"0"};
        	String[] v117={"limpid","�峺͸����",a,"0"};
        	String[] v118={"lineage","��ϵ��Ѫͳ",n,"0"};
        	String[] v119={"linen","����֯Ʒ�����鲼",n,"0"};
        	String[] v120={"linger","����������",v,"0"};
        	String[] v121={"linguistics","����ѧ",n,"0"};
        	String[] v122={"lionize","��ݣ�����",v,"0"};
        	String[] v123={"liquefy","ʹҺ����ʹ�ܽ�",v,"0"};
        	String[] v124={"liquid","�峺��",a,"0"};
        	String[] v125={"liquidate","���㣬�峥",v,"0"};
        	String[] v126={"lissome","��̬���ŵģ������",a,"0"};
        	String[] v127={"list","��б",n+v,"0"};
        	String[] v128={"listless","�޾���ɵ�",a,"0"};
        	String[] v129={"literal","�����ϵģ���ʵԭ��ģ���ȷ��",a,"0"};
        	String[] v130={"literate","�ж�д�����ģ����Ļ�������",a,"0"};
        	String[] v131={"literati","���ˣ�ѧ��(��)",n,"0"};
        	String[] v132={"lithe","����ģ��������ģ����ݵģ�����",a,"0"};
        	String[] v133={"litigant","���ϵ�����",n,"0"};
        	String[] v134={"litigation","����",n,"0"};
        	String[] v135={"litter","������һ��(����)",n,"0"};
        	String[] v136={"loaf","һ��(���)����ȹ���",n+v,"0"};
        	String[] v137={"loathe","���ޣ����",v,"0"};
        	String[] v138={"lobby","��������Ϣ��",n,"0"};
        	String[] v139={"lobe","������(�η�)Ҷ",n,"0"};
        	String[] v140={"locale","�¼��������ֳ����ص�",n,"0"};
        	String[] v141={"locomotion","�˶����ƶ�",n,"0"};
        	String[] v142={"locomotive","�ƶ��ģ���������ͷ",a+n,"0"};
        	String[] v143={"locus","�ص㣬���ڵ�",n,"0"};
        	String[] v144={"lode","����",n,"0"};
        	String[] v145={"lofty","��ߵ�",a,"0"};
        	String[] v146={"log","��־����¼",n+v,"0"};
        	String[] v147={"logistics","����ѧ������",n,"0"};
        	String[] v148={"loll","�������������",v,"0"};
        	String[] v149={"longevity","����",n,"0"};
        	String[] v150={"longing","����",n,"0"};
        	String[] v151={"long-winded","�߳���",a,"0"};
        	String[] v152={"loom","֯��������Լ����",n+v,"0"};
        	String[] v153={"loon","���ˣ�����",n,"0"};
        	String[] v154={"loop","Ȧ��������Ȧ",n,"0"};
        	String[] v155={"loophole","ǹ�ۣ�С����������",n,"0"};
        	String[] v156={"loosen","���ɣ��ɿ�",v,"0"};
        	String[] v157={"lope","���Ĳ���",n,"0"};
        	String[] v158={"lopsided","����һ���ģ���ƽ���",a,"0"};
        	String[] v159={"loquacious","����ģ������",a,"0"};
        	String[] v160={"lot","ǩ����ǩ������",n+v,"0"};
        	String[] v161={"lottery","��Ʊ����ʸ�����",n,"0"};
        	String[] v162={"lounge","��ɢ��б������Ϣ��",v+n,"0"};
        	String[] v163={"loutish","��³��",a,"0"};
        	String[] v164={"low","ţ��",v,"0"};
        	String[] v165={"loyal","�ҳϵ�",a,"0"};
        	
        	
        	
        	subInitial(DBParameter.pos_wl_22,v1);
    		subInitial(DBParameter.pos_wl_22,v2);
    		subInitial(DBParameter.pos_wl_22,v3);
    		subInitial(DBParameter.pos_wl_22,v4);
    		subInitial(DBParameter.pos_wl_22,v5);
    		subInitial(DBParameter.pos_wl_22,v6);
    		subInitial(DBParameter.pos_wl_22,v7);
    		subInitial(DBParameter.pos_wl_22,v8);
    		subInitial(DBParameter.pos_wl_22,v9);
    		subInitial(DBParameter.pos_wl_22,v10);
    		subInitial(DBParameter.pos_wl_22,v11);
    		subInitial(DBParameter.pos_wl_22,v12);
    		subInitial(DBParameter.pos_wl_22,v13);
    		subInitial(DBParameter.pos_wl_22,v14);
    		subInitial(DBParameter.pos_wl_22,v15);
    		subInitial(DBParameter.pos_wl_22,v16);
    		subInitial(DBParameter.pos_wl_22,v17);
    		subInitial(DBParameter.pos_wl_22,v18);
    		subInitial(DBParameter.pos_wl_22,v19);
    		subInitial(DBParameter.pos_wl_22,v20);
    		subInitial(DBParameter.pos_wl_22,v21);
    		subInitial(DBParameter.pos_wl_22,v22);
    		subInitial(DBParameter.pos_wl_22,v23);
    		subInitial(DBParameter.pos_wl_22,v24);
    		subInitial(DBParameter.pos_wl_22,v25);
    		subInitial(DBParameter.pos_wl_22,v26);
    		subInitial(DBParameter.pos_wl_22,v27);
    		subInitial(DBParameter.pos_wl_22,v28);
    		subInitial(DBParameter.pos_wl_22,v29);
    		subInitial(DBParameter.pos_wl_22,v30);
    		subInitial(DBParameter.pos_wl_22,v31);
    		subInitial(DBParameter.pos_wl_22,v32);
    		subInitial(DBParameter.pos_wl_22,v33);
    		subInitial(DBParameter.pos_wl_22,v34);
    		subInitial(DBParameter.pos_wl_22,v35);
    		subInitial(DBParameter.pos_wl_22,v36);
    		subInitial(DBParameter.pos_wl_22,v37);
    		subInitial(DBParameter.pos_wl_22,v38);
    		subInitial(DBParameter.pos_wl_22,v39);
    		subInitial(DBParameter.pos_wl_22,v40);
    		subInitial(DBParameter.pos_wl_22,v41);
    		subInitial(DBParameter.pos_wl_22,v42);
    		subInitial(DBParameter.pos_wl_22,v43);
    		subInitial(DBParameter.pos_wl_22,v44);
    		subInitial(DBParameter.pos_wl_22,v45);
    		subInitial(DBParameter.pos_wl_22,v46);
    		subInitial(DBParameter.pos_wl_22,v47);
    		subInitial(DBParameter.pos_wl_22,v48);
    		subInitial(DBParameter.pos_wl_22,v49);
    		subInitial(DBParameter.pos_wl_22,v50);
    		
    		subInitial(DBParameter.pos_wl_22,v51);
    		subInitial(DBParameter.pos_wl_22,v52);
    		subInitial(DBParameter.pos_wl_22,v53);
    		subInitial(DBParameter.pos_wl_22,v54);
    		subInitial(DBParameter.pos_wl_22,v55);
    		subInitial(DBParameter.pos_wl_22,v56);
    		subInitial(DBParameter.pos_wl_22,v57);
    		subInitial(DBParameter.pos_wl_22,v58);
    		subInitial(DBParameter.pos_wl_22,v59);
    		subInitial(DBParameter.pos_wl_22,v60);
    		subInitial(DBParameter.pos_wl_22,v61);
    		subInitial(DBParameter.pos_wl_22,v62);
    		subInitial(DBParameter.pos_wl_22,v63);
    		subInitial(DBParameter.pos_wl_22,v64);
    		subInitial(DBParameter.pos_wl_22,v65);
    		subInitial(DBParameter.pos_wl_22,v66);
    		subInitial(DBParameter.pos_wl_22,v67);
    		subInitial(DBParameter.pos_wl_22,v68);
    		subInitial(DBParameter.pos_wl_22,v69);
    		subInitial(DBParameter.pos_wl_22,v70);
    		subInitial(DBParameter.pos_wl_22,v71);
    		subInitial(DBParameter.pos_wl_22,v72);
    		subInitial(DBParameter.pos_wl_22,v73);
    		subInitial(DBParameter.pos_wl_22,v74);
    		subInitial(DBParameter.pos_wl_22,v75);
    		subInitial(DBParameter.pos_wl_22,v76);
    		subInitial(DBParameter.pos_wl_22,v77);
    		subInitial(DBParameter.pos_wl_22,v78);
    		subInitial(DBParameter.pos_wl_22,v79);
    		subInitial(DBParameter.pos_wl_22,v80);
    		subInitial(DBParameter.pos_wl_22,v81);
    		subInitial(DBParameter.pos_wl_22,v82);
    		subInitial(DBParameter.pos_wl_22,v83);
    		subInitial(DBParameter.pos_wl_22,v84);
    		subInitial(DBParameter.pos_wl_22,v85);
    		subInitial(DBParameter.pos_wl_22,v86);
    		subInitial(DBParameter.pos_wl_22,v87);
    		subInitial(DBParameter.pos_wl_22,v88);
    		subInitial(DBParameter.pos_wl_22,v89);
    		subInitial(DBParameter.pos_wl_22,v90);
    		subInitial(DBParameter.pos_wl_22,v91);
    		subInitial(DBParameter.pos_wl_22,v92);
    		subInitial(DBParameter.pos_wl_22,v93);
    		subInitial(DBParameter.pos_wl_22,v94);
    		subInitial(DBParameter.pos_wl_22,v95);
    		subInitial(DBParameter.pos_wl_22,v96);
    		subInitial(DBParameter.pos_wl_22,v97);
    		subInitial(DBParameter.pos_wl_22,v98);
    		subInitial(DBParameter.pos_wl_22,v99);
    		subInitial(DBParameter.pos_wl_22,v100);
    		subInitial(DBParameter.pos_wl_22,v101);
    		subInitial(DBParameter.pos_wl_22,v102);
    		subInitial(DBParameter.pos_wl_22,v103);
    		subInitial(DBParameter.pos_wl_22,v104);
    		subInitial(DBParameter.pos_wl_22,v105);
    		subInitial(DBParameter.pos_wl_22,v106);
    		subInitial(DBParameter.pos_wl_22,v107);
    		subInitial(DBParameter.pos_wl_22,v108);
    		subInitial(DBParameter.pos_wl_22,v109);
    		subInitial(DBParameter.pos_wl_22,v110);
    		subInitial(DBParameter.pos_wl_22,v111);
    		subInitial(DBParameter.pos_wl_22,v112);
    		subInitial(DBParameter.pos_wl_22,v113);
    		subInitial(DBParameter.pos_wl_22,v114);
    		subInitial(DBParameter.pos_wl_22,v115);
    		subInitial(DBParameter.pos_wl_22,v116);
    		subInitial(DBParameter.pos_wl_22,v117);
    		subInitial(DBParameter.pos_wl_22,v118);
    		
    		subInitial(DBParameter.pos_wl_22,v119);
    		subInitial(DBParameter.pos_wl_22,v120);
    		subInitial(DBParameter.pos_wl_22,v121);
    		subInitial(DBParameter.pos_wl_22,v122);
    		subInitial(DBParameter.pos_wl_22,v123);
    		subInitial(DBParameter.pos_wl_22,v124);
    		subInitial(DBParameter.pos_wl_22,v125);
    		subInitial(DBParameter.pos_wl_22,v126);
    		subInitial(DBParameter.pos_wl_22,v127);
    		subInitial(DBParameter.pos_wl_22,v128);
    		subInitial(DBParameter.pos_wl_22,v129);
    		subInitial(DBParameter.pos_wl_22,v130);
    		subInitial(DBParameter.pos_wl_22,v131);
    		subInitial(DBParameter.pos_wl_22,v132);
    		subInitial(DBParameter.pos_wl_22,v133);
    		subInitial(DBParameter.pos_wl_22,v134);
    		subInitial(DBParameter.pos_wl_22,v135);
    		subInitial(DBParameter.pos_wl_22,v136);
    		subInitial(DBParameter.pos_wl_22,v137);
    		subInitial(DBParameter.pos_wl_22,v138);
    		subInitial(DBParameter.pos_wl_22,v139);
    		subInitial(DBParameter.pos_wl_22,v140);
    		subInitial(DBParameter.pos_wl_22,v141);
    		subInitial(DBParameter.pos_wl_22,v142);
    		subInitial(DBParameter.pos_wl_22,v143);
    		subInitial(DBParameter.pos_wl_22,v144);
    		subInitial(DBParameter.pos_wl_22,v145);
    		subInitial(DBParameter.pos_wl_22,v146);
    		subInitial(DBParameter.pos_wl_22,v147);
    		subInitial(DBParameter.pos_wl_22,v148);
    		subInitial(DBParameter.pos_wl_22,v149);
    		subInitial(DBParameter.pos_wl_22,v150);
    		subInitial(DBParameter.pos_wl_22,v151);
    		subInitial(DBParameter.pos_wl_22,v152);
    		subInitial(DBParameter.pos_wl_22,v153);
    		subInitial(DBParameter.pos_wl_22,v154);
    		subInitial(DBParameter.pos_wl_22,v155);
    		subInitial(DBParameter.pos_wl_22,v156);
    		subInitial(DBParameter.pos_wl_22,v157);
    		subInitial(DBParameter.pos_wl_22,v158);
    		subInitial(DBParameter.pos_wl_22,v159);
    		subInitial(DBParameter.pos_wl_22,v160);
    		subInitial(DBParameter.pos_wl_22,v161);
    		subInitial(DBParameter.pos_wl_22,v162);
    		subInitial(DBParameter.pos_wl_22,v163);
    		subInitial(DBParameter.pos_wl_22,v164);
    		subInitial(DBParameter.pos_wl_22,v165);
    		
        	
    }
    public void doList_23(){
    	
    	String[] v1={"lubricant","�󻬼�",n,"0"};
    	String[] v2={"lubricate","��",v,"0"};
    	String[] v3={"lucid","�������ģ������׶���",a,"0"};
    	String[] v4={"lucrative","׬Ǯ�ģ�������ͼ��",a,"0"};
    	String[] v5={"ludicrous","���ƿ�Ц��",a,"0"};
    	String[] v6={"lug","�ϣ���",v+n,"0"};
    	String[] v7={"lukewarm","΢�µģ������ĵ�",a,"0"};
    	String[] v8={"lull","�����ͣ��ʹƽ��",n+v,"0"};
    	String[] v9={"lullaby","ҡ����",n,"0"};
    	String[] v10={"lumber","���Ƕ��У���׾���ߣ����",v+n,"0"};
    	String[] v11={"lumberjack","��ľ��",n,"0"};
    	String[] v12={"lumen","����",n,"0"};
    	String[] v13={"luminary","�ܳ��������",n,"0"};
    	String[] v14={"lump","һ�飬�׿飻�γɿ�״",n+v,"0"};
    	String[] v15={"lunar","������",a,"0"};
    	String[] v16={"lunatic","���ӣ�������",n+a,"0"};
    	String[] v17={"lurch","ͻȻ��ǰ����浹�����Ƕ���",n+v,"0"};
    	String[] v18={"lurid","ҫ�۵ģ��������ŵ�",a,"0"};
    	String[] v19={"lurk","Ǳ�������",v,"0"};
    	String[] v20={"lush","��ï�ģ�ïʢ��",a,"0"};
    	String[] v21={"lust","ǿ�ҵ�����",n,"0"};
    	String[] v22={"lustrous","�й����",a,"0"};
    	String[] v23={"luxuriant","��ï�ģ����ֵ�",a,"0"};
    	String[] v24={"luxurious","�ݳ޵ģ�������",a,"0"};
    	String[] v25={"luxury","�ݳ�(Ʒ)",n,"0"};
    	String[] v26={"lyric","����ģ�����ʫ�����",a+n,"0"};
    	String[] v27={"macabre","���˵�",a,"0"};
    	String[] v28={"macerate","����ʹ����",v,"0"};
    	String[] v29={"machination","��ı",n,"0"};
    	String[] v30={"maculated","�аߵ��",a,"0"};
    	String[] v31={"madrigal","�����ʫ����裬�ϳ���",n,"0"};
    	String[] v32={"maelstrom","�����У������",n,"0"};
    	String[] v33={"magenta","�Ϻ�ɫ�ģ��Ϻ�ɫ���Ϻ�Ⱦ��",a+n,"0"};
    	String[] v34={"magisterial","��Ȩ���ģ������",a,"0"};
    	String[] v35={"magnanimity","����",n,"0"};
    	String[] v36={"magnanimous","�������ģ�������",a,"0"};
    	String[] v37={"magnate","��������ͷ",n,"0"};
    	String[] v38={"magnificent","׳���ģ���ΰ�ģ����е�",a,"0"};
    	String[] v39={"magnify","�Ŵ�����",v,"0"};
    	String[] v40={"magnitude","��Ҫ�����������",n,"0"};
    	String[] v41={"magpie","ȵ",n,"0"};
    	String[] v42={"maintenance","ά�֣�ά��",n,"0"};
    	String[] v43={"maize","����",n,"0"};
    	String[] v44={"majestic","��ΰ�ģ�ׯ�ϵ�",a,"0"};
    	String[] v45={"maladroit","��׾��",a,"0"};
    	String[] v46={"malaise","���ʣ������",n,"0"};
    	String[] v47={"malapropism","�ֵ�����",n,"0"};
    	String[] v48={"malcontent","�����ģ��������ӣ�������",a+n,"0"};
    	String[] v49={"malevolent","����ģ��񶾵�",a,"0"};
    	String[] v50={"malfeasance","������Ϊ����ְ",n,"0"};
    	String[] v51={"malfunction","�������ϣ�����",v+n,"0"};
        String[] v52={"malicious","�񶾵�",a,"0"};
        String[] v53={"malign","�̰���а���",v+a,"0"};
        String[] v54={"malinger","װ�����ӱܹ���",v,"0"};
        String[] v55={"malleable","���ܵģ��׸ı��",a,"0"};
        String[] v56={"malpractice","���ְ�أ���ְ",n,"0"};
        String[] v57={"mammoth","�޴��",a,"0"};
        String[] v58={"mandate","���ָ��",n,"0"};
        String[] v59={"mandatory","����ģ�ǿ�ȵ�",a,"0"};
        String[] v60={"mangle","�������꣬ѹ��",v,"0"};		
    	String[] v61={"mania","�񣬿���",n,"0"};
        String[] v62={"manifest","��Ȼ�ģ��ÿ��������ػ��嵥",a+n,"0"};
       	String[] v63={"manifesto","���ԣ�����",n,"0"};
       	String[] v64={"manifold","����ģ����ֵ�",a,"0"};
       	String[] v65={"manipulate","����",v,"0"};
       	String[] v66={"manipulative","���ݱ��˵ģ��������ʵ�",a,"0"};
        String[] v67={"mannered","������",a,"0"};
        String[] v68={"mansion","���ݣ�����",n,"0"};
        
        String[] v69={"mantle","���磬���񣻸���",n+v,"0"};
        String[] v70={"manumit","���(ū��)",v,"0"};
    	String[] v71={"manure","��ʣ���...ʩ��",n+v,"0"};
        String[] v72={"manuscript","�ָ壬�ֳ���",n,"0"};
       	String[] v73={"maple","����",n,"0"};
       	String[] v74={"mar","�ƻ�������",v,"0"};
       	String[] v75={"marble","����ʯ",n,"0"};
        String[] v76={"mare","ĸ��ĸ¿",n,"0"};
        String[] v77={"margarine","����",n,"0"};
        String[] v78={"margin","ҳ�߿հף���Ե",n,"0"};
        String[] v79={"marine","���ģ����е�",a,"0"};
        String[] v80={"marionette","ľż",n,"0"};
    	String[] v81={"martial","������",a,"0"};
        String[] v82={"maritime","�غ��ģ����ϵ�",a,"0"};
        String[] v83={"marked","���Եģ������ӵ�",a,"0"};
        String[] v84={"maroon","��ɫ(��)",n+a,"0"};
        String[] v85={"marsh","����ʪ��",n,"0"};
        String[] v86={"marshal","�������ţ�����",v,"0"};
        String[] v87={"marsupial","�д�����(��)",n+a,"0"};
        String[] v88={"martial","ս���ģ����µ�",a,"0"};
        String[] v89={"martyr","��ʿ��ѳ����",n,"0"};
        String[] v90={"marvel","��...�е����죻�漣",v+n,"0"};
        String[] v91={"mash","���ɺ�״",v,"0"};
        String[] v92={"mask","����ߣ�����",n+v,"0"};
        String[] v93={"mason","���߽���ʯ��",n,"0"};
        String[] v94={"masquerade","��ױ��᣻αװ",n+v,"0"};
        String[] v95={"massacre","����ɱ",n,"0"};
        String[] v96={"massive","�޴�ģ����ص�",a,"0"};
        String[] v97={"mast","��Φ�����",n,"0"};
        String[] v98={"masticate","�׽�����...ĥ�ɽ�",v,"0"};
        String[] v99={"mate","��飬��ż������",n+v,"0"};
        String[] v100={"materialize","�������壬ʹ���廯��ʵ��",v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"maternal","ĸ�Ե�",a,"0"};
        	String[] v102={"matrix","ģ�ӣ�����",n,"0"};
        	String[] v103={"mattress","����",n,"0"};
        	String[] v104={"mature","����ģ���˼���ǵ�",a,"0"};
        	String[] v105={"maudlin","��������ģ����޵�",a,"0"};
        	String[] v106={"maul","˺��Ƥ�⣬�˺�",v,"0"};
        	String[] v107={"mauve","����ɫ��",a,"0"};
        	String[] v108={"maven","ר�ң�����",n,"0"};
        	String[] v109={"maverick","�뷨���ڲ�ͬ����",n,"0"};
        	String[] v110={"mawkish","��������ģ�������ζ�ģ�������Ż��",a,"0"};
        	String[] v111={"maximize","ʹ��������޶�",v,"0"};
        	String[] v112={"maze","�Թ�",n,"0"};
        	String[] v113={"meager","ƶ���ģ�������",a,"0"};
        	String[] v114={"mean","�����ģ����ĵ�",a,"0"};
        	String[] v115={"meander","���Ѷ���",v,"0"};
        	String[] v116={"measly","������ģ�С�ÿ�����",a,"0"};
        	String[] v117={"measured","��ȷ�ģ����ص�",a,"0"};
        	String[] v118={"mechanical","��е�ģ�����ģ�������",a,"0"};
        	String[] v119={"mechanics","��ѧ",n,"0"};
        	String[] v120={"mechanism","�ṹ������",n,"0"};
        	String[] v121={"medal","���ƣ�ѫ��",n,"0"};
        	String[] v122={"meddle","����",v,"0"};
        	String[] v123={"meddlesome","�������µ�",a,"0"};
        	String[] v124={"mediate","��ͣ",v,"0"};
        	String[] v125={"medieval","�����͵ģ��йŵ�",a,"0"};
        	String[] v126={"mediocrity","ƽӹ��µµ��Ϊ",n,"0"};
        	String[] v127={"meditate","��˼����ʡ",v,"0"};
        	String[] v128={"medium","ý�飬(ϸ��)���滷��",n,"0"};
        	String[] v129={"medley","���ֻ��ӣ���ϸ���",n,"0"};
        	String[] v130={"meek","��˳��",a,"0"};
        	String[] v131={"meet","���ʵ�",a,"0"};
        	String[] v132={"melancholy","�����ģ����˱��˵�",a,"0"};
        	String[] v133={"meld","(ʹ)��ϣ�(ʹ)�ϲ�",v,"0"};
        	String[] v134={"mellifluous","(����)����������",a,"0"};
        	String[] v135={"melodrama","��ھ磬����Ϸ��",n,"0"};
        	String[] v136={"melon","���",n,"0"};
        	String[] v137={"membrane","��Ĥ��Ĥ",n,"0"};
        	String[] v138={"memoir","����¼���Դ�������¼",n,"0"};
        	String[] v139={"memorial","��������������ģ������",n+a,"0"};
        	String[] v140={"menace","��в������",n+v,"0"};
        	String[] v141={"mend","�޸ģ��Ľ�",v,"0"};
        	String[] v142={"mendacious","����ģ����ѵ�",a,"0"};
        	String[] v143={"mendicant","����ģ���ؤ",a+n,"0"};
        	String[] v144={"menthol","���ɴ�",n,"0"};
        	String[] v145={"mentor","��ʦ",n,"0"};
        	String[] v146={"mercantile","ó�׵ģ���ҵ��",a,"0"};
        	String[] v147={"mercenary","Ψ����ͼ�ģ���Ӷ��",a+n,"0"};
        	String[] v148={"mercurial","�Ʊ�ģ����õ�",a,"0"};
        	String[] v149={"meretricious","������ʵ�ģ����޵�",a,"0"};
        	String[] v150={"merit","ֵ��",v,"0"};
        	String[] v151={"merited","�õõģ�������Ȼ��",a,"0"};
        	String[] v152={"meritorious","ֵ�����͵�",a,"0"};
        	String[] v153={"mesa","��̨�أ�ƽ��ɽ",n,"0"};
        	String[] v154={"mesh","������׽���ݺ�",v,"0"};
        	String[] v155={"metabolism","�³´�л",n,"0"};
        	String[] v156={"metamorphose","����",v,"0"};
        	String[] v157={"metaphor","����������",n,"0"};
        	String[] v158={"metaphysics","�ζ���ѧ����ѧ",n,"0"};
        	String[] v159={"mete","���裬���䣬�������߽�",v+n,"0"};
        	String[] v160={"meteoric","���ǵģ�꼻�һ�ֵ�",a,"0"};
        	String[] v161={"methodical","ϸ�ĵģ��������ɵ�",a,"0"};
        	String[] v162={"meticulous","ϸ�ĵģ�һ˿������",a,"0"};
        	String[] v163={"metrical","�����ģ����ɵ�",a,"0"};
        	String[] v164={"metropolis","�����",n,"0"};
        	
        	
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_23,v1);
    		subInitial(DBParameter.pos_wl_23,v2);
    		subInitial(DBParameter.pos_wl_23,v3);
    		subInitial(DBParameter.pos_wl_23,v4);
    		subInitial(DBParameter.pos_wl_23,v5);
    		subInitial(DBParameter.pos_wl_23,v6);
    		subInitial(DBParameter.pos_wl_23,v7);
    		subInitial(DBParameter.pos_wl_23,v8);
    		subInitial(DBParameter.pos_wl_23,v9);
    		subInitial(DBParameter.pos_wl_23,v10);
    		subInitial(DBParameter.pos_wl_23,v11);
    		subInitial(DBParameter.pos_wl_23,v12);
    		subInitial(DBParameter.pos_wl_23,v13);
    		subInitial(DBParameter.pos_wl_23,v14);
    		subInitial(DBParameter.pos_wl_23,v15);
    		subInitial(DBParameter.pos_wl_23,v16);
    		subInitial(DBParameter.pos_wl_23,v17);
    		subInitial(DBParameter.pos_wl_23,v18);
    		subInitial(DBParameter.pos_wl_23,v19);
    		subInitial(DBParameter.pos_wl_23,v20);
    		subInitial(DBParameter.pos_wl_23,v21);
    		subInitial(DBParameter.pos_wl_23,v22);
    		subInitial(DBParameter.pos_wl_23,v23);
    		subInitial(DBParameter.pos_wl_23,v24);
    		subInitial(DBParameter.pos_wl_23,v25);
    		subInitial(DBParameter.pos_wl_23,v26);
    		subInitial(DBParameter.pos_wl_23,v27);
    		subInitial(DBParameter.pos_wl_23,v28);
    		subInitial(DBParameter.pos_wl_23,v29);
    		subInitial(DBParameter.pos_wl_23,v30);
    		subInitial(DBParameter.pos_wl_23,v31);
    		subInitial(DBParameter.pos_wl_23,v32);
    		subInitial(DBParameter.pos_wl_23,v33);
    		subInitial(DBParameter.pos_wl_23,v34);
    		subInitial(DBParameter.pos_wl_23,v35);
    		subInitial(DBParameter.pos_wl_23,v36);
    		subInitial(DBParameter.pos_wl_23,v37);
    		subInitial(DBParameter.pos_wl_23,v38);
    		subInitial(DBParameter.pos_wl_23,v39);
    		subInitial(DBParameter.pos_wl_23,v40);
    		subInitial(DBParameter.pos_wl_23,v41);
    		subInitial(DBParameter.pos_wl_23,v42);
    		subInitial(DBParameter.pos_wl_23,v43);
    		subInitial(DBParameter.pos_wl_23,v44);
    		subInitial(DBParameter.pos_wl_23,v45);
    		subInitial(DBParameter.pos_wl_23,v46);
    		subInitial(DBParameter.pos_wl_23,v47);
    		subInitial(DBParameter.pos_wl_23,v48);
    		subInitial(DBParameter.pos_wl_23,v49);
    		subInitial(DBParameter.pos_wl_23,v50);
    		
    		subInitial(DBParameter.pos_wl_23,v51);
    		subInitial(DBParameter.pos_wl_23,v52);
    		subInitial(DBParameter.pos_wl_23,v53);
    		subInitial(DBParameter.pos_wl_23,v54);
    		subInitial(DBParameter.pos_wl_23,v55);
    		subInitial(DBParameter.pos_wl_23,v56);
    		subInitial(DBParameter.pos_wl_23,v57);
    		subInitial(DBParameter.pos_wl_23,v58);
    		subInitial(DBParameter.pos_wl_23,v59);
    		subInitial(DBParameter.pos_wl_23,v60);
    		subInitial(DBParameter.pos_wl_23,v61);
    		subInitial(DBParameter.pos_wl_23,v62);
    		subInitial(DBParameter.pos_wl_23,v63);
    		subInitial(DBParameter.pos_wl_23,v64);
    		subInitial(DBParameter.pos_wl_23,v65);
    		subInitial(DBParameter.pos_wl_23,v66);
    		subInitial(DBParameter.pos_wl_23,v67);
    		subInitial(DBParameter.pos_wl_23,v68);
    		subInitial(DBParameter.pos_wl_23,v69);
    		subInitial(DBParameter.pos_wl_23,v70);
    		subInitial(DBParameter.pos_wl_23,v71);
    		subInitial(DBParameter.pos_wl_23,v72);
    		subInitial(DBParameter.pos_wl_23,v73);
    		subInitial(DBParameter.pos_wl_23,v74);
    		subInitial(DBParameter.pos_wl_23,v75);
    		subInitial(DBParameter.pos_wl_23,v76);
    		subInitial(DBParameter.pos_wl_23,v77);
    		subInitial(DBParameter.pos_wl_23,v78);
    		subInitial(DBParameter.pos_wl_23,v79);
    		subInitial(DBParameter.pos_wl_23,v80);
    		subInitial(DBParameter.pos_wl_23,v81);
    		subInitial(DBParameter.pos_wl_23,v82);
    		subInitial(DBParameter.pos_wl_23,v83);
    		subInitial(DBParameter.pos_wl_23,v84);
    		subInitial(DBParameter.pos_wl_23,v85);
    		subInitial(DBParameter.pos_wl_23,v86);
    		subInitial(DBParameter.pos_wl_23,v87);
    		subInitial(DBParameter.pos_wl_23,v88);
    		subInitial(DBParameter.pos_wl_23,v89);
    		subInitial(DBParameter.pos_wl_23,v90);
    		subInitial(DBParameter.pos_wl_23,v91);
    		subInitial(DBParameter.pos_wl_23,v92);
    		subInitial(DBParameter.pos_wl_23,v93);
    		subInitial(DBParameter.pos_wl_23,v94);
    		subInitial(DBParameter.pos_wl_23,v95);
    		subInitial(DBParameter.pos_wl_23,v96);
    		subInitial(DBParameter.pos_wl_23,v97);
    		subInitial(DBParameter.pos_wl_23,v98);
    		subInitial(DBParameter.pos_wl_23,v99);
    		subInitial(DBParameter.pos_wl_23,v100);
    		subInitial(DBParameter.pos_wl_23,v101);
    		subInitial(DBParameter.pos_wl_23,v102);
    		subInitial(DBParameter.pos_wl_23,v103);
    		subInitial(DBParameter.pos_wl_23,v104);
    		subInitial(DBParameter.pos_wl_23,v105);
    		subInitial(DBParameter.pos_wl_23,v106);
    		subInitial(DBParameter.pos_wl_23,v107);
    		subInitial(DBParameter.pos_wl_23,v108);
    		subInitial(DBParameter.pos_wl_23,v109);
    		subInitial(DBParameter.pos_wl_23,v110);
    		subInitial(DBParameter.pos_wl_23,v111);
    		subInitial(DBParameter.pos_wl_23,v112);
    		subInitial(DBParameter.pos_wl_23,v113);
    		subInitial(DBParameter.pos_wl_23,v114);
    		subInitial(DBParameter.pos_wl_23,v115);
    		subInitial(DBParameter.pos_wl_23,v116);
    		subInitial(DBParameter.pos_wl_23,v117);
    		subInitial(DBParameter.pos_wl_23,v118);
    		
    		subInitial(DBParameter.pos_wl_23,v119);
    		subInitial(DBParameter.pos_wl_23,v120);
    		subInitial(DBParameter.pos_wl_23,v121);
    		subInitial(DBParameter.pos_wl_23,v122);
    		subInitial(DBParameter.pos_wl_23,v123);
    		subInitial(DBParameter.pos_wl_23,v124);
    		subInitial(DBParameter.pos_wl_23,v125);
    		subInitial(DBParameter.pos_wl_23,v126);
    		subInitial(DBParameter.pos_wl_23,v127);
    		subInitial(DBParameter.pos_wl_23,v128);
    		subInitial(DBParameter.pos_wl_23,v129);
    		subInitial(DBParameter.pos_wl_23,v130);
    		subInitial(DBParameter.pos_wl_23,v131);
    		subInitial(DBParameter.pos_wl_23,v132);
    		subInitial(DBParameter.pos_wl_23,v133);
    		subInitial(DBParameter.pos_wl_23,v134);
    		subInitial(DBParameter.pos_wl_23,v135);
    		subInitial(DBParameter.pos_wl_23,v136);
    		subInitial(DBParameter.pos_wl_23,v137);
    		subInitial(DBParameter.pos_wl_23,v138);
    		subInitial(DBParameter.pos_wl_23,v139);
    		subInitial(DBParameter.pos_wl_23,v140);
    		subInitial(DBParameter.pos_wl_23,v141);
    		subInitial(DBParameter.pos_wl_23,v142);
    		subInitial(DBParameter.pos_wl_23,v143);
    		subInitial(DBParameter.pos_wl_23,v144);
    		subInitial(DBParameter.pos_wl_23,v145);
    		subInitial(DBParameter.pos_wl_23,v146);
    		subInitial(DBParameter.pos_wl_23,v147);
    		subInitial(DBParameter.pos_wl_23,v148);
    		subInitial(DBParameter.pos_wl_23,v149);
    		subInitial(DBParameter.pos_wl_23,v150);
    		subInitial(DBParameter.pos_wl_23,v151);
    		subInitial(DBParameter.pos_wl_23,v152);
    		subInitial(DBParameter.pos_wl_23,v153);
    		subInitial(DBParameter.pos_wl_23,v154);
    		subInitial(DBParameter.pos_wl_23,v155);
    		subInitial(DBParameter.pos_wl_23,v156);
    		subInitial(DBParameter.pos_wl_23,v157);
    		subInitial(DBParameter.pos_wl_23,v158);
    		subInitial(DBParameter.pos_wl_23,v159);
    		subInitial(DBParameter.pos_wl_23,v160);
    		subInitial(DBParameter.pos_wl_23,v161);
    		subInitial(DBParameter.pos_wl_23,v162);
    		subInitial(DBParameter.pos_wl_23,v163);
    		subInitial(DBParameter.pos_wl_23,v164);
    	
    	
    }
    public void doList_24(){
    	String[] v1={"metropolitan","����е�",a,"0"};
    	String[] v2={"mettle","��������־",n,"0"};
    	String[] v3={"mettlesome","�����ӵ�",a,"0"};
    	String[] v4={"microbe","΢����",n,"0"};
    	String[] v5={"microorganism","΢���ϸ��",n,"0"};
    	String[] v6={"microscopic","��С�ģ���΢����",a,"0"};
    	String[] v7={"miff","С����",n,"0"};
    	String[] v8={"mighty","ǿ�����ģ�ǿ���",a,"0"};
    	String[] v9={"migratory","Ǩ�Ƶģ����˵�",a,"0"};
    	String[] v10={"milestone","��̱���ת�۵�",n,"0"};
    	String[] v11={"militia","���",n,"0"};
    	String[] v12={"milk","եȡ",v,"0"};
    	String[] v13={"mill","ĥ����ѹե�������쳧",n,"0"};
    	String[] v14={"mime","�ƾ�",n,"0"};
    	String[] v15={"mimic","ģ�£�ϷŪ��ģ���������е���",v+n,"0"};
    	String[] v16={"minaret","�����µļ���",n,"0"};
    	String[] v17={"minatory","��в�ģ����ŵ�",a,"0"};
    	String[] v18={"mince","���飬С����·",v,"0"};
    	String[] v19={"mingle","���",v,"0"};
    	String[] v20={"miniature","С������Ӱ",n,"0"};
    	String[] v21={"minimize","��С��",v,"0"};
    	String[] v22={"minion","ū��",n,"0"};
    	String[] v23={"minnow","���㣬С��ˮ��",n,"0"};
    	String[] v24={"mint","�������޶��ҳ�",n,"0"};
    	String[] v25={"minuet","С����",n,"0"};
    	String[] v26={"minuscule","��С��",a,"0"};
    	String[] v27={"minutes","�����¼",n,"0"};
    	String[] v28={"minutia","ϸ֦ĩ��",n,"0"};
    	String[] v29={"miracle","���£��漣",n,"0"};
    	String[] v30={"mirage","��Ӱ��������¥",n,"0"};
    	String[] v31={"mire","���ӣ�������ʹ...��������",n+v,"0"};
    	String[] v32={"mirth","���֣���Ц",n,"0"};
    	String[] v33={"misanthrope","����������",n,"0"};
    	String[] v34={"mischievous","�����ģ��к�����",a,"0"};
    	String[] v35={"miscreant","�������ͽ",n,"0"};
    	String[] v36={"miser","�ز�ū�����Ĺ�",n,"0"};
    	String[] v37={"miserly","���ĵģ�̰����",a,"0"};
    	String[] v38={"misgiving","���ģ�����",n,"0"};
    	String[] v39={"misinform","��...�ṩ������Ϣ",v,"0"};
    	String[] v40={"misnomer","���ֵ�����",n,"0"};
    	String[] v41={"misperceive","���",v,"0"};
    	String[] v42={"misrepresent","�󴫣�����",v,"0"};
    	String[] v43={"misshapen","���εģ����ι�״��",a,"0"};
    	String[] v44={"missile","���������",n,"0"};
    	String[] v45={"mite","��С����С��",n,"0"};
    	String[] v46={"mitigate","���ᣬ����",v,"0"};
    	String[] v47={"mitten","��ָ����",n,"0"};
    	String[] v48={"mnemonics","���䷨���������",n,"0"};
    	String[] v49={"moan","��������Թ",n+v,"0"};
    	String[] v50={"moat","���������Ǻ�",n,"0"};
    	String[] v51={"mobile","�����ƶ���",a,"0"};
        String[] v52={"mobility","�ɶ��ԣ�������",n,"0"};
        String[] v53={"mock","��Ц����Ū��ģ��",v,"0"};
        String[] v54={"mode","��ʽ��ʱ�У�ģʽ",n,"0"};
        String[] v55={"modest","ǫ��ģ�������",a,"0"};
        String[] v56={"modicum","����",n,"0"};
        String[] v57={"modify","�޸ģ����",v,"0"};
        String[] v58={"modish","ʱ�ֵ�",a,"0"};
        String[] v59={"modulate","����",v,"0"};
        String[] v60={"mogul","��Ҫ����",n,"0"};		
    	String[] v61={"molar","�ʳ�",n,"0"};
        String[] v62={"mold","ģ�ӣ�ù������",n+v,"0"};
       	String[] v63={"molding","װ��������������",n,"0"};
       	String[] v64={"moldy","��ù��",a,"0"};
       	String[] v65={"molecule","����",n,"0"};
       	String[] v66={"mollify","��ο������",v,"0"};
        String[] v67={"mollycoddle","���ְ�ϧ�����ߣ����ߵ���",v+n,"0"};
        String[] v68={"molt","���𣬻�ë",n+v,"0"};
        String[] v69={"molten","�ڻ���",a,"0"};
        String[] v70={"moment","˲�䣬��Ҫ",n,"0"};
    	String[] v71={"momentous","����Ҫ�ģ����ص�",a,"0"};
        String[] v72={"momentum","�ƽ�������ͷ",n,"0"};
       	String[] v73={"monarch","����������",n,"0"};
       	String[] v74={"monarchy","������",n,"0"};
       	String[] v75={"monetary","���ҵ�",a,"0"};
        String[] v76={"mongrel","���֣���Ѫ��",n,"0"};
        String[] v77={"monochromatic","��ɫ�ģ���ɫ����",a,"0"};
        String[] v78={"monochrome","��ɫ�ģ���ɫ����",n,"0"};
        String[] v79={"monocle","��Ƭ�۾�",n,"0"};
        String[] v80={"monogamy","һ��һ����",n,"0"};
    	String[] v81={"monolithic","��ʯ�ģ��޴��",a,"0"};
        String[] v82={"monologue","���ף����˳�ƪ��˵",n,"0"};
        String[] v83={"monomania","ƫִ֢�����Ȳ�",n,"0"};
        String[] v84={"monopoly","ר��Ȩ��¢��",n,"0"};
        String[] v85={"monotonous","�����ģ����ĵ�",a,"0"};
        String[] v86={"monotony","������ǧƪһ��",n,"0"};
        String[] v87={"monsoon","����",n,"0"};
        String[] v88={"montage","��̫�棬ƴ����",n,"0"};
        String[] v89={"monumental","����ģ������",a,"0"};
        String[] v90={"morale","ʿ������������",n,"0"};
        String[] v91={"moralistic","��ѧ����",a,"0"};
        String[] v92={"moratorium","ֹͣ��������ֹ�",n,"0"};
        String[] v93={"morbid","��̬�ģ���������",a,"0"};
        String[] v94={"mordant","����ģ������",a,"0"};
        String[] v95={"moribund","���������ģ�������",a,"0"};
        String[] v96={"morose","������",a,"0"};
        String[] v97={"morsel","һС��(ʳ��)��С��",n,"0"};
        String[] v98={"mortality","������",n,"0"};
        String[] v99={"mortar","�ʣ��в����Ȼ���",n,"0"};
        String[] v100={"mortgage","��Ѻ�����Ѻ֤�飻��...��Ѻ",n+v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"mortification","���裬����",n,"0"};
        	String[] v102={"mortify","ʹ���裬ʹʹ��",v,"0"};
        	String[] v103={"mortuary","ͣʬ��",n,"0"};
        	String[] v104={"mosaic","�����ˣ���Ƕϸ��",n,"0"};
        	String[] v105={"mosque","������",n,"0"};
        	String[] v106={"mosquito","����",n,"0"};
        	String[] v107={"mote","΢����΢��",n,"0"};
        	String[] v108={"motif","(��Ʒ)��ּ������",n,"0"};
        	String[] v109={"motility","�˶���",n,"0"};
        	String[] v110={"motley","���ӵģ���ɫ��",a,"0"};
        	String[] v111={"mottled","����ɫ�ģ��߲���",a,"0"};
        	String[] v112={"motto","������������",n,"0"};
        	String[] v113={"mountainous","��ɽ��",a,"0"};
        	String[] v114={"mourn","����������",v,"0"};
        	String[] v115={"mournful","���˵�",a,"0"};
        	String[] v116={"movement","����",n,"0"};
        	String[] v117={"muffle","ʹ�������ͣ���ס",v,"0"};
        	String[] v118={"mulish","��һ���ģ�ִ�ֵ�",a,"0"};
        	String[] v119={"multiple","�����ģ����ص�",a,"0"};
        	String[] v120={"multiplicity","������",n,"0"};
        	String[] v121={"multiply","�ˣ����ӣ���ֳ",v,"0"};
        	String[] v122={"mumble","���棬���������˵",v,"0"};
        	String[] v123={"mundane","�����ģ����׵�",a,"0"};
        	String[] v124={"municipality","�У���������",n,"0"};
        	String[] v125={"minificence","������������",n,"0"};
        	String[] v126={"munition","���𣬵�ҩ",n,"0"};
        	String[] v127={"mural","ǽ�ڵģ��ڻ�",a+n,"0"};
        	String[] v128={"murky","�ڰ��ģ����ʵ�",a,"0"};
        	String[] v129={"murmur","������˵����Թ",v,"0"};
        	String[] v130={"muse","��˼��ڤ��",v,"0"};
        	String[] v131={"musicologist","����ѧ��",n,"0"};
        	String[] v132={"musket","ëɪǹ",n,"0"};
        	String[] v133={"muster","�ټ����ۼ�",v,"0"};
        	String[] v134={"mutate","����",v,"0"};
        	String[] v135={"mute","��Ĭ�ģ�����������������",a+v+n,"0"};
        	String[] v136={"muted","(����)�����ģ���������",a,"0"};
        	String[] v137={"mutineer","�����ߣ�������",n,"0"};
        	String[] v138={"mutter","���棬�ֹ�",v,"0"};
        	String[] v139={"myopia","���ӣ�ȱ��Զ��",n,"0"};
        	String[] v140={"myopic","�����۵ģ�ȱ���������",a,"0"};
        	String[] v141={"myriad","���ģ�������",a,"0"};
        	String[] v142={"mystic","���صģ�����˼���",a,"0"};
        	String[] v143={"nadir","��͵�",n,"0"};
        	String[] v144={"nag","��߶�����ţ��Ҳ磬��Թ",v,"0"};
        	String[] v145={"naive","����ģ����ӵ�",a,"0"};
        	String[] v146={"narcissism","����",n,"0"};
        	String[] v147={"narcissist","�Ը����ˣ�������",n,"0"};
        	String[] v148={"narcotic","����ҩ�����ߵ�",n+a,"0"};
        	String[] v149={"narrative","�����ģ������µ�",a,"0"};
        	String[] v150={"nascent","�����ģ���ѿ��",a,"0"};
        	String[] v151={"natal","�����ģ�����ʱ��",a,"0"};
        	String[] v152={"natty","����ģ�������",a,"0"};
        	String[] v153={"nausea","��Ż������",n,"0"};
        	String[] v154={"nauseate","ʹ��Ż��ʹ���",v,"0"};
        	String[] v155={"nautical","��Ա�ģ�������",a,"0"};
        	String[] v156={"navigate","����������",v,"0"};
        	String[] v157={"naysay","�ܾ���˵��",v,"0"};
        	String[] v158={"nebulous","ģ�������",a,"0"};
        	String[] v159={"needle","�룬��Ҷ",n,"0"};
        	String[] v160={"needlework","���ң�����",n,"0"};
        	String[] v161={"needy","ƶ���",a,"0"};
        	String[] v162={"nefarious","а���",a,"0"};
        	String[] v163={"negate","ȡ��������",v,"0"};
        	String[] v164={"negation","�񶨣��ܾ�",n,"0"};
        	String[] v165={"negligence","���ģ����",n,"0"};
        	String[] v166={"negotiable","��������",a,"0"};
        	String[] v167={"negotiate","���飬̸�У�����",v,"0"};
        	String[] v168={"neolithic","��ʱ��ʱ����",a,"0"};
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_24,v1);
    		subInitial(DBParameter.pos_wl_24,v2);
    		subInitial(DBParameter.pos_wl_24,v3);
    		subInitial(DBParameter.pos_wl_24,v4);
    		subInitial(DBParameter.pos_wl_24,v5);
    		subInitial(DBParameter.pos_wl_24,v6);
    		subInitial(DBParameter.pos_wl_24,v7);
    		subInitial(DBParameter.pos_wl_24,v8);
    		subInitial(DBParameter.pos_wl_24,v9);
    		subInitial(DBParameter.pos_wl_24,v10);
    		subInitial(DBParameter.pos_wl_24,v11);
    		subInitial(DBParameter.pos_wl_24,v12);
    		subInitial(DBParameter.pos_wl_24,v13);
    		subInitial(DBParameter.pos_wl_24,v14);
    		subInitial(DBParameter.pos_wl_24,v15);
    		subInitial(DBParameter.pos_wl_24,v16);
    		subInitial(DBParameter.pos_wl_24,v17);
    		subInitial(DBParameter.pos_wl_24,v18);
    		subInitial(DBParameter.pos_wl_24,v19);
    		subInitial(DBParameter.pos_wl_24,v20);
    		subInitial(DBParameter.pos_wl_24,v21);
    		subInitial(DBParameter.pos_wl_24,v22);
    		subInitial(DBParameter.pos_wl_24,v23);
    		subInitial(DBParameter.pos_wl_24,v24);
    		subInitial(DBParameter.pos_wl_24,v25);
    		subInitial(DBParameter.pos_wl_24,v26);
    		subInitial(DBParameter.pos_wl_24,v27);
    		subInitial(DBParameter.pos_wl_24,v28);
    		subInitial(DBParameter.pos_wl_24,v29);
    		subInitial(DBParameter.pos_wl_24,v30);
    		subInitial(DBParameter.pos_wl_24,v31);
    		subInitial(DBParameter.pos_wl_24,v32);
    		subInitial(DBParameter.pos_wl_24,v33);
    		subInitial(DBParameter.pos_wl_24,v34);
    		subInitial(DBParameter.pos_wl_24,v35);
    		subInitial(DBParameter.pos_wl_24,v36);
    		subInitial(DBParameter.pos_wl_24,v37);
    		subInitial(DBParameter.pos_wl_24,v38);
    		subInitial(DBParameter.pos_wl_24,v39);
    		subInitial(DBParameter.pos_wl_24,v40);
    		subInitial(DBParameter.pos_wl_24,v41);
    		subInitial(DBParameter.pos_wl_24,v42);
    		subInitial(DBParameter.pos_wl_24,v43);
    		subInitial(DBParameter.pos_wl_24,v44);
    		subInitial(DBParameter.pos_wl_24,v45);
    		subInitial(DBParameter.pos_wl_24,v46);
    		subInitial(DBParameter.pos_wl_24,v47);
    		subInitial(DBParameter.pos_wl_24,v48);
    		subInitial(DBParameter.pos_wl_24,v49);
    		subInitial(DBParameter.pos_wl_24,v50);
    		
    		subInitial(DBParameter.pos_wl_24,v51);
    		subInitial(DBParameter.pos_wl_24,v52);
    		subInitial(DBParameter.pos_wl_24,v53);
    		subInitial(DBParameter.pos_wl_24,v54);
    		subInitial(DBParameter.pos_wl_24,v55);
    		subInitial(DBParameter.pos_wl_24,v56);
    		subInitial(DBParameter.pos_wl_24,v57);
    		subInitial(DBParameter.pos_wl_24,v58);
    		subInitial(DBParameter.pos_wl_24,v59);
    		subInitial(DBParameter.pos_wl_24,v60);
    		subInitial(DBParameter.pos_wl_24,v61);
    		subInitial(DBParameter.pos_wl_24,v62);
    		subInitial(DBParameter.pos_wl_24,v63);
    		subInitial(DBParameter.pos_wl_24,v64);
    		subInitial(DBParameter.pos_wl_24,v65);
    		subInitial(DBParameter.pos_wl_24,v66);
    		subInitial(DBParameter.pos_wl_24,v67);
    		subInitial(DBParameter.pos_wl_24,v68);
    		subInitial(DBParameter.pos_wl_24,v69);
    		subInitial(DBParameter.pos_wl_24,v70);
    		subInitial(DBParameter.pos_wl_24,v71);
    		subInitial(DBParameter.pos_wl_24,v72);
    		subInitial(DBParameter.pos_wl_24,v73);
    		subInitial(DBParameter.pos_wl_24,v74);
    		subInitial(DBParameter.pos_wl_24,v75);
    		subInitial(DBParameter.pos_wl_24,v76);
    		subInitial(DBParameter.pos_wl_24,v77);
    		subInitial(DBParameter.pos_wl_24,v78);
    		subInitial(DBParameter.pos_wl_24,v79);
    		subInitial(DBParameter.pos_wl_24,v80);
    		subInitial(DBParameter.pos_wl_24,v81);
    		subInitial(DBParameter.pos_wl_24,v82);
    		subInitial(DBParameter.pos_wl_24,v83);
    		subInitial(DBParameter.pos_wl_24,v84);
    		subInitial(DBParameter.pos_wl_24,v85);
    		subInitial(DBParameter.pos_wl_24,v86);
    		subInitial(DBParameter.pos_wl_24,v87);
    		subInitial(DBParameter.pos_wl_24,v88);
    		subInitial(DBParameter.pos_wl_24,v89);
    		subInitial(DBParameter.pos_wl_24,v90);
    		subInitial(DBParameter.pos_wl_24,v91);
    		subInitial(DBParameter.pos_wl_24,v92);
    		subInitial(DBParameter.pos_wl_24,v93);
    		subInitial(DBParameter.pos_wl_24,v94);
    		subInitial(DBParameter.pos_wl_24,v95);
    		subInitial(DBParameter.pos_wl_24,v96);
    		subInitial(DBParameter.pos_wl_24,v97);
    		subInitial(DBParameter.pos_wl_24,v98);
    		subInitial(DBParameter.pos_wl_24,v99);
    		subInitial(DBParameter.pos_wl_24,v100);
    		subInitial(DBParameter.pos_wl_24,v101);
    		subInitial(DBParameter.pos_wl_24,v102);
    		subInitial(DBParameter.pos_wl_24,v103);
    		subInitial(DBParameter.pos_wl_24,v104);
    		subInitial(DBParameter.pos_wl_24,v105);
    		subInitial(DBParameter.pos_wl_24,v106);
    		subInitial(DBParameter.pos_wl_24,v107);
    		subInitial(DBParameter.pos_wl_24,v108);
    		subInitial(DBParameter.pos_wl_24,v109);
    		subInitial(DBParameter.pos_wl_24,v110);
    		subInitial(DBParameter.pos_wl_24,v111);
    		subInitial(DBParameter.pos_wl_24,v112);
    		subInitial(DBParameter.pos_wl_24,v113);
    		subInitial(DBParameter.pos_wl_24,v114);
    		subInitial(DBParameter.pos_wl_24,v115);
    		subInitial(DBParameter.pos_wl_24,v116);
    		subInitial(DBParameter.pos_wl_24,v117);
    		subInitial(DBParameter.pos_wl_24,v118);
    		
    		subInitial(DBParameter.pos_wl_24,v119);
    		subInitial(DBParameter.pos_wl_24,v120);
    		subInitial(DBParameter.pos_wl_24,v121);
    		subInitial(DBParameter.pos_wl_24,v122);
    		subInitial(DBParameter.pos_wl_24,v123);
    		subInitial(DBParameter.pos_wl_24,v124);
    		subInitial(DBParameter.pos_wl_24,v125);
    		subInitial(DBParameter.pos_wl_24,v126);
    		subInitial(DBParameter.pos_wl_24,v127);
    		subInitial(DBParameter.pos_wl_24,v128);
    		subInitial(DBParameter.pos_wl_24,v129);
    		subInitial(DBParameter.pos_wl_24,v130);
    		subInitial(DBParameter.pos_wl_24,v131);
    		subInitial(DBParameter.pos_wl_24,v132);
    		subInitial(DBParameter.pos_wl_24,v133);
    		subInitial(DBParameter.pos_wl_24,v134);
    		subInitial(DBParameter.pos_wl_24,v135);
    		subInitial(DBParameter.pos_wl_24,v136);
    		subInitial(DBParameter.pos_wl_24,v137);
    		subInitial(DBParameter.pos_wl_24,v138);
    		subInitial(DBParameter.pos_wl_24,v139);
    		subInitial(DBParameter.pos_wl_24,v140);
    		subInitial(DBParameter.pos_wl_24,v141);
    		subInitial(DBParameter.pos_wl_24,v142);
    		subInitial(DBParameter.pos_wl_24,v143);
    		subInitial(DBParameter.pos_wl_24,v144);
    		subInitial(DBParameter.pos_wl_24,v145);
    		subInitial(DBParameter.pos_wl_24,v146);
    		subInitial(DBParameter.pos_wl_24,v147);
    		subInitial(DBParameter.pos_wl_24,v148);
    		subInitial(DBParameter.pos_wl_24,v149);
    		subInitial(DBParameter.pos_wl_24,v150);
    		subInitial(DBParameter.pos_wl_24,v151);
    		subInitial(DBParameter.pos_wl_24,v152);
    		subInitial(DBParameter.pos_wl_24,v153);
    		subInitial(DBParameter.pos_wl_24,v154);
    		subInitial(DBParameter.pos_wl_24,v155);
    		subInitial(DBParameter.pos_wl_24,v156);
    		subInitial(DBParameter.pos_wl_24,v157);
    		subInitial(DBParameter.pos_wl_24,v158);
    		subInitial(DBParameter.pos_wl_24,v159);
    		subInitial(DBParameter.pos_wl_24,v160);
    		subInitial(DBParameter.pos_wl_24,v161);
    		subInitial(DBParameter.pos_wl_24,v162);
    		subInitial(DBParameter.pos_wl_24,v163);
    		subInitial(DBParameter.pos_wl_24,v164);
    		subInitial(DBParameter.pos_wl_24,v165);
    		subInitial(DBParameter.pos_wl_24,v166);
    		subInitial(DBParameter.pos_wl_24,v167);
    		subInitial(DBParameter.pos_wl_24,v168);
    		
        	
    	
    }
    
    public void doList_25(){
    	
    	String[] v1={"neologism","���֣�����",n,"0"};
    	String[] v2={"neophyte","��ѧ�ߣ�����",n,"0"};
    	String[] v3={"neopotism","ȹ����ϵ",n,"0"};
    	String[] v4={"nerve","��������������",n+v,"0"};
    	String[] v5={"nettle","ݡ�飻����",n+v,"0"};
    	String[] v6={"neurology","��ѧ",n,"0"};
    	String[] v7={"neutralize","ʹ��Ч",v,"0"};
    	String[] v8={"neutron","����",n,"0"};
    	String[] v9={"nexus","��ϵ������",n,"0"};
    	String[] v10={"nib","�ֱʼ�",n,"0"};
    	String[] v11={"nibble","һ���ؿ�",v,"0"};
    	String[] v12={"nice","���ܵ�",a,"0"};
    	String[] v13={"nick","С�˿ڣ��̺�",n,"0"};
    	String[] v14={"nightmare","����",n,"0"};
    	String[] v15={"nil","�ޣ���",n,"0"};
    	String[] v16={"nip","С�����",v,"0"};
    	String[] v17={"nitpick","��ë���",v,"0"};
    	String[] v18={"nocturnal","ҹ��ģ�ҹ�䷢����",a,"0"};
    	String[] v19={"noisome","����ģ����˲�ˬ��",a,"0"};
    	String[] v20={"nomad","�����ߣ���������",n,"0"};
    	String[] v21={"nomadic","������",a,"0"};
    	String[] v22={"nominal","�����ϵģ�������ʵ��",a,"0"};
    	String[] v23={"nominate","������������ָ��",v,"0"};
    	String[] v24={"nonchalance","��Į������",n,"0"};
    	String[] v25={"noncommittal","̬�������ģ����е������",a,"0"};
    	String[] v26={"nonentity","����Ҫ���˻���",n,"0"};
    	String[] v27={"nonflammable","����ȼ��",a,"0"};
    	String[] v28={"nonplus","ʹ�����Ի��Ի󣬾���",v+n,"0"};
    	String[] v29={"nonporous","�޿׵ģ�����©��",a,"0"};
    	String[] v30={"nonradioactive","�Ƿ����Ե�",a,"0"};
    	String[] v31={"nonsensical","���Ƶģ��������",a,"0"};
    	String[] v32={"nonthreatening","����в��",a,"0"};
    	String[] v33={"nonviable","�޷������",a,"0"};
    	String[] v34={"norm","�淶��׼��",n,"0"};
    	String[] v35={"nostalgia","���ɣ�˼��",n,"0"};
    	String[] v36={"nostrum","�Ҵ��ط�������ҩ",n,"0"};
    	String[] v37={"notable","���Եģ����ڵģ���Ҫ��",a,"0"};
    	String[] v38={"notch","V���ο̺�",n,"0"};
    	String[] v39={"notorious","����������",a,"0"};
    	String[] v40={"nourish","����������",v,"0"};
    	String[] v41={"nova","����",n,"0"};
    	String[] v42={"novelty","����(������)",n,"0"};
    	String[] v43={"novice","����",n,"0"};
    	String[] v44={"noxious","�к��ģ��ж���",a,"0"};
    	String[] v45={"nuance","ϸ΢����",n,"0"};
    	String[] v46={"nubile","(Ů��)���������ģ������˵ģ��Ըе�",a,"0"};
    	String[] v47={"nucleate","ʹ�ɺˣ��к˵�",v+a,"0"};
    	String[] v48={"nucleus","(ԭ��)��",n,"0"};
    	String[] v49={"nudge","(����)�ᴥ������",v,"0"};
    	String[] v50={"nugatory","�޼�ֵ�ģ������",a,"0"};
    	String[] v51={"nulify","ʹ��Ч��ȡ��",v,"0"};
        String[] v52={"numb","��ľ��",a,"0"};
        String[] v53={"numerous","���ģ��ܶ��",a,"0"};
        String[] v54={"numismatist","Ǯ��ѧ�ң�Ǯ���ղؼ�",n,"0"};
        String[] v55={"nurture","������������������Ӫ�����������",v+n,"0"};
        String[] v56={"nutrient","��������",n,"0"};
        String[] v57={"nutrition","Ӫ����Ӫ��ѧ",n,"0"};
        String[] v58={"oafishness","�մ�",n,"0"};
        String[] v59={"oak","����",n,"0"};
        String[] v60={"oasis","����",n,"0"};		
    	String[] v61={"oath","���ԣ�����",n,"0"};
        String[] v62={"obdurate","��ִ�ģ���̵�",a,"0"};
       	String[] v63={"obedient","���ӵģ�˳�ӵ�",a,"0"};
       	String[] v64={"obeisance","�Ϲ�������",n,"0"};
       	String[] v65={"obese","�����ֵ�",a,"0"};
       	String[] v66={"obfuscate","ʹ����ʹ�Ի�",v,"0"};
        String[] v67={"obituary","���ţ�����",n,"0"};
        String[] v68={"objection","��񣬷���",n,"0"};
        String[] v69={"objective","�͹۵�",a,"0"};
        String[] v70={"obligation","���Σ�ծ��",n,"0"};
    	String[] v71={"obligatory","ǿ���Եģ������",a,"0"};
        String[] v72={"oblige","������������",v,"0"};
       	String[] v73={"obliging","���еģ��������˵�",a,"0"};
       	String[] v74={"oblique","��ӵģ�б��",a,"0"};
       	String[] v75={"obliterate","Ϳ��������",v,"0"};
        String[] v76={"oblivious","�����ģ������",a,"0"};
        String[] v77={"obloquy","�������",n,"0"};
        String[] v78={"obnoxious","���˲�ˬ��",a,"0"};
        String[] v79={"obscure","�����ģ�������ģ����أ�ʹ...ģ��",a+v,"0"};
        String[] v80={"obscurity","�ѽ⣬������",n,"0"};
    	String[] v81={"obsequious","��ӭ�ģ����ĵ�",a,"0"};
        String[] v82={"observatory","����̨",n,"0"};
        String[] v83={"obsess","��ס��ʹ������ʹ����",v,"0"};
        String[] v84={"obsolete","�����ģ���ʱ��",a,"0"};
        String[] v85={"obstacle","�ϰ�������",n,"0"};
        String[] v86={"obstinacy","��ִ���������",n,"0"};
        String[] v87={"obstinate","��ִ�ģ���ǿ��",a,"0"};
        String[] v88={"obstreperous","���ֵģ��ѹ�����",a,"0"};
        String[] v89={"obstruct","��أ��ض�",v,"0"};
        String[] v90={"obtainable","�ܵõ���",a,"0"};
        String[] v91={"obtuse","�ޱ��ģ���������",a,"0"};
        String[] v92={"obverse","����(��)",n+a,"0"};
        String[] v93={"obviate","�ų�������(Σ�գ�����)",v,"0"};
        String[] v94={"obvious","���Եģ��Զ��׼���",a,"0"};
        String[] v95={"occlude","ʹ����",v,"0"};
        String[] v96={"occult","���ܵģ���������",a,"0"};
        String[] v97={"occupation","������ְҵ��ռ��",n,"0"};
        String[] v98={"occurence","�¼�������",n,"0"};
        String[] v99={"octogenarian","��Ѯ����",n,"0"};
        String[] v100={"odds","���ᣬ������",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"ode","��ʫ���̸�",n,"0"};
        	String[] v102={"odious","�����ģ������",a,"0"};
        	String[] v103={"odium","����",n,"0"};
        	String[] v104={"odometer","��̱�",n,"0"};
        	String[] v105={"odyssey","��;ð������",n,"0"};
        	String[] v106={"offbeat","������ģ���ƽ����",a,"0"};
        	String[] v107={"offence(offense)","ð��������",n,"0"};
        	String[] v108={"offend","ð��",v,"0"};
        	String[] v109={"offensive","���˲���ģ������˵�",a,"0"};
        	String[] v110={"offhand","������׼���ģ�����",a+d,"0"};
        	String[] v111={"officious","��������ģ����Ҹ�ģ��������ڵ�",a,"0"};
        	String[] v112={"offish","�䵭��",a,"0"};
        	String[] v113={"off-key","�ߵ��ģ�����г��",a,"0"};
        	String[] v114={"offset","����������",v,"0"};
        	String[] v115={"offspring","��Ů�����",n,"0"};
        	String[] v116={"offstage","Ļ���",a+d,"0"};
        	String[] v117={"ogle","���ﲨ������",v+n,"0"};
        	String[] v118={"ointment","�͸࣬���",n,"0"};
        	String[] v119={"olfaction","���",n,"0"};
        	String[] v120={"oligarchy","��ͷ����",n,"0"};
        	String[] v121={"omelet","�嵰��",n,"0"};
        	String[] v122={"ominous","Ԥ�׵ģ������",a,"0"};
        	String[] v123={"omit","ʡ�ԣ���©�����",v,"0"};
        	String[] v124={"omnipotent","ȫ�ܵģ����ܵ�",a,"0"};
        	String[] v125={"omnipresent","�޴����ڵ�",a,"0"};
        	String[] v126={"omniscient","������֪��",a,"0"};
        	String[] v127={"onerous","���صģ��鷳��",a,"0"};
        	String[] v128={"onset","(�����)��ʼ����",n,"0"};
        	String[] v129={"opacity","��͸���ԣ���ɬ",n,"0"};
        	String[] v130={"opalescence","(��͸����)��׹�",n,"0"};
        	String[] v131={"opaque","��͸���ģ��Ѷ���",a,"0"};
        	String[] v132={"operative","ʵʩ�е�",a,"0"};
        	String[] v133={"operetta","С���",n,"0"};
        	String[] v134={"opine","�룬��Ϊ",v,"0"};
        	String[] v135={"opinionated","��ִ������",a,"0"};
        	String[] v136={"opponent","����",n,"0"};
        	String[] v137={"opportune","���ʵģ��ʵ���",a,"0"};
        	String[] v138={"oppose","����",v,"0"};
        	String[] v139={"oppress","ѹ�ȣ�ѹ��",v,"0"};
        	String[] v140={"opprobrious","����ģ���������",a,"0"};
        	String[] v141={"optimism","�ֹ�����",n,"0"};
        	String[] v142={"optimist","�ֹ�������",n,"0"};
        	String[] v143={"optimum","��õģ���������",a,"0"};
        	String[] v144={"optional","������ѡ���",a,"0"};
        	String[] v145={"opulent","��ԣ�ģ������",a,"0"};
        	String[] v146={"oracle","���񷢲����͵���",n,"0"};
        	String[] v147={"oration","��ʽ��˵���ݽ�",n,"0"};
        	String[] v148={"oratorio","�峪��",n,"0"};
        	String[] v149={"oratory","�ݽ���",n,"0"};
        	String[] v150={"orchard","��԰",n,"0"};
        	String[] v151={"orchestra","�����ֶ�",n,"0"};
        	String[] v152={"ordain","����(��ְ)���䷢����",v,"0"};
        	String[] v153={"ordeal","�Ͼ����飬ʹ�ྭ��",n,"0"};
        	String[] v154={"ordnance","���ڣ���е",n,"0"};
        	String[] v155={"ore","�󣬿�ʯ",n,"0"};
        	String[] v156={"organism","����л���",n,"0"};
        	String[] v157={"orient","ȷ������ʹ��Ϥ���",v,"0"};
        	String[] v158={"original","����ģ�ԭʼ�ģ��д����",a,"0"};
        	String[] v159={"orginality","�����ԣ�������",n,"0"};
        	String[] v160={"ornate","�����ģ�����װ�ε�",a,"0"};
        	String[] v161={"ornithologist","����ѧ��",n,"0"};
        	String[] v162={"ornithology","����ѧ",n,"0"};
        	String[] v163={"orthodontics","���ݽ���ѧ",n,"0"};
        	String[] v164={"orthodox","��ͳ��",a,"0"};
        	
        	
        	
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_25,v1);
    		subInitial(DBParameter.pos_wl_25,v2);
    		subInitial(DBParameter.pos_wl_25,v3);
    		subInitial(DBParameter.pos_wl_25,v4);
    		subInitial(DBParameter.pos_wl_25,v5);
    		subInitial(DBParameter.pos_wl_25,v6);
    		subInitial(DBParameter.pos_wl_25,v7);
    		subInitial(DBParameter.pos_wl_25,v8);
    		subInitial(DBParameter.pos_wl_25,v9);
    		subInitial(DBParameter.pos_wl_25,v10);
    		subInitial(DBParameter.pos_wl_25,v11);
    		subInitial(DBParameter.pos_wl_25,v12);
    		subInitial(DBParameter.pos_wl_25,v13);
    		subInitial(DBParameter.pos_wl_25,v14);
    		subInitial(DBParameter.pos_wl_25,v15);
    		subInitial(DBParameter.pos_wl_25,v16);
    		subInitial(DBParameter.pos_wl_25,v17);
    		subInitial(DBParameter.pos_wl_25,v18);
    		subInitial(DBParameter.pos_wl_25,v19);
    		subInitial(DBParameter.pos_wl_25,v20);
    		subInitial(DBParameter.pos_wl_25,v21);
    		subInitial(DBParameter.pos_wl_25,v22);
    		subInitial(DBParameter.pos_wl_25,v23);
    		subInitial(DBParameter.pos_wl_25,v24);
    		subInitial(DBParameter.pos_wl_25,v25);
    		subInitial(DBParameter.pos_wl_25,v26);
    		subInitial(DBParameter.pos_wl_25,v27);
    		subInitial(DBParameter.pos_wl_25,v28);
    		subInitial(DBParameter.pos_wl_25,v29);
    		subInitial(DBParameter.pos_wl_25,v30);
    		subInitial(DBParameter.pos_wl_25,v31);
    		subInitial(DBParameter.pos_wl_25,v32);
    		subInitial(DBParameter.pos_wl_25,v33);
    		subInitial(DBParameter.pos_wl_25,v34);
    		subInitial(DBParameter.pos_wl_25,v35);
    		subInitial(DBParameter.pos_wl_25,v36);
    		subInitial(DBParameter.pos_wl_25,v37);
    		subInitial(DBParameter.pos_wl_25,v38);
    		subInitial(DBParameter.pos_wl_25,v39);
    		subInitial(DBParameter.pos_wl_25,v40);
    		subInitial(DBParameter.pos_wl_25,v41);
    		subInitial(DBParameter.pos_wl_25,v42);
    		subInitial(DBParameter.pos_wl_25,v43);
    		subInitial(DBParameter.pos_wl_25,v44);
    		subInitial(DBParameter.pos_wl_25,v45);
    		subInitial(DBParameter.pos_wl_25,v46);
    		subInitial(DBParameter.pos_wl_25,v47);
    		subInitial(DBParameter.pos_wl_25,v48);
    		subInitial(DBParameter.pos_wl_25,v49);
    		subInitial(DBParameter.pos_wl_25,v50);
    		
    		subInitial(DBParameter.pos_wl_25,v51);
    		subInitial(DBParameter.pos_wl_25,v52);
    		subInitial(DBParameter.pos_wl_25,v53);
    		subInitial(DBParameter.pos_wl_25,v54);
    		subInitial(DBParameter.pos_wl_25,v55);
    		subInitial(DBParameter.pos_wl_25,v56);
    		subInitial(DBParameter.pos_wl_25,v57);
    		subInitial(DBParameter.pos_wl_25,v58);
    		subInitial(DBParameter.pos_wl_25,v59);
    		subInitial(DBParameter.pos_wl_25,v60);
    		subInitial(DBParameter.pos_wl_25,v61);
    		subInitial(DBParameter.pos_wl_25,v62);
    		subInitial(DBParameter.pos_wl_25,v63);
    		subInitial(DBParameter.pos_wl_25,v64);
    		subInitial(DBParameter.pos_wl_25,v65);
    		subInitial(DBParameter.pos_wl_25,v66);
    		subInitial(DBParameter.pos_wl_25,v67);
    		subInitial(DBParameter.pos_wl_25,v68);
    		subInitial(DBParameter.pos_wl_25,v69);
    		subInitial(DBParameter.pos_wl_25,v70);
    		subInitial(DBParameter.pos_wl_25,v71);
    		subInitial(DBParameter.pos_wl_25,v72);
    		subInitial(DBParameter.pos_wl_25,v73);
    		subInitial(DBParameter.pos_wl_25,v74);
    		subInitial(DBParameter.pos_wl_25,v75);
    		subInitial(DBParameter.pos_wl_25,v76);
    		subInitial(DBParameter.pos_wl_25,v77);
    		subInitial(DBParameter.pos_wl_25,v78);
    		subInitial(DBParameter.pos_wl_25,v79);
    		subInitial(DBParameter.pos_wl_25,v80);
    		subInitial(DBParameter.pos_wl_25,v81);
    		subInitial(DBParameter.pos_wl_25,v82);
    		subInitial(DBParameter.pos_wl_25,v83);
    		subInitial(DBParameter.pos_wl_25,v84);
    		subInitial(DBParameter.pos_wl_25,v85);
    		subInitial(DBParameter.pos_wl_25,v86);
    		subInitial(DBParameter.pos_wl_25,v87);
    		subInitial(DBParameter.pos_wl_25,v88);
    		subInitial(DBParameter.pos_wl_25,v89);
    		subInitial(DBParameter.pos_wl_25,v90);
    		subInitial(DBParameter.pos_wl_25,v91);
    		subInitial(DBParameter.pos_wl_25,v92);
    		subInitial(DBParameter.pos_wl_25,v93);
    		subInitial(DBParameter.pos_wl_25,v94);
    		subInitial(DBParameter.pos_wl_25,v95);
    		subInitial(DBParameter.pos_wl_25,v96);
    		subInitial(DBParameter.pos_wl_25,v97);
    		subInitial(DBParameter.pos_wl_25,v98);
    		subInitial(DBParameter.pos_wl_25,v99);
    		subInitial(DBParameter.pos_wl_25,v100);
    		subInitial(DBParameter.pos_wl_25,v101);
    		subInitial(DBParameter.pos_wl_25,v102);
    		subInitial(DBParameter.pos_wl_25,v103);
    		subInitial(DBParameter.pos_wl_25,v104);
    		subInitial(DBParameter.pos_wl_25,v105);
    		subInitial(DBParameter.pos_wl_25,v106);
    		subInitial(DBParameter.pos_wl_25,v107);
    		subInitial(DBParameter.pos_wl_25,v108);
    		subInitial(DBParameter.pos_wl_25,v109);
    		subInitial(DBParameter.pos_wl_25,v110);
    		subInitial(DBParameter.pos_wl_25,v111);
    		subInitial(DBParameter.pos_wl_25,v112);
    		subInitial(DBParameter.pos_wl_25,v113);
    		subInitial(DBParameter.pos_wl_25,v114);
    		subInitial(DBParameter.pos_wl_25,v115);
    		subInitial(DBParameter.pos_wl_25,v116);
    		subInitial(DBParameter.pos_wl_25,v117);
    		subInitial(DBParameter.pos_wl_25,v118);
    		
    		subInitial(DBParameter.pos_wl_25,v119);
    		subInitial(DBParameter.pos_wl_25,v120);
    		subInitial(DBParameter.pos_wl_25,v121);
    		subInitial(DBParameter.pos_wl_25,v122);
    		subInitial(DBParameter.pos_wl_25,v123);
    		subInitial(DBParameter.pos_wl_25,v124);
    		subInitial(DBParameter.pos_wl_25,v125);
    		subInitial(DBParameter.pos_wl_25,v126);
    		subInitial(DBParameter.pos_wl_25,v127);
    		subInitial(DBParameter.pos_wl_25,v128);
    		subInitial(DBParameter.pos_wl_25,v129);
    		subInitial(DBParameter.pos_wl_25,v130);
    		subInitial(DBParameter.pos_wl_25,v131);
    		subInitial(DBParameter.pos_wl_25,v132);
    		subInitial(DBParameter.pos_wl_25,v133);
    		subInitial(DBParameter.pos_wl_25,v134);
    		subInitial(DBParameter.pos_wl_25,v135);
    		subInitial(DBParameter.pos_wl_25,v136);
    		subInitial(DBParameter.pos_wl_25,v137);
    		subInitial(DBParameter.pos_wl_25,v138);
    		subInitial(DBParameter.pos_wl_25,v139);
    		subInitial(DBParameter.pos_wl_25,v140);
    		subInitial(DBParameter.pos_wl_25,v141);
    		subInitial(DBParameter.pos_wl_25,v142);
    		subInitial(DBParameter.pos_wl_25,v143);
    		subInitial(DBParameter.pos_wl_25,v144);
    		subInitial(DBParameter.pos_wl_25,v145);
    		subInitial(DBParameter.pos_wl_25,v146);
    		subInitial(DBParameter.pos_wl_25,v147);
    		subInitial(DBParameter.pos_wl_25,v148);
    		subInitial(DBParameter.pos_wl_25,v149);
    		subInitial(DBParameter.pos_wl_25,v150);
    		subInitial(DBParameter.pos_wl_25,v151);
    		subInitial(DBParameter.pos_wl_25,v152);
    		subInitial(DBParameter.pos_wl_25,v153);
    		subInitial(DBParameter.pos_wl_25,v154);
    		subInitial(DBParameter.pos_wl_25,v155);
    		subInitial(DBParameter.pos_wl_25,v156);
    		subInitial(DBParameter.pos_wl_25,v157);
    		subInitial(DBParameter.pos_wl_25,v158);
    		subInitial(DBParameter.pos_wl_25,v159);
    		subInitial(DBParameter.pos_wl_25,v160);
    		subInitial(DBParameter.pos_wl_25,v161);
    		subInitial(DBParameter.pos_wl_25,v162);
    		subInitial(DBParameter.pos_wl_25,v163);
    		subInitial(DBParameter.pos_wl_25,v164);
    		
        	
    	
    }
    public void doList_26(){
    	String[] v1={"oscillate","�ڶ�����ԥ",v,"0"};
    	String[] v2={"osmosis","��͸��Ǳ��Ĭ��",n,"0"};
    	String[] v3={"osseous","�ǵģ���ǵ�",a,"0"};
    	String[] v4={"ossify","�ǻ���Ӳ��������",v,"0"};
    	String[] v5={"ostensible","�����ϵ�",a,"0"};
    	String[] v6={"ostentation","��ʾ����ҫ",n,"0"};
    	String[] v7={"ostracism","�����ų�",n,"0"};
    	String[] v8={"ostracize","�����ų�",v,"0"};
    	String[] v9={"ostrich","���񣬲�������ʵ����",n,"0"};
    	String[] v10={"other-directed","����֧���",a,"0"};
    	String[] v11={"otter","ˮ̡",n,"0"};
    	String[] v12={"oust","����",v,"0"};
    	String[] v13={"outgoing","���Ƶģ�������ȥ��",a,"0"};
    	String[] v14={"outgrowth","��Ȼ���������Ʒ",n,"0"};
    	String[] v15={"outlandish","�Źֵ�",a,"0"};
    	String[] v16={"outlet","����",n,"0"};
    	String[] v17={"outline","����������",n,"0"};
    	String[] v18={"outmaneuver","�Բ�����ʤ",v,"0"};
    	String[] v19={"outmoded","�������е�",a,"0"};
    	String[] v20={"outrage","����",n,"0"};
    	String[] v21={"outset","��ʼ����ͷ",n,"0"};
    	String[] v22={"outshine","��...����",v,"0"};
    	String[] v23={"outskirts","����������",n,"0"};
    	String[] v24={"outspoken","ֱ�Բ����",a,"0"};
    	String[] v25={"outstrip","�������ܹ�",v,"0"};
    	String[] v26={"outwit","�Ի���ʤ��",v,"0"};
    	String[] v27={"ovation","���ҵĻ�ӭ������",n,"0"};
    	String[] v28={"overbearing","ר��ģ����ϵ�",a,"0"};
    	String[] v29={"overdose","����ļ���",n,"0"};
    	String[] v30={"overdue","����δ���ģ����ڵ�",a,"0"};
    	String[] v31={"overexposure","���ֱ�¶��(��Ƭ)�ع����",n,"0"};
    	String[] v32={"overflow","���������",v,"0"};
    	String[] v33={"overhaul","���׼�飬����",v,"0"};
    	String[] v34={"overlap","(���ֵ�)�ص�",v,"0"};
    	String[] v35={"overlook","���ӣ�����",v,"0"};
    	String[] v36={"overpowering","ѹ���Եģ����ɿ��ܵ�",a,"0"};
    	String[] v37={"overreach","���¹�ͷ",v,"0"};
    	String[] v38={"override","����ᣬ�����̤",v,"0"};
    	String[] v39={"overriding","����Ҫ�ģ����ȵ�",a,"0"};
    	String[] v40={"overrule","(�ϼ����¼���)���",v,"0"};
    	String[] v41={"oversee","�ල",v,"0"};
    	String[] v42={"overshadow","�ڱΣ�ʹʧɫ",v,"0"};
    	String[] v43={"overstate","�Թ���ʵ",v,"0"};
    	String[] v44={"overt","������",a,"0"};
    	String[] v45={"overthrow","�Ʒ�����ֹ",n+v,"0"};
    	String[] v46={"overture","ǰ����������",n,"0"};
    	String[] v47={"overturn","�������Ʒ�",v,"0"};
    	String[] v48={"overwhelm","���ģ�ѹ��",v,"0"};
    	String[] v49={"overwrought","���Ź��ȵģ��˷ܹ��ȵ�",a,"0"};
    	String[] v50={"owl","èͷӥ",n,"0"};
    	String[] v51={"oxidize","����������",v,"0"};
        String[] v52={"pacifist","��ս������",n,"0"};
        String[] v53={"pacify","��ο",v,"0"};
        String[] v54={"pack","��Ⱥ��һȺ����",n,"0"};
        String[] v55={"packed","�����˵ģ�ӵ����",a,"0"};
        String[] v56={"pact","Э����ЭԼ",n,"0"};
        String[] v57={"padding","�ĵ棬����",n,"0"};
        String[] v58={"paean","�����裬�̸�",n,"0"};
        String[] v59={"pagan","û���ڽ��������ˣ����ͽ",n,"0"};
        String[] v60={"pageant","׳�۵����У�¶����ʷ��",n,"0"};		
    	String[] v61={"painkiller","ֹʹҩ",n,"0"};
        String[] v62={"painstaking","ɷ�ѿ��ĵ�",a,"0"};
       	String[] v63={"palate","���񣬿�ζ������",n,"0"};
       	String[] v64={"palatial","�����ģ���ΰ��",a,"0"};
       	String[] v65={"palette","��ɫ�壬��������",n,"0"};
       	String[] v66={"pall","���˷��壬ʧȥ������",v,"0"};
        String[] v67={"palliate","����(ʹ��)������(����)",v,"0"};
        String[] v68={"palliative","���ͼ�������ģ����͵�",n+a,"0"};
        String[] v69={"pallid","�԰׵ģ���Ѫɫ��",a,"0"};
        String[] v70={"palmy","���ٵģ���鵵�",a,"0"};
    	String[] v71={"palpable","�ɴ�֪��",a,"0"};
        String[] v72={"palpitate","(����)���ٲ����������",v,"0"};
       	String[] v73={"palter","�������",v,"0"};
       	String[] v74={"paltry","�޼�ֵ�ģ�΢�������",a,"0"};
       	String[] v75={"pamphlet","С����",n,"0"};
        String[] v76={"pan","��������",v,"0"};
        String[] v77={"panacea","����ҩ",n,"0"};
        String[] v78={"panache","��ҫ������",n,"0"};
        String[] v79={"pancreas","����",n,"0"};
        String[] v80={"pandemic","(����)��Χ���е�",a,"0"};
    	String[] v81={"pandemonium","�����������",n,"0"};
        String[] v82={"panegyric","�̴ʣ�����",n,"0"};
        String[] v83={"panel","ר��С�飬�Ǳ��",n,"0"};
        String[] v84={"pang","һ���ʹ",n,"0"};
        String[] v85={"panic","�ֻ�(��)",n+a,"0"};
        String[] v86={"panorama","�Źۣ�ȫ��",n,"0"};
        String[] v87={"panther","�ڱ�",n,"0"};
        String[] v88={"pantomime","�ƾ�",n,"0"};
        String[] v89={"pantry","ʳƷ��",n,"0"};
        String[] v90={"papyrus","ɯ�ݣ�ɯ��ֽ",n,"0"};
        String[] v91={"parable","Ԣ�ԣ�����",n,"0"};
        String[] v92={"parabola","������",n,"0"};
        String[] v93={"paradigm","������ʾ��",n,"0"};
        String[] v94={"paradox","���ƴ���ȴ��ȷ�����ۣ���ͨ�������෴�Ĺ۵�",n,"0"};
        String[] v95={"paragon","ģ��������",n,"0"};
        String[] v96={"parallel","ƽ�еģ����Ƶģ�ƽ���ߣ���...����",a+n+v,"0"};
        String[] v97={"parallelism","ƽ�У�����",n,"0"};
        String[] v98={"parameter","����������",n,"0"};
        String[] v99={"paramount","����Ҫ�ģ����Ȩ����",a,"0"};
        String[] v100={"paranoia","ƫִ�񣬶���֢",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"paranoid","ƫִ�ģ����ɵ�",a,"0"};
        	String[] v102={"paraphrase","���ͣ�����",v,"0"};
        	String[] v103={"parasite","ʳ�ͣ�������",n,"0"};
        	String[] v104={"parch","�濾������",v,"0"};
        	String[] v105={"pare","�����޼�������",v,"0"};
        	String[] v106={"pariah","����",n,"0"};
        	String[] v107={"parity","ͬ��",n,"0"};
        	String[] v108={"parka","�ɿ˴���",n,"0"};
        	String[] v109={"parlance","˵��������",n,"0"};
        	String[] v110={"parody","ģ���Եĳ�Ū���»���ݣ�׾�ӵ�ģ��",n,"0"};
        	String[] v111={"paroxysm","(�����)ͻ��",n,"0"};
        	String[] v112={"parquet","��ľ�ذ�",n,"0"};
        	String[] v113={"parry","�������ܿ�",v,"0"};
        	String[] v114={"parse","��...���﷨����",v,"0"};
        	String[] v115={"parsimony","����",n,"0"};
        	String[] v116={"partial","�ֲ��ģ�ƫ̻��",a,"0"};
        	String[] v117={"partiality","ƫ̻��ƫ��",n,"0"};
        	String[] v118={"particular","��ʵ��ϸ��",n,"0"};
        	String[] v119={"particularize","�������о�",v,"0"};
        	String[] v120={"partisan","��ͽ������֧����",n,"0"};
        	String[] v121={"partition","��������ǽ",n,"0"};
        	String[] v122={"passionate","���������",a,"0"};
        	String[] v123={"passive","�����ģ�ȱ��������",a,"0"};
        	String[] v124={"pastel","��ɫ�۱ʻ����ʻ�����͵�ɫ��",n,"0"};
        	String[] v125={"pasteurize","��������",v,"0"};
        	String[] v126={"pastiche","���ƴ�յ���Ʒ",n,"0"};
        	String[] v127={"pastoral","԰������ģ�������",a,"0"};
        	String[] v128={"pastry","��㣬����",n,"0"};
        	String[] v129={"patch","������һСƬ(����)",n,"0"};
        	String[] v130={"patent","�Զ��׼��ģ�ר��Ȩ",a+n,"0"};
        	String[] v131={"pathogen","��ԭ��",n,"0"};
        	String[] v132={"pathology","����ѧ",n,"0"};
        	String[] v133={"patina","���⣬���������",n,"0"};
        	String[] v134={"patrician","����",n,"0"};
        	String[] v135={"patrimony","�洫�Ʋ�",n,"0"};
        	String[] v136={"patriot","������",n,"0"};
        	String[] v137={"patriotism","��������",n,"0"};
        	String[] v138={"patronage","�������ݹ�",n,"0"};
        	String[] v139={"patronize","�Ը���һ�ȵ�̬�ȶԴ����ݹ�",v,"0"};
        	String[] v140={"paucity","С����ȱ��",n,"0"};
        	String[] v141={"paunchy","����ӵ�",a,"0"};
        	String[] v142={"pauper","ƶ����ؤ",n,"0"};
        	String[] v143={"peak","�㲣�����",v,"0"};
        	String[] v144={"pecan","ɽ����",n,"0"};
        	String[] v145={"peccadillo","С��ʧ",n,"0"};
        	String[] v146={"peck","��ʳ������",v,"0"};
        	String[] v147={"pedagogue","��ʦ��������",n,"0"};
        	String[] v148={"pedagogy","����ѧ����ѧ��",n,"0"};
        	String[] v149={"pedal","̤�壬�ŵţ����̤��",n+v,"0"};
        	String[] v150={"pedant","�ظ�֮�ˣ������",n,"0"};
        	String[] v151={"pedestal","����",n,"0"};
        	
        	subInitial(DBParameter.pos_wl_26,v1);
    		subInitial(DBParameter.pos_wl_26,v2);
    		subInitial(DBParameter.pos_wl_26,v3);
    		subInitial(DBParameter.pos_wl_26,v4);
    		subInitial(DBParameter.pos_wl_26,v5);
    		subInitial(DBParameter.pos_wl_26,v6);
    		subInitial(DBParameter.pos_wl_26,v7);
    		subInitial(DBParameter.pos_wl_26,v8);
    		subInitial(DBParameter.pos_wl_26,v9);
    		subInitial(DBParameter.pos_wl_26,v10);
    		subInitial(DBParameter.pos_wl_26,v11);
    		subInitial(DBParameter.pos_wl_26,v12);
    		subInitial(DBParameter.pos_wl_26,v13);
    		subInitial(DBParameter.pos_wl_26,v14);
    		subInitial(DBParameter.pos_wl_26,v15);
    		subInitial(DBParameter.pos_wl_26,v16);
    		subInitial(DBParameter.pos_wl_26,v17);
    		subInitial(DBParameter.pos_wl_26,v18);
    		subInitial(DBParameter.pos_wl_26,v19);
    		subInitial(DBParameter.pos_wl_26,v20);
    		subInitial(DBParameter.pos_wl_26,v21);
    		subInitial(DBParameter.pos_wl_26,v22);
    		subInitial(DBParameter.pos_wl_26,v23);
    		subInitial(DBParameter.pos_wl_26,v24);
    		subInitial(DBParameter.pos_wl_26,v25);
    		subInitial(DBParameter.pos_wl_26,v26);
    		subInitial(DBParameter.pos_wl_26,v27);
    		subInitial(DBParameter.pos_wl_26,v28);
    		subInitial(DBParameter.pos_wl_26,v29);
    		subInitial(DBParameter.pos_wl_26,v30);
    		subInitial(DBParameter.pos_wl_26,v31);
    		subInitial(DBParameter.pos_wl_26,v32);
    		subInitial(DBParameter.pos_wl_26,v33);
    		subInitial(DBParameter.pos_wl_26,v34);
    		subInitial(DBParameter.pos_wl_26,v35);
    		subInitial(DBParameter.pos_wl_26,v36);
    		subInitial(DBParameter.pos_wl_26,v37);
    		subInitial(DBParameter.pos_wl_26,v38);
    		subInitial(DBParameter.pos_wl_26,v39);
    		subInitial(DBParameter.pos_wl_26,v40);
    		subInitial(DBParameter.pos_wl_26,v41);
    		subInitial(DBParameter.pos_wl_26,v42);
    		subInitial(DBParameter.pos_wl_26,v43);
    		subInitial(DBParameter.pos_wl_26,v44);
    		subInitial(DBParameter.pos_wl_26,v45);
    		subInitial(DBParameter.pos_wl_26,v46);
    		subInitial(DBParameter.pos_wl_26,v47);
    		subInitial(DBParameter.pos_wl_26,v48);
    		subInitial(DBParameter.pos_wl_26,v49);
    		subInitial(DBParameter.pos_wl_26,v50);
    		
    		subInitial(DBParameter.pos_wl_26,v51);
    		subInitial(DBParameter.pos_wl_26,v52);
    		subInitial(DBParameter.pos_wl_26,v53);
    		subInitial(DBParameter.pos_wl_26,v54);
    		subInitial(DBParameter.pos_wl_26,v55);
    		subInitial(DBParameter.pos_wl_26,v56);
    		subInitial(DBParameter.pos_wl_26,v57);
    		subInitial(DBParameter.pos_wl_26,v58);
    		subInitial(DBParameter.pos_wl_26,v59);
    		subInitial(DBParameter.pos_wl_26,v60);
    		subInitial(DBParameter.pos_wl_26,v61);
    		subInitial(DBParameter.pos_wl_26,v62);
    		subInitial(DBParameter.pos_wl_26,v63);
    		subInitial(DBParameter.pos_wl_26,v64);
    		subInitial(DBParameter.pos_wl_26,v65);
    		subInitial(DBParameter.pos_wl_26,v66);
    		subInitial(DBParameter.pos_wl_26,v67);
    		subInitial(DBParameter.pos_wl_26,v68);
    		subInitial(DBParameter.pos_wl_26,v69);
    		subInitial(DBParameter.pos_wl_26,v70);
    		subInitial(DBParameter.pos_wl_26,v71);
    		subInitial(DBParameter.pos_wl_26,v72);
    		subInitial(DBParameter.pos_wl_26,v73);
    		subInitial(DBParameter.pos_wl_26,v74);
    		subInitial(DBParameter.pos_wl_26,v75);
    		subInitial(DBParameter.pos_wl_26,v76);
    		subInitial(DBParameter.pos_wl_26,v77);
    		subInitial(DBParameter.pos_wl_26,v78);
    		subInitial(DBParameter.pos_wl_26,v79);
    		subInitial(DBParameter.pos_wl_26,v80);
    		subInitial(DBParameter.pos_wl_26,v81);
    		subInitial(DBParameter.pos_wl_26,v82);
    		subInitial(DBParameter.pos_wl_26,v83);
    		subInitial(DBParameter.pos_wl_26,v84);
    		subInitial(DBParameter.pos_wl_26,v85);
    		subInitial(DBParameter.pos_wl_26,v86);
    		subInitial(DBParameter.pos_wl_26,v87);
    		subInitial(DBParameter.pos_wl_26,v88);
    		subInitial(DBParameter.pos_wl_26,v89);
    		subInitial(DBParameter.pos_wl_26,v90);
    		subInitial(DBParameter.pos_wl_26,v91);
    		subInitial(DBParameter.pos_wl_26,v92);
    		subInitial(DBParameter.pos_wl_26,v93);
    		subInitial(DBParameter.pos_wl_26,v94);
    		subInitial(DBParameter.pos_wl_26,v95);
    		subInitial(DBParameter.pos_wl_26,v96);
    		subInitial(DBParameter.pos_wl_26,v97);
    		subInitial(DBParameter.pos_wl_26,v98);
    		subInitial(DBParameter.pos_wl_26,v99);
    		subInitial(DBParameter.pos_wl_26,v100);
    		subInitial(DBParameter.pos_wl_26,v101);
    		subInitial(DBParameter.pos_wl_26,v102);
    		subInitial(DBParameter.pos_wl_26,v103);
    		subInitial(DBParameter.pos_wl_26,v104);
    		subInitial(DBParameter.pos_wl_26,v105);
    		subInitial(DBParameter.pos_wl_26,v106);
    		subInitial(DBParameter.pos_wl_26,v107);
    		subInitial(DBParameter.pos_wl_26,v108);
    		subInitial(DBParameter.pos_wl_26,v109);
    		subInitial(DBParameter.pos_wl_26,v110);
    		subInitial(DBParameter.pos_wl_26,v111);
    		subInitial(DBParameter.pos_wl_26,v112);
    		subInitial(DBParameter.pos_wl_26,v113);
    		subInitial(DBParameter.pos_wl_26,v114);
    		subInitial(DBParameter.pos_wl_26,v115);
    		subInitial(DBParameter.pos_wl_26,v116);
    		subInitial(DBParameter.pos_wl_26,v117);
    		subInitial(DBParameter.pos_wl_26,v118);
    		
    		subInitial(DBParameter.pos_wl_26,v119);
    		subInitial(DBParameter.pos_wl_26,v120);
    		subInitial(DBParameter.pos_wl_26,v121);
    		subInitial(DBParameter.pos_wl_26,v122);
    		subInitial(DBParameter.pos_wl_26,v123);
    		subInitial(DBParameter.pos_wl_26,v124);
    		subInitial(DBParameter.pos_wl_26,v125);
    		subInitial(DBParameter.pos_wl_26,v126);
    		subInitial(DBParameter.pos_wl_26,v127);
    		subInitial(DBParameter.pos_wl_26,v128);
    		subInitial(DBParameter.pos_wl_26,v129);
    		subInitial(DBParameter.pos_wl_26,v130);
    		subInitial(DBParameter.pos_wl_26,v131);
    		subInitial(DBParameter.pos_wl_26,v132);
    		subInitial(DBParameter.pos_wl_26,v133);
    		subInitial(DBParameter.pos_wl_26,v134);
    		subInitial(DBParameter.pos_wl_26,v135);
    		subInitial(DBParameter.pos_wl_26,v136);
    		subInitial(DBParameter.pos_wl_26,v137);
    		subInitial(DBParameter.pos_wl_26,v138);
    		subInitial(DBParameter.pos_wl_26,v139);
    		subInitial(DBParameter.pos_wl_26,v140);
    		subInitial(DBParameter.pos_wl_26,v141);
    		subInitial(DBParameter.pos_wl_26,v142);
    		subInitial(DBParameter.pos_wl_26,v143);
    		subInitial(DBParameter.pos_wl_26,v144);
    		subInitial(DBParameter.pos_wl_26,v145);
    		subInitial(DBParameter.pos_wl_26,v146);
    		subInitial(DBParameter.pos_wl_26,v147);
    		subInitial(DBParameter.pos_wl_26,v148);
    		subInitial(DBParameter.pos_wl_26,v149);
    		subInitial(DBParameter.pos_wl_26,v150);
    		subInitial(DBParameter.pos_wl_26,v151);
    	
    	
    }
    public void doList_27(){
    	String[] v1={"pedestrian","ͽ���ģ�ȱ������ģ�����",a+n,"0"};
    	String[] v2={"pediatrics","С����",n,"0"};
    	String[] v3={"peel","��...��Ƥ����Ƥ",v+n,"0"};
    	String[] v4={"peer","ͬ��֮�ˣ�ͬ��",n,"0"};
    	String[] v5={"peerless","�޿�ƥ�е�",a,"0"};
    	String[] v6={"peeve","ʹ���գ�Թ��",v,"0"};
    	String[] v7={"peevish","��Ƣ����",a,"0"};
    	String[] v8={"pejorative","������ģ���͵�",a,"0"};
    	String[] v9={"pelf","Ǯ�ƣ�����֮��",n,"0"};
    	String[] v10={"pell-mell","���ҵ�",d,"0"};
    	String[] v11={"pellucid","�����ģ��峺��",a,"0"};
    	String[] v12={"pen","Χ���������ĸ���",n,"0"};
    	String[] v13={"penalize","��...�ڲ�����λ������",v,"0"};
    	String[] v14={"penalty","�̷�������",n,"0"};
    	String[] v15={"penance","���ҳͷ�",n,"0"};
    	String[] v16={"penchant","���ã��Ⱥ�",n,"0"};
    	String[] v17={"pending","���������ģ�δ����",a,"0"};
    	String[] v18={"pendulum","�ڣ��Ӱ�",n,"0"};
    	String[] v19={"penetrate","�̴������룬�˽�",v,"0"};
    	String[] v20={"peninsula","�뵺",n,"0"};
    	String[] v21={"penitent","��ڵģ���ڵ�",a,"0"};
    	String[] v22={"pennant","(���ϵ�)�ź���",n,"0"};
    	String[] v23={"penultimate","�����ڶ���",a,"0"};
    	String[] v24={"penury","ƶ�����",n,"0"};
    	String[] v25={"perambulate","Ѳ�ӣ�����",v,"0"};
    	String[] v26={"perception","�о���������",n,"0"};
    	String[] v27={"perch","��Ϣ",v,"0"};
    	String[] v28={"percussionist","�û���������ʦ",n,"0"};
    	String[] v29={"peregrination","����",n,"0"};
    	String[] v30={"peremptory","���ݷ����ģ�ר���",a,"0"};
    	String[] v31={"perennial","����ģ����õ�",a,"0"};
    	String[] v32={"perfervid","�ǳ����ĵ�",a,"0"};
    	String[] v33={"perfidious","���ҵģ����������",a,"0"};
    	String[] v34={"perfidy","���ң�����",n,"0"};
    	String[] v35={"perforate","��",v,"0"};
    	String[] v36={"perfunctory","���ʵ�",a,"0"};
    	String[] v37={"peril","Σ��",n,"0"};
    	String[] v38={"perilous","Σ�յģ�ð�յ�",a,"0"};
    	String[] v39={"perimeter","�ܳ�",n,"0"};
    	String[] v40={"periodical","�ڿ�",n,"0"};
    	String[] v41={"peripatetic","Ѳ�ε�",a,"0"};
    	String[] v42={"peripheral","����Ҫ�ģ���Χ��",a,"0"};
    	String[] v43={"periphery","����Ҫ�Ĳ��֣���Χ",n,"0"};
    	String[] v44={"periscope","Ǳ����",n,"0"};
    	String[] v45={"perish","��������",v,"0"};
    	String[] v46={"perishing","�Ϻ���",a,"0"};
    	String[] v47={"perjure","��α֤��������",v,"0"};
    	String[] v48={"perjury","��α֤��������",n,"0"};
    	String[] v49={"perky","����ģ����õ�",a,"0"};
    	String[] v50={"permanent","���õģ����õ�",a,"0"};
    	String[] v51={"permeable","����͸��",a,"0"};
        String[] v52={"permeate","��ɢ����͸",v,"0"};
        String[] v53={"permissive","�������ݵ�",a,"0"};
        String[] v54={"pernicious","�к��ģ�������",a,"0"};
        String[] v55={"perpendidcular","��ֱ��",a,"0"};
        String[] v56={"perpetual","�������ϵģ����õ�",a,"0"};
        String[] v57={"perpetuate","ʹ���棬ʹ���ǲ���",v,"0"};
        String[] v58={"perquisite","�̶�����������",n,"0"};
        String[] v59={"persecute","�Ⱥ�",v,"0"};
        String[] v60={"persiflage","�ڿ࣬��Ū",n,"0"};		
    	String[] v61={"personable","Ӣ���ģ���Ⱥõ�",a,"0"};
        String[] v62={"personification","���ͣ�������������",n,"0"};
       	String[] v63={"personnel","ȫ����Ա��Ա��",n,"0"};
       	String[] v64={"perspective","(���������)�Ƕȣ�����",n,"0"};
       	String[] v65={"perspicacious","���߻��۵�",a,"0"};
       	String[] v66={"perspicuity","�������������",n,"0"};
        String[] v67={"perspicuous","�����ģ����˵�",a,"0"};
        String[] v68={"perspire","����",v,"0"};
        String[] v69={"pertain","����",v,"0"};
        String[] v70={"pertinacious","��ִ�ģ��޷���Ԧ�ģ�����Э��",a,"0"};
    	String[] v71={"pertinent","�йصģ���ص�",a,"0"};
        String[] v72={"peruse","ϸ��������",v,"0"};
       	String[] v73={"pervade","�������ռ�",v,"0"};
       	String[] v74={"pervious","����͸��",a,"0"};
       	String[] v75={"pessimism","���ۣ���������",n,"0"};
        String[] v76={"pest","���棬����������˻���",n,"0"};
        String[] v77={"pester","������ǿ��",v,"0"};
        String[] v78={"pesticide","ɱ���",n,"0"};
        String[] v79={"pestilent","�����ģ��к���",a,"0"};
        String[] v80={"pestle","�ƣ��鲧�",n,"0"};
    	String[] v81={"petal","����",n,"0"};
        String[] v82={"petition","��Ը����Ը��",n,"0"};
        String[] v83={"petitioner","��Ը��",n,"0"};
        String[] v84={"petrify","ʯ�����Ŵ�",v,"0"};
        String[] v85={"petroglyph","��ʯ���",n,"0"};
        String[] v86={"petroleum","ʯ��",n,"0"};
        String[] v87={"petrology","��ʯѧ",n,"0"};
        String[] v88={"petty","�����",a,"0"};
        String[] v89={"petulance","��Ƣ�����Լ�",n,"0"};
        String[] v90={"petulant","�Լ��ģ������",a,"0"};
        String[] v91={"phantom","���飬����",n,"0"};
        String[] v92={"pharmaceutical","��ҩ��",a,"0"};
        String[] v93={"phenomena","����",n,"0"};
        String[] v94={"phenomenal","������",a,"0"};
        String[] v95={"philanthropic","������",a,"0"};
        String[] v96={"philatelist","���ʼ�",n,"0"};
        String[] v97={"philately","����",n,"0"};
        String[] v98={"philistine","ӹ�ˣ��п�",n,"0"};
        String[] v99={"phlegmatic","�侲�ģ��䵭��",a,"0"};
        String[] v100={"phoenix","��ˣ�����������������",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"phonetic","������",a,"0"};
        	String[] v102={"photosynthesis","�������",n,"0"};
        	String[] v103={"physiological","����ģ�����ѧ�ϵ�",a,"0"};
        	String[] v104={"piano","�����",a,"0"};
        	String[] v105={"pictorial","�滭�ģ���ͼƬ�ģ���ͼƬ��ʾ��",a,"0"};
        	String[] v106={"piddling","����ģ�΢�������",a,"0"};
        	String[] v107={"pied","��ɫ��",a,"0"};
        	String[] v108={"pierce","��͸������",v,"0"};
        	String[] v109={"piercing","�̹ǵģ������",a,"0"};
        	String[] v110={"pigment","��Ȼɫ�أ��ɷ�����",n,"0"};
        	String[] v111={"pilgrim","��ʥ�ͣ����",n,"0"};
        	String[] v112={"pillar","����",n,"0"};
        	String[] v113={"pillory","���ּϣ�ʾ�ڣ���Ū",n,"0"};
        	String[] v114={"pilot","����Ա���캽Ա���쵼��",n,"0"};
        	String[] v115={"pinch","������һ�飬һ��",v+n,"0"};
        	String[] v116={"pine","��������",n,"0"};
        	String[] v117={"pinnacle","������ɽ�壬����",n,"0"};
        	String[] v118={"pinpoint","��ȷ���ҳ����������ǳ���ȷ��",v+a,"0"};
        	String[] v119={"pious","�ϵģ������",a,"0"};
        	String[] v120={"piquant","�����ģ���θ�ģ��˷ܵ�",a,"0"};
        	String[] v121={"pique","(�������˺���)���ã���ŭ��ð��",n+v,"0"};
        	String[] v122={"pirate","�����������ߣ���ӡ���Ӷ�",n+v,"0"};
        	String[] v123={"pirouette","(�赸)�ż��ŵص���ת",v+n,"0"};
        	String[] v124={"pistol","��ǹ",n,"0"};
        	String[] v125={"pitch","���࣬���ͣ�����",n,"0"};
        	String[] v126={"pitcher","�б�ˮ��",n,"0"};
        	String[] v127={"pitfall","���壬δ�ϵ���Σ�ջ�����",n,"0"};
        	String[] v128={"pith","���裬Ҫ��",n,"0"};
        	String[] v129={"pithiness","���",n,"0"};
        	String[] v130={"pithy","������",a,"0"};
        	String[] v131={"pitiful","ֵ��ͬ���",a,"0"};
        	String[] v132={"pittance","΢����нٺ",n,"0"};
        	String[] v133={"placate","��ο��ƽϢ",v,"0"};
        	String[] v134={"placebo","��ο��",n,"0"};
        	String[] v135={"placid","�����ģ�ƽ�͵�",a,"0"};
        	String[] v136={"plagiarism","���ԣ���Ϯ",n,"0"};
        	String[] v137={"plagiarize","���ԣ���Ϯ",v,"0"};
        	String[] v138={"plague","���ߣ�������˻������",n+v,"0"};
        	String[] v139={"plain","�򵥵ģ�����ģ�ƽԭ",a+n,"0"};
        	String[] v140={"plaintiff","ԭ��",n,"0"};
        	String[] v141={"plaintive","�����ģ����ĵ�",a,"0"};
        	String[] v142={"plait","���裻��ɱ�",n+v,"0"};
        	String[] v143={"plane","���ӣ�ƽ�棻��",n+v,"0"};
        	String[] v144={"plangent","�����ģ�������",a,"0"};
        	String[] v145={"plankton","��������",n,"0"};
        	String[] v146={"plaster","���࣬ʯ�ࣻĨ����",n+v,"0"};
        	String[] v147={"plateau","��ԭ��ƽ�ȵ�״̬",n,"0"};
        	String[] v148={"platitude","�´��ĵ�",n,"0"};
        	String[] v149={"platonic","���۵ģ�������ģ��޸й�������",a,"0"};
        	String[] v150={"plaudit","�Ȳʣ�����",v,"0"};
        	String[] v151={"plausible","�����Ͽ������е����",a,"0"};
        	String[] v152={"plead","�������...Ϊ����",v,"0"};
        	String[] v153={"pleat","(�·��ϵ�)��",n,"0"};
        	String[] v154={"pledge","���ԣ���֤������",n+v,"0"};
        	String[] v155={"plenitude","��ȫ������",n,"0"};
        	String[] v156={"plethora","��������ʣ",n,"0"};
        	String[] v157={"pliable","����ģ������",a,"0"};
        	String[] v158={"pliant","����Ӱ��ģ������",a,"0"};
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_27,v1);
    		subInitial(DBParameter.pos_wl_27,v2);
    		subInitial(DBParameter.pos_wl_27,v3);
    		subInitial(DBParameter.pos_wl_27,v4);
    		subInitial(DBParameter.pos_wl_27,v5);
    		subInitial(DBParameter.pos_wl_27,v6);
    		subInitial(DBParameter.pos_wl_27,v7);
    		subInitial(DBParameter.pos_wl_27,v8);
    		subInitial(DBParameter.pos_wl_27,v9);
    		subInitial(DBParameter.pos_wl_27,v10);
    		subInitial(DBParameter.pos_wl_27,v11);
    		subInitial(DBParameter.pos_wl_27,v12);
    		subInitial(DBParameter.pos_wl_27,v13);
    		subInitial(DBParameter.pos_wl_27,v14);
    		subInitial(DBParameter.pos_wl_27,v15);
    		subInitial(DBParameter.pos_wl_27,v16);
    		subInitial(DBParameter.pos_wl_27,v17);
    		subInitial(DBParameter.pos_wl_27,v18);
    		subInitial(DBParameter.pos_wl_27,v19);
    		subInitial(DBParameter.pos_wl_27,v20);
    		subInitial(DBParameter.pos_wl_27,v21);
    		subInitial(DBParameter.pos_wl_27,v22);
    		subInitial(DBParameter.pos_wl_27,v23);
    		subInitial(DBParameter.pos_wl_27,v24);
    		subInitial(DBParameter.pos_wl_27,v25);
    		subInitial(DBParameter.pos_wl_27,v26);
    		subInitial(DBParameter.pos_wl_27,v27);
    		subInitial(DBParameter.pos_wl_27,v28);
    		subInitial(DBParameter.pos_wl_27,v29);
    		subInitial(DBParameter.pos_wl_27,v30);
    		subInitial(DBParameter.pos_wl_27,v31);
    		subInitial(DBParameter.pos_wl_27,v32);
    		subInitial(DBParameter.pos_wl_27,v33);
    		subInitial(DBParameter.pos_wl_27,v34);
    		subInitial(DBParameter.pos_wl_27,v35);
    		subInitial(DBParameter.pos_wl_27,v36);
    		subInitial(DBParameter.pos_wl_27,v37);
    		subInitial(DBParameter.pos_wl_27,v38);
    		subInitial(DBParameter.pos_wl_27,v39);
    		subInitial(DBParameter.pos_wl_27,v40);
    		subInitial(DBParameter.pos_wl_27,v41);
    		subInitial(DBParameter.pos_wl_27,v42);
    		subInitial(DBParameter.pos_wl_27,v43);
    		subInitial(DBParameter.pos_wl_27,v44);
    		subInitial(DBParameter.pos_wl_27,v45);
    		subInitial(DBParameter.pos_wl_27,v46);
    		subInitial(DBParameter.pos_wl_27,v47);
    		subInitial(DBParameter.pos_wl_27,v48);
    		subInitial(DBParameter.pos_wl_27,v49);
    		subInitial(DBParameter.pos_wl_27,v50);
    		
    		subInitial(DBParameter.pos_wl_27,v51);
    		subInitial(DBParameter.pos_wl_27,v52);
    		subInitial(DBParameter.pos_wl_27,v53);
    		subInitial(DBParameter.pos_wl_27,v54);
    		subInitial(DBParameter.pos_wl_27,v55);
    		subInitial(DBParameter.pos_wl_27,v56);
    		subInitial(DBParameter.pos_wl_27,v57);
    		subInitial(DBParameter.pos_wl_27,v58);
    		subInitial(DBParameter.pos_wl_27,v59);
    		subInitial(DBParameter.pos_wl_27,v60);
    		subInitial(DBParameter.pos_wl_27,v61);
    		subInitial(DBParameter.pos_wl_27,v62);
    		subInitial(DBParameter.pos_wl_27,v63);
    		subInitial(DBParameter.pos_wl_27,v64);
    		subInitial(DBParameter.pos_wl_27,v65);
    		subInitial(DBParameter.pos_wl_27,v66);
    		subInitial(DBParameter.pos_wl_27,v67);
    		subInitial(DBParameter.pos_wl_27,v68);
    		subInitial(DBParameter.pos_wl_27,v69);
    		subInitial(DBParameter.pos_wl_27,v70);
    		subInitial(DBParameter.pos_wl_27,v71);
    		subInitial(DBParameter.pos_wl_27,v72);
    		subInitial(DBParameter.pos_wl_27,v73);
    		subInitial(DBParameter.pos_wl_27,v74);
    		subInitial(DBParameter.pos_wl_27,v75);
    		subInitial(DBParameter.pos_wl_27,v76);
    		subInitial(DBParameter.pos_wl_27,v77);
    		subInitial(DBParameter.pos_wl_27,v78);
    		subInitial(DBParameter.pos_wl_27,v79);
    		subInitial(DBParameter.pos_wl_27,v80);
    		subInitial(DBParameter.pos_wl_27,v81);
    		subInitial(DBParameter.pos_wl_27,v82);
    		subInitial(DBParameter.pos_wl_27,v83);
    		subInitial(DBParameter.pos_wl_27,v84);
    		subInitial(DBParameter.pos_wl_27,v85);
    		subInitial(DBParameter.pos_wl_27,v86);
    		subInitial(DBParameter.pos_wl_27,v87);
    		subInitial(DBParameter.pos_wl_27,v88);
    		subInitial(DBParameter.pos_wl_27,v89);
    		subInitial(DBParameter.pos_wl_27,v90);
    		subInitial(DBParameter.pos_wl_27,v91);
    		subInitial(DBParameter.pos_wl_27,v92);
    		subInitial(DBParameter.pos_wl_27,v93);
    		subInitial(DBParameter.pos_wl_27,v94);
    		subInitial(DBParameter.pos_wl_27,v95);
    		subInitial(DBParameter.pos_wl_27,v96);
    		subInitial(DBParameter.pos_wl_27,v97);
    		subInitial(DBParameter.pos_wl_27,v98);
    		subInitial(DBParameter.pos_wl_27,v99);
    		subInitial(DBParameter.pos_wl_27,v100);
    		subInitial(DBParameter.pos_wl_27,v101);
    		subInitial(DBParameter.pos_wl_27,v102);
    		subInitial(DBParameter.pos_wl_27,v103);
    		subInitial(DBParameter.pos_wl_27,v104);
    		subInitial(DBParameter.pos_wl_27,v105);
    		subInitial(DBParameter.pos_wl_27,v106);
    		subInitial(DBParameter.pos_wl_27,v107);
    		subInitial(DBParameter.pos_wl_27,v108);
    		subInitial(DBParameter.pos_wl_27,v109);
    		subInitial(DBParameter.pos_wl_27,v110);
    		subInitial(DBParameter.pos_wl_27,v111);
    		subInitial(DBParameter.pos_wl_27,v112);
    		subInitial(DBParameter.pos_wl_27,v113);
    		subInitial(DBParameter.pos_wl_27,v114);
    		subInitial(DBParameter.pos_wl_27,v115);
    		subInitial(DBParameter.pos_wl_27,v116);
    		subInitial(DBParameter.pos_wl_27,v117);
    		subInitial(DBParameter.pos_wl_27,v118);
    		
    		subInitial(DBParameter.pos_wl_27,v119);
    		subInitial(DBParameter.pos_wl_27,v120);
    		subInitial(DBParameter.pos_wl_27,v121);
    		subInitial(DBParameter.pos_wl_27,v122);
    		subInitial(DBParameter.pos_wl_27,v123);
    		subInitial(DBParameter.pos_wl_27,v124);
    		subInitial(DBParameter.pos_wl_27,v125);
    		subInitial(DBParameter.pos_wl_27,v126);
    		subInitial(DBParameter.pos_wl_27,v127);
    		subInitial(DBParameter.pos_wl_27,v128);
    		subInitial(DBParameter.pos_wl_27,v129);
    		subInitial(DBParameter.pos_wl_27,v130);
    		subInitial(DBParameter.pos_wl_27,v131);
    		subInitial(DBParameter.pos_wl_27,v132);
    		subInitial(DBParameter.pos_wl_27,v133);
    		subInitial(DBParameter.pos_wl_27,v134);
    		subInitial(DBParameter.pos_wl_27,v135);
    		subInitial(DBParameter.pos_wl_27,v136);
    		subInitial(DBParameter.pos_wl_27,v137);
    		subInitial(DBParameter.pos_wl_27,v138);
    		subInitial(DBParameter.pos_wl_27,v139);
    		subInitial(DBParameter.pos_wl_27,v140);
    		subInitial(DBParameter.pos_wl_27,v141);
    		subInitial(DBParameter.pos_wl_27,v142);
    		subInitial(DBParameter.pos_wl_27,v143);
    		subInitial(DBParameter.pos_wl_27,v144);
    		subInitial(DBParameter.pos_wl_27,v145);
    		subInitial(DBParameter.pos_wl_27,v146);
    		subInitial(DBParameter.pos_wl_27,v147);
    		subInitial(DBParameter.pos_wl_27,v148);
    		subInitial(DBParameter.pos_wl_27,v149);
    		subInitial(DBParameter.pos_wl_27,v150);
    		subInitial(DBParameter.pos_wl_27,v151);
    		subInitial(DBParameter.pos_wl_27,v152);
    		subInitial(DBParameter.pos_wl_27,v153);
    		subInitial(DBParameter.pos_wl_27,v154);
    		subInitial(DBParameter.pos_wl_27,v155);
    		subInitial(DBParameter.pos_wl_27,v156);
    		subInitial(DBParameter.pos_wl_27,v157);
    		subInitial(DBParameter.pos_wl_27,v158);

        	
    	
    }
    public void doList_28(){
    	String[] v1={"plight","�������ླ",n,"0"};
    	String[] v2={"plinth","���ţ�����",n,"0"};
    	String[] v3={"plod","�ز���",v,"0"};
    	String[] v4={"plot","��ڣ���ı���߻�",n,"0"};
    	String[] v5={"plough","��",n+v,"0"};
    	String[] v6={"ploy","���У�����",n,"0"};
    	String[] v7={"pluck","��������������ë������",n+v,"0"};
    	String[] v8={"plumb","��ȷ�أ���ֱ�ģ������˽⣬��ˮ��",d+a+v,"0"};
    	String[] v9={"plumber","�ܹ�",n,"0"};
    	String[] v10={"plume","��ë��������ë��ɦ��Ū��",n+v,"0"};
    	String[] v11={"plummet","(��ֱ��ͻȻ)׹��",v,"0"};
    	String[] v12={"plunder","�Ӷ�",v,"0"};
    	String[] v13={"plunge","Ͷ��",v,"0"};
    	String[] v14={"plush","������",a,"0"};
    	String[] v15={"plutocracy","�Ʒ�ͳ��",n,"0"};
    	String[] v16={"pod","���ԣ���(����)",n+v,"0"};
    	String[] v17={"podiatrist","�㲡ҽ��",n,"0"};
    	String[] v18={"podium","��̳��ָ��̨",n,"0"};
    	String[] v19={"poignant","���ĵģ������",a,"0"};
    	String[] v20={"poise","ʹƽ�⡢��ȣ�̩Ȼ����",v+n,"0"};
    	String[] v21={"poisonous","�ж��ģ��к���",a,"0"};
    	String[] v22={"poke","�̣���",v,"0"};
    	String[] v23={"polar","�����ģ��ż��ģ��ؼ���",a,"0"};
    	String[] v24={"polarity","�����ԣ������ֻ�",n,"0"};
    	String[] v25={"polarize","ʹ...�����ֻ�",v,"0"};
    	String[] v26={"polemic","��ս",n,"0"};
    	String[] v27={"polemical","������ս��",a,"0"};
    	String[] v28={"polish","�������׹⣻�Ϲ��������",v+n,"0"};
    	String[] v29={"poll","������飬ѡ��ͶƱ",n,"0"};
    	String[] v30={"pollen","����",n,"0"};
    	String[] v31={"pollinate","��...�ڷ�",v,"0"};
    	String[] v32={"pollster","��������",n,"0"};
    	String[] v33={"pomposity","�Դ����Ϊ����������������",n,"0"};
    	String[] v34={"pompous","�Դ��",a,"0"};
    	String[] v35={"poncho","��������",n,"0"};
    	String[] v36={"ponder","��ϸ����",v,"0"};
    	String[] v37={"ponderable","�ɹ�����",a,"0"};
    	String[] v38={"ponderous","���ص�",a,"0"};
    	String[] v39={"pontifical","����Ϊ�ǵģ���ϵ�",a,"0"};
    	String[] v40={"pontificate","�Դ����ϵ�����˵",v,"0"};
    	String[] v41={"populace","���ڣ��ϰ���",n,"0"};
    	String[] v42={"populous","�˿ڳ��ܵ�",a,"0"};
    	String[] v43={"porcelain","����",n,"0"};
    	String[] v44={"porcupine","����",n,"0"};
    	String[] v45={"pore","ë�ף�����",n,"0"};
    	String[] v46={"porous","��׵ģ�����͸��",a,"0"};
    	String[] v47={"portentous","���׵ģ���Σ�յ�",a,"0"};
    	String[] v48={"portfolio","�ļ��У��ɷݵ�",n,"0"};
    	String[] v49={"portray","��棬����",v,"0"};
    	String[] v50={"pose","�����ƣ�����",v,"0"};
    	String[] v51={"poseur","װģ��������",n,"0"};
        String[] v52={"posit","�϶�����Ϊ",v,"0"};
        String[] v53={"posse","��װ�Ŷ�",n,"0"};
        String[] v54={"possessed","���Եģ�����",a,"0"};
        String[] v55={"poster","����",n,"0"};
        String[] v56={"postpone","�Ƴ�",v,"0"};
        String[] v57={"postulate","�ٶ���Ҫ��",v,"0"};
        String[] v58={"posture","���ƣ�̬�ȣ�������̬",n+v,"0"};
        String[] v59={"potable","�������õ�",a,"0"};
        String[] v60={"potation","����������",n,"0"};		
    	String[] v61={"potentate","ͳ����",n,"0"};
        String[] v62={"potential","Ǳ�ڵ�",a,"0"};
       	String[] v63={"potentiate","��ǿ",v,"0"};
       	String[] v64={"potpourri","���ӣ����ļ�",n,"0"};
       	String[] v65={"pottery","���գ�����",n,"0"};
       	String[] v66={"pout","���죬����",v,"0"};
        String[] v67={"practitioner","��ҵ�ߣ�������",n,"0"};
        String[] v68={"pragmatic","ʵ�ʵģ�ʵ�������",a,"0"};
        String[] v69={"prank","������",n,"0"};
        String[] v70={"prate","��˵��Ϲ��",v,"0"};
    	String[] v71={"preach","���̣�����",v,"0"};
        String[] v72={"preamble","ǰ�ԣ�����",n,"0"};
       	String[] v73={"precarious","���ݲ���ģ�����ס�ģ�Σ�յ�",a,"0"};
       	String[] v74={"precede","���ڣ���...֮ǰ",v,"0"};
       	String[] v75={"precept","����",n,"0"};
        String[] v76={"precipice","����",n,"0"};
        String[] v77={"precipitant","�����",n,"0"};
        String[] v78={"precipitate","���٣��ٳɣ�³ç��",v+a,"0"};
        String[] v79={"precipitation","��ˮ",n,"0"};
        String[] v80={"precis","ժҪ�����",n,"0"};
    	String[] v81={"preclude","���⣬�ų�",v,"0"};
        String[] v82={"precocious","�����",a,"0"};
        String[] v83={"precursor","����",n,"0"};
        String[] v84={"predator","ʳ�⶯��",n,"0"};
        String[] v85={"predecessor","ǰ�Σ�ǰ����ԭ�ȵĶ���",n,"0"};
        String[] v86={"predestine","ע��",v,"0"};
        String[] v87={"predicament","����������",n,"0"};
        String[] v88={"predilection","ƫ̻������",n,"0"};
        String[] v89={"predisposition","�������",n,"0"};
        String[] v90={"predominant","��������",a,"0"};
        String[] v91={"predominate","֧�䣬ͳ�Σ�ռ����",v,"0"};
        String[] v92={"preeminent","������͵�",a,"0"};
        String[] v93={"preempt","��������Ȩȡ�ã�ȡ��",v,"0"};
        String[] v94={"preen","������ë�����",v,"0"};
        String[] v95={"preface","����",n,"0"};
        String[] v96={"pregnant","���еģ�������",a,"0"};
        String[] v97={"prehistoric","ʷǰ��",a,"0"};
        String[] v98={"prejudice","ƫ�����ɼ���ʹ����ƫ��",v,"0"};
        String[] v99={"preliminary","Ԥ���ģ�������",a,"0"};
        String[] v100={"preliterate","���ֳ�����ǰ��",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"prelude","��Ļ��ǰ��",n,"0"};
        	String[] v102={"premature","����ģ������",a,"0"};
        	String[] v103={"premeditate","Ԥ�ȼƻ�",v,"0"};
        	String[] v104={"premeditated","Ԥ�ȼƻ���",a,"0"};
        	String[] v105={"premiere","�״ι���",n+v,"0"};
        	String[] v106={"premise","ǰ��",n,"0"};
        	String[] v107={"premium","���շѣ�����",n,"0"};
        	String[] v108={"premonition","Ԥ�У�Ԥ��",n,"0"};
        	String[] v109={"preoccupation","ȫ���ע��ʹ��רע�Ķ���",n,"0"};
        	String[] v110={"preponderate","ѹ��������",v,"0"};
        	String[] v111={"preposition","��ʣ�ǰ�ô�",n,"0"};
        	String[] v112={"preposterous","������",a,"0"};
        	String[] v113={"prerequisite","�Ⱦ�����",n,"0"};
        	String[] v114={"prerogative","��Ȩ",n,"0"};
        	String[] v115={"presage","Ԥ�У�Ԥʾ",n+v,"0"};
        	String[] v116={"prescience","Ԥ֪���ȼ�",n,"0"};
        	String[] v117={"prescribe","���������涨",v,"0"};
        	String[] v118={"prescription","����(�ϵ�ҩ)",n,"0"};
        	String[] v119={"presentation","���ݣ�����",n,"0"};
        	String[] v120={"presenter","������",n,"0"};
        	String[] v121={"preservative","�����ģ�������",a+n,"0"};
        	String[] v122={"preside","������ϯ������ָ��",v,"0"};
        	String[] v123={"press","��ѹ",v,"0"};
        	String[] v124={"pressing","���ȵģ����еģ�����Ҫ���",a,"0"};
        	String[] v125={"prestige","���ţ�����",n,"0"};
        	String[] v126={"prestigious","��������",a,"0"};
        	String[] v127={"presume","�ٶ�",v,"0"};
        	String[] v128={"presumption","ð����ר��",n,"0"};
        	String[] v129={"presupposition","�ܲ�",n,"0"};
        	String[] v130={"pretend","��װ��װ��",v,"0"};
        	String[] v131={"pretension","������������ҫ",n,"0"};
        	String[] v132={"pretentious","��̧��۵�",a,"0"};
        	String[] v133={"preternatural","�쳣�ģ�����Ȼ��",a,"0"};
        	String[] v134={"pretext","���",n,"0"};
        	String[] v135={"prevail","սʤ��ʢ��",v,"0"};
        	String[] v136={"prevaricate","֧����ʣ�˵��",v,"0"};
        	String[] v137={"preview","Ԥ�ݣ�Ԥչ",v+n,"0"};
        	String[] v138={"previous","֮ǰ��",a,"0"};
        	String[] v139={"prey","����ʳ�Ķ���",n,"0"};
        	String[] v140={"prim","��ׯ�����",a,"0"};
        	String[] v141={"primate","�鳤��(����)",n,"0"};
        	String[] v142={"prime","ȫʢʱ�ڣ�����ģ�ԭʼ�ģ���õ�",a,"0"};
        	String[] v143={"primp","(��Ů)������",v,"0"};
        	String[] v144={"principal","��Ҫ�ģ���Ҫ��",a,"0"};
        	String[] v145={"principle","ԭ��ԭ������׼��",n,"0"};
        	String[] v146={"priority","���ȣ���ǰ",n,"0"};
        	String[] v147={"pristine","̫�ŵģ�����ģ����ʵ�",a,"0"};
        	
        	
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_28,v1);
    		subInitial(DBParameter.pos_wl_28,v2);
    		subInitial(DBParameter.pos_wl_28,v3);
    		subInitial(DBParameter.pos_wl_28,v4);
    		subInitial(DBParameter.pos_wl_28,v5);
    		subInitial(DBParameter.pos_wl_28,v6);
    		subInitial(DBParameter.pos_wl_28,v7);
    		subInitial(DBParameter.pos_wl_28,v8);
    		subInitial(DBParameter.pos_wl_28,v9);
    		subInitial(DBParameter.pos_wl_28,v10);
    		subInitial(DBParameter.pos_wl_28,v11);
    		subInitial(DBParameter.pos_wl_28,v12);
    		subInitial(DBParameter.pos_wl_28,v13);
    		subInitial(DBParameter.pos_wl_28,v14);
    		subInitial(DBParameter.pos_wl_28,v15);
    		subInitial(DBParameter.pos_wl_28,v16);
    		subInitial(DBParameter.pos_wl_28,v17);
    		subInitial(DBParameter.pos_wl_28,v18);
    		subInitial(DBParameter.pos_wl_28,v19);
    		subInitial(DBParameter.pos_wl_28,v20);
    		subInitial(DBParameter.pos_wl_28,v21);
    		subInitial(DBParameter.pos_wl_28,v22);
    		subInitial(DBParameter.pos_wl_28,v23);
    		subInitial(DBParameter.pos_wl_28,v24);
    		subInitial(DBParameter.pos_wl_28,v25);
    		subInitial(DBParameter.pos_wl_28,v26);
    		subInitial(DBParameter.pos_wl_28,v27);
    		subInitial(DBParameter.pos_wl_28,v28);
    		subInitial(DBParameter.pos_wl_28,v29);
    		subInitial(DBParameter.pos_wl_28,v30);
    		subInitial(DBParameter.pos_wl_28,v31);
    		subInitial(DBParameter.pos_wl_28,v32);
    		subInitial(DBParameter.pos_wl_28,v33);
    		subInitial(DBParameter.pos_wl_28,v34);
    		subInitial(DBParameter.pos_wl_28,v35);
    		subInitial(DBParameter.pos_wl_28,v36);
    		subInitial(DBParameter.pos_wl_28,v37);
    		subInitial(DBParameter.pos_wl_28,v38);
    		subInitial(DBParameter.pos_wl_28,v39);
    		subInitial(DBParameter.pos_wl_28,v40);
    		subInitial(DBParameter.pos_wl_28,v41);
    		subInitial(DBParameter.pos_wl_28,v42);
    		subInitial(DBParameter.pos_wl_28,v43);
    		subInitial(DBParameter.pos_wl_28,v44);
    		subInitial(DBParameter.pos_wl_28,v45);
    		subInitial(DBParameter.pos_wl_28,v46);
    		subInitial(DBParameter.pos_wl_28,v47);
    		subInitial(DBParameter.pos_wl_28,v48);
    		subInitial(DBParameter.pos_wl_28,v49);
    		subInitial(DBParameter.pos_wl_28,v50);
    		
    		subInitial(DBParameter.pos_wl_28,v51);
    		subInitial(DBParameter.pos_wl_28,v52);
    		subInitial(DBParameter.pos_wl_28,v53);
    		subInitial(DBParameter.pos_wl_28,v54);
    		subInitial(DBParameter.pos_wl_28,v55);
    		subInitial(DBParameter.pos_wl_28,v56);
    		subInitial(DBParameter.pos_wl_28,v57);
    		subInitial(DBParameter.pos_wl_28,v58);
    		subInitial(DBParameter.pos_wl_28,v59);
    		subInitial(DBParameter.pos_wl_28,v60);
    		subInitial(DBParameter.pos_wl_28,v61);
    		subInitial(DBParameter.pos_wl_28,v62);
    		subInitial(DBParameter.pos_wl_28,v63);
    		subInitial(DBParameter.pos_wl_28,v64);
    		subInitial(DBParameter.pos_wl_28,v65);
    		subInitial(DBParameter.pos_wl_28,v66);
    		subInitial(DBParameter.pos_wl_28,v67);
    		subInitial(DBParameter.pos_wl_28,v68);
    		subInitial(DBParameter.pos_wl_28,v69);
    		subInitial(DBParameter.pos_wl_28,v70);
    		subInitial(DBParameter.pos_wl_28,v71);
    		subInitial(DBParameter.pos_wl_28,v72);
    		subInitial(DBParameter.pos_wl_28,v73);
    		subInitial(DBParameter.pos_wl_28,v74);
    		subInitial(DBParameter.pos_wl_28,v75);
    		subInitial(DBParameter.pos_wl_28,v76);
    		subInitial(DBParameter.pos_wl_28,v77);
    		subInitial(DBParameter.pos_wl_28,v78);
    		subInitial(DBParameter.pos_wl_28,v79);
    		subInitial(DBParameter.pos_wl_28,v80);
    		subInitial(DBParameter.pos_wl_28,v81);
    		subInitial(DBParameter.pos_wl_28,v82);
    		subInitial(DBParameter.pos_wl_28,v83);
    		subInitial(DBParameter.pos_wl_28,v84);
    		subInitial(DBParameter.pos_wl_28,v85);
    		subInitial(DBParameter.pos_wl_28,v86);
    		subInitial(DBParameter.pos_wl_28,v87);
    		subInitial(DBParameter.pos_wl_28,v88);
    		subInitial(DBParameter.pos_wl_28,v89);
    		subInitial(DBParameter.pos_wl_28,v90);
    		subInitial(DBParameter.pos_wl_28,v91);
    		subInitial(DBParameter.pos_wl_28,v92);
    		subInitial(DBParameter.pos_wl_28,v93);
    		subInitial(DBParameter.pos_wl_28,v94);
    		subInitial(DBParameter.pos_wl_28,v95);
    		subInitial(DBParameter.pos_wl_28,v96);
    		subInitial(DBParameter.pos_wl_28,v97);
    		subInitial(DBParameter.pos_wl_28,v98);
    		subInitial(DBParameter.pos_wl_28,v99);
    		subInitial(DBParameter.pos_wl_28,v100);
    		subInitial(DBParameter.pos_wl_28,v101);
    		subInitial(DBParameter.pos_wl_28,v102);
    		subInitial(DBParameter.pos_wl_28,v103);
    		subInitial(DBParameter.pos_wl_28,v104);
    		subInitial(DBParameter.pos_wl_28,v105);
    		subInitial(DBParameter.pos_wl_28,v106);
    		subInitial(DBParameter.pos_wl_28,v107);
    		subInitial(DBParameter.pos_wl_28,v108);
    		subInitial(DBParameter.pos_wl_28,v109);
    		subInitial(DBParameter.pos_wl_28,v110);
    		subInitial(DBParameter.pos_wl_28,v111);
    		subInitial(DBParameter.pos_wl_28,v112);
    		subInitial(DBParameter.pos_wl_28,v113);
    		subInitial(DBParameter.pos_wl_28,v114);
    		subInitial(DBParameter.pos_wl_28,v115);
    		subInitial(DBParameter.pos_wl_28,v116);
    		subInitial(DBParameter.pos_wl_28,v117);
    		subInitial(DBParameter.pos_wl_28,v118);
    		
    		subInitial(DBParameter.pos_wl_28,v119);
    		subInitial(DBParameter.pos_wl_28,v120);
    		subInitial(DBParameter.pos_wl_28,v121);
    		subInitial(DBParameter.pos_wl_28,v122);
    		subInitial(DBParameter.pos_wl_28,v123);
    		subInitial(DBParameter.pos_wl_28,v124);
    		subInitial(DBParameter.pos_wl_28,v125);
    		subInitial(DBParameter.pos_wl_28,v126);
    		subInitial(DBParameter.pos_wl_28,v127);
    		subInitial(DBParameter.pos_wl_28,v128);
    		subInitial(DBParameter.pos_wl_28,v129);
    		subInitial(DBParameter.pos_wl_28,v130);
    		subInitial(DBParameter.pos_wl_28,v131);
    		subInitial(DBParameter.pos_wl_28,v132);
    		subInitial(DBParameter.pos_wl_28,v133);
    		subInitial(DBParameter.pos_wl_28,v134);
    		subInitial(DBParameter.pos_wl_28,v135);
    		subInitial(DBParameter.pos_wl_28,v136);
    		subInitial(DBParameter.pos_wl_28,v137);
    		subInitial(DBParameter.pos_wl_28,v138);
    		subInitial(DBParameter.pos_wl_28,v139);
    		subInitial(DBParameter.pos_wl_28,v140);
    		subInitial(DBParameter.pos_wl_28,v141);
    		subInitial(DBParameter.pos_wl_28,v142);
    		subInitial(DBParameter.pos_wl_28,v143);
    		subInitial(DBParameter.pos_wl_28,v144);
    		subInitial(DBParameter.pos_wl_28,v145);
    		subInitial(DBParameter.pos_wl_28,v146);
    		subInitial(DBParameter.pos_wl_28,v147);
    
        	
    }
    public void doList_29(){
        String[] v1={"privation","ɥʧ��ƶ��",n,"0"};
    	String[] v2={"privilege","��Ȩ",n,"0"};
    	String[] v3={"probe","̽��",v,"0"};
    	String[] v4={"probity","��ֱ",n,"0"};
    	String[] v5={"proboscis","(��)���ǣ�(����)����",n,"0"};
    	String[] v6={"proceeds","����",n,"0"};
    	String[] v7={"procession","���У�ǰ��",n,"0"};
    	String[] v8={"proclaim","���棬��������ʾ",v,"0"};
    	String[] v9={"procrastinate","���飬����",v,"0"};
    	String[] v10={"proctor","�����ˣ�ѧ��",n,"0"};
    	String[] v11={"procure","ȡ�ã����",v,"0"};
    	String[] v12={"prod","�̣�ͱ������",v,"0"};
    	String[] v13={"prodigal","�ӻ��ģ��ӻ���",a+n,"0"};
    	String[] v14={"prodigious","�޴��",a,"0"};
    	String[] v15={"prodigy","���£����",n,"0"};
    	String[] v16={"produce","��Ʒ��ũ��Ʒ",n,"0"};
    	String[] v17={"productivity","��������������",n,"0"};
    	String[] v18={"profane","���£�����",v,"0"};
    	String[] v19={"proffer","�׳������ͣ�����",n+v,"0"};
    	String[] v20={"proficient","�����ģ���ͨ��",a,"0"};
    	String[] v21={"profile","���Σ�����������",n,"0"};
    	String[] v22={"profiteer","���̣�Ĳȡ������",n,"0"};
    	String[] v23={"profligate","�ӽ������ģ��ӻ���",a+n,"0"};
    	String[] v24={"profound","��ģ���̵ģ�Ԩ���ģ���µ�",a,"0"};
    	String[] v25={"profuse","�ܶ�ģ��˷ѵ�",a,"0"};
    	String[] v26={"progeny","�������Ů",n,"0"};
    	String[] v27={"prognosis","Ԥ�󣬶Լ��������������Ԥ��",n,"0"};
    	String[] v28={"prohibitive","���Ƶģ��۸񳬳����ܷ�Χ��",a,"0"};
    	String[] v29={"projectile","�����������",n,"0"};
    	String[] v30={"projection","ͻ����",n,"0"};
    	String[] v31={"projector","��Ӱ��ӳ�����õƻ�",n,"0"};
    	String[] v32={"proliferate","��ֳ������",v,"0"};
    	String[] v33={"prolific","�����",a,"0"};
    	String[] v34={"prolix","���µģ��߳���",a,"0"};
    	String[] v35={"prolixity","����",n,"0"};
    	String[] v36={"prologue","�����ף���Ļ",n,"0"};
    	String[] v37={"prolong","�ӳ�������",v,"0"};
    	String[] v38={"promenade","ɢ��������",n+v,"0"};
    	String[] v39={"prominent","�����ģ�������",a,"0"};
    	String[] v40={"promote","�������ٽ�",v,"0"};
    	String[] v41={"prompt","��ʹ���������ݵģ�Ѹ�ٵ�",v+a,"0"};
    	String[] v42={"promulgate","�䲼������",v,"0"};
    	String[] v43={"prone","���Եģ�������...��",a,"0"};
    	String[] v44={"pronounced","(�۵�)��ȷ�ģ����Ե�",a,"0"};
    	String[] v45={"prop","֧�����ɽ��֧��",n+v,"0"};
    	String[] v46={"propagate","��ֳ������",v,"0"};
    	String[] v47={"propel","�ƽ�",v,"0"};
    	String[] v48={"propensity","�Ⱥã�ϰ��",n,"0"};
    	String[] v49={"prophecy","Ԥ��",n,"0"};
    	String[] v50={"prophet","��֪��Ԥ�Լ�",n,"0"};
    	String[] v51={"prophetic","Ԥʾ�ģ���֪��",a,"0"};
        String[] v52={"propitiate","�ֺã���ο",v,"0"};
        String[] v53={"propitious","�����ģ�������",a,"0"};
        String[] v54={"proposal","�᰸������",n,"0"};
        String[] v55={"proposition","����������",n,"0"};
        String[] v56={"proprietary","˽�е�",a,"0"};
        String[] v57={"propriety","��ڣ��ʵ�",n,"0"};
        String[] v58={"propulsion","�ƽ���",n,"0"};
        String[] v59={"prosaic","�����ģ���Ȥ��",a,"0"};
        String[] v60={"proscribe","��ֹ",v,"0"};		
    	String[] v61={"prose","ɢ��",n,"0"};
        String[] v62={"prosecute","�淢�����",v,"0"};
       	String[] v63={"prosecution","���ߣ�ʵ�У���Ӫ",n,"0"};
       	String[] v64={"proselytize","ʹ...���",v,"0"};
       	String[] v65={"prospect","��̽��������ǰ��",v+n,"0"};
       	String[] v66={"prosperity","���٣����ˣ�����",n,"0"};
        String[] v67={"prosperous","���ٸ�ǿ��",a,"0"};
        String[] v68={"prostrate","���Եģ���ɥ�ģ�ʹ���£��Ϲ�",a+v,"0"};
        String[] v69={"protagonist","�����ߣ�֧����",n,"0"};
        String[] v70={"protean","�仯��˵ģ�����",a,"0"};
    	String[] v71={"protest","���飬����",n,"0"};
        String[] v72={"protocol","�⽻��ڣ�Э�飬�ݰ�",n,"0"};
       	String[] v73={"prototype","ԭ�ͣ�����",n,"0"};
       	String[] v74={"protract","�ӳ����ϳ�",v,"0"};
       	String[] v75={"protuberant","͹���ģ�¡���",a,"0"};
        String[] v76={"provenance","(������)��������Դ",n,"0"};
        String[] v77={"provender","���ϣ�����",n,"0"};
        String[] v78={"provident","��ıԶ�ǵģ��ڼ��",a,"0"};
        String[] v79={"providential","���˵ģ�ǡ���ô���",a,"0"};
        String[] v80={"provincial","ƫ����",a,"0"};
    	String[] v81={"provision","(��ʳ)��Ӧ������",n,"0"};
        String[] v82={"provisional","��ʱ��",a,"0"};
        String[] v83={"provisory","�и���������",a,"0"};
        String[] v84={"provocation","���ƣ���ŭ",n,"0"};
        String[] v85={"prowess","�¸ң�����������",n,"0"};
        String[] v86={"prowl","Ǳ��",v,"0"};
        String[] v87={"proximate","�������ٵ�",a,"0"};
        String[] v88={"prude","�����������",n,"0"};
        String[] v89={"prudent","�����ģ�������",a,"0"};
        String[] v90={"prudish","��������ģ��ٵ�ѧ��",a,"0"};
        String[] v91={"prune","÷�ɣ��޼�",n+v,"0"};
        String[] v92={"pry","��̽���˿�",v,"0"};
        String[] v93={"pseudonym","����������",n,"0"};
        String[] v94={"psyche","���ǣ�����",n,"0"};
        String[] v95={"psychology","����ѧ������״̬",n,"0"};
        String[] v96={"publicize","����ע�⣬����",v,"0"};
        String[] v97={"pucker","���壻����",v+n,"0"};
        String[] v98={"puckish","������",a,"0"};
        String[] v99={"puddle","ˮ�ӣ���",n,"0"};
        String[] v100={"puerile","���ɵģ���ͯ��",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"pugilism","����",n,"0"};
        	String[] v102={"pugilist","ȭʦ",n,"0"};
        	String[] v103={"pugnacious","�ö���",a,"0"};
        	String[] v104={"puissance","Ȩ��",n,"0"};
        	String[] v105={"puissant","ǿ���",a,"0"};
        	String[] v106={"pulchritude","����",n,"0"};
        	String[] v107={"pullet","Сĸ��",n,"0"};
        	String[] v108={"pulley","���֣�����",n,"0"};
        	String[] v109={"pulp","���⽴��ֽ��",n,"0"};
        	String[] v110={"pulse","����������������������",v+n,"0"};
        	String[] v111={"pulverize","ѹ�ɷۣ����׻���",v,"0"};
        	String[] v112={"pun","˫����",n,"0"};
        	String[] v113={"punch","��ȭ�ͻ�����",v,"0"};
        	String[] v114={"punctilious","��С��΢��",a,"0"};
        	String[] v115={"puncture","�̴������ƣ��̿ף�����",v+n,"0"};
        	String[] v116={"pundit","ר�ң�Ȩ����ʿ",n,"0"};
        	String[] v117={"pungent","ζ���̼��ģ����̵�",a,"0"};
        	String[] v118={"puny","��С�ģ�����������",a,"0"};
        	String[] v119={"purchase","(��ֹ�»���)֧��",n,"0"};
        	String[] v120={"purgative","кҩ",n,"0"};
        	String[] v121={"purgatory","�������ܿ����ѵĵط�",n,"0"};
        	String[] v122={"purge","��ϴ��ϴ��",v,"0"};
        	String[] v123={"purify","ʹ�ྻ������",v,"0"};
        	String[] v124={"purity","����������",n,"0"};
        	String[] v125={"purlieu","�ڽ�����",n,"0"};
        	String[] v126={"purloin","͵��",v,"0"};
        	String[] v127={"purported","�ųƵģ�ҥ����",a,"0"};
        	String[] v128={"pursue","׷��",v,"0"};
        	String[] v129={"purvey","(����)����",v,"0"};
        	String[] v130={"pusillanimous","��С��",a,"0"};
        	String[] v131={"pylon","��ѹ���߼ܣ�����",n,"0"};
        	String[] v132={"pyre","�����õĲ��",n,"0"};
        	String[] v133={"quack","ð������֮�ˣ�ӹҽ",n,"0"};
        	String[] v134={"quaff","ʹ��������",v,"0"};
        	String[] v135={"quail","η�壬����",v,"0"};
        	String[] v136={"quaint","������Ȥ��",a,"0"};
        	String[] v137={"qualified","���ʸ�ģ������Ƶ�",a,"0"};
        	String[] v138={"qualms","����",n,"0"};
        	String[] v139={"quandary","���󣬽�������",n,"0"};
        	String[] v140={"quantum","����",n,"0"};
        	String[] v141={"quarantine","��������ڣ�����",n,"0"};
        	String[] v142={"quarry","����",n,"0"};
        	String[] v143={"quartet","�����࣬���س�",n,"0"};
        	String[] v144={"quash","��ѹ��ȡ��",v,"0"};
        	String[] v145={"quaver","������������������",v+n,"0"};
        	String[] v146={"quay","��ͷ",n,"0"};
        	String[] v147={"quell","��ֹ����ѹ",v,"0"};
        	String[] v148={"quench","Ϩ������",v,"0"};
        	String[] v149={"querulous","��Թ�ģ�����ɧ��",a,"0"};
        	String[] v150={"quest","̽��",v+n,"0"};
        	
        	
        	
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_29,v1);
    		subInitial(DBParameter.pos_wl_29,v2);
    		subInitial(DBParameter.pos_wl_29,v3);
    		subInitial(DBParameter.pos_wl_29,v4);
    		subInitial(DBParameter.pos_wl_29,v5);
    		subInitial(DBParameter.pos_wl_29,v6);
    		subInitial(DBParameter.pos_wl_29,v7);
    		subInitial(DBParameter.pos_wl_29,v8);
    		subInitial(DBParameter.pos_wl_29,v9);
    		subInitial(DBParameter.pos_wl_29,v10);
    		subInitial(DBParameter.pos_wl_29,v11);
    		subInitial(DBParameter.pos_wl_29,v12);
    		subInitial(DBParameter.pos_wl_29,v13);
    		subInitial(DBParameter.pos_wl_29,v14);
    		subInitial(DBParameter.pos_wl_29,v15);
    		subInitial(DBParameter.pos_wl_29,v16);
    		subInitial(DBParameter.pos_wl_29,v17);
    		subInitial(DBParameter.pos_wl_29,v18);
    		subInitial(DBParameter.pos_wl_29,v19);
    		subInitial(DBParameter.pos_wl_29,v20);
    		subInitial(DBParameter.pos_wl_29,v21);
    		subInitial(DBParameter.pos_wl_29,v22);
    		subInitial(DBParameter.pos_wl_29,v23);
    		subInitial(DBParameter.pos_wl_29,v24);
    		subInitial(DBParameter.pos_wl_29,v25);
    		subInitial(DBParameter.pos_wl_29,v26);
    		subInitial(DBParameter.pos_wl_29,v27);
    		subInitial(DBParameter.pos_wl_29,v28);
    		subInitial(DBParameter.pos_wl_29,v29);
    		subInitial(DBParameter.pos_wl_29,v30);
    		subInitial(DBParameter.pos_wl_29,v31);
    		subInitial(DBParameter.pos_wl_29,v32);
    		subInitial(DBParameter.pos_wl_29,v33);
    		subInitial(DBParameter.pos_wl_29,v34);
    		subInitial(DBParameter.pos_wl_29,v35);
    		subInitial(DBParameter.pos_wl_29,v36);
    		subInitial(DBParameter.pos_wl_29,v37);
    		subInitial(DBParameter.pos_wl_29,v38);
    		subInitial(DBParameter.pos_wl_29,v39);
    		subInitial(DBParameter.pos_wl_29,v40);
    		subInitial(DBParameter.pos_wl_29,v41);
    		subInitial(DBParameter.pos_wl_29,v42);
    		subInitial(DBParameter.pos_wl_29,v43);
    		subInitial(DBParameter.pos_wl_29,v44);
    		subInitial(DBParameter.pos_wl_29,v45);
    		subInitial(DBParameter.pos_wl_29,v46);
    		subInitial(DBParameter.pos_wl_29,v47);
    		subInitial(DBParameter.pos_wl_29,v48);
    		subInitial(DBParameter.pos_wl_29,v49);
    		subInitial(DBParameter.pos_wl_29,v50);
    		
    		subInitial(DBParameter.pos_wl_29,v51);
    		subInitial(DBParameter.pos_wl_29,v52);
    		subInitial(DBParameter.pos_wl_29,v53);
    		subInitial(DBParameter.pos_wl_29,v54);
    		subInitial(DBParameter.pos_wl_29,v55);
    		subInitial(DBParameter.pos_wl_29,v56);
    		subInitial(DBParameter.pos_wl_29,v57);
    		subInitial(DBParameter.pos_wl_29,v58);
    		subInitial(DBParameter.pos_wl_29,v59);
    		subInitial(DBParameter.pos_wl_29,v60);
    		subInitial(DBParameter.pos_wl_29,v61);
    		subInitial(DBParameter.pos_wl_29,v62);
    		subInitial(DBParameter.pos_wl_29,v63);
    		subInitial(DBParameter.pos_wl_29,v64);
    		subInitial(DBParameter.pos_wl_29,v65);
    		subInitial(DBParameter.pos_wl_29,v66);
    		subInitial(DBParameter.pos_wl_29,v67);
    		subInitial(DBParameter.pos_wl_29,v68);
    		subInitial(DBParameter.pos_wl_29,v69);
    		subInitial(DBParameter.pos_wl_29,v70);
    		subInitial(DBParameter.pos_wl_29,v71);
    		subInitial(DBParameter.pos_wl_29,v72);
    		subInitial(DBParameter.pos_wl_29,v73);
    		subInitial(DBParameter.pos_wl_29,v74);
    		subInitial(DBParameter.pos_wl_29,v75);
    		subInitial(DBParameter.pos_wl_29,v76);
    		subInitial(DBParameter.pos_wl_29,v77);
    		subInitial(DBParameter.pos_wl_29,v78);
    		subInitial(DBParameter.pos_wl_29,v79);
    		subInitial(DBParameter.pos_wl_29,v80);
    		subInitial(DBParameter.pos_wl_29,v81);
    		subInitial(DBParameter.pos_wl_29,v82);
    		subInitial(DBParameter.pos_wl_29,v83);
    		subInitial(DBParameter.pos_wl_29,v84);
    		subInitial(DBParameter.pos_wl_29,v85);
    		subInitial(DBParameter.pos_wl_29,v86);
    		subInitial(DBParameter.pos_wl_29,v87);
    		subInitial(DBParameter.pos_wl_29,v88);
    		subInitial(DBParameter.pos_wl_29,v89);
    		subInitial(DBParameter.pos_wl_29,v90);
    		subInitial(DBParameter.pos_wl_29,v91);
    		subInitial(DBParameter.pos_wl_29,v92);
    		subInitial(DBParameter.pos_wl_29,v93);
    		subInitial(DBParameter.pos_wl_29,v94);
    		subInitial(DBParameter.pos_wl_29,v95);
    		subInitial(DBParameter.pos_wl_29,v96);
    		subInitial(DBParameter.pos_wl_29,v97);
    		subInitial(DBParameter.pos_wl_29,v98);
    		subInitial(DBParameter.pos_wl_29,v99);
    		subInitial(DBParameter.pos_wl_29,v100);
    		subInitial(DBParameter.pos_wl_29,v101);
    		subInitial(DBParameter.pos_wl_29,v102);
    		subInitial(DBParameter.pos_wl_29,v103);
    		subInitial(DBParameter.pos_wl_29,v104);
    		subInitial(DBParameter.pos_wl_29,v105);
    		subInitial(DBParameter.pos_wl_29,v106);
    		subInitial(DBParameter.pos_wl_29,v107);
    		subInitial(DBParameter.pos_wl_29,v108);
    		subInitial(DBParameter.pos_wl_29,v109);
    		subInitial(DBParameter.pos_wl_29,v110);
    		subInitial(DBParameter.pos_wl_29,v111);
    		subInitial(DBParameter.pos_wl_29,v112);
    		subInitial(DBParameter.pos_wl_29,v113);
    		subInitial(DBParameter.pos_wl_29,v114);
    		subInitial(DBParameter.pos_wl_29,v115);
    		subInitial(DBParameter.pos_wl_29,v116);
    		subInitial(DBParameter.pos_wl_29,v117);
    		subInitial(DBParameter.pos_wl_29,v118);
    		
    		subInitial(DBParameter.pos_wl_29,v119);
    		subInitial(DBParameter.pos_wl_29,v120);
    		subInitial(DBParameter.pos_wl_29,v121);
    		subInitial(DBParameter.pos_wl_29,v122);
    		subInitial(DBParameter.pos_wl_29,v123);
    		subInitial(DBParameter.pos_wl_29,v124);
    		subInitial(DBParameter.pos_wl_29,v125);
    		subInitial(DBParameter.pos_wl_29,v126);
    		subInitial(DBParameter.pos_wl_29,v127);
    		subInitial(DBParameter.pos_wl_29,v128);
    		subInitial(DBParameter.pos_wl_29,v129);
    		subInitial(DBParameter.pos_wl_29,v130);
    		subInitial(DBParameter.pos_wl_29,v131);
    		subInitial(DBParameter.pos_wl_29,v132);
    		subInitial(DBParameter.pos_wl_29,v133);
    		subInitial(DBParameter.pos_wl_29,v134);
    		subInitial(DBParameter.pos_wl_29,v135);
    		subInitial(DBParameter.pos_wl_29,v136);
    		subInitial(DBParameter.pos_wl_29,v137);
    		subInitial(DBParameter.pos_wl_29,v138);
    		subInitial(DBParameter.pos_wl_29,v139);
    		subInitial(DBParameter.pos_wl_29,v140);
    		subInitial(DBParameter.pos_wl_29,v141);
    		subInitial(DBParameter.pos_wl_29,v142);
    		subInitial(DBParameter.pos_wl_29,v143);
    		subInitial(DBParameter.pos_wl_29,v144);
    		subInitial(DBParameter.pos_wl_29,v145);
    		subInitial(DBParameter.pos_wl_29,v146);
    		subInitial(DBParameter.pos_wl_29,v147);
    		subInitial(DBParameter.pos_wl_29,v148);
    		subInitial(DBParameter.pos_wl_29,v149);
    		subInitial(DBParameter.pos_wl_29,v150);
    		
        	
    }
    public void doList_30(){
    	String[] v1={"queue","�Ŷӣ�����",v+n,"0"};
    	String[] v2={"quibble","�ݴʣ���ë��õķ������",n,"0"};
    	String[] v3={"quiescent","�����ģ���ֹ��",a,"0"};
    	String[] v4={"quill","(����ȶ����)��",n,"0"};
    	String[] v5={"quirk","���£����",n,"0"};
    	String[] v6={"quisling","���������ڼ�",n,"0"};
    	String[] v7={"quiver","��Ͳ������",n,"0"};
    	String[] v8={"quixotic","����ʵ�ʵ�",a,"0"};
    	String[] v9={"quota","������",n,"0"};
    	String[] v10={"quote","���ã�����",v,"0"};
    	String[] v11={"quotidian","ÿ�յģ�ƽ����",a,"0"};
    	String[] v12={"rabble","�ں�֮�ڣ��µ���",n,"0"};
    	String[] v13={"rabid","����Ȯ���ģ�ʧȥ���Ե�",a,"0"};
    	String[] v14={"rabies","��Ȯ��",n,"0"};
    	String[] v15={"ranonteur","���ڽ����µ���",n,"0"};
    	String[] v16={"racy","���õģ�������",a,"0"};
    	String[] v17={"radius","�뾶",n,"0"};
    	String[] v18={"raffish","���׵ģ����޵�",a,"0"};
    	String[] v19={"raffle","�齱",n,"0"};
    	String[] v20={"rafter","����",n,"0"};
    	String[] v21={"rag","�ɲ����鲼���ƾ��·�",n,"0"};
    	String[] v22={"ragged","���õ�",a,"0"};
    	String[] v23={"raid","ͻȻϮ��",n,"0"};
    	String[] v24={"rail","���ˣ����죻�������ָ��",n+v,"0"};
    	String[] v25={"raisin","���Ѹ�",n,"0"};
    	String[] v26={"rakish","�����ģ��ŵ���",a,"0"};
    	String[] v27={"rally","�ټ�������",n+v,"0"};
    	String[] v28={"ram","����ײ�����ͻ�",n,"0"};
    	String[] v29={"ramble","����",n+v,"0"};
    	String[] v30={"rambunctious","ɧ�ҵģ�(�˷�)ʧ�ص�",a,"0"};
    	String[] v31={"ramify","��֧���ֲ�",v,"0"};
    	String[] v32={"rampage","�񱩵��ҳ壻��ŭ",v+n,"0"};
    	String[] v33={"rampant","�����ģ���Ⱶ�",a,"0"};
    	String[] v34={"rampart","���ݣ���ǽ",n,"0"};
    	String[] v35={"ramshakle","ҡҡ��׹��",a,"0"};
    	String[] v36={"rancid","�����ʵģ���ζ��",a,"0"};
    	String[] v37={"rancor","���Թ��",n,"0"};
    	String[] v38={"random","û��Ŀ�ĵģ�żȻ�ģ�����",a,"0"};
    	String[] v39={"ranger","ɭ�ֹ���Ա��Ѳ���ﾯ",n,"0"};
    	String[] v40={"rankle","Թ�ޣ���ŭ",v,"0"};
    	String[] v41={"ransom","����������",n+v,"0"};
    	String[] v42={"rant","�������ڳ�����",v,"0"};
    	String[] v43={"rapacious","ǿ��ģ�̰����",a,"0"};
    	String[] v44={"rapids","����������",n,"0"};
    	String[] v45={"rapport","������һ��",n,"0"};
    	String[] v46={"rapprochement","�ͺã�����",n,"0"};
    	String[] v47={"rapt","ר����־��",a,"0"};
    	String[] v48={"rarefaction","ϡ��",n,"0"};
    	String[] v49={"raspy","�̶��ģ����˵�",a,"0"};
    	String[] v50={"ratification","��ʽ��׼",n,"0"};
    	String[] v51={"ratiocination","��������",n,"0"};
        String[] v52={"ration","���",n+v,"0"};
        String[] v53={"rational","���Եģ������",a,"0"};
        String[] v54={"rattle","ʹ�������죬ʹ����",v,"0"};
        String[] v55={"raucous","ɳ�Ƶģ��ֲڵ�",a,"0"};
        String[] v56={"ravage","�ݻ٣�ʹ�ķ�",v,"0"};
        String[] v57={"rave","�����������",n+v,"0"};
        String[] v58={"ravel","���������᣻�𿪣���ɢ",v,"0"};
        String[] v59={"ravenous","�����˵ģ�̰����",a,"0"};
        String[] v60={"ravishing","���������",a,"0"};		
    	String[] v61={"raze","�����ƻ�",v,"0"};
        String[] v62={"razor","���뵶",n,"0"};
       	String[] v63={"reactant","��Ӧ��",n,"0"};
       	String[] v64={"reactionary","���صģ�������",a,"0"};
       	String[] v65={"readily","�����ɵģ�Ѹ�ٵģ����׵�",d,"0"};
       	String[] v66={"ready","�����ģ�Ѹ�ٵ�",a,"0"};
        String[] v67={"reagent","�Լ�",n,"0"};
        String[] v68={"realign","�������(����)",v,"0"};
        String[] v69={"realm","���������򣬷�Χ",n,"0"};
        String[] v70={"ream","��(ֽ�ŵļ�����λ)",n,"0"};
    	String[] v71={"reap","�ո�ջ�",v,"0"};
        String[] v72={"rebate","�ۿۣ��ؿ�",n,"0"};
       	String[] v73={"rebellious","�����ģ��ѿ��Ƶ�",a,"0"};
       	String[] v74={"rebuff","��Ȼ�ܾ�",v,"0"};
       	String[] v75={"rebuke","ָ��Ǵ��",v,"0"};
        String[] v76={"rebus","���գ�����",n,"0"};
        String[] v77={"rebuttal","��������֤",n,"0"};
        String[] v78={"recalcitrant","�翹��",a,"0"};
        String[] v79={"recall","���룬�ջأ�����",v+n,"0"};
        String[] v80={"recant","�ı䣬����",v,"0"};
    	String[] v81={"recantation","�ı��ڽ�����",n,"0"};
        String[] v82={"recapitulate","��Ҫ����",v,"0"};
        String[] v83={"recast","������������Ա",v,"0"};
        String[] v84={"recede","���ˣ��ջ�(ŵ��)",v,"0"};
        String[] v85={"receipt","�յ����ӵ�����Ʊ���վ�",n,"0"};
        String[] v86={"receptacle","����",n,"0"};
        String[] v87={"receptive","����������",a,"0"};
        String[] v88={"recess","�ڰ�",n,"0"};
        String[] v89={"recession","��������ʱ�ڣ����أ��˻�",n,"0"};
        String[] v90={"recessive","���˵ģ�(�Ŵ�)���ε�",a,"0"};
        String[] v91={"recipe","ʳ��",n,"0"};
        String[] v92={"recipient","������",n,"0"};
        String[] v93={"reciprocal","�໥�ģ����ݵ�",a,"0"};
        String[] v94={"reciprocate","�ر�����л",v,"0"};
        String[] v95={"recital","���࣬����",n,"0"};
        String[] v96={"reclaim","����������",v,"0"};
        String[] v97={"recluse","��ʿ",n,"0"};
        String[] v98={"recoil","��ȴ",v,"0"};
        String[] v99={"recollection","�������������е�����",n,"0"};
        String[] v100={"recombine","���飬�ٽ��",v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"recompense","���꣬�⳥",v,"0"};
        	String[] v102={"reconcile","�ͽ⣬����",v,"0"};
        	String[] v103={"recondite","��µ�",a,"0"};
        	String[] v104={"reconnaissance","��飬Ԥ��̽��",n,"0"};
        	String[] v105={"reconstitute","���飬��ˮ��",v,"0"};
        	String[] v106={"recourse","����������",n,"0"};
        	String[] v107={"recruit","�±����³�Ա����ļ",n+v,"0"};
        	String[] v108={"rectangle","����",n,"0"};
        	String[] v109={"rectify","����������",v,"0"};
        	String[] v110={"rectitude","��ʵ����ֱ",n,"0"};
        	String[] v111={"recumbent","���Եģ���Ϣ��",a,"0"};
        	String[] v112={"recuperate","(����)�ָ�����ԭ",v,"0"};
        	String[] v113={"redeem","����",v,"0"};
        	String[] v114={"redemptive","��صģ������",a,"0"};
        	String[] v115={"redirect","�ļ�(�ż�)���ı䷽��",v,"0"};
        	String[] v116={"redistribution","���·���",n,"0"};
        	String[] v117={"redolent","�ҷ���",a,"0"};
        	String[] v118={"redoubtable","�ɾ�η��",a,"0"};
        	String[] v119={"redress","����������",n,"0"};
        	String[] v120={"redundancy","��ʣ������",n,"0"};
        	String[] v121={"redundant","�����",a,"0"};
        	String[] v122={"reed","«έ����Ƭ",n,"0"};
        	String[] v123={"reek","����ζ",v,"0"};
        	String[] v124={"reel","���ᣬ��ת����...������",n+v,"0"};
        	String[] v125={"refectory","(ѧԺ)������ʳ��",n,"0"};
        	String[] v126={"referee","����Ա",n,"0"};
        	String[] v127={"refinery","������",n,"0"};
        	String[] v128={"reflect","���䣬��ϸ����",v,"0"};
        	String[] v129={"refraction","����",n,"0"};
        	String[] v130={"refractory","��ǿ�ģ���Ӧ�ٶ۵�",a,"0"};
        	String[] v131={"refrain","���ƣ������еķ����䣬����",v+n,"0"};
        	String[] v132={"refresh","����...��ƣ�ͣ�ʹ��������",v,"0"};
        	String[] v133={"refugee","����������",n,"0"};
        	String[] v134={"refulgent","�Ի͵ģ����õ�",a,"0"};
        	String[] v135={"refurbish","ˢ�£�����",v,"0"};
        	String[] v136={"refute","����",v,"0"};
        	String[] v137={"regale","�����ʹ����",v,"0"};
        	String[] v138={"regime","��Ȩ�������ƶ�",n,"0"};
        	String[] v139={"regress","ʹ���ˣ���ԭ������",v,"0"};
        	String[] v140={"regressive","�˲��ģ��˻���",a,"0"};
        	String[] v141={"regulate","���ƣ�����",v,"0"};
        	String[] v142={"rehabilitate","�޸����ָ�(ְҵ��)",v,"0"};
        	String[] v143={"rehearsal","���ݣ���ϰ",n,"0"};
        	String[] v144={"rehearse","������Ԥ�ݣ�����",v,"0"};
        	String[] v145={"reign","ͳ��ʱ�ڣ�����������",n,"0"};
        	String[] v146={"reimburse","����",v,"0"};
        	String[] v147={"rein","����������",n+v,"0"};
        	String[] v148={"reinforce","��ǿ��������Ԯ",v,"0"};
        	String[] v149={"reinstate","�ָ�(ԭְ)",v,"0"};
        	String[] v150={"reiterate","���꣬������˵",v,"0"};
        	String[] v151={"rejoice","ϲ��������",v,"0"};
        	String[] v152={"rejuvenate","ʹ���ϻ�ͯ",v,"0"};
        	String[] v153={"relapse","�ɲ��������ٶ�",v+n,"0"};
        	
        	
        	
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_30,v1);
    		subInitial(DBParameter.pos_wl_30,v2);
    		subInitial(DBParameter.pos_wl_30,v3);
    		subInitial(DBParameter.pos_wl_30,v4);
    		subInitial(DBParameter.pos_wl_30,v5);
    		subInitial(DBParameter.pos_wl_30,v6);
    		subInitial(DBParameter.pos_wl_30,v7);
    		subInitial(DBParameter.pos_wl_30,v8);
    		subInitial(DBParameter.pos_wl_30,v9);
    		subInitial(DBParameter.pos_wl_30,v10);
    		subInitial(DBParameter.pos_wl_30,v11);
    		subInitial(DBParameter.pos_wl_30,v12);
    		subInitial(DBParameter.pos_wl_30,v13);
    		subInitial(DBParameter.pos_wl_30,v14);
    		subInitial(DBParameter.pos_wl_30,v15);
    		subInitial(DBParameter.pos_wl_30,v16);
    		subInitial(DBParameter.pos_wl_30,v17);
    		subInitial(DBParameter.pos_wl_30,v18);
    		subInitial(DBParameter.pos_wl_30,v19);
    		subInitial(DBParameter.pos_wl_30,v20);
    		subInitial(DBParameter.pos_wl_30,v21);
    		subInitial(DBParameter.pos_wl_30,v22);
    		subInitial(DBParameter.pos_wl_30,v23);
    		subInitial(DBParameter.pos_wl_30,v24);
    		subInitial(DBParameter.pos_wl_30,v25);
    		subInitial(DBParameter.pos_wl_30,v26);
    		subInitial(DBParameter.pos_wl_30,v27);
    		subInitial(DBParameter.pos_wl_30,v28);
    		subInitial(DBParameter.pos_wl_30,v29);
    		subInitial(DBParameter.pos_wl_30,v30);
    		subInitial(DBParameter.pos_wl_30,v31);
    		subInitial(DBParameter.pos_wl_30,v32);
    		subInitial(DBParameter.pos_wl_30,v33);
    		subInitial(DBParameter.pos_wl_30,v34);
    		subInitial(DBParameter.pos_wl_30,v35);
    		subInitial(DBParameter.pos_wl_30,v36);
    		subInitial(DBParameter.pos_wl_30,v37);
    		subInitial(DBParameter.pos_wl_30,v38);
    		subInitial(DBParameter.pos_wl_30,v39);
    		subInitial(DBParameter.pos_wl_30,v40);
    		subInitial(DBParameter.pos_wl_30,v41);
    		subInitial(DBParameter.pos_wl_30,v42);
    		subInitial(DBParameter.pos_wl_30,v43);
    		subInitial(DBParameter.pos_wl_30,v44);
    		subInitial(DBParameter.pos_wl_30,v45);
    		subInitial(DBParameter.pos_wl_30,v46);
    		subInitial(DBParameter.pos_wl_30,v47);
    		subInitial(DBParameter.pos_wl_30,v48);
    		subInitial(DBParameter.pos_wl_30,v49);
    		subInitial(DBParameter.pos_wl_30,v50);
    		
    		subInitial(DBParameter.pos_wl_30,v51);
    		subInitial(DBParameter.pos_wl_30,v52);
    		subInitial(DBParameter.pos_wl_30,v53);
    		subInitial(DBParameter.pos_wl_30,v54);
    		subInitial(DBParameter.pos_wl_30,v55);
    		subInitial(DBParameter.pos_wl_30,v56);
    		subInitial(DBParameter.pos_wl_30,v57);
    		subInitial(DBParameter.pos_wl_30,v58);
    		subInitial(DBParameter.pos_wl_30,v59);
    		subInitial(DBParameter.pos_wl_30,v60);
    		subInitial(DBParameter.pos_wl_30,v61);
    		subInitial(DBParameter.pos_wl_30,v62);
    		subInitial(DBParameter.pos_wl_30,v63);
    		subInitial(DBParameter.pos_wl_30,v64);
    		subInitial(DBParameter.pos_wl_30,v65);
    		subInitial(DBParameter.pos_wl_30,v66);
    		subInitial(DBParameter.pos_wl_30,v67);
    		subInitial(DBParameter.pos_wl_30,v68);
    		subInitial(DBParameter.pos_wl_30,v69);
    		subInitial(DBParameter.pos_wl_30,v70);
    		subInitial(DBParameter.pos_wl_30,v71);
    		subInitial(DBParameter.pos_wl_30,v72);
    		subInitial(DBParameter.pos_wl_30,v73);
    		subInitial(DBParameter.pos_wl_30,v74);
    		subInitial(DBParameter.pos_wl_30,v75);
    		subInitial(DBParameter.pos_wl_30,v76);
    		subInitial(DBParameter.pos_wl_30,v77);
    		subInitial(DBParameter.pos_wl_30,v78);
    		subInitial(DBParameter.pos_wl_30,v79);
    		subInitial(DBParameter.pos_wl_30,v80);
    		subInitial(DBParameter.pos_wl_30,v81);
    		subInitial(DBParameter.pos_wl_30,v82);
    		subInitial(DBParameter.pos_wl_30,v83);
    		subInitial(DBParameter.pos_wl_30,v84);
    		subInitial(DBParameter.pos_wl_30,v85);
    		subInitial(DBParameter.pos_wl_30,v86);
    		subInitial(DBParameter.pos_wl_30,v87);
    		subInitial(DBParameter.pos_wl_30,v88);
    		subInitial(DBParameter.pos_wl_30,v89);
    		subInitial(DBParameter.pos_wl_30,v90);
    		subInitial(DBParameter.pos_wl_30,v91);
    		subInitial(DBParameter.pos_wl_30,v92);
    		subInitial(DBParameter.pos_wl_30,v93);
    		subInitial(DBParameter.pos_wl_30,v94);
    		subInitial(DBParameter.pos_wl_30,v95);
    		subInitial(DBParameter.pos_wl_30,v96);
    		subInitial(DBParameter.pos_wl_30,v97);
    		subInitial(DBParameter.pos_wl_30,v98);
    		subInitial(DBParameter.pos_wl_30,v99);
    		subInitial(DBParameter.pos_wl_30,v100);
    		subInitial(DBParameter.pos_wl_30,v101);
    		subInitial(DBParameter.pos_wl_30,v102);
    		subInitial(DBParameter.pos_wl_30,v103);
    		subInitial(DBParameter.pos_wl_30,v104);
    		subInitial(DBParameter.pos_wl_30,v105);
    		subInitial(DBParameter.pos_wl_30,v106);
    		subInitial(DBParameter.pos_wl_30,v107);
    		subInitial(DBParameter.pos_wl_30,v108);
    		subInitial(DBParameter.pos_wl_30,v109);
    		subInitial(DBParameter.pos_wl_30,v110);
    		subInitial(DBParameter.pos_wl_30,v111);
    		subInitial(DBParameter.pos_wl_30,v112);
    		subInitial(DBParameter.pos_wl_30,v113);
    		subInitial(DBParameter.pos_wl_30,v114);
    		subInitial(DBParameter.pos_wl_30,v115);
    		subInitial(DBParameter.pos_wl_30,v116);
    		subInitial(DBParameter.pos_wl_30,v117);
    		subInitial(DBParameter.pos_wl_30,v118);
    		
    		subInitial(DBParameter.pos_wl_30,v119);
    		subInitial(DBParameter.pos_wl_30,v120);
    		subInitial(DBParameter.pos_wl_30,v121);
    		subInitial(DBParameter.pos_wl_30,v122);
    		subInitial(DBParameter.pos_wl_30,v123);
    		subInitial(DBParameter.pos_wl_30,v124);
    		subInitial(DBParameter.pos_wl_30,v125);
    		subInitial(DBParameter.pos_wl_30,v126);
    		subInitial(DBParameter.pos_wl_30,v127);
    		subInitial(DBParameter.pos_wl_30,v128);
    		subInitial(DBParameter.pos_wl_30,v129);
    		subInitial(DBParameter.pos_wl_30,v130);
    		subInitial(DBParameter.pos_wl_30,v131);
    		subInitial(DBParameter.pos_wl_30,v132);
    		subInitial(DBParameter.pos_wl_30,v133);
    		subInitial(DBParameter.pos_wl_30,v134);
    		subInitial(DBParameter.pos_wl_30,v135);
    		subInitial(DBParameter.pos_wl_30,v136);
    		subInitial(DBParameter.pos_wl_30,v137);
    		subInitial(DBParameter.pos_wl_30,v138);
    		subInitial(DBParameter.pos_wl_30,v139);
    		subInitial(DBParameter.pos_wl_30,v140);
    		subInitial(DBParameter.pos_wl_30,v141);
    		subInitial(DBParameter.pos_wl_30,v142);
    		subInitial(DBParameter.pos_wl_30,v143);
    		subInitial(DBParameter.pos_wl_30,v144);
    		subInitial(DBParameter.pos_wl_30,v145);
    		subInitial(DBParameter.pos_wl_30,v146);
    		subInitial(DBParameter.pos_wl_30,v147);
    		subInitial(DBParameter.pos_wl_30,v148);
    		subInitial(DBParameter.pos_wl_30,v149);
    		subInitial(DBParameter.pos_wl_30,v150);
    		subInitial(DBParameter.pos_wl_30,v151);
    		subInitial(DBParameter.pos_wl_30,v152);
    		subInitial(DBParameter.pos_wl_30,v153);
    
        	
    }
    public void doList_31(){
    	String[] v1={"relate","�������й���",v,"0"};
    	String[] v2={"relaxation","���ɣ���ǲ",n,"0"};
    	String[] v3={"release","�ͷ�",n+v,"0"};
    	String[] v4={"relegate","���������أ��������и�",v,"0"};
    	String[] v5={"relent","�������ģ�����",v,"0"};
    	String[] v6={"relenting","�����ģ�������",a,"0"};
    	String[] v7={"relentless","�����",a,"0"};
    	String[] v8={"reliance","����",n,"0"};
    	String[] v9={"relic","����ż�",n,"0"};
    	String[] v10={"relieved","��ο�ģ������ظ���",a,"0"};
    	String[] v11={"relinquish","�������ϳ�",v,"0"};
    	String[] v12={"relish","ζ����ϲ�ã�ϲ��",n+v,"0"};
    	String[] v13={"remainder","ʣ����",n,"0"};
    	String[] v14={"remains","��ַ������",n,"0"};
    	String[] v15={"reminder","�����˼���֮��",n,"0"};
    	String[] v16={"reminisce","׷�䣬����",v,"0"};
    	String[] v17={"remiss","����ģ������ĵ�",a,"0"};
    	String[] v18={"remnant","�������ͷ����",n,"0"};
    	String[] v19={"remorse","�ûڣ��ں�",n,"0"};
    	String[] v20={"remove","���ߣ��ѵ���Ǩ��",v,"0"};
    	String[] v21={"remunerative","����ߵģ��������",a,"0"};
    	String[] v22={"rend","˺�ѣ����ѣ�����",v,"0"};
    	String[] v23={"render","�ʵݣ����֣��ṩ",v,"0"};
    	String[] v24={"rendering","�ݳ�������",n,"0"};
    	String[] v25={"rendezvous","Լ�ᣬԼ��ص�",n,"0"};
    	String[] v26={"renegade","�ѽ��ߣ���ͽ",n,"0"};
    	String[] v27={"renege","���ţ�ΥԼ",v,"0"};
    	String[] v28={"renounce","(��ʽ)����",v,"0"};
    	String[] v29={"renovate","�޸���װ�ޣ�����",v,"0"};
    	String[] v30={"renown","����������",n,"0"};
    	String[] v31={"rent","�ѷ죬����",n,"0"};
    	String[] v32={"reparable","����صģ��ܲ��ȵ�",a,"0"};
    	String[] v33={"reparation","�⳥������",n,"0"};
    	String[] v34={"repartee","����Ļش�",n,"0"};
    	String[] v35={"repatriate","ǲ��",v,"0"};
    	String[] v36={"repeal","�ϳ�(����)",v,"0"};
    	String[] v37={"repel","���ˣ�ʹ...����",v,"0"};
    	String[] v38={"repellent","��������",a,"0"};
    	String[] v39={"repercussion","���죬Ӱ��",n,"0"};
    	String[] v40={"repertoire","(���ŵ�)������Ŀ",n,"0"};
    	String[] v41={"repine","���������б�Թ",v,"0"};
    	String[] v42={"replenish","���䣬��װ��",v,"0"};
    	String[] v43={"replete","�����ģ�������",a,"0"};
    	String[] v44={"reportorial","���ߵģ���ʵ��",a,"0"};
    	String[] v45={"repose","������Ϣ����˯",v+n,"0"};
    	String[] v46={"reprehend","Ǵ������",v,"0"};
    	String[] v47={"reprehensible","Ӧ��Ǵ���",a,"0"};
    	String[] v48={"repressed","��ѹ�Ƶģ���ѹ�ֵ�",a,"0"};
    	String[] v49={"reprieve","���̣���ʱ���",v+n,"0"};
    	String[] v50={"reprimand","ѵ�룬Ǵ��",v+n,"0"};
    	String[] v51={"reprisal","(���λ���µ�)����",n,"0"};
        String[] v52={"reprise","(���־���)�������ظ����ظ�(����)",n,"0"};
        String[] v53={"reproach","Ǵ������",n,"0"};
        String[] v54={"reprobate","Ǵ��ָ�𣻶���ģ�����֮��",v+a+n,"0"};
        String[] v55={"reproof","��⣬��",n,"0"};
        String[] v56={"reprove","������",v,"0"};
        String[] v57={"reptile","���ж������֮��",n,"0"};
        String[] v58={"reptilian","������ģ����µ�",a,"0"};
        String[] v59={"repudiate","�ܾ�������",v,"0"};
        String[] v60={"repugnance","�Ӷ�",n,"0"};		
    	String[] v61={"repugnant","��������",a,"0"};
        String[] v62={"repulse","���𣬻��ˣ���񣻻ؾ����ܾ�",v+n,"0"};
       	String[] v63={"repulsion","��񣬷��У��ų���",n,"0"};
       	String[] v64={"reputation","����",n,"0"};
       	String[] v65={"repute","����",n,"0"};
       	String[] v66={"request","Ҫ������",n+v,"0"};
        String[] v67={"requisite","�������Ҫ��",n+a,"0"};
        String[] v68={"requite","���𣬱���",v,"0"};
        String[] v69={"rescind","�ϳ���ȡ��",v,"0"};
        String[] v70={"rescission","�ϳ�",n,"0"};
    	String[] v71={"rescue","��ȣ���...�ӷ��ɼ����ǿ�ж��",n+v,"0"};
        String[] v72={"resent","����",v,"0"};
       	String[] v73={"resentment","�ߺ�",n,"0"};
       	String[] v74={"reserve","����������������Ĭ��������������������Ԥ��",n+v,"0"};
       	String[] v75={"reside","��ס",v,"0"};
        String[] v76={"resident","���񣻶��ӵģ���פ��",n+a,"0"};
        String[] v77={"residual","����ģ�ʣ���",a,"0"};
        String[] v78={"residue","ʣ��",n,"0"};
        String[] v79={"resignation","���ӣ�˳�ӣ���ְ",n,"0"};
        String[] v80={"resigned","����˳�ܵģ�˳�ӵ�",a,"0"};
    	String[] v81={"resilience","���ԣ�����",n,"0"};
        String[] v82={"resilient","�е��Եģ��ָܻ������ģ���Ӧ��ǿ��",a,"0"};
        String[] v83={"resonant","(����)�����ģ�������",a,"0"};
        String[] v84={"resort","�ȼ�ʤ��",n,"0"};
        String[] v85={"resound","�ص�������������",v,"0"};
        String[] v86={"resourceful","���ǵ�",a,"0"};
        String[] v87={"respiration","����",n,"0"};
        String[] v88={"respite","��Ϣ���ݻ�",n,"0"};
        String[] v89={"resplendent","�����ģ��Ի͵�",a,"0"};
        String[] v90={"respondent","����",n,"0"};
        String[] v91={"response","��Ӧ����Ӧ���ش�",n,"0"};
        String[] v92={"responsive","���еģ���Ӧ���",a,"0"};
        String[] v93={"responsiveness","Ӧ����Ӧ",n,"0"};
        String[] v94={"resitution","�鳥���⳥",n,"0"};
        String[] v95={"restive","�������ģ���������",a,"0"};
        String[] v96={"restiveness","��ǿ�����Լ�Ԧ",n,"0"};
        String[] v97={"restless","��ͣ�ģ���������",a,"0"};
        String[] v98={"restore","ʹ�ظ����ָ����޸����޲�",v,"0"};
        String[] v99={"restored","�ָ��ģ����޵�",a,"0"};
        String[] v100={"restrain","���ƣ�����",v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"restraint","����",n,"0"};
        	String[] v102={"resume","���¿�ʼ������",v,"0"};
        	String[] v103={"resurgence","���𣬸������",n,"0"};
        	String[] v104={"resurrect","ʹ�������",v,"0"};
        	String[] v105={"resuscitate","ʹ���ʹ����",v,"0"};
        	String[] v106={"retail","����",v+n,"0"};
        	String[] v107={"retain","���������֣���ס",v,"0"};
        	String[] v108={"retainer","�̴�",n,"0"};
        	String[] v109={"retaliate","����������",v,"0"};
        	String[] v110={"retaliation","����",n,"0"};
        	String[] v111={"retard","����������",v,"0"};
        	String[] v112={"reticent","��Ĭ�����",a,"0"};
        	String[] v113={"retinue","�̴ӣ���Ա��",n,"0"};
        	String[] v114={"retiring","���ӵģ���ϲ���罻��",a,"0"};
        	String[] v115={"retort","����",v,"0"};
        	String[] v116={"retouch","���裬��ɫ",v,"0"};
        	String[] v117={"retrace","�عˣ�����",v,"0"};
        	String[] v118={"retract","���أ��ջ�",v,"0"};
        	String[] v119={"retreat","���ˣ����Ӵ�",n+v,"0"};
        	String[] v120={"retrench","��ʡ����������",v,"0"};
        	String[] v121={"retribution","��Ӧ���ͷ�",n,"0"};
        	String[] v122={"retrieve","Ѱ�أ�ȡ�أ����",n+v,"0"};
        	String[] v123={"revealing","��¶�ģ���¶�ģ���¶�Ե�",a,"0"};
        	String[] v124={"revelation","��ʾ��й¶����ʵ",n,"0"};
        	String[] v125={"revelry","��",n,"0"};
        	String[] v126={"revenge","����������",n,"0"};
        	String[] v127={"revenue","�����룬����˰������",n,"0"};
        	String[] v128={"reverberate","�����������",v,"0"};
        	String[] v129={"revere","��",v,"0"};
        	String[] v130={"reverie","���룬�λ���",n,"0"};
        	String[] v131={"reverse","���棬�෴����������ת",n+v,"0"};
        	String[] v132={"revert","�ָ����ظ��������¿���",v,"0"};
        	String[] v133={"revile","�����������",v,"0"};
        	String[] v134={"revise","�ı䣬����",v+n,"0"};
        	String[] v135={"revitalize","ʹ���³�������",v,"0"};
        	String[] v136={"revive","ʹ���ѣ������У�ʹ����",v,"0"};
        	String[] v137={"revolt","���ң��췴",v,"0"};
        	String[] v138={"revue","ʱ�·�̾�",n,"0"};
        	String[] v139={"reward","�걨������",n+v,"0"};
        	String[] v140={"rewarding","����ģ�ֵ������",a,"0"};
        	String[] v141={"rhetoric","�޴�ѧ�����������",n,"0"};
        	String[] v142={"rhinestone","����ʯ",n,"0"};
        	String[] v143={"rhubarb","��ֲ����ƣ���������",n+v,"0"};
        	String[] v144={"rhyme","Ѻ��",n+v,"0"};
        	String[] v145={"rhythmic","�н����",a,"0"};
        	String[] v146={"rib","�߹ǣ�ɡ��",n,"0"};
        	String[] v147={"ribald","�����ģ��ֱɵ�",a,"0"};
        	String[] v148={"rickety","���ο��ģ�ҡҡ��׹��",a,"0"};
        	String[] v149={"riddle","����",n,"0"};
        	String[] v150={"rider","���֣����ģ�����",n,"0"};
        	String[] v151={"ridge","����¡����",n,"0"};
        	String[] v152={"ridicule","���䣬��Ц",n+v,"0"};
        	String[] v153={"rife","���еģ��ձ��",a,"0"};
        	String[] v154={"rifle","��ǹ������",n+v,"0"};
        	String[] v155={"rift","�ѿڣ����ѣ�ì��",n,"0"};
        	String[] v156={"rig","��ƭ����ף�α��",v,"0"};
        	String[] v157={"rigid","Ӳ�Եģ���Ӳ��",a,"0"};
        	String[] v158={"rigor","�ϸ񣬿��̣���ȷ���Ͽ�",n,"0"};
        	String[] v159={"rile","ʹ...�ջ𣬼�ŭ",v,"0"};
        	String[] v160={"rind","(���ϵ�)��Ƥ",n,"0"};
        	String[] v161={"ringlet","��",n,"0"};
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_31,v1);
    		subInitial(DBParameter.pos_wl_31,v2);
    		subInitial(DBParameter.pos_wl_31,v3);
    		subInitial(DBParameter.pos_wl_31,v4);
    		subInitial(DBParameter.pos_wl_31,v5);
    		subInitial(DBParameter.pos_wl_31,v6);
    		subInitial(DBParameter.pos_wl_31,v7);
    		subInitial(DBParameter.pos_wl_31,v8);
    		subInitial(DBParameter.pos_wl_31,v9);
    		subInitial(DBParameter.pos_wl_31,v10);
    		subInitial(DBParameter.pos_wl_31,v11);
    		subInitial(DBParameter.pos_wl_31,v12);
    		subInitial(DBParameter.pos_wl_31,v13);
    		subInitial(DBParameter.pos_wl_31,v14);
    		subInitial(DBParameter.pos_wl_31,v15);
    		subInitial(DBParameter.pos_wl_31,v16);
    		subInitial(DBParameter.pos_wl_31,v17);
    		subInitial(DBParameter.pos_wl_31,v18);
    		subInitial(DBParameter.pos_wl_31,v19);
    		subInitial(DBParameter.pos_wl_31,v20);
    		subInitial(DBParameter.pos_wl_31,v21);
    		subInitial(DBParameter.pos_wl_31,v22);
    		subInitial(DBParameter.pos_wl_31,v23);
    		subInitial(DBParameter.pos_wl_31,v24);
    		subInitial(DBParameter.pos_wl_31,v25);
    		subInitial(DBParameter.pos_wl_31,v26);
    		subInitial(DBParameter.pos_wl_31,v27);
    		subInitial(DBParameter.pos_wl_31,v28);
    		subInitial(DBParameter.pos_wl_31,v29);
    		subInitial(DBParameter.pos_wl_31,v30);
    		subInitial(DBParameter.pos_wl_31,v31);
    		subInitial(DBParameter.pos_wl_31,v32);
    		subInitial(DBParameter.pos_wl_31,v33);
    		subInitial(DBParameter.pos_wl_31,v34);
    		subInitial(DBParameter.pos_wl_31,v35);
    		subInitial(DBParameter.pos_wl_31,v36);
    		subInitial(DBParameter.pos_wl_31,v37);
    		subInitial(DBParameter.pos_wl_31,v38);
    		subInitial(DBParameter.pos_wl_31,v39);
    		subInitial(DBParameter.pos_wl_31,v40);
    		subInitial(DBParameter.pos_wl_31,v41);
    		subInitial(DBParameter.pos_wl_31,v42);
    		subInitial(DBParameter.pos_wl_31,v43);
    		subInitial(DBParameter.pos_wl_31,v44);
    		subInitial(DBParameter.pos_wl_31,v45);
    		subInitial(DBParameter.pos_wl_31,v46);
    		subInitial(DBParameter.pos_wl_31,v47);
    		subInitial(DBParameter.pos_wl_31,v48);
    		subInitial(DBParameter.pos_wl_31,v49);
    		subInitial(DBParameter.pos_wl_31,v50);
    		
    		subInitial(DBParameter.pos_wl_31,v51);
    		subInitial(DBParameter.pos_wl_31,v52);
    		subInitial(DBParameter.pos_wl_31,v53);
    		subInitial(DBParameter.pos_wl_31,v54);
    		subInitial(DBParameter.pos_wl_31,v55);
    		subInitial(DBParameter.pos_wl_31,v56);
    		subInitial(DBParameter.pos_wl_31,v57);
    		subInitial(DBParameter.pos_wl_31,v58);
    		subInitial(DBParameter.pos_wl_31,v59);
    		subInitial(DBParameter.pos_wl_31,v60);
    		subInitial(DBParameter.pos_wl_31,v61);
    		subInitial(DBParameter.pos_wl_31,v62);
    		subInitial(DBParameter.pos_wl_31,v63);
    		subInitial(DBParameter.pos_wl_31,v64);
    		subInitial(DBParameter.pos_wl_31,v65);
    		subInitial(DBParameter.pos_wl_31,v66);
    		subInitial(DBParameter.pos_wl_31,v67);
    		subInitial(DBParameter.pos_wl_31,v68);
    		subInitial(DBParameter.pos_wl_31,v69);
    		subInitial(DBParameter.pos_wl_31,v70);
    		subInitial(DBParameter.pos_wl_31,v71);
    		subInitial(DBParameter.pos_wl_31,v72);
    		subInitial(DBParameter.pos_wl_31,v73);
    		subInitial(DBParameter.pos_wl_31,v74);
    		subInitial(DBParameter.pos_wl_31,v75);
    		subInitial(DBParameter.pos_wl_31,v76);
    		subInitial(DBParameter.pos_wl_31,v77);
    		subInitial(DBParameter.pos_wl_31,v78);
    		subInitial(DBParameter.pos_wl_31,v79);
    		subInitial(DBParameter.pos_wl_31,v80);
    		subInitial(DBParameter.pos_wl_31,v81);
    		subInitial(DBParameter.pos_wl_31,v82);
    		subInitial(DBParameter.pos_wl_31,v83);
    		subInitial(DBParameter.pos_wl_31,v84);
    		subInitial(DBParameter.pos_wl_31,v85);
    		subInitial(DBParameter.pos_wl_31,v86);
    		subInitial(DBParameter.pos_wl_31,v87);
    		subInitial(DBParameter.pos_wl_31,v88);
    		subInitial(DBParameter.pos_wl_31,v89);
    		subInitial(DBParameter.pos_wl_31,v90);
    		subInitial(DBParameter.pos_wl_31,v91);
    		subInitial(DBParameter.pos_wl_31,v92);
    		subInitial(DBParameter.pos_wl_31,v93);
    		subInitial(DBParameter.pos_wl_31,v94);
    		subInitial(DBParameter.pos_wl_31,v95);
    		subInitial(DBParameter.pos_wl_31,v96);
    		subInitial(DBParameter.pos_wl_31,v97);
    		subInitial(DBParameter.pos_wl_31,v98);
    		subInitial(DBParameter.pos_wl_31,v99);
    		subInitial(DBParameter.pos_wl_31,v100);
    		subInitial(DBParameter.pos_wl_31,v101);
    		subInitial(DBParameter.pos_wl_31,v102);
    		subInitial(DBParameter.pos_wl_31,v103);
    		subInitial(DBParameter.pos_wl_31,v104);
    		subInitial(DBParameter.pos_wl_31,v105);
    		subInitial(DBParameter.pos_wl_31,v106);
    		subInitial(DBParameter.pos_wl_31,v107);
    		subInitial(DBParameter.pos_wl_31,v108);
    		subInitial(DBParameter.pos_wl_31,v109);
    		subInitial(DBParameter.pos_wl_31,v110);
    		subInitial(DBParameter.pos_wl_31,v111);
    		subInitial(DBParameter.pos_wl_31,v112);
    		subInitial(DBParameter.pos_wl_31,v113);
    		subInitial(DBParameter.pos_wl_31,v114);
    		subInitial(DBParameter.pos_wl_31,v115);
    		subInitial(DBParameter.pos_wl_31,v116);
    		subInitial(DBParameter.pos_wl_31,v117);
    		subInitial(DBParameter.pos_wl_31,v118);
    		
    		subInitial(DBParameter.pos_wl_31,v119);
    		subInitial(DBParameter.pos_wl_31,v120);
    		subInitial(DBParameter.pos_wl_31,v121);
    		subInitial(DBParameter.pos_wl_31,v122);
    		subInitial(DBParameter.pos_wl_31,v123);
    		subInitial(DBParameter.pos_wl_31,v124);
    		subInitial(DBParameter.pos_wl_31,v125);
    		subInitial(DBParameter.pos_wl_31,v126);
    		subInitial(DBParameter.pos_wl_31,v127);
    		subInitial(DBParameter.pos_wl_31,v128);
    		subInitial(DBParameter.pos_wl_31,v129);
    		subInitial(DBParameter.pos_wl_31,v130);
    		subInitial(DBParameter.pos_wl_31,v131);
    		subInitial(DBParameter.pos_wl_31,v132);
    		subInitial(DBParameter.pos_wl_31,v133);
    		subInitial(DBParameter.pos_wl_31,v134);
    		subInitial(DBParameter.pos_wl_31,v135);
    		subInitial(DBParameter.pos_wl_31,v136);
    		subInitial(DBParameter.pos_wl_31,v137);
    		subInitial(DBParameter.pos_wl_31,v138);
    		subInitial(DBParameter.pos_wl_31,v139);
    		subInitial(DBParameter.pos_wl_31,v140);
    		subInitial(DBParameter.pos_wl_31,v141);
    		subInitial(DBParameter.pos_wl_31,v142);
    		subInitial(DBParameter.pos_wl_31,v143);
    		subInitial(DBParameter.pos_wl_31,v144);
    		subInitial(DBParameter.pos_wl_31,v145);
    		subInitial(DBParameter.pos_wl_31,v146);
    		subInitial(DBParameter.pos_wl_31,v147);
    		subInitial(DBParameter.pos_wl_31,v148);
    		subInitial(DBParameter.pos_wl_31,v149);
    		subInitial(DBParameter.pos_wl_31,v150);
    		subInitial(DBParameter.pos_wl_31,v151);
    		subInitial(DBParameter.pos_wl_31,v152);
    		subInitial(DBParameter.pos_wl_31,v153);
    		subInitial(DBParameter.pos_wl_31,v154);
    		subInitial(DBParameter.pos_wl_31,v155);
    		subInitial(DBParameter.pos_wl_31,v156);
    		subInitial(DBParameter.pos_wl_31,v157);
    		subInitial(DBParameter.pos_wl_31,v158);
    		subInitial(DBParameter.pos_wl_31,v159);
    		subInitial(DBParameter.pos_wl_31,v160);
    		subInitial(DBParameter.pos_wl_31,v161);
    	
        	
    }
    public void doList_32(){
    	String[] v1={"riot","�μӱ���",v,"0"};
    	String[] v2={"riotous","���ҵģ�ɧ���ģ����ֵ�",a,"0"};
    	String[] v3={"ripen","ʹ����",v,"0"};
    	String[] v4={"ripple","������������",v+n,"0"};
    	String[] v5={"rite","(�ڽ�)��ʽ",n,"0"};
    	String[] v6={"ritual","��ʽ������ϰ��",n,"0"};
    	String[] v7={"rival","�����ߣ����֣���...ƥ��",n+v,"0"};
    	String[] v8={"rivalry","�������Կ�",n,"0"};
    	String[] v9={"rive","˺��������",v,"0"};
    	String[] v10={"riven","˺�ѵģ����ѵ�",a,"0"};
    	String[] v11={"rivet","í��������",n+v,"0"};
    	String[] v12={"riveting","�ǳ����ʵ�",a,"0"};
    	String[] v13={"rivulet","СϪ��С��",n,"0"};
    	String[] v14={"robe","���ۣ����",n,"0"};
    	String[] v15={"robust","��׳��",a,"0"};
    	String[] v16={"roe","����",n,"0"};
    	String[] v17={"roll","ɿ��������",v,"0"};
    	String[] v18={"rookie","�±�������",n,"0"};
    	String[] v19={"roster","ֵ���������",n,"0"};
    	String[] v20={"rostrum","��̨����̳",n,"0"};
    	String[] v21={"rotate","��ת������",v,"0"};
    	String[] v22={"rotten","���ܵģ�����",a,"0"};
    	String[] v23={"roughen","��ֲڣ��䲻ƽ",v,"0"};
    	String[] v24={"royalty","��˰",n,"0"};
    	String[] v25={"rubicund","(��ɫ)�����",a,"0"};
    	String[] v26={"rudder","���棬�쵼��",n,"0"};
    	String[] v27={"rudimentary","�����ģ�δ��ַ�չ��",a,"0"};
    	String[] v28={"rue","��ڣ��ź�",n,"0"};
    	String[] v29={"ruffian","�������ͽ���б���",n+a,"0"};
    	String[] v30={"ruffle","Ū�壬��ŭ�����",v+n,"0"};
    	String[] v31={"ruminant","��ۻ�ģ���˼��",a,"0"};
    	String[] v32={"rumple","Ū�壬Ū��",v,"0"};
    	String[] v33={"rung","���Ӻᵵ���ݼ�",n,"0"};
    	String[] v34={"runic","��ŷ�Ŵ����ֵģ����ص�",a,"0"};
    	String[] v35={"rupture","���ѣ�����",n+v,"0"};
    	String[] v36={"rural","����",a,"0"};
    	String[] v37={"ruse","ƭ�������",n,"0"};
    	String[] v38={"rustic","���ģ���������",a,"0"};
    	String[] v39={"ruthlessness","���飬����",n,"0"};
    	String[] v40={"sabotage","��ı�ƻ����߸��",n,"0"};
    	String[] v41={"saboteur","�����ƻ����",n,"0"};
    	String[] v42={"saccharin","�Ǿ�",n,"0"};
    	String[] v43={"sacred","��ʥ�ģ�ׯ�ϵ�",a,"0"};
    	String[] v44={"sacrifice","����",n+v,"0"};
    	String[] v45={"sacriledge","���£�ð������",n,"0"};
    	String[] v46={"sacrilegious","�����",a,"0"};
    	String[] v47={"sadden","ʹ���ģ�ʹ����",v,"0"};
    	String[] v48={"saddle","��",n,"0"};
    	String[] v49={"safeguard","������ʩ",n,"0"};
    	String[] v50={"sagacious","�����ģ���ǵ�",a,"0"};
    	String[] v51={"sage","�ǻ۵ģ�����",a+n,"0"};
        String[] v52={"saintly","ʥͽ�Ƶģ���Ϊʥ���",a,"0"};
        String[] v53={"salient","�����ģ�ͻ����",a,"0"};
        String[] v54={"saliva","��Һ����ˮ",n,"0"};
        String[] v55={"salmon","������㣬����ɫ",n,"0"};
        String[] v56={"salubrious","���潡����",a,"0"};
        String[] v57={"salutary","����ģ����潡����",a,"0"};
        String[] v58={"salutation","�к������⣬����",n,"0"};
        String[] v59={"salute","��������",v,"0"};
        String[] v60={"salvage","���ȣ����Ͼ���",n,"0"};		
    	String[] v61={"salve","ҩ�ࣻ���ᣬ����",n+v,"0"};
        String[] v62={"sampler","���廨��������Ա",n,"0"};
       	String[] v63={"sactify","ʹ��ʥ",v,"0"};
       	String[] v64={"sanctimonious","��װ��ʥ��",a,"0"};
       	String[] v65={"sanction","��׼���Ͽ�",v+n,"0"};
       	String[] v66={"sandal","��Ь����Ь",n,"0"};
        String[] v67={"sane","��־����ģ����ǵ�",a,"0"};
        String[] v68={"sanguine","�ֹ۵�",a,"0"};
        String[] v69={"sanity","��־���",n,"0"};
        String[] v70={"sap","��Һ���������������ľ�",n+v,"0"};
    	String[] v71={"sapient","���ǻ۵�",a,"0"};
        String[] v72={"sapphire","��ʯ������ʯ������ɫ��",n+a,"0"};
       	String[] v73={"sarcastic","��̵�",a,"0"};
       	String[] v74={"sartorial","�÷�ģ����Ƶ�",a,"0"};
       	String[] v75={"sash","���",n,"0"};
        String[] v76={"sate","ʹ�������㣬ʹ����",v,"0"};
        String[] v77={"satiated","�������ģ����ģ������",a,"0"};
        String[] v78={"satire","���(��Ʒ)",n,"0"};
        String[] v79={"satirize","���",v,"0"};
        String[] v80={"saturate","��͸��ʹ����",v,"0"};
        String[] v81={"saturnine","�����ģ�������",a,"0"};
        String[] v82={"saunter","�й䣬����",n+v,"0"};
        String[] v83={"savage","���͵ģ�Ұ����",a,"0"};
        String[] v84={"savant","��ѧ֮ʿ����ѧʿ",n,"0"};
        String[] v85={"savvy","�м�ʶ�ģ������ܸɵ�",a,"0"};
        String[] v86={"sawdust","��м",n,"0"};
        String[] v87={"scabbard","��",n,"0"};
        String[] v88={"scad","��࣬����",n,"0"};
        String[] v89={"scaffold","���ּ�",n,"0"};
        String[] v90={"scalding","���̵�",a,"0"};
        String[] v91={"scale","���ۣ�����",n,"0"};
        String[] v92={"scalpel","��������������ʵ�",n,"0"};
        String[] v93={"scandal","���ţ�����̰�",n,"0"};
        String[] v94={"scant","����ģ�ȱ����",a,"0"};
        String[] v95={"scarcity","���㣬ȱ��",n,"0"};
        String[] v96={"scarf","Χ������",n,"0"};
        String[] v97={"scathing","���̵ģ�������",a,"0"};
        String[] v98={"scatter","ɢ������ɢ",v,"0"};
        String[] v99={"scenario","�籾��٣��籾",n,"0"};
        String[] v100={"schematic","��Ҫ�ģ�ͼ���",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"schematize","��Ҫ��ʾ",v,"0"};
        	String[] v102={"scheme","��ı��(��Ʒ)��ϵ���ṹ",n,"0"};
        	String[] v103={"schism","��֯����",n,"0"};
        	String[] v104={"school","��Ⱥ",n,"0"};
        	String[] v105={"scion","��ѿ������",n,"0"};
        	String[] v106={"scissor","����",n,"0"};
        	String[] v107={"scoff","��Ц��Ц�������̻���",v+n,"0"};
        	String[] v108={"scoop","С�������ӣ�����ȡ����Ҩ��",v,"0"};
        	String[] v109={"scope","�۽磬��Χ",n,"0"};
        	String[] v110={"scorch","�������ս�",v,"0"};
        	String[] v111={"score","����",n,"0"};
        	String[] v112={"scorn","����",n+v,"0"};
        	String[] v113={"scorpion","Ы��",n,"0"};
        	String[] v114={"scotch","��ѹ������",v,"0"};
        	String[] v115={"scourge","���ף�ĥ��",n+v,"0"};
        	String[] v116={"scowl","ŭ�ݣ�(����)��ü��ŭ��",n+v,"0"};
        	String[] v117={"scrap","СƬ����м������",n+v,"0"};
        	String[] v118={"scrappy","��Ƭ�ģ��ö��ģ������",a,"0"};
        	String[] v119={"scrawl","��Ϳ���ʲݵ�д",v,"0"};
        	String[] v120={"screw","�ݶ������������Ĺ�",n,"0"};
        	String[] v121={"screwdriver","��˿��",n,"0"};
        	String[] v122={"scribble","��д����Ϳ",v,"0"};
        	String[] v123={"script","�籾���ű�",n,"0"};
        	String[] v124={"scripture","���ģ�ʥ��",n,"0"};
        	String[] v125={"scroll","���ᣬֽ������",n,"0"};
        	String[] v126={"scrub","�����ԣ����尫С֮�ˣ�������ϴ",n+v,"0"};
        	String[] v127={"scruple","�˼ɣ�����",n+v,"0"};
        	String[] v128={"scrutable","��������",a,"0"};
        	String[] v129={"scrutinize","��ϸ��飬ϸ��",v,"0"};
        	String[] v130={"scuff","���Ž���",v,"0"};
        	String[] v131={"sculpt","���",v,"0"};
        	String[] v132={"scurrilous","������",a,"0"};
        	String[] v133={"scurry","���ܣ�����",v,"0"};
        	String[] v134={"scurvy","���ɵ�",a,"0"};
        	String[] v135={"scythe","������",n,"0"};
        	String[] v136={"seam","�죬�ӷ�",n,"0"};
        	String[] v137={"seamy","����ģ����ӵ�",a,"0"};
        	String[] v138={"sear","����",v,"0"};
        	String[] v139={"seasoned","�о���ģ�ѵ�����ص�",a,"0"};
        	String[] v140={"seasoning","��ζƷ������",n,"0"};
        	String[] v141={"secede","��ʽ������˳�",v,"0"};
        	String[] v142={"secrete","���أ�����",v,"0"};
        	String[] v143={"secretive","�ؿ���ƿ��",a,"0"};
        	String[] v144={"secular","���׵�",a,"0"};
        	String[] v145={"secure","��ȫ�ģ��ȹ̵ģ��̶���ʹ��ȫ",a+v,"0"};
        	String[] v146={"securities","֤ȯ",n,"0"};
        	String[] v147={"sedate","�򾲵�",a,"0"};
        	String[] v148={"sedative","(ҩ��)�򾲵ģ��򾲼�",a+n,"0"};
        	String[] v149={"sedentary","������",a,"0"};
        	String[] v150={"sediment","�������",n,"0"};
        	String[] v151={"sedulity","�ڷ�",n,"0"};
        	String[] v152={"sedulous","�۾�����ģ������",a,"0"};
        	String[] v153={"seedling","����",n,"0"};
        	String[] v154={"seemly","����ģ����˵�",a,"0"};
        	String[] v155={"seep","��©",v,"0"};
        	String[] v156={"seethe","���ڣ���ӿ",v,"0"};
        	String[] v157={"segment","����",n,"0"};
        	String[] v158={"seine","������������",n,"0"};
        	String[] v159={"seismic","�����",a,"0"};
        	String[] v160={"semblance","��ò������",n,"0"};
        	String[] v161={"seminal","�д����",a,"0"};
        	String[] v162={"seminary","��ѧԺ",n,"0"};
        	String[] v163={"sensation","֪�����䶯(����)",n,"0"};
        	String[] v164={"sensible","���ǵģ��ɸо�����",a,"0"};
        	String[] v165={"sensitive","���е�",a,"0"};
        	String[] v166={"sensitivity","���У�������",n,"0"};
        	String[] v167={"sensitization","����",n,"0"};
        	String[] v168={"sentient","��֪���ģ�֪Ϥ��",a,"0"};
        	String[] v169={"sentiment","����ƸУ�˼�����",n,"0"};
        	String[] v170={"sentinel","�ڱ�������",n,"0"};
        	String[] v171={"separate","ʹ�ֿ�����ͬ�ģ����Ե�",v+a,"0"};
        	String[] v172={"septic","�ܸ�Ⱦ�ģ����ܵ�",a,"0"};
        	String[] v173={"sepulchral","��Ĺ�ģ���ɭ��",a,"0"};
        	String[] v174={"sequential","�����ģ�һ������",a,"0"};
            String[] v175={"sequester","(ʹ)���ˣ�(ʹ)����",v,"0"};
        	String[] v176={"seraphic","����ʹ��ģ�������",a,"0"};
        	String[] v177={"sere","�ɿݵģ���ή��",a,"0"};
        	
        	
        	
        	subInitial(DBParameter.pos_wl_32,v1);
    		subInitial(DBParameter.pos_wl_32,v2);
    		subInitial(DBParameter.pos_wl_32,v3);
    		subInitial(DBParameter.pos_wl_32,v4);
    		subInitial(DBParameter.pos_wl_32,v5);
    		subInitial(DBParameter.pos_wl_32,v6);
    		subInitial(DBParameter.pos_wl_32,v7);
    		subInitial(DBParameter.pos_wl_32,v8);
    		subInitial(DBParameter.pos_wl_32,v9);
    		subInitial(DBParameter.pos_wl_32,v10);
    		subInitial(DBParameter.pos_wl_32,v11);
    		subInitial(DBParameter.pos_wl_32,v12);
    		subInitial(DBParameter.pos_wl_32,v13);
    		subInitial(DBParameter.pos_wl_32,v14);
    		subInitial(DBParameter.pos_wl_32,v15);
    		subInitial(DBParameter.pos_wl_32,v16);
    		subInitial(DBParameter.pos_wl_32,v17);
    		subInitial(DBParameter.pos_wl_32,v18);
    		subInitial(DBParameter.pos_wl_32,v19);
    		subInitial(DBParameter.pos_wl_32,v20);
    		subInitial(DBParameter.pos_wl_32,v21);
    		subInitial(DBParameter.pos_wl_32,v22);
    		subInitial(DBParameter.pos_wl_32,v23);
    		subInitial(DBParameter.pos_wl_32,v24);
    		subInitial(DBParameter.pos_wl_32,v25);
    		subInitial(DBParameter.pos_wl_32,v26);
    		subInitial(DBParameter.pos_wl_32,v27);
    		subInitial(DBParameter.pos_wl_32,v28);
    		subInitial(DBParameter.pos_wl_32,v29);
    		subInitial(DBParameter.pos_wl_32,v30);
    		subInitial(DBParameter.pos_wl_32,v31);
    		subInitial(DBParameter.pos_wl_32,v32);
    		subInitial(DBParameter.pos_wl_32,v33);
    		subInitial(DBParameter.pos_wl_32,v34);
    		subInitial(DBParameter.pos_wl_32,v35);
    		subInitial(DBParameter.pos_wl_32,v36);
    		subInitial(DBParameter.pos_wl_32,v37);
    		subInitial(DBParameter.pos_wl_32,v38);
    		subInitial(DBParameter.pos_wl_32,v39);
    		subInitial(DBParameter.pos_wl_32,v40);
    		subInitial(DBParameter.pos_wl_32,v41);
    		subInitial(DBParameter.pos_wl_32,v42);
    		subInitial(DBParameter.pos_wl_32,v43);
    		subInitial(DBParameter.pos_wl_32,v44);
    		subInitial(DBParameter.pos_wl_32,v45);
    		subInitial(DBParameter.pos_wl_32,v46);
    		subInitial(DBParameter.pos_wl_32,v47);
    		subInitial(DBParameter.pos_wl_32,v48);
    		subInitial(DBParameter.pos_wl_32,v49);
    		subInitial(DBParameter.pos_wl_32,v50);
    		
    		subInitial(DBParameter.pos_wl_32,v51);
    		subInitial(DBParameter.pos_wl_32,v52);
    		subInitial(DBParameter.pos_wl_32,v53);
    		subInitial(DBParameter.pos_wl_32,v54);
    		subInitial(DBParameter.pos_wl_32,v55);
    		subInitial(DBParameter.pos_wl_32,v56);
    		subInitial(DBParameter.pos_wl_32,v57);
    		subInitial(DBParameter.pos_wl_32,v58);
    		subInitial(DBParameter.pos_wl_32,v59);
    		subInitial(DBParameter.pos_wl_32,v60);
    		subInitial(DBParameter.pos_wl_32,v61);
    		subInitial(DBParameter.pos_wl_32,v62);
    		subInitial(DBParameter.pos_wl_32,v63);
    		subInitial(DBParameter.pos_wl_32,v64);
    		subInitial(DBParameter.pos_wl_32,v65);
    		subInitial(DBParameter.pos_wl_32,v66);
    		subInitial(DBParameter.pos_wl_32,v67);
    		subInitial(DBParameter.pos_wl_32,v68);
    		subInitial(DBParameter.pos_wl_32,v69);
    		subInitial(DBParameter.pos_wl_32,v70);
    		subInitial(DBParameter.pos_wl_32,v71);
    		subInitial(DBParameter.pos_wl_32,v72);
    		subInitial(DBParameter.pos_wl_32,v73);
    		subInitial(DBParameter.pos_wl_32,v74);
    		subInitial(DBParameter.pos_wl_32,v75);
    		subInitial(DBParameter.pos_wl_32,v76);
    		subInitial(DBParameter.pos_wl_32,v77);
    		subInitial(DBParameter.pos_wl_32,v78);
    		subInitial(DBParameter.pos_wl_32,v79);
    		subInitial(DBParameter.pos_wl_32,v80);
    		subInitial(DBParameter.pos_wl_32,v81);
    		subInitial(DBParameter.pos_wl_32,v82);
    		subInitial(DBParameter.pos_wl_32,v83);
    		subInitial(DBParameter.pos_wl_32,v84);
    		subInitial(DBParameter.pos_wl_32,v85);
    		subInitial(DBParameter.pos_wl_32,v86);
    		subInitial(DBParameter.pos_wl_32,v87);
    		subInitial(DBParameter.pos_wl_32,v88);
    		subInitial(DBParameter.pos_wl_32,v89);
    		subInitial(DBParameter.pos_wl_32,v90);
    		subInitial(DBParameter.pos_wl_32,v91);
    		subInitial(DBParameter.pos_wl_32,v92);
    		subInitial(DBParameter.pos_wl_32,v93);
    		subInitial(DBParameter.pos_wl_32,v94);
    		subInitial(DBParameter.pos_wl_32,v95);
    		subInitial(DBParameter.pos_wl_32,v96);
    		subInitial(DBParameter.pos_wl_32,v97);
    		subInitial(DBParameter.pos_wl_32,v98);
    		subInitial(DBParameter.pos_wl_32,v99);
    		subInitial(DBParameter.pos_wl_32,v100);
    		subInitial(DBParameter.pos_wl_32,v101);
    		subInitial(DBParameter.pos_wl_32,v102);
    		subInitial(DBParameter.pos_wl_32,v103);
    		subInitial(DBParameter.pos_wl_32,v104);
    		subInitial(DBParameter.pos_wl_32,v105);
    		subInitial(DBParameter.pos_wl_32,v106);
    		subInitial(DBParameter.pos_wl_32,v107);
    		subInitial(DBParameter.pos_wl_32,v108);
    		subInitial(DBParameter.pos_wl_32,v109);
    		subInitial(DBParameter.pos_wl_32,v110);
    		subInitial(DBParameter.pos_wl_32,v111);
    		subInitial(DBParameter.pos_wl_32,v112);
    		subInitial(DBParameter.pos_wl_32,v113);
    		subInitial(DBParameter.pos_wl_32,v114);
    		subInitial(DBParameter.pos_wl_32,v115);
    		subInitial(DBParameter.pos_wl_32,v116);
    		subInitial(DBParameter.pos_wl_32,v117);
    		subInitial(DBParameter.pos_wl_32,v118);
    		
    		subInitial(DBParameter.pos_wl_32,v119);
    		subInitial(DBParameter.pos_wl_32,v120);
    		subInitial(DBParameter.pos_wl_32,v121);
    		subInitial(DBParameter.pos_wl_32,v122);
    		subInitial(DBParameter.pos_wl_32,v123);
    		subInitial(DBParameter.pos_wl_32,v124);
    		subInitial(DBParameter.pos_wl_32,v125);
    		subInitial(DBParameter.pos_wl_32,v126);
    		subInitial(DBParameter.pos_wl_32,v127);
    		subInitial(DBParameter.pos_wl_32,v128);
    		subInitial(DBParameter.pos_wl_32,v129);
    		subInitial(DBParameter.pos_wl_32,v130);
    		subInitial(DBParameter.pos_wl_32,v131);
    		subInitial(DBParameter.pos_wl_32,v132);
    		subInitial(DBParameter.pos_wl_32,v133);
    		subInitial(DBParameter.pos_wl_32,v134);
    		subInitial(DBParameter.pos_wl_32,v135);
    		subInitial(DBParameter.pos_wl_32,v136);
    		subInitial(DBParameter.pos_wl_32,v137);
    		subInitial(DBParameter.pos_wl_32,v138);
    		subInitial(DBParameter.pos_wl_32,v139);
    		subInitial(DBParameter.pos_wl_32,v140);
    		subInitial(DBParameter.pos_wl_32,v141);
    		subInitial(DBParameter.pos_wl_32,v142);
    		subInitial(DBParameter.pos_wl_32,v143);
    		subInitial(DBParameter.pos_wl_32,v144);
    		subInitial(DBParameter.pos_wl_32,v145);
    		subInitial(DBParameter.pos_wl_32,v146);
    		subInitial(DBParameter.pos_wl_32,v147);
    		subInitial(DBParameter.pos_wl_32,v148);
    		subInitial(DBParameter.pos_wl_32,v149);
    		subInitial(DBParameter.pos_wl_32,v150);
    		subInitial(DBParameter.pos_wl_32,v151);
    		subInitial(DBParameter.pos_wl_32,v152);
    		subInitial(DBParameter.pos_wl_32,v153);
    		subInitial(DBParameter.pos_wl_32,v154);
    		subInitial(DBParameter.pos_wl_32,v155);
    		subInitial(DBParameter.pos_wl_32,v156);
    		subInitial(DBParameter.pos_wl_32,v157);
    		subInitial(DBParameter.pos_wl_32,v158);
    		subInitial(DBParameter.pos_wl_32,v159);
    		subInitial(DBParameter.pos_wl_32,v160);
    		subInitial(DBParameter.pos_wl_32,v161);
    		subInitial(DBParameter.pos_wl_32,v162);
    		subInitial(DBParameter.pos_wl_32,v163);
    		subInitial(DBParameter.pos_wl_32,v164);
    		subInitial(DBParameter.pos_wl_32,v165);
    		subInitial(DBParameter.pos_wl_32,v166);
    		subInitial(DBParameter.pos_wl_32,v167);
    		subInitial(DBParameter.pos_wl_32,v168);
    		subInitial(DBParameter.pos_wl_32,v169);
    		subInitial(DBParameter.pos_wl_32,v170);
    		subInitial(DBParameter.pos_wl_32,v171);
    		subInitial(DBParameter.pos_wl_32,v172);
    		subInitial(DBParameter.pos_wl_32,v173);
    		subInitial(DBParameter.pos_wl_32,v174);
    		subInitial(DBParameter.pos_wl_32,v175);
    		subInitial(DBParameter.pos_wl_32,v176);
    		subInitial(DBParameter.pos_wl_32,v177);
    		
        	
    }
    public void doList_33(){
    	String[] v1={"serene","�峺�ģ����ʵģ�������",a,"0"};
    	String[] v2={"serial","���ӵģ�һϵ�е�",a,"0"};
    	String[] v3={"sermon","������ѵ�룬˵��",n,"0"};
    	String[] v4={"serrated","�ʾ��״��",a,"0"};
    	String[] v5={"serried","�ܼ���",a,"0"};
    	String[] v6={"serviceable","���õģ����õ�",a,"0"};
    	String[] v7={"servile","ū�Եģ�������˳��",a,"0"};
    	String[] v8={"servitude","ū�ۣ�����",n,"0"};
    	String[] v9={"setback","����",n,"0"};
    	String[] v10={"settle","�����ڣ���������Ϣ",v,"0"};
    	String[] v11={"settled","�̶���",a,"0"};
    	String[] v12={"sever","�жϣ�����",v,"0"};
    	String[] v13={"severe","�ϸ�ģ����͵�",a,"0"};
    	String[] v14={"sewer","��ˮ��",n,"0"};
    	String[] v15={"sextant","������",n,"0"};
    	String[] v16={"shackle","���ͣ�����",n,"0"};
    	String[] v17={"shale","ҳ��",n,"0"};
    	String[] v18={"sham","��٣�αװ",n+v,"0"};
    	String[] v19={"shambles","���Ҿ�����������",n,"0"};
    	String[] v20={"shard","��Ƭ",n,"0"};
    	String[] v21={"shattered","����ģ��ƻ���",a,"0"};
    	String[] v22={"shavings","�ٻ�",n,"0"};
    	String[] v23={"shear","��ë������",v,"0"};
    	String[] v24={"sheath","��",n,"0"};
    	String[] v25={"sheathe","����",v,"0"};
    	String[] v26={"shed","����������",v,"0"};
    	String[] v27={"sheer","��ȫ�ģ����͵ģ�������",v,"0"};
    	String[] v28={"shell","���ǣ��ڵ�������",n+v,"0"};
    	String[] v29={"shelter","�ڱδ����ڱΣ��ӻ�������",n+v,"0"};
    	String[] v30={"shelve","����",v,"0"};
    	String[] v31={"sheriff","���������ΰ���",n,"0"};
    	String[] v32={"shield","�ܣ��ڻ����ڵ�",n+v,"0"};
    	String[] v33={"shiftiness","��թ",n,"0"};
    	String[] v34={"shiftless","û�о������ģ�͵͵�ģ����ܵ�",a,"0"};
    	String[] v35={"shingle","ľ�ߣ��ݶ��壬ľ��С����",n,"0"};
    	String[] v36={"shipshape","����ģ���Ȼ�����",a,"0"};
    	String[] v37={"shirk","�ӱܣ����",v,"0"};
    	String[] v38={"shoal","ǳ̲��ǳˮ����һȺ(��)��ˮǳ��",n+a,"0"};
    	String[] v39={"shoddy","���ʵģ�ð��û���",a,"0"};
    	String[] v40={"shoot","��ѿ",n,"0"};
    	String[] v41={"shoplift","���̵�͵��",v,"0"};
    	String[] v42={"shopworn","���̵���о��˵�",a,"0"};
    	String[] v43={"shoulder","�磬·��",n,"0"};
    	String[] v44={"shove","�Ƽ�������",v,"0"};
    	String[] v45={"shrewd","�ж����ݵģ�������",a,"0"};
    	String[] v46={"shriek","���",v,"0"};
    	String[] v47={"shrine","���裬ʥ��",n,"0"};
    	String[] v48={"shrink","����������",v,"0"};
    	String[] v49={"shroud","���£��ڱ������",n+v,"0"};
    	String[] v50={"shrub","��ľ",n,"0"};
    	String[] v51={"shrug","�ʼ�",v,"0"};
        String[] v52={"shuck","�ǣ��У�����֮��",n,"0"};
        String[] v53={"shudder","ս��������",v+n,"0"};
        String[] v54={"shun","���⣬����",v,"0"};
        String[] v55={"shunt","ʹ(��)ת����һ�����ת�Ʒ���",v,"0"};
        String[] v56={"sibilant","������������",a,"0"};
        String[] v57={"sibling","�ֵܻ����",n,"0"};
        String[] v58={"sibyl","ŮԤ�Լң�Ů��֪",n,"0"};
        String[] v59={"sidereal","���ǵ�",a,"0"};
        String[] v60={"sideshow","��ˣ���������",n,"0"};		
    	String[] v61={"sidestep","���һ���Զ�ܣ��ر�",v,"0"};
        String[] v62={"siege","��Χ��Χ��",n,"0"};
       	String[] v63={"sift","ɸ������",v,"0"};
       	String[] v64={"signal","�źţ����źţ�������",n+v+a,"0"};
       	String[] v65={"significant","�൱�����ģ������ش��",a,"0"};
       	String[] v66={"signify","��ʾ������Ҫ��",v,"0"};
        String[] v67={"sill","�ż�����̨",n,"0"};
        String[] v68={"silt","���࣬��ɳ",n,"0"};
        String[] v69={"silversmith","����",n,"0"};
        String[] v70={"simper","��Ц��ɵЦ",v,"0"};
    	String[] v71={"simpleton","����",n,"0"};
        String[] v72={"simulate","��װ��ģ��",v,"0"};
       	String[] v73={"simultaneous","ͬʱ������",a,"0"};
       	String[] v74={"sincere","��ʵ�ģ���ֱ�ģ���ֿ�ģ�������",a,"0"};
       	String[] v75={"sinecure","��ְ����������",n,"0"};
        String[] v76={"sinew","�죬���⣬����",n,"0"};
        String[] v77={"singe","(��΢��)�ս����̽�",v,"0"};
        String[] v78={"singularity","���أ�(����ѧ)���",n,"0"};
        String[] v79={"sinuous","���ѵģ��ػص�",a,"0"};
        String[] v80={"sip","���",v,"0"};
    	String[] v81={"siren","���ѣ�������",n,"0"};
        String[] v82={"skeleton","�Ǽܣ�����",n,"0"};
        String[] v83={"sketchy","���Եģ����Ե�",a,"0"};
        String[] v84={"skew","��ֱ�ģ���б��",a,"0"};
        String[] v85={"skewer","����Ǥ����Ǥ����",n+v,"0"};
        String[] v86={"skiff","���ۣ�С��",n,"0"};
        String[] v87={"skillet","���",n,"0"};
        String[] v88={"skim","��Һ�����Ʋȥ��������Զ�",v,"0"};
        String[] v89={"skimp","��ʡ����",v,"0"};
        String[] v90={"skinflint","���Ĺ�",n,"0"};
        String[] v91={"skirmish","Сս��С����",n,"0"};
        String[] v92={"skirt","���ƣ����",v,"0"};
        String[] v93={"skit","��Ĭ��̶̾�",n,"0"};
        String[] v94={"skyscraper","Ħ���¥",n,"0"};
        String[] v95={"slab","��壬���",n,"0"};
        String[] v96={"slack","��ɢ�ģ�и���ģ��ɳڵģ���и������",a+v,"0"};
        String[] v97={"slacken","(ʹ)�ɳڣ�����",v,"0"};
        String[] v98={"slag","¯��������",n,"0"};
        String[] v99={"slake","��ʣ�����",v,"0"};
        String[] v100={"slander","�̰���ڮ��",v+n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"slanderous","�̰���",a,"0"};
        	String[] v102={"slant","��б��б�棬����",v+n,"0"};
        	String[] v103={"slate","ʯ�壬��ѡ������������",n+v,"0"};
        	String[] v104={"slaughter","��ɱ������",n+v,"0"};
        	String[] v105={"sleigh","(������)ѩ��",n,"0"};
        	String[] v106={"slew","(ʹ)��ת������",v+n,"0"};
        	String[] v107={"slice","�г�Ƭ����Ƭ",v+n,"0"};
        	String[] v108={"slick","�����ģ�Բ���ģ��⻬��",a,"0"};
        	String[] v109={"slight","΢С�ģ��������",a+v+n,"0"};
        	String[] v110={"slippage","�������½�",n,"0"};
        	String[] v111={"slippery","���ģ��ƻ���",a,"0"};
        	String[] v112={"slipshod","���ģ����ʵ�",a,"0"};
        	String[] v113={"slither","(��)Ť��",v,"0"};
        	String[] v114={"sliver","�������ѳ�ϸƬ",n+v,"0"};
        	String[] v115={"sloppy","���ݵģ��������",a,"0"};
        	String[] v116={"slot","����",n,"0"};
        	String[] v117={"sloth","���裬����",n,"0"};
        	String[] v118={"slouch","û�����",v+n,"0"};
        	String[] v119={"slough","��Ƥ",v,"0"};
        	String[] v120={"sluggard","����",n,"0"};
        	String[] v121={"sluice","ˮբ����ϴ",n+v,"0"};
        	String[] v122={"slumber","��˯",n+v,"0"};
        	String[] v123={"slur","��������Ľ�",v,"0"};
        	String[] v124={"slurp","������਺�",v,"0"};
        	String[] v125={"sly","�ƻ��ģ���������",a,"0"};
        	String[] v126={"smarmy","��������",a,"0"};
        	String[] v127={"smart","ʹ�ࣻʱ�ֵģ�������",n+a,"0"};
        	String[] v128={"smattering","��֪������",n,"0"};
        	String[] v129={"smear","���գ��۵㣻���ۣ�Ū��",n+v,"0"};
        	String[] v130={"smirk","��Ц�������Ц",v,"0"};
        	String[] v131={"smooth","�⻬�ģ�ƽ�ȵģ�Ūƽ��ʹ�⻬������",a,"0"};
        	String[] v132={"smother","���ǣ�(ʹ)����",v,"0"};
        	String[] v133={"smudge","�պۣ�Ū��",n+v,"0"};
        	String[] v134={"smug","�����ģ�����������",a,"0"};
        	String[] v135={"smuggle","��˽��˽��",v,"0"};
        	String[] v136={"snare","����������",n,"0"};
        	String[] v137={"snarl","����������",n+v,"0"};
        	String[] v138={"snatch","��ȡ",n+v,"0"};
        	String[] v139={"sneaking","���ܵ�",a,"0"};
        	String[] v140={"sneer","��Ц������",v,"0"};
        	String[] v141={"snide","��̵ģ���ɳ��Ӱ��",a,"0"};
        	String[] v142={"snip","����",v,"0"};
        	String[] v143={"snitch","���ܣ�͵",v,"0"};
        	String[] v144={"snobbish","�����۵�",a,"0"};
        	String[] v145={"snowdrift","ѩ��",n,"0"};
        	String[] v146={"snub","����",v,"0"};
        	String[] v147={"snug","��ů�ģ����ʵ�",a,"0"};
        	String[] v148={"soak","����",v,"0"};
        	String[] v149={"soar","�߷ɣ����裬����",v,"0"};
        	String[] v150={"sober","���ѵģ�ׯ�ص�",a,"0"};
        	String[] v151={"sobriety","���ƣ�ׯ��",n,"0"};
        	String[] v152={"sock","�ػ���ʹ��",v,"0"};
        	String[] v153={"sod","�ݵ�",n,"0"};
        	String[] v154={"sodden","��͸�˵�",a,"0"};
        	String[] v155={"soggy","ʪ͸��",a,"0"};
        	String[] v156={"soil","Ū��",n+v,"0"};
        	String[] v157={"solace","��ο��ο��",n,"0"};
        	String[] v158={"solder","���ӣ�����",v,"0"};
        	String[] v159={"solemn","ׯ�ϵģ���ɫ��",a,"0"};
        	String[] v160={"solemnity","ׯ�ϣ�����",n,"0"};
        	String[] v161={"solicit","���󣬽���",v,"0"};
        	String[] v162={"solicitous","���еģ������",a,"0"};
        	String[] v163={"solicitude","�ػ���ǣ��",n,"0"};
        	String[] v164={"solidarity","�Žᣬһ��",n,"0"};
        	String[] v165={"solidify","���̣�ʹ�Ž�",v,"0"};
        	String[] v166={"solitary","�¶��ģ���ʿ",a+n,"0"};
        	String[] v167={"solitude","�¶�",n,"0"};
        	String[] v168={"solo","�����ģ�����",a+n,"0"};
        	String[] v169={"soluble","���ܵģ��ɽ����",a,"0"};
        	String[] v170={"solvent","�г�ծ�����ģ��ܼ�",a+n,"0"};
        	String[] v171={"somatic","�����",a,"0"};
        	String[] v172={"somber","�����ģ�������",a,"0"};
        	String[] v173={"sonata","������",n,"0"};
        	String[] v174={"sonnet","ʮ����ʫ",n,"0"};
        	String[] v175={"soot","���̻ң�����",n,"0"};
        	String[] v176={"soothe","��ο������",v,"0"};
        	String[] v177={"sop","�ݹ���ʳƷ����οƷ",n,"0"};
        	String[] v178={"sophism","��磬�����",n,"0"};
        	String[] v179={"sophisticated","�������ʵģ�(����)���ܵ�",a,"0"};
        	
        	
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_33,v1);
    		subInitial(DBParameter.pos_wl_33,v2);
    		subInitial(DBParameter.pos_wl_33,v3);
    		subInitial(DBParameter.pos_wl_33,v4);
    		subInitial(DBParameter.pos_wl_33,v5);
    		subInitial(DBParameter.pos_wl_33,v6);
    		subInitial(DBParameter.pos_wl_33,v7);
    		subInitial(DBParameter.pos_wl_33,v8);
    		subInitial(DBParameter.pos_wl_33,v9);
    		subInitial(DBParameter.pos_wl_33,v10);
    		subInitial(DBParameter.pos_wl_33,v11);
    		subInitial(DBParameter.pos_wl_33,v12);
    		subInitial(DBParameter.pos_wl_33,v13);
    		subInitial(DBParameter.pos_wl_33,v14);
    		subInitial(DBParameter.pos_wl_33,v15);
    		subInitial(DBParameter.pos_wl_33,v16);
    		subInitial(DBParameter.pos_wl_33,v17);
    		subInitial(DBParameter.pos_wl_33,v18);
    		subInitial(DBParameter.pos_wl_33,v19);
    		subInitial(DBParameter.pos_wl_33,v20);
    		subInitial(DBParameter.pos_wl_33,v21);
    		subInitial(DBParameter.pos_wl_33,v22);
    		subInitial(DBParameter.pos_wl_33,v23);
    		subInitial(DBParameter.pos_wl_33,v24);
    		subInitial(DBParameter.pos_wl_33,v25);
    		subInitial(DBParameter.pos_wl_33,v26);
    		subInitial(DBParameter.pos_wl_33,v27);
    		subInitial(DBParameter.pos_wl_33,v28);
    		subInitial(DBParameter.pos_wl_33,v29);
    		subInitial(DBParameter.pos_wl_33,v30);
    		subInitial(DBParameter.pos_wl_33,v31);
    		subInitial(DBParameter.pos_wl_33,v32);
    		subInitial(DBParameter.pos_wl_33,v33);
    		subInitial(DBParameter.pos_wl_33,v34);
    		subInitial(DBParameter.pos_wl_33,v35);
    		subInitial(DBParameter.pos_wl_33,v36);
    		subInitial(DBParameter.pos_wl_33,v37);
    		subInitial(DBParameter.pos_wl_33,v38);
    		subInitial(DBParameter.pos_wl_33,v39);
    		subInitial(DBParameter.pos_wl_33,v40);
    		subInitial(DBParameter.pos_wl_33,v41);
    		subInitial(DBParameter.pos_wl_33,v42);
    		subInitial(DBParameter.pos_wl_33,v43);
    		subInitial(DBParameter.pos_wl_33,v44);
    		subInitial(DBParameter.pos_wl_33,v45);
    		subInitial(DBParameter.pos_wl_33,v46);
    		subInitial(DBParameter.pos_wl_33,v47);
    		subInitial(DBParameter.pos_wl_33,v48);
    		subInitial(DBParameter.pos_wl_33,v49);
    		subInitial(DBParameter.pos_wl_33,v50);
    		
    		subInitial(DBParameter.pos_wl_33,v51);
    		subInitial(DBParameter.pos_wl_33,v52);
    		subInitial(DBParameter.pos_wl_33,v53);
    		subInitial(DBParameter.pos_wl_33,v54);
    		subInitial(DBParameter.pos_wl_33,v55);
    		subInitial(DBParameter.pos_wl_33,v56);
    		subInitial(DBParameter.pos_wl_33,v57);
    		subInitial(DBParameter.pos_wl_33,v58);
    		subInitial(DBParameter.pos_wl_33,v59);
    		subInitial(DBParameter.pos_wl_33,v60);
    		subInitial(DBParameter.pos_wl_33,v61);
    		subInitial(DBParameter.pos_wl_33,v62);
    		subInitial(DBParameter.pos_wl_33,v63);
    		subInitial(DBParameter.pos_wl_33,v64);
    		subInitial(DBParameter.pos_wl_33,v65);
    		subInitial(DBParameter.pos_wl_33,v66);
    		subInitial(DBParameter.pos_wl_33,v67);
    		subInitial(DBParameter.pos_wl_33,v68);
    		subInitial(DBParameter.pos_wl_33,v69);
    		subInitial(DBParameter.pos_wl_33,v70);
    		subInitial(DBParameter.pos_wl_33,v71);
    		subInitial(DBParameter.pos_wl_33,v72);
    		subInitial(DBParameter.pos_wl_33,v73);
    		subInitial(DBParameter.pos_wl_33,v74);
    		subInitial(DBParameter.pos_wl_33,v75);
    		subInitial(DBParameter.pos_wl_33,v76);
    		subInitial(DBParameter.pos_wl_33,v77);
    		subInitial(DBParameter.pos_wl_33,v78);
    		subInitial(DBParameter.pos_wl_33,v79);
    		subInitial(DBParameter.pos_wl_33,v80);
    		subInitial(DBParameter.pos_wl_33,v81);
    		subInitial(DBParameter.pos_wl_33,v82);
    		subInitial(DBParameter.pos_wl_33,v83);
    		subInitial(DBParameter.pos_wl_33,v84);
    		subInitial(DBParameter.pos_wl_33,v85);
    		subInitial(DBParameter.pos_wl_33,v86);
    		subInitial(DBParameter.pos_wl_33,v87);
    		subInitial(DBParameter.pos_wl_33,v88);
    		subInitial(DBParameter.pos_wl_33,v89);
    		subInitial(DBParameter.pos_wl_33,v90);
    		subInitial(DBParameter.pos_wl_33,v91);
    		subInitial(DBParameter.pos_wl_33,v92);
    		subInitial(DBParameter.pos_wl_33,v93);
    		subInitial(DBParameter.pos_wl_33,v94);
    		subInitial(DBParameter.pos_wl_33,v95);
    		subInitial(DBParameter.pos_wl_33,v96);
    		subInitial(DBParameter.pos_wl_33,v97);
    		subInitial(DBParameter.pos_wl_33,v98);
    		subInitial(DBParameter.pos_wl_33,v99);
    		subInitial(DBParameter.pos_wl_33,v100);
    		subInitial(DBParameter.pos_wl_33,v101);
    		subInitial(DBParameter.pos_wl_33,v102);
    		subInitial(DBParameter.pos_wl_33,v103);
    		subInitial(DBParameter.pos_wl_33,v104);
    		subInitial(DBParameter.pos_wl_33,v105);
    		subInitial(DBParameter.pos_wl_33,v106);
    		subInitial(DBParameter.pos_wl_33,v107);
    		subInitial(DBParameter.pos_wl_33,v108);
    		subInitial(DBParameter.pos_wl_33,v109);
    		subInitial(DBParameter.pos_wl_33,v110);
    		subInitial(DBParameter.pos_wl_33,v111);
    		subInitial(DBParameter.pos_wl_33,v112);
    		subInitial(DBParameter.pos_wl_33,v113);
    		subInitial(DBParameter.pos_wl_33,v114);
    		subInitial(DBParameter.pos_wl_33,v115);
    		subInitial(DBParameter.pos_wl_33,v116);
    		subInitial(DBParameter.pos_wl_33,v117);
    		subInitial(DBParameter.pos_wl_33,v118);
    		
    		subInitial(DBParameter.pos_wl_33,v119);
    		subInitial(DBParameter.pos_wl_33,v120);
    		subInitial(DBParameter.pos_wl_33,v121);
    		subInitial(DBParameter.pos_wl_33,v122);
    		subInitial(DBParameter.pos_wl_33,v123);
    		subInitial(DBParameter.pos_wl_33,v124);
    		subInitial(DBParameter.pos_wl_33,v125);
    		subInitial(DBParameter.pos_wl_33,v126);
    		subInitial(DBParameter.pos_wl_33,v127);
    		subInitial(DBParameter.pos_wl_33,v128);
    		subInitial(DBParameter.pos_wl_33,v129);
    		subInitial(DBParameter.pos_wl_33,v130);
    		subInitial(DBParameter.pos_wl_33,v131);
    		subInitial(DBParameter.pos_wl_33,v132);
    		subInitial(DBParameter.pos_wl_33,v133);
    		subInitial(DBParameter.pos_wl_33,v134);
    		subInitial(DBParameter.pos_wl_33,v135);
    		subInitial(DBParameter.pos_wl_33,v136);
    		subInitial(DBParameter.pos_wl_33,v137);
    		subInitial(DBParameter.pos_wl_33,v138);
    		subInitial(DBParameter.pos_wl_33,v139);
    		subInitial(DBParameter.pos_wl_33,v140);
    		subInitial(DBParameter.pos_wl_33,v141);
    		subInitial(DBParameter.pos_wl_33,v142);
    		subInitial(DBParameter.pos_wl_33,v143);
    		subInitial(DBParameter.pos_wl_33,v144);
    		subInitial(DBParameter.pos_wl_33,v145);
    		subInitial(DBParameter.pos_wl_33,v146);
    		subInitial(DBParameter.pos_wl_33,v147);
    		subInitial(DBParameter.pos_wl_33,v148);
    		subInitial(DBParameter.pos_wl_33,v149);
    		subInitial(DBParameter.pos_wl_33,v150);
    		subInitial(DBParameter.pos_wl_33,v151);
    		subInitial(DBParameter.pos_wl_33,v152);
    		subInitial(DBParameter.pos_wl_33,v153);
    		subInitial(DBParameter.pos_wl_33,v154);
    		subInitial(DBParameter.pos_wl_33,v155);
    		subInitial(DBParameter.pos_wl_33,v156);
    		subInitial(DBParameter.pos_wl_33,v157);
    		subInitial(DBParameter.pos_wl_33,v158);
    		subInitial(DBParameter.pos_wl_33,v159);
    		subInitial(DBParameter.pos_wl_33,v160);
    		subInitial(DBParameter.pos_wl_33,v161);
    		subInitial(DBParameter.pos_wl_33,v162);
    		subInitial(DBParameter.pos_wl_33,v163);
    		subInitial(DBParameter.pos_wl_33,v164);
    		subInitial(DBParameter.pos_wl_33,v165);
    		subInitial(DBParameter.pos_wl_33,v166);
    		subInitial(DBParameter.pos_wl_33,v167);
    		subInitial(DBParameter.pos_wl_33,v168);
    		subInitial(DBParameter.pos_wl_33,v169);
    		subInitial(DBParameter.pos_wl_33,v170);
    		subInitial(DBParameter.pos_wl_33,v171);
    		subInitial(DBParameter.pos_wl_33,v172);
    		subInitial(DBParameter.pos_wl_33,v173);
    		subInitial(DBParameter.pos_wl_33,v174);
    		subInitial(DBParameter.pos_wl_33,v175);
    		subInitial(DBParameter.pos_wl_33,v176);
    		subInitial(DBParameter.pos_wl_33,v177);
    		subInitial(DBParameter.pos_wl_33,v178);
    		subInitial(DBParameter.pos_wl_33,v179);
    		
        	
    }
    public void doList_34(){
    	String[] v1={"sophistication","��磬���ʣ�����",n,"0"};
    	String[] v2={"sophistry","���",n,"0"};
    	String[] v3={"soporific","���ߵģ�����ҩ",a+n,"0"};
    	String[] v4={"sopping","����ʪ͸��",a,"0"};
    	String[] v5={"sorcery","������ħ��",n,"0"};
    	String[] v6={"sordid","���ɵģ������",a,"0"};
    	String[] v7={"souvenir","����Ʒ",n,"0"};
    	String[] v8={"sovereign","Ԫ��",n,"0"};
    	String[] v9={"sovereignty","��Ȩ��ͳ��Ȩ",n,"0"};
    	String[] v10={"sow","ĸ������",n+v,"0"};
    	String[] v11={"spackle","������",n,"0"};
    	String[] v12={"span","��ȣ��������޼�ľ���",n,"0"};
    	String[] v13={"spank","�Ĵ�",v,"0"};
    	String[] v14={"sparing","�ڼ��",a,"0"};
    	String[] v15={"spark","��",n,"0"};
    	String[] v16={"sparring","ȭ��������",n,"0"};
    	String[] v17={"sparse","ϡ�ٵģ�ƶ����",a,"0"};
    	String[] v18={"spartan","���ӵģ��̿��",a,"0"};
    	String[] v19={"spat","�ڽǣ�С����",n,"0"};
    	String[] v20={"spate","������������(ˮ)����",n,"0"};
    	String[] v21={"spatial","�йؿռ��",a,"0"};
    	String[] v22={"spatula","Ĩ��",n,"0"};
    	String[] v23={"spawn","(���)���ӣ���������",n+v,"0"};
    	String[] v24={"spear","ì����Ҷ���̴�",n+v,"0"};
    	String[] v25={"specialize","ר���о�",v,"0"};
    	String[] v26={"specifics","ϸС����",n,"0"};
    	String[] v27={"specimen","��������Ʒ���걾",n,"0"};
    	String[] v28={"specious","���Ƕ��ǵģ�������ʵ��",a,"0"};
    	String[] v29={"speck","�ߵ㣬����",n,"0"};
    	String[] v30={"spectacular","׳�۵ģ�������ʤ��",a,"0"};
    	String[] v31={"spectator","���ڣ��ۿ���",n,"0"};
    	String[] v32={"specter","��꣬���飬�־�",n,"0"};
    	String[] v33={"spectral","�����",a,"0"};
    	String[] v34={"spectrum","���ף���Χ",n,"0"};
    	String[] v35={"speculate","��˼��˼����Ͷ��",v,"0"};
    	String[] v36={"speculative","Ͷ���ģ�����ģ�˼����",a,"0"};
    	String[] v37={"spell","������һ��ʱ��",n,"0"};
    	String[] v38={"spendthrift","�ӽ�������(��)",a+n,"0"};
    	String[] v39={"spike","��������",n,"0"};
    	String[] v40={"spin","��ת����ɴ����ת",v+n,"0"};
    	String[] v41={"spindly","ϸ���ģ�������",a,"0"};
    	String[] v42={"spineless","û�����ģ�ų����",a,"0"};
    	String[] v43={"spiny","��״�ģ���̵�",a,"0"};
    	String[] v44={"spire","(����)�ⶥ",n,"0"};
    	String[] v45={"spiritual","�����",a,"0"};
    	String[] v46={"spite","Թ�ޣ�����",n,"0"};
    	String[] v47={"spleen","Թŭ",n,"0"};
    	String[] v48={"splendor","׳�����Ի�",n,"0"};
    	String[] v49={"splice","��ϣ��ν�",v,"0"};
    	String[] v50={"splint","(�̶��Ϲǵ�)�а�",n,"0"};
    	String[] v51={"split","���ѣ��ֿ�",v+n,"0"};
        String[] v52={"splurge","��ҫ������",n,"0"};
        String[] v53={"spoil","�𻵣��ƻ����簮",v,"0"};
        String[] v54={"spoke","����",n,"0"};
        String[] v55={"spongy","����ģ�����ʵ��",a,"0"};
        String[] v56={"spontaneity","��Ȼ���Է�",n,"0"};
        String[] v57={"spontaneous","�Է��ģ���Ȼ��",a,"0"};
        String[] v58={"spoof","����",v,"0"};
        String[] v59={"sporadic","����ʱ������",a,"0"};
        String[] v60={"sport","��Ū����ҫ",v,"0"};		
    	String[] v61={"sprain","Ť��",v,"0"};
        String[] v62={"sprawling","ֲ�������ģ�(����)�޼ƻ���չ��",a,"0"};
       	String[] v63={"sprig","��֦",n,"0"};
       	String[] v64={"sprightly","���ģ����õ�",a,"0"};
       	String[] v65={"sprout","��������ѿ����ѿ",v+n,"0"};
       	String[] v66={"spruce","��ɼ�������",n+a,"0"};
        String[] v67={"spur","�̼�������������̴���",v,"0"};
        String[] v68={"spurious","�ٵģ�α���",a,"0"};
        String[] v69={"squabble","����",n,"0"};
        String[] v70={"squalid","�ۻ��",a,"0"};
    	String[] v71={"squall","���ݶ����ҵķ籩�����ݵ�ɧ��",n,"0"};
        String[] v72={"squalor","���࣬�ۻ�",n,"0"};
       	String[] v73={"squander","�˷ѣ��ӻ�",v,"0"};
       	String[] v74={"square","һֱ�����ϣ�����",v,"0"};
       	String[] v75={"squash","ѹ�飬��ѹ���Ϲ�",v+n,"0"};
        String[] v76={"squat","���£����ֵ�",v+a,"0"};
        String[] v77={"squeeze","����ѹե",v+n,"0"};
        String[] v78={"squelch","ѹ�ƣ���ѹ",v,"0"};
        String[] v79={"squint","б��",v,"0"};
        String[] v80={"squirrel","����",n,"0"};
    	String[] v81={"staccato","�����ģ��������",a,"0"};
        String[] v82={"stagnant","ͣ�͵�",a,"0"};
        String[] v83={"staid","���صģ����ŵ�",a,"0"};
        String[] v84={"stain","���ۣ�Ⱦɫ",v,"0"};
        String[] v85={"stake","��׮����ע",n,"0"};
        String[] v86={"stale","�����ʵģ��¸���",a,"0"};
        String[] v87={"stalemate","���壬����",n,"0"};
        String[] v88={"stalk","��������",v,"0"};
        String[] v89={"stall","ʹֹͣ��ʹ�ӳ�",v,"0"};
        String[] v90={"stalwart","��׳�ģ��ᶨ��",a,"0"};
        String[] v91={"stammer","�ڳԣ����",v,"0"};
        String[] v92={"stamp","��ţ���...�ϸ�ӡ",n+v,"0"};
        String[] v93={"stance","վ�ˣ�����",n,"0"};
        String[] v94={"stanch","��ֹ(ѪҺ)��ֹס",v,"0"};
        String[] v95={"stanza","(ʫ)�ڣ���",n,"0"};
        String[] v96={"staple","��Ҫ��Ʒ",n,"0"};
        String[] v97={"starchy","����۵ģ��̰��",a,"0"};
        String[] v98={"stark","��Ӳ�ģ���ȫ��",a,"0"};
        String[] v99={"startle","ʹ�Ծ�",v,"0"};
        String[] v100={"stasis","ͣ��",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"static","��̬�ģ������",a,"0"};
        	String[] v102={"stationary","��ֹ�ģ�������",a,"0"};
        	String[] v103={"statuary","���񣬵�������",n,"0"};
        	String[] v104={"stature","��ߣ����",n,"0"};
        	String[] v105={"status","��ݣ���λ",n,"0"};
        	String[] v106={"statute","���棬����",n,"0"};
        	String[] v107={"statutory","�����ģ��ܷ���Լ����",a,"0"};
        	String[] v108={"steadfast","��ʵ�ģ������",a,"0"};
        	String[] v109={"stealth","���ܵ��ж�",n,"0"};
        	String[] v110={"steep","���ݣ���͸",v,"0"};
        	String[] v111={"steer","�ٶ棬��ʻ����ţ��ʳ��ţ",v+n,"0"};
        	String[] v112={"stellar","�ǵģ������",a,"0"};
        	String[] v113={"stem","����Ҷ��",n,"0"};
        	String[] v114={"stench","����",n,"0"};
        	String[] v115={"stencil","(���ֺ�ͼ����)ģ�壻��ģ���д",n+v,"0"};
        	String[] v116={"stentorian","��������",a,"0"};
        	String[] v117={"stereotype","�̶���ʽ������",n,"0"};
        	String[] v118={"sterile","ƶ�ģ����еģ��޾���",a,"0"};
        	String[] v119={"sterile","ʹ������ɱ��",v,"0"};
        	String[] v120={"stern","��β",n,"0"};
        	String[] v121={"stethoscope","������",n,"0"};
        	String[] v122={"stickler","���ϸ��֮��",n,"0"};
        	String[] v123={"stiff","��ֱ�ģ�����ģ�������",a,"0"};
        	String[] v124={"stifle","�е���Ϣ",v,"0"};
        	String[] v125={"stigma","����ı�־���۵�",n,"0"};
        	String[] v126={"stigmatize","�������",v,"0"};
        	String[] v127={"stilted","(���¡�̸��)����Ȼ�ģ����ŵ�",a,"0"};
        	String[] v128={"stimultant","�˷ܼ����̼���",n,"0"};
        	String[] v129={"stimulus","�̼������",n,"0"};
        	String[] v130={"sting","��ʹ�����ݣ���",v+n,"0"};
        	String[] v131={"stinginess","С��",n,"0"};
        	String[] v132={"stingy","���ĵģ�С����",a,"0"};
        	String[] v133={"stint","��ϧ����ʡ",v,"0"};
        	String[] v134={"stipple","�㻭������",v,"0"};
        	String[] v135={"stipulate","Ҫ����...Ϊ������Լ��",v,"0"};
        	String[] v136={"stipulation","�涨��Լ��",n,"0"};
        	String[] v137={"stir","�̼�",v,"0"};
        	String[] v138={"stitch","һ�룬һ�������",v+n,"0"};
        	String[] v139={"stock","��ͨ�ģ����õģ����",a+n,"0"};
        	String[] v140={"stockade","դ����Χ��",n,"0"};
        	String[] v141={"stocky","���ֵģ���׳��",a,"0"};
        	String[] v142={"stodgy","��ζ��",a,"0"};
        	String[] v143={"stoic","���̿˼�֮��",n,"0"};
        	String[] v144={"stoke","��..��ȼ��",v,"0"};
        	String[] v145={"stolid","�޶����Ե�",a,"0"};
        	String[] v146={"stomach","����",v,"0"};
        	String[] v147={"stonewall","�������£������ϰ�",v,"0"};
        	String[] v148={"stout","���ֵģ�ǿ׳��",a,"0"};
        	String[] v149={"stowaway","(���ڴ����ɻ��е�)͵����",n,"0"};
        	String[] v150={"straightforward","��ֱ�ģ�ֱ���˵��ģ��׶���",a,"0"};
        	String[] v151={"strand","���ߵ�һ�ɣ���ǳ",n+v,"0"};
        	String[] v152={"stranded","��ǳ�ģ��������ѵ�",a,"0"};
        	String[] v153={"stratagem","ı��",n,"0"};
        	String[] v154={"stratify","�㻯",v,"0"};
        	String[] v155={"stratum","�ز㣬�ײ�",n,"0"};
        	String[] v156={"stray","ƫ�룬��·������·�ģ������",v+a,"0"};
        	String[] v157={"streak","���������ƣ�������",n+v,"0"};
        	String[] v158={"stream","СϪ��ˮ������ע��ӿ��",n+v,"0"};
        	String[] v159={"stretch","�䳤����չ",v,"0"};
        	String[] v160={"strew","��������",v,"0"};
        	String[] v161={"striate","��...�ϼ�������",v,"0"};
        	String[] v162={"striated","�����Ƶ�",a,"0"};
        	String[] v163={"stricture","����Ǵ������",n,"0"};
        	String[] v164={"stride","������",v,"0"};
        	String[] v165={"strident","�����ģ��̶���",a,"0"};
        	String[] v166={"strife","��������ͻ",n,"0"};
        	String[] v167={"striking","����עĿ�ģ����Ե�",a,"0"};
        	String[] v168={"stringent","�ϸ�ģ����̵ģ�ȱǮ��",a,"0"};
        	String[] v169={"strip","��ȥ��������һƬ",v+n,"0"};
        	String[] v170={"strive","�ܶ���Ŭ��",v,"0"};
        	
        	
        	
        	
        	
        	
   			subInitial(DBParameter.pos_wl_34,v1);
   			subInitial(DBParameter.pos_wl_34,v2);
   			subInitial(DBParameter.pos_wl_34,v3);
   			subInitial(DBParameter.pos_wl_34,v4);
   			subInitial(DBParameter.pos_wl_34,v5);
   			subInitial(DBParameter.pos_wl_34,v6);
   			subInitial(DBParameter.pos_wl_34,v7);
   			subInitial(DBParameter.pos_wl_34,v8);
   			subInitial(DBParameter.pos_wl_34,v9);
   			subInitial(DBParameter.pos_wl_34,v10);
   			subInitial(DBParameter.pos_wl_34,v11);
   			subInitial(DBParameter.pos_wl_34,v12);
   			subInitial(DBParameter.pos_wl_34,v13);
   			subInitial(DBParameter.pos_wl_34,v14);
   			subInitial(DBParameter.pos_wl_34,v15);
   			subInitial(DBParameter.pos_wl_34,v16);
   			subInitial(DBParameter.pos_wl_34,v17);
   			subInitial(DBParameter.pos_wl_34,v18);
   			subInitial(DBParameter.pos_wl_34,v19);
   			subInitial(DBParameter.pos_wl_34,v20);
   			subInitial(DBParameter.pos_wl_34,v21);
   			subInitial(DBParameter.pos_wl_34,v22);
   			subInitial(DBParameter.pos_wl_34,v23);
   			subInitial(DBParameter.pos_wl_34,v24);
   			subInitial(DBParameter.pos_wl_34,v25);
   			subInitial(DBParameter.pos_wl_34,v26);
   			subInitial(DBParameter.pos_wl_34,v27);
   			subInitial(DBParameter.pos_wl_34,v28);
   			subInitial(DBParameter.pos_wl_34,v29);
   			subInitial(DBParameter.pos_wl_34,v30);
   			subInitial(DBParameter.pos_wl_34,v31);
   			subInitial(DBParameter.pos_wl_34,v32);
   			subInitial(DBParameter.pos_wl_34,v33);
   			subInitial(DBParameter.pos_wl_34,v34);
   			subInitial(DBParameter.pos_wl_34,v35);
   			subInitial(DBParameter.pos_wl_34,v36);
   			subInitial(DBParameter.pos_wl_34,v37);
   			subInitial(DBParameter.pos_wl_34,v38);
   			subInitial(DBParameter.pos_wl_34,v39);
   			subInitial(DBParameter.pos_wl_34,v40);
   			subInitial(DBParameter.pos_wl_34,v41);
   			subInitial(DBParameter.pos_wl_34,v42);
   			subInitial(DBParameter.pos_wl_34,v43);
   			subInitial(DBParameter.pos_wl_34,v44);
   			subInitial(DBParameter.pos_wl_34,v45);
   			subInitial(DBParameter.pos_wl_34,v46);
   			subInitial(DBParameter.pos_wl_34,v47);
   			subInitial(DBParameter.pos_wl_34,v48);
   			subInitial(DBParameter.pos_wl_34,v49);
   			subInitial(DBParameter.pos_wl_34,v50);
   			
   			subInitial(DBParameter.pos_wl_34,v51);
   			subInitial(DBParameter.pos_wl_34,v52);
   			subInitial(DBParameter.pos_wl_34,v53);
   			subInitial(DBParameter.pos_wl_34,v54);
   			subInitial(DBParameter.pos_wl_34,v55);
   			subInitial(DBParameter.pos_wl_34,v56);
   			subInitial(DBParameter.pos_wl_34,v57);
   			subInitial(DBParameter.pos_wl_34,v58);
   			subInitial(DBParameter.pos_wl_34,v59);
   			subInitial(DBParameter.pos_wl_34,v60);
   			subInitial(DBParameter.pos_wl_34,v61);
   			subInitial(DBParameter.pos_wl_34,v62);
   			subInitial(DBParameter.pos_wl_34,v63);
   			subInitial(DBParameter.pos_wl_34,v64);
   			subInitial(DBParameter.pos_wl_34,v65);
   			subInitial(DBParameter.pos_wl_34,v66);
   			subInitial(DBParameter.pos_wl_34,v67);
   			subInitial(DBParameter.pos_wl_34,v68);
   			subInitial(DBParameter.pos_wl_34,v69);
   			subInitial(DBParameter.pos_wl_34,v70);
   			subInitial(DBParameter.pos_wl_34,v71);
   			subInitial(DBParameter.pos_wl_34,v72);
   			subInitial(DBParameter.pos_wl_34,v73);
   			subInitial(DBParameter.pos_wl_34,v74);
   			subInitial(DBParameter.pos_wl_34,v75);
   			subInitial(DBParameter.pos_wl_34,v76);
   			subInitial(DBParameter.pos_wl_34,v77);
   			subInitial(DBParameter.pos_wl_34,v78);
   			subInitial(DBParameter.pos_wl_34,v79);
   			subInitial(DBParameter.pos_wl_34,v80);
   			subInitial(DBParameter.pos_wl_34,v81);
   			subInitial(DBParameter.pos_wl_34,v82);
   			subInitial(DBParameter.pos_wl_34,v83);
   			subInitial(DBParameter.pos_wl_34,v84);
   			subInitial(DBParameter.pos_wl_34,v85);
   			subInitial(DBParameter.pos_wl_34,v86);
   			subInitial(DBParameter.pos_wl_34,v87);
   			subInitial(DBParameter.pos_wl_34,v88);
   			subInitial(DBParameter.pos_wl_34,v89);
   			subInitial(DBParameter.pos_wl_34,v90);
   			subInitial(DBParameter.pos_wl_34,v91);
   			subInitial(DBParameter.pos_wl_34,v92);
   			subInitial(DBParameter.pos_wl_34,v93);
   			subInitial(DBParameter.pos_wl_34,v94);
   			subInitial(DBParameter.pos_wl_34,v95);
   			subInitial(DBParameter.pos_wl_34,v96);
   			subInitial(DBParameter.pos_wl_34,v97);
   			subInitial(DBParameter.pos_wl_34,v98);
   			subInitial(DBParameter.pos_wl_34,v99);
   			subInitial(DBParameter.pos_wl_34,v100);
   			subInitial(DBParameter.pos_wl_34,v101);
   			subInitial(DBParameter.pos_wl_34,v102);
   			subInitial(DBParameter.pos_wl_34,v103);
   			subInitial(DBParameter.pos_wl_34,v104);
   			subInitial(DBParameter.pos_wl_34,v105);
   			subInitial(DBParameter.pos_wl_34,v106);
   			subInitial(DBParameter.pos_wl_34,v107);
   			subInitial(DBParameter.pos_wl_34,v108);
   			subInitial(DBParameter.pos_wl_34,v109);
   			subInitial(DBParameter.pos_wl_34,v110);
   			subInitial(DBParameter.pos_wl_34,v111);
   			subInitial(DBParameter.pos_wl_34,v112);
   			subInitial(DBParameter.pos_wl_34,v113);
   			subInitial(DBParameter.pos_wl_34,v114);
   			subInitial(DBParameter.pos_wl_34,v115);
   			subInitial(DBParameter.pos_wl_34,v116);
   			subInitial(DBParameter.pos_wl_34,v117);
   			subInitial(DBParameter.pos_wl_34,v118);
   			
   			subInitial(DBParameter.pos_wl_34,v119);
   			subInitial(DBParameter.pos_wl_34,v120);
   			subInitial(DBParameter.pos_wl_34,v121);
   			subInitial(DBParameter.pos_wl_34,v122);
   			subInitial(DBParameter.pos_wl_34,v123);
   			subInitial(DBParameter.pos_wl_34,v124);
   			subInitial(DBParameter.pos_wl_34,v125);
   			subInitial(DBParameter.pos_wl_34,v126);
   			subInitial(DBParameter.pos_wl_34,v127);
   			subInitial(DBParameter.pos_wl_34,v128);
   			subInitial(DBParameter.pos_wl_34,v129);
   			subInitial(DBParameter.pos_wl_34,v130);
   			subInitial(DBParameter.pos_wl_34,v131);
   			subInitial(DBParameter.pos_wl_34,v132);
   			subInitial(DBParameter.pos_wl_34,v133);
   			subInitial(DBParameter.pos_wl_34,v134);
   			subInitial(DBParameter.pos_wl_34,v135);
   			subInitial(DBParameter.pos_wl_34,v136);
   			subInitial(DBParameter.pos_wl_34,v137);
   			subInitial(DBParameter.pos_wl_34,v138);
   			subInitial(DBParameter.pos_wl_34,v139);
   			subInitial(DBParameter.pos_wl_34,v140);
   			subInitial(DBParameter.pos_wl_34,v141);
   			subInitial(DBParameter.pos_wl_34,v142);
   			subInitial(DBParameter.pos_wl_34,v143);
   			subInitial(DBParameter.pos_wl_34,v144);
   			subInitial(DBParameter.pos_wl_34,v145);
   			subInitial(DBParameter.pos_wl_34,v146);
   			subInitial(DBParameter.pos_wl_34,v147);
   			subInitial(DBParameter.pos_wl_34,v148);
   			subInitial(DBParameter.pos_wl_34,v149);
   			subInitial(DBParameter.pos_wl_34,v150);
   			subInitial(DBParameter.pos_wl_34,v151);
   			subInitial(DBParameter.pos_wl_34,v152);
   			subInitial(DBParameter.pos_wl_34,v153);
   			subInitial(DBParameter.pos_wl_34,v154);
   			subInitial(DBParameter.pos_wl_34,v155);
   			subInitial(DBParameter.pos_wl_34,v156);
   			subInitial(DBParameter.pos_wl_34,v157);
   			subInitial(DBParameter.pos_wl_34,v158);
   			subInitial(DBParameter.pos_wl_34,v159);
   			subInitial(DBParameter.pos_wl_34,v160);
   			subInitial(DBParameter.pos_wl_34,v161);
   			subInitial(DBParameter.pos_wl_34,v162);
   			subInitial(DBParameter.pos_wl_34,v163);
   			subInitial(DBParameter.pos_wl_34,v164);
   			subInitial(DBParameter.pos_wl_34,v165);
   			subInitial(DBParameter.pos_wl_34,v166);
   			subInitial(DBParameter.pos_wl_34,v167);
   			subInitial(DBParameter.pos_wl_34,v168);
   			subInitial(DBParameter.pos_wl_34,v169);
   			subInitial(DBParameter.pos_wl_34,v170);
   			
        	
        	
        	
        	
        	
    	
    }
    public void doList_35(){
    	
    	String[] v1={"stroke","����������һ��",v+n,"0"};
    	String[] v2={"stroll","�������й�",v,"0"};
    	String[] v3={"strut","ֺ��������ߣ�֧��",v+n,"0"};
    	String[] v4={"stubborn","��ִ�ģ����Ըı��",a,"0"};
    	String[] v5={"studied","���صģ�����ϰ�õ�",a,"0"};
    	String[] v6={"stuffy","(����)�����ʵģ����˵�",a,"0"};
    	String[] v7={"stultify","ʹ��û�����Ц��ʹ����",v,"0"};
    	String[] v8={"stunning","����������",a,"0"};
    	String[] v9={"stunt","�谭(�ɳ�)���ؼ�������",v+n,"0"};
    	String[] v10={"stupor","���ԣ���ʡ����",n,"0"};
    	String[] v11={"sturdy","(����)ǿ���ģ���ʵ��",a,"0"};
    	String[] v12={"stutter","�ڳ�",n+v,"0"};
    	String[] v13={"stygian","�����ģ���ɭɭ��",a,"0"};
    	String[] v14={"stylus","����",n,"0"};
    	String[] v15={"stymie","����",v,"0"};
    	String[] v16={"subdue","������ѹ�ƣ�����",v,"0"};
    	String[] v17={"subdued","(�����)��͵�",a,"0"};
    	String[] v18={"subject","��֧�����",n,"0"};
    	String[] v19={"subjective","���۵�",a,"0"};
    	String[] v20={"subjugate","��������ѹ",v,"0"};
    	String[] v21={"sublime","��ߵ�",a,"0"};
    	String[] v22={"subliminal","Ǳ��ʶ��",a,"0"};
    	String[] v23={"submission","����������",n,"0"};
    	String[] v24={"submit","�������ύ",v,"0"};
    	String[] v25={"suborn","����",v,"0"};
    	String[] v26={"subpoena","��Ʊ����Ѷ",n+v,"0"};
    	String[] v27={"subsequent","���ģ�������",a,"0"};
    	String[] v28={"subside","(������)���ݣ�(����)ƽϢ",v,"0"};
    	String[] v29={"subsidiary","�����ģ���Ҫ��",a,"0"};
    	String[] v30={"subsidy","������",n,"0"};
    	String[] v31={"subsistence","���棬���ƣ�����",n,"0"};
    	String[] v32={"substance","���⣬���ݣ�ʵ�ʣ�����",n,"0"};
    	String[] v33={"substantial","��̵ģ�ʵ�ʵ�",a,"0"};
    	String[] v34={"substantiate","֤ʵ",v,"0"};
    	String[] v35={"substantive","�����ģ��������ڵ�",a,"0"};
    	String[] v36={"substitute","����Ʒ������",n+v,"0"};
    	String[] v37={"subsume","����������",v,"0"};
    	String[] v38={"subterfuge","��ƣ��д�",n,"0"};
    	String[] v39={"subterranean","���µ�",a,"0"};
    	String[] v40={"subtle","΢���",a,"0"};
    	String[] v41={"subtract","����",v,"0"};
    	String[] v42={"subversive","�߸��Ե�",a,"0"};
    	String[] v43={"subvert","�߸����Ʒ�",v,"0"};
    	String[] v44={"succinct","������",a,"0"};
    	String[] v45={"succor","����",v+n,"0"};
    	String[] v46={"succumb","���ӣ���...����",v,"0"};
    	String[] v47={"suffice","�㹻��(ʳ��)����",v,"0"};
    	String[] v48={"sufficient","�㹻��",a,"0"};
    	String[] v49={"suffocate","(ʹ)��Ϣ����",v,"0"};
    	String[] v50={"suffrage","ѡ��Ȩ��ͶƱȨ",n,"0"};
    	String[] v51={"suffragist","����Ȩ�������ߣ���Ů��Ȩ����",n,"0"};
        String[] v52={"suffuse","(ɫ��)������Ⱦ��",v,"0"};
        String[] v53={"suitcase","������",n,"0"};
        String[] v54={"sulky","������",a,"0"};
        String[] v55={"sullen","������",a,"0"};
        String[] v56={"sultry","���ȵģ���ɧ��",a,"0"};
        String[] v57={"summarily","�����أ��ִٵ�",d,"0"};
        String[] v58={"summary","�ܽ᣻������",n+a,"0"};
        String[] v59={"summation","�������ϼ�",n,"0"};
        String[] v60={"summon","�ټ����ټ�",v,"0"};		
    	String[] v61={"sumptuous","�ݳ޵�",a,"0"};
        String[] v62={"sunder","���ѣ�����",v,"0"};
       	String[] v63={"superb","�ϳ˵�",a,"0"};
       	String[] v64={"supercilious","Ŀ�����˵�",a,"0"};
       	String[] v65={"superficial","����ģ���ǳ��",a,"0"};
       	String[] v66={"superficiality","ǳ��",n,"0"};
        String[] v67={"superfluity","�������",n,"0"};
        String[] v68={"superfluous","�����",a,"0"};
        String[] v69={"superimpose","��������",v,"0"};
        String[] v70={"superintend","�ල",v,"0"};
    	String[] v71={"superiority","��Խ(��)",n,"0"};
        String[] v72={"supernova","������",n,"0"};
       	String[] v73={"supersede","��̭��ȡ��",v,"0"};
       	String[] v74={"supervise","�ල������",v,"0"};
       	String[] v75={"supine","���Եģ���ɢ��",a,"0"};
        String[] v76={"supplant","�ż���ȡ��",v,"0"};
        String[] v77={"supple","���������",a,"0"};
        String[] v78={"supplement","����",n+v,"0"};
        String[] v79={"suppliant","����ģ������",a,"0"};
        String[] v80={"supplicant","�����ߣ�������",n,"0"};
    	String[] v81={"supplicate","����",v,"0"};
        String[] v82={"supremacy","�������ϣ���Ȩ",n,"0"};
        String[] v83={"supreme","���ߵ�",a,"0"};
        String[] v84={"surcharge","��...��ȡ������ã����ӷ�",v+n,"0"};
        String[] v85={"surfeit","(ʳ��)������ʹ����",n+v,"0"};
        String[] v86={"surge","������ӿ������",v,"0"};
        String[] v87={"surgeon","���ҽʦ����ҽ�����ϵ�ҽ��",n,"0"};
        String[] v88={"surly","Ƣ�������",a,"0"};
        String[] v89={"surmise","�Ʋ⣬�²�",n+v,"0"};
        String[] v90={"surmount","�˷���սʤ",v,"0"};
        String[] v91={"surpass","����",v,"0"};
        String[] v92={"surplus","��ʣ�ģ�ӯ���",a,"0"};
        String[] v93={"surrealism","����ʵ����",n,"0"};
        String[] v94={"surrender","Ͷ�����������黹",v,"0"};
        String[] v95={"surreptitious","��������",a,"0"};
        String[] v96={"surrogate","����Ʒ��������",n,"0"};
        String[] v97={"surveyor","����Ա",n,"0"};
        String[] v98={"survive","�Ҵ�",v,"0"};
        String[] v99={"susceptibility","�׸���",n,"0"};
        String[] v100={"susceptible","����Ӱ���",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"suspect","���ɣ����ɷ������ɵ�",v+n+a,"0"};
        	String[] v102={"suspend","�ݻ���������",v,"0"};
        	String[] v103={"suspense","�������",n,"0"};
        	String[] v104={"suspicion","���ɣ����죬����",n,"0"};
        	String[] v105={"suspicious","���ɵ�",a,"0"};
        	String[] v106={"sustain","����(����)��֧��(����)",v,"0"};
        	String[] v107={"sustained","�־õ�",a,"0"};
        	String[] v108={"sustenance","ʳ�����",n,"0"};
        	String[] v109={"suture","���ߣ����",n+v,"0"};
        	String[] v110={"svelte","(Ů��)��̬������",a,"0"};
        	String[] v111={"swagger","��ҡ��ڵ���",v,"0"};
        	String[] v112={"swallow","���£�����",v,"0"};
        	String[] v113={"swamp","����ʹ���룬��û",n+v,"0"};
        	String[] v114={"sway","ҡ��",n+v,"0"};
        	String[] v115={"swell","���ͣ���ǿ",v,"0"};
        	String[] v116={"sweltering","���ȵ�",a,"0"};
        	String[] v117={"swerve","ͻȻ�ı䷽��",v,"0"};
        	String[] v118={"swift","Ѹ�ٵģ����ݵ�",a,"0"};
        	String[] v119={"swill","��ϴ��ʹ��",v,"0"};
        	String[] v120={"swindle","թƭ",v,"0"};
        	String[] v121={"swine","��",n,"0"};
        	String[] v122={"swing","ҡ�ڣ���ת����ǧ",v+n,"0"};
        	String[] v123={"swirl","��ת������",v+n,"0"};
        	String[] v124={"sybaritic","���ݵ�",a,"0"};
        	String[] v125={"sycophant","��ƨ��",n,"0"};
        	String[] v126={"syllabus","��ѧ��Ҫ",n,"0"};
        	String[] v127={"symbiosis","����",n,"0"};
        	String[] v128={"symmetry","�Գ�",n,"0"};
        	String[] v129={"symphony","������",n,"0"};
        	String[] v130={"synchronous","ͬʱ������",a,"0"};
        	String[] v131={"syndrome","�ۺ�֢״",n,"0"};
        	String[] v132={"synergic","Эͬ���õ�",a,"0"};
        	String[] v133={"synopsis","ժҪ",n,"0"};
        	String[] v134={"synoptic","ժҪ��",a,"0"};
        	String[] v135={"synthesis","�ۺϣ��ϳ�",n,"0"};
        	String[] v136={"syringe","ע����",n,"0"};
        	String[] v137={"table","���ã����ӿ���",v,"0"};
        	String[] v138={"taboo","��ɵģ�����",a+v,"0"};
        	String[] v139={"tacit","���ղ�����",a,"0"};
        	String[] v140={"taciturn","��Ĭ���Ե�",a,"0"};
        	String[] v141={"tackiness","�����",n,"0"};
        	String[] v142={"tackle","��������",v+n,"0"};
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_35,v1);
    		subInitial(DBParameter.pos_wl_35,v2);
    		subInitial(DBParameter.pos_wl_35,v3);
    		subInitial(DBParameter.pos_wl_35,v4);
    		subInitial(DBParameter.pos_wl_35,v5);
    		subInitial(DBParameter.pos_wl_35,v6);
    		subInitial(DBParameter.pos_wl_35,v7);
    		subInitial(DBParameter.pos_wl_35,v8);
    		subInitial(DBParameter.pos_wl_35,v9);
    		subInitial(DBParameter.pos_wl_35,v10);
    		subInitial(DBParameter.pos_wl_35,v11);
    		subInitial(DBParameter.pos_wl_35,v12);
    		subInitial(DBParameter.pos_wl_35,v13);
    		subInitial(DBParameter.pos_wl_35,v14);
    		subInitial(DBParameter.pos_wl_35,v15);
    		subInitial(DBParameter.pos_wl_35,v16);
    		subInitial(DBParameter.pos_wl_35,v17);
    		subInitial(DBParameter.pos_wl_35,v18);
    		subInitial(DBParameter.pos_wl_35,v19);
    		subInitial(DBParameter.pos_wl_35,v20);
    		subInitial(DBParameter.pos_wl_35,v21);
    		subInitial(DBParameter.pos_wl_35,v22);
    		subInitial(DBParameter.pos_wl_35,v23);
    		subInitial(DBParameter.pos_wl_35,v24);
    		subInitial(DBParameter.pos_wl_35,v25);
    		subInitial(DBParameter.pos_wl_35,v26);
    		subInitial(DBParameter.pos_wl_35,v27);
    		subInitial(DBParameter.pos_wl_35,v28);
    		subInitial(DBParameter.pos_wl_35,v29);
    		subInitial(DBParameter.pos_wl_35,v30);
    		subInitial(DBParameter.pos_wl_35,v31);
    		subInitial(DBParameter.pos_wl_35,v32);
    		subInitial(DBParameter.pos_wl_35,v33);
    		subInitial(DBParameter.pos_wl_35,v34);
    		subInitial(DBParameter.pos_wl_35,v35);
    		subInitial(DBParameter.pos_wl_35,v36);
    		subInitial(DBParameter.pos_wl_35,v37);
    		subInitial(DBParameter.pos_wl_35,v38);
    		subInitial(DBParameter.pos_wl_35,v39);
    		subInitial(DBParameter.pos_wl_35,v40);
    		subInitial(DBParameter.pos_wl_35,v41);
    		subInitial(DBParameter.pos_wl_35,v42);
    		subInitial(DBParameter.pos_wl_35,v43);
    		subInitial(DBParameter.pos_wl_35,v44);
    		subInitial(DBParameter.pos_wl_35,v45);
    		subInitial(DBParameter.pos_wl_35,v46);
    		subInitial(DBParameter.pos_wl_35,v47);
    		subInitial(DBParameter.pos_wl_35,v48);
    		subInitial(DBParameter.pos_wl_35,v49);
    		subInitial(DBParameter.pos_wl_35,v50);
    		
    		subInitial(DBParameter.pos_wl_35,v51);
    		subInitial(DBParameter.pos_wl_35,v52);
    		subInitial(DBParameter.pos_wl_35,v53);
    		subInitial(DBParameter.pos_wl_35,v54);
    		subInitial(DBParameter.pos_wl_35,v55);
    		subInitial(DBParameter.pos_wl_35,v56);
    		subInitial(DBParameter.pos_wl_35,v57);
    		subInitial(DBParameter.pos_wl_35,v58);
    		subInitial(DBParameter.pos_wl_35,v59);
    		subInitial(DBParameter.pos_wl_35,v60);
    		subInitial(DBParameter.pos_wl_35,v61);
    		subInitial(DBParameter.pos_wl_35,v62);
    		subInitial(DBParameter.pos_wl_35,v63);
    		subInitial(DBParameter.pos_wl_35,v64);
    		subInitial(DBParameter.pos_wl_35,v65);
    		subInitial(DBParameter.pos_wl_35,v66);
    		subInitial(DBParameter.pos_wl_35,v67);
    		subInitial(DBParameter.pos_wl_35,v68);
    		subInitial(DBParameter.pos_wl_35,v69);
    		subInitial(DBParameter.pos_wl_35,v70);
    		subInitial(DBParameter.pos_wl_35,v71);
    		subInitial(DBParameter.pos_wl_35,v72);
    		subInitial(DBParameter.pos_wl_35,v73);
    		subInitial(DBParameter.pos_wl_35,v74);
    		subInitial(DBParameter.pos_wl_35,v75);
    		subInitial(DBParameter.pos_wl_35,v76);
    		subInitial(DBParameter.pos_wl_35,v77);
    		subInitial(DBParameter.pos_wl_35,v78);
    		subInitial(DBParameter.pos_wl_35,v79);
    		subInitial(DBParameter.pos_wl_35,v80);
    		subInitial(DBParameter.pos_wl_35,v81);
    		subInitial(DBParameter.pos_wl_35,v82);
    		subInitial(DBParameter.pos_wl_35,v83);
    		subInitial(DBParameter.pos_wl_35,v84);
    		subInitial(DBParameter.pos_wl_35,v85);
    		subInitial(DBParameter.pos_wl_35,v86);
    		subInitial(DBParameter.pos_wl_35,v87);
    		subInitial(DBParameter.pos_wl_35,v88);
    		subInitial(DBParameter.pos_wl_35,v89);
    		subInitial(DBParameter.pos_wl_35,v90);
    		subInitial(DBParameter.pos_wl_35,v91);
    		subInitial(DBParameter.pos_wl_35,v92);
    		subInitial(DBParameter.pos_wl_35,v93);
    		subInitial(DBParameter.pos_wl_35,v94);
    		subInitial(DBParameter.pos_wl_35,v95);
    		subInitial(DBParameter.pos_wl_35,v96);
    		subInitial(DBParameter.pos_wl_35,v97);
    		subInitial(DBParameter.pos_wl_35,v98);
    		subInitial(DBParameter.pos_wl_35,v99);
    		subInitial(DBParameter.pos_wl_35,v100);
    		subInitial(DBParameter.pos_wl_35,v101);
    		subInitial(DBParameter.pos_wl_35,v102);
    		subInitial(DBParameter.pos_wl_35,v103);
    		subInitial(DBParameter.pos_wl_35,v104);
    		subInitial(DBParameter.pos_wl_35,v105);
    		subInitial(DBParameter.pos_wl_35,v106);
    		subInitial(DBParameter.pos_wl_35,v107);
    		subInitial(DBParameter.pos_wl_35,v108);
    		subInitial(DBParameter.pos_wl_35,v109);
    		subInitial(DBParameter.pos_wl_35,v110);
    		subInitial(DBParameter.pos_wl_35,v111);
    		subInitial(DBParameter.pos_wl_35,v112);
    		subInitial(DBParameter.pos_wl_35,v113);
    		subInitial(DBParameter.pos_wl_35,v114);
    		subInitial(DBParameter.pos_wl_35,v115);
    		subInitial(DBParameter.pos_wl_35,v116);
    		subInitial(DBParameter.pos_wl_35,v117);
    		subInitial(DBParameter.pos_wl_35,v118);
    		
    		subInitial(DBParameter.pos_wl_35,v119);
    		subInitial(DBParameter.pos_wl_35,v120);
    		subInitial(DBParameter.pos_wl_35,v121);
    		subInitial(DBParameter.pos_wl_35,v122);
    		subInitial(DBParameter.pos_wl_35,v123);
    		subInitial(DBParameter.pos_wl_35,v124);
    		subInitial(DBParameter.pos_wl_35,v125);
    		subInitial(DBParameter.pos_wl_35,v126);
    		subInitial(DBParameter.pos_wl_35,v127);
    		subInitial(DBParameter.pos_wl_35,v128);
    		subInitial(DBParameter.pos_wl_35,v129);
    		subInitial(DBParameter.pos_wl_35,v130);
    		subInitial(DBParameter.pos_wl_35,v131);
    		subInitial(DBParameter.pos_wl_35,v132);
    		subInitial(DBParameter.pos_wl_35,v133);
    		subInitial(DBParameter.pos_wl_35,v134);
    		subInitial(DBParameter.pos_wl_35,v135);
    		subInitial(DBParameter.pos_wl_35,v136);
    		subInitial(DBParameter.pos_wl_35,v137);
    		subInitial(DBParameter.pos_wl_35,v138);
    		subInitial(DBParameter.pos_wl_35,v139);
    		subInitial(DBParameter.pos_wl_35,v140);
    		subInitial(DBParameter.pos_wl_35,v141);
    		subInitial(DBParameter.pos_wl_35,v142);
    		
    	
    }
    public void doList_36(){
    	String[] v1={"tact","���ǣ�Բ��",n,"0"};
    	String[] v2={"tactic","�ֶΣ�ս��",n,"0"};
    	String[] v3={"tactile","�д�����",a,"0"};
    	String[] v4={"tadpole","���",n,"0"};
    	String[] v5={"taking","�������˵�",a,"0"};
    	String[] v6={"talisman","��а������",n,"0"};
    	String[] v7={"tally","(ʹ)һ��",v,"0"};
    	String[] v8={"talon","���ݵ���צ",n,"0"};
    	String[] v9={"tambourine","���",n,"0"};
    	String[] v10={"tame","ѱ����",a,"0"};
    	String[] v11={"tamp","��ʵ����ʵ",v,"0"};
    	String[] v12={"tamper","�𺦣��ܸ�",v,"0"};
    	String[] v13={"tan","��(��)",v,"0"};
    	String[] v14={"tangential","���ߵģ������",a,"0"};
    	String[] v15={"tangible","�ɴ�����",a,"0"};
    	String[] v16={"tangle","����",v,"0"};
    	String[] v17={"tango","̽����",n,"0"};
    	String[] v18={"tangy","ǿ�ҵ�",a,"0"};
    	String[] v19={"tantalize","������ʹ���ż�",v,"0"};
    	String[] v20={"tantamount","��...��ȵ�",a,"0"};
    	String[] v21={"tantrum","��Ƣ������ŭ",n,"0"};
    	String[] v22={"taper","ϸ�����𽥱�ϸ",n+v,"0"};
    	String[] v23={"tapestry","��̺",n,"0"};
    	String[] v24={"tardy","�����ģ��ٻ���",a,"0"};
    	String[] v25={"tare","�Ӳ�",n,"0"};
    	String[] v26={"tariff","��˰",n,"0"};
    	String[] v27={"tarnish","ʧȥ���󣬻ް�",n+v,"0"};
    	String[] v28={"tarpaulin","��ˮ�Ͳ�",n,"0"};
    	String[] v29={"tart","��ģ������",a,"0"};
    	String[] v30={"tasty","ζ���õ�",a,"0"};
    	String[] v31={"tatty","��ª�ģ��������",a,"0"};
    	String[] v32={"taut","������",a,"0"};
    	String[] v33={"tauten","����������",v,"0"};
    	String[] v34={"tawdry","������ʵ��",a,"0"};
    	String[] v35={"taxing","���ص�",a,"0"};
    	String[] v36={"taxonomist","����ѧ��",n,"0"};
    	String[] v37={"tear","˺��",v,"0"};
    	String[] v38={"tease","���֣�ϷŪ��ǿ��",n+v,"0"};
    	String[] v39={"technocrat","����������Ա",n,"0"};
    	String[] v40={"tedious","�߳���",a,"0"};
    	String[] v41={"tedium","������ζ",n,"0"};
    	String[] v42={"teeter","ҡ��",v,"0"};
    	String[] v43={"telling","��Ч�ģ�������",a,"0"};
    	String[] v44={"temerity","³ç����",n,"0"};
    	String[] v45={"temp","����ʱ����",v,"0"};
    	String[] v46={"temper","���������ͣ�Ƣ��",v+n,"0"};
    	String[] v47={"tempest","�����꣬ɧ��",n,"0"};
    	String[] v48={"tempestuous","�񱩵�",a,"0"};
    	String[] v49={"tempo","(�����������)�������ٶ�",n,"0"};
    	String[] v50={"temporal","ʱ��ģ����׵�",a,"0"};
    	String[] v51={"temporize","���ӣ�����ʹ��",v,"0"};
        String[] v52={"temptation","�ջ��ջ���",n,"0"};
        String[] v53={"tenable","վ��ס�ŵģ���и�ɻ���",a,"0"};
        String[] v54={"tenacious","���Ͳ��ε�",a,"0"};
        String[] v55={"tenacity","��֣���ִ",n,"0"};
        String[] v56={"tenant","����",n,"0"};
        String[] v57={"tend","���ϣ�����",v,"0"};
        String[] v58={"tendentious","��ƫ����",a,"0"};
        String[] v59={"tender","���(���)",v,"0"};
        String[] v60={"tenet","�������������",n,"0"};		
    	String[] v61={"tenor","�и�����Ҫ�㣬Ҫּ",n,"0"};
        String[] v62={"tension","���ţ����ǣ�����",n,"0"};
       	String[] v63={"tentative","��̽�Ե�",a,"0"};
       	String[] v64={"tenuous","ϡ���ģ��ն���",a,"0"};
       	String[] v65={"tenure","���ڣ�����ְλ",n,"0"};
       	String[] v66={"tepid","΢�µ�",a,"0"};
        String[] v67={"terminal","�յ㣬ĩ��(��)",n+a,"0"};
        String[] v68={"terminate","��ֹ",v,"0"};
        String[] v69={"termination","�յ�",n,"0"};
        String[] v70={"terminology","�������ѧ",n,"0"};
    	String[] v71={"terminus","�յ�վ",n,"0"};
        String[] v72={"termite","����",n,"0"};
       	String[] v73={"terrace","һ�������̨",n,"0"};
       	String[] v74={"terrain","���ƣ�����",n,"0"};
       	String[] v75={"terrestrial","����ģ�½�ص�",a,"0"};
        String[] v76={"terse","���ģ�������",a,"0"};
        String[] v77={"testament","������֤��",n,"0"};
        String[] v78={"testater","����������",n,"0"};
        String[] v79={"testify","��֤��֤ʵ",v,"0"};
        String[] v80={"testimony","֤�ԣ�֤��",n,"0"};
    	String[] v81={"testiness","��ŭ",n,"0"};
        String[] v82={"testy","�Լ���",a,"0"};
        String[] v83={"tether","����˩ס�����������޶ȣ���Χ",v+n,"0"};
        String[] v84={"texture","�ʵأ��ṹ",n,"0"};
        String[] v85={"thatch","��é�ݸ��ǣ�é��",v+n,"0"};
        String[] v86={"thaw","�ⶳ���ڻ�",v,"0"};
        String[] v87={"thematic","�����",a,"0"};
        String[] v88={"theocracy","��Ȩ����",n,"0"};
        String[] v89={"theoretical","����ʵ�ʵģ������ϵ�",a,"0"};
        String[] v90={"therapeutic","�β���",a,"0"};
        String[] v91={"thermal","�����ģ���ů��",a,"0"};
        String[] v92={"thesis","���⣬����",n,"0"};
        String[] v93={"thicket","���ԣ���ľ��",n,"0"};
        String[] v94={"thorn","�̣�����",n,"0"};
        String[] v95={"thread","����",n,"0"};
        String[] v96={"threadbare","ĥ�Ƶģ��¸���",a,"0"};
        String[] v97={"threat","��в�����ţ�����",n,"0"};
        String[] v98={"thrive","��׳�ɳ�",v,"0"};
        String[] v99={"throne","��������λ",n,"0"};
        String[] v100={"throng","һ��Ⱥ��ӵ��",n+v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"throwback","�������󣬸���",n,"0"};
        	String[] v102={"thrust","�����ƣ��̣���",v,"0"};
        	String[] v103={"thwart","���ӣ�ʹ...�ܴ�",v,"0"};
        	String[] v104={"tickler","���ֵ����⣬����",n,"0"};
        	String[] v105={"ticklish","�����ģ���ŭ��",a,"0"};
        	String[] v106={"tidy","����ģ������",a,"0"};
        	String[] v107={"tiff","���죬����",n,"0"};
        	String[] v108={"tightfisted","���ĵ�",a,"0"};
        	String[] v109={"tilt","ʹ��б����б��б��",v+n,"0"};
        	String[] v110={"timber","ľ�ģ�(��)Ʒ��",n,"0"};
        	String[] v111={"timbre","��ɫ������",n,"0"};
        	String[] v112={"timely","��ʱ�ģ���ʱ��",a,"0"};
        	String[] v113={"timid","���ӵ�",a,"0"};
        	String[] v114={"timidity","����",n,"0"};
        	String[] v115={"timorous","��С�ģ����ӵ�",a,"0"};
        	String[] v116={"tinder","����",n,"0"};
        	String[] v117={"tined","��˵�",a,"0"};
        	String[] v118={"tinker","�������ˣ�׾���޲�",n+v,"0"};
        	String[] v119={"tint","ɫ�󣻸�...������ɫ",n+v,"0"};
        	String[] v120={"tirade","��ƪ�Ĺ����Խ���",n,"0"};
        	String[] v121={"tire","��̥����ƣ��",n+v,"0"};
        	String[] v122={"tissue","ϸ����֯����ֽ����ֽ",n,"0"};
        	String[] v123={"titanic","�޴�ģ������ޱȵ�",a,"0"};
        	String[] v124={"titular","������ʵ�ģ������ϵ�",a,"0"};
        	String[] v125={"toady","������",n,"0"};
        	String[] v126={"toil","���࣬��������",n+v,"0"};
        	String[] v127={"tolerance","���̣�������������",n,"0"};
        	String[] v128={"toll","��·�ѣ�������������ʧ��(�������ֹ��ɵ�)��",n+v,"0"};
        	String[] v129={"tombstone","Ĺ��",n,"0"};
        	String[] v130={"tongs","���ӣ�ǯ��",n,"0"};
        	String[] v131={"tonic","��������֮���Ʒ���̲���",n+a,"0"};
        	String[] v132={"tonsorial","��ʦ�ģ�����",a,"0"};
        	String[] v133={"topple","�㸲���Ƶ�",v,"0"};
        	String[] v134={"torment","��ĥ��ʹ��",n,"0"};
        	String[] v135={"tornado","쫷磬�����",n,"0"};
        	String[] v136={"torpid","��ɢ�ģ�����������",a,"0"};
        	String[] v137={"torpor","��������",n,"0"};
        	String[] v138={"torque","ת�أ���Ȧ",n,"0"};
        	String[] v139={"torrent","����������",n,"0"};
        	String[] v140={"tortuous","����������",a,"0"};
        	String[] v141={"toss","Ͷ������ʹҡ��",v,"0"};
        	String[] v142={"totalitarian","��Ȩ�����",a,"0"};
        	String[] v143={"totem","ͼ�ڣ�����",n,"0"};
        	String[] v144={"totter","ҡҡ��׹����������",v,"0"};
        	String[] v145={"touchy","���еģ��׷�Ƣ����",a,"0"};
        	String[] v146={"toupee","���üٷ�",n,"0"};
        	String[] v147={"tournament","��������ʿ������",n,"0"};
        	String[] v148={"tourniquet","ֹѪ��",n,"0"};
        	String[] v149={"tout","����˿ͣ���������",n,"0"};
        	String[] v150={"toxic","�ж��ģ��ж���",a,"0"};
        	String[] v151={"toxin","����",n,"0"};
        	String[] v152={"toy","�����濼�ǣ���Ū",v,"0"};
        	String[] v153={"traceable","��׷�ٵ�",a,"0"};
        	String[] v154={"track","�㼣���ټ��������С��������",n+v,"0"};
        	String[] v155={"tract","��������Ƭ����",n,"0"};
        	String[] v156={"tractability","��˳",n,"0"};
        	String[] v157={"tractable","���ڼ�Ԧ�ģ���˳��",a,"0"};
        	String[] v158={"tragedy","���磬����",n,"0"};
        	String[] v159={"trait","�˵���������",n,"0"};
        	String[] v160={"traitor","����������ͽ",n,"0"};
        	String[] v161={"trajectory","���䵯��",n,"0"};
        	String[] v162={"trample","�Ȼ�����̤",v,"0"};
        	String[] v163={"trance","��㱣���˯״̬",n,"0"};
        	String[] v164={"tranquility","����������",n,"0"};
        	String[] v165={"transaction","��������",n,"0"};
        	String[] v166={"transcend","��Խ��ʤ��",v,"0"};
        	String[] v167={"transcendent","׿Խ��",a,"0"};
        	String[] v168={"transcendental","��Խ�����",a,"0"};
        	String[] v169={"transcribe","��д��ת¼",v,"0"};
        	String[] v170={"transfer","ת�ƣ����ݣ����Σ�ת��",v,"0"};
        	String[] v171={"transfigure","�������Ĺ�",v,"0"};
        	String[] v172={"transgress","ð����Υ��",v,"0"};
        	String[] v173={"transgression","Υ�������",n,"0"};
        	String[] v174={"transience","����",n,"0"};
        	String[] v175={"transient","���ݵ�",a,"0"};
        	String[] v176={"transition","����ʱ��",n,"0"};
        	String[] v177={"transitory","���ݵ�",a,"0"};
        	String[] v178={"translucent","(��)͸����",a,"0"};
        	
        	
        	
        	subInitial(DBParameter.pos_wl_36,v1);
    		subInitial(DBParameter.pos_wl_36,v2);
    		subInitial(DBParameter.pos_wl_36,v3);
    		subInitial(DBParameter.pos_wl_36,v4);
    		subInitial(DBParameter.pos_wl_36,v5);
    		subInitial(DBParameter.pos_wl_36,v6);
    		subInitial(DBParameter.pos_wl_36,v7);
    		subInitial(DBParameter.pos_wl_36,v8);
    		subInitial(DBParameter.pos_wl_36,v9);
    		subInitial(DBParameter.pos_wl_36,v10);
    		subInitial(DBParameter.pos_wl_36,v11);
    		subInitial(DBParameter.pos_wl_36,v12);
    		subInitial(DBParameter.pos_wl_36,v13);
    		subInitial(DBParameter.pos_wl_36,v14);
    		subInitial(DBParameter.pos_wl_36,v15);
    		subInitial(DBParameter.pos_wl_36,v16);
    		subInitial(DBParameter.pos_wl_36,v17);
    		subInitial(DBParameter.pos_wl_36,v18);
    		subInitial(DBParameter.pos_wl_36,v19);
    		subInitial(DBParameter.pos_wl_36,v20);
    		subInitial(DBParameter.pos_wl_36,v21);
    		subInitial(DBParameter.pos_wl_36,v22);
    		subInitial(DBParameter.pos_wl_36,v23);
    		subInitial(DBParameter.pos_wl_36,v24);
    		subInitial(DBParameter.pos_wl_36,v25);
    		subInitial(DBParameter.pos_wl_36,v26);
    		subInitial(DBParameter.pos_wl_36,v27);
    		subInitial(DBParameter.pos_wl_36,v28);
    		subInitial(DBParameter.pos_wl_36,v29);
    		subInitial(DBParameter.pos_wl_36,v30);
    		subInitial(DBParameter.pos_wl_36,v31);
    		subInitial(DBParameter.pos_wl_36,v32);
    		subInitial(DBParameter.pos_wl_36,v33);
    		subInitial(DBParameter.pos_wl_36,v34);
    		subInitial(DBParameter.pos_wl_36,v35);
    		subInitial(DBParameter.pos_wl_36,v36);
    		subInitial(DBParameter.pos_wl_36,v37);
    		subInitial(DBParameter.pos_wl_36,v38);
    		subInitial(DBParameter.pos_wl_36,v39);
    		subInitial(DBParameter.pos_wl_36,v40);
    		subInitial(DBParameter.pos_wl_36,v41);
    		subInitial(DBParameter.pos_wl_36,v42);
    		subInitial(DBParameter.pos_wl_36,v43);
    		subInitial(DBParameter.pos_wl_36,v44);
    		subInitial(DBParameter.pos_wl_36,v45);
    		subInitial(DBParameter.pos_wl_36,v46);
    		subInitial(DBParameter.pos_wl_36,v47);
    		subInitial(DBParameter.pos_wl_36,v48);
    		subInitial(DBParameter.pos_wl_36,v49);
    		subInitial(DBParameter.pos_wl_36,v50);
    		
    		subInitial(DBParameter.pos_wl_36,v51);
    		subInitial(DBParameter.pos_wl_36,v52);
    		subInitial(DBParameter.pos_wl_36,v53);
    		subInitial(DBParameter.pos_wl_36,v54);
    		subInitial(DBParameter.pos_wl_36,v55);
    		subInitial(DBParameter.pos_wl_36,v56);
    		subInitial(DBParameter.pos_wl_36,v57);
    		subInitial(DBParameter.pos_wl_36,v58);
    		subInitial(DBParameter.pos_wl_36,v59);
    		subInitial(DBParameter.pos_wl_36,v60);
    		subInitial(DBParameter.pos_wl_36,v61);
    		subInitial(DBParameter.pos_wl_36,v62);
    		subInitial(DBParameter.pos_wl_36,v63);
    		subInitial(DBParameter.pos_wl_36,v64);
    		subInitial(DBParameter.pos_wl_36,v65);
    		subInitial(DBParameter.pos_wl_36,v66);
    		subInitial(DBParameter.pos_wl_36,v67);
    		subInitial(DBParameter.pos_wl_36,v68);
    		subInitial(DBParameter.pos_wl_36,v69);
    		subInitial(DBParameter.pos_wl_36,v70);
    		subInitial(DBParameter.pos_wl_36,v71);
    		subInitial(DBParameter.pos_wl_36,v72);
    		subInitial(DBParameter.pos_wl_36,v73);
    		subInitial(DBParameter.pos_wl_36,v74);
    		subInitial(DBParameter.pos_wl_36,v75);
    		subInitial(DBParameter.pos_wl_36,v76);
    		subInitial(DBParameter.pos_wl_36,v77);
    		subInitial(DBParameter.pos_wl_36,v78);
    		subInitial(DBParameter.pos_wl_36,v79);
    		subInitial(DBParameter.pos_wl_36,v80);
    		subInitial(DBParameter.pos_wl_36,v81);
    		subInitial(DBParameter.pos_wl_36,v82);
    		subInitial(DBParameter.pos_wl_36,v83);
    		subInitial(DBParameter.pos_wl_36,v84);
    		subInitial(DBParameter.pos_wl_36,v85);
    		subInitial(DBParameter.pos_wl_36,v86);
    		subInitial(DBParameter.pos_wl_36,v87);
    		subInitial(DBParameter.pos_wl_36,v88);
    		subInitial(DBParameter.pos_wl_36,v89);
    		subInitial(DBParameter.pos_wl_36,v90);
    		subInitial(DBParameter.pos_wl_36,v91);
    		subInitial(DBParameter.pos_wl_36,v92);
    		subInitial(DBParameter.pos_wl_36,v93);
    		subInitial(DBParameter.pos_wl_36,v94);
    		subInitial(DBParameter.pos_wl_36,v95);
    		subInitial(DBParameter.pos_wl_36,v96);
    		subInitial(DBParameter.pos_wl_36,v97);
    		subInitial(DBParameter.pos_wl_36,v98);
    		subInitial(DBParameter.pos_wl_36,v99);
    		subInitial(DBParameter.pos_wl_36,v100);
    		subInitial(DBParameter.pos_wl_36,v101);
    		subInitial(DBParameter.pos_wl_36,v102);
    		subInitial(DBParameter.pos_wl_36,v103);
    		subInitial(DBParameter.pos_wl_36,v104);
    		subInitial(DBParameter.pos_wl_36,v105);
    		subInitial(DBParameter.pos_wl_36,v106);
    		subInitial(DBParameter.pos_wl_36,v107);
    		subInitial(DBParameter.pos_wl_36,v108);
    		subInitial(DBParameter.pos_wl_36,v109);
    		subInitial(DBParameter.pos_wl_36,v110);
    		subInitial(DBParameter.pos_wl_36,v111);
    		subInitial(DBParameter.pos_wl_36,v112);
    		subInitial(DBParameter.pos_wl_36,v113);
    		subInitial(DBParameter.pos_wl_36,v114);
    		subInitial(DBParameter.pos_wl_36,v115);
    		subInitial(DBParameter.pos_wl_36,v116);
    		subInitial(DBParameter.pos_wl_36,v117);
    		subInitial(DBParameter.pos_wl_36,v118);
    		
    		subInitial(DBParameter.pos_wl_36,v119);
    		subInitial(DBParameter.pos_wl_36,v120);
    		subInitial(DBParameter.pos_wl_36,v121);
    		subInitial(DBParameter.pos_wl_36,v122);
    		subInitial(DBParameter.pos_wl_36,v123);
    		subInitial(DBParameter.pos_wl_36,v124);
    		subInitial(DBParameter.pos_wl_36,v125);
    		subInitial(DBParameter.pos_wl_36,v126);
    		subInitial(DBParameter.pos_wl_36,v127);
    		subInitial(DBParameter.pos_wl_36,v128);
    		subInitial(DBParameter.pos_wl_36,v129);
    		subInitial(DBParameter.pos_wl_36,v130);
    		subInitial(DBParameter.pos_wl_36,v131);
    		subInitial(DBParameter.pos_wl_36,v132);
    		subInitial(DBParameter.pos_wl_36,v133);
    		subInitial(DBParameter.pos_wl_36,v134);
    		subInitial(DBParameter.pos_wl_36,v135);
    		subInitial(DBParameter.pos_wl_36,v136);
    		subInitial(DBParameter.pos_wl_36,v137);
    		subInitial(DBParameter.pos_wl_36,v138);
    		subInitial(DBParameter.pos_wl_36,v139);
    		subInitial(DBParameter.pos_wl_36,v140);
    		subInitial(DBParameter.pos_wl_36,v141);
    		subInitial(DBParameter.pos_wl_36,v142);
    		subInitial(DBParameter.pos_wl_36,v143);
    		subInitial(DBParameter.pos_wl_36,v144);
    		subInitial(DBParameter.pos_wl_36,v145);
    		subInitial(DBParameter.pos_wl_36,v146);
    		subInitial(DBParameter.pos_wl_36,v147);
    		subInitial(DBParameter.pos_wl_36,v148);
    		subInitial(DBParameter.pos_wl_36,v149);
    		subInitial(DBParameter.pos_wl_36,v150);
    		subInitial(DBParameter.pos_wl_36,v151);
    		subInitial(DBParameter.pos_wl_36,v152);
    		subInitial(DBParameter.pos_wl_36,v153);
    		subInitial(DBParameter.pos_wl_36,v154);
    		subInitial(DBParameter.pos_wl_36,v155);
    		subInitial(DBParameter.pos_wl_36,v156);
    		subInitial(DBParameter.pos_wl_36,v157);
    		subInitial(DBParameter.pos_wl_36,v158);
    		subInitial(DBParameter.pos_wl_36,v159);
    		subInitial(DBParameter.pos_wl_36,v160);
    		subInitial(DBParameter.pos_wl_36,v161);
    		subInitial(DBParameter.pos_wl_36,v162);
    		subInitial(DBParameter.pos_wl_36,v163);
    		subInitial(DBParameter.pos_wl_36,v164);
    		subInitial(DBParameter.pos_wl_36,v165);
    		subInitial(DBParameter.pos_wl_36,v166);
    		subInitial(DBParameter.pos_wl_36,v167);
    		subInitial(DBParameter.pos_wl_36,v168);
    		subInitial(DBParameter.pos_wl_36,v169);
    		subInitial(DBParameter.pos_wl_36,v170);
    		subInitial(DBParameter.pos_wl_36,v171);
    		subInitial(DBParameter.pos_wl_36,v172);
    		subInitial(DBParameter.pos_wl_36,v173);
    		subInitial(DBParameter.pos_wl_36,v174);
    		subInitial(DBParameter.pos_wl_36,v175);
    		subInitial(DBParameter.pos_wl_36,v176);
    		subInitial(DBParameter.pos_wl_36,v177);
    		subInitial(DBParameter.pos_wl_36,v178);
    		
        	
    	
    }
    public void doList_37(){
    	
    	String[] v1={"transmit","���ͣ�����",v,"0"};
    	String[] v2={"transmute","�仯������",v,"0"};
    	String[] v3={"transparent","͸���ģ�ֱ�ʵ�",a,"0"};
    	String[] v4={"transplantation","��ֲ",n,"0"};
    	String[] v5={"transport","���䣻��ϲ",v+n,"0"};
    	String[] v6={"transpose","�任λ�ã�����",v,"0"};
    	String[] v7={"trapeze","������ǧ",n,"0"};
    	String[] v8={"traverse","�ᴩ�������",v,"0"};
    	String[] v9={"travesty","����ģ�£�����",v+n,"0"};
    	String[] v10={"treacherous","���ѵģ���թ��",a,"0"};
    	String[] v11={"treason","�ѹ���",n,"0"};
    	String[] v12={"treatise","����",n,"0"};
    	String[] v13={"treaty","��Լ��Э��",n,"0"};
    	String[] v14={"tremendous","���˵�",a,"0"};
    	String[] v15={"tremor","�𶯣�����",n,"0"};
    	String[] v16={"trenchant","һ���Ѫ��",a,"0"};
    	String[] v17={"trend","���ƣ�����",n+v,"0"};
    	String[] v18={"trepidation","�־壬�̿�",n,"0"};
    	String[] v19={"trespass","�ַ�������˽�����",v,"0"};
    	String[] v20={"tribunal","��ͥ��������",n,"0"};
    	String[] v21={"tribute","�޴ǣ�����",n,"0"};
    	String[] v22={"trickle","һ�εε�����ϸ��",v+n,"0"};
    	String[] v23={"trifle","΢�����������",n,"0"};
    	String[] v24={"trigger","���������������",n+v,"0"};
    	String[] v25={"trilogy","������",n,"0"};
    	String[] v26={"trim","�޼�����������",v+a,"0"};
    	String[] v27={"trinket","Сװ��Ʒ����ֵǮ���鱦",n,"0"};
    	String[] v28={"trio","�����࣬���س�������һ��",n,"0"};
    	String[] v29={"tripod","���ż�",n,"0"};
    	String[] v30={"trite","�¸���",a,"0"};
    	String[] v31={"triumph","����������",n+v,"0"};
    	String[] v32={"trivial","��ϸ��",a,"0"};
    	String[] v33={"trophy","��Ʒ",n,"0"};
    	String[] v34={"troupe","�質�ţ�����",n,"0"};
    	String[] v35={"trowel","�൶��С��",n,"0"};
    	String[] v36={"truancy","��ѧ������",n,"0"};
    	String[] v37={"truce","ͣս",n,"0"};
    	String[] v38={"truculent","�б��ģ��׺ݵ�",a,"0"};
    	String[] v39={"trudge","����",v,"0"};
    	String[] v40={"trumpet","���ȣ�С��",n,"0"};
    	String[] v41={"truncate","��...�ض̣�ȥβ",v,"0"};
    	String[] v42={"trunk","���ɣ�������",n,"0"};
    	String[] v43={"truss","֧�ܣ�һ��(�ɲ�)",n,"0"};
    	
    	String[] v45={"trustworthy","ֵ��������",a,"0"};
    	String[] v46={"tuber","�龥�����",n,"0"};
    	String[] v47={"tumult","�Һ��",n,"0"};
    	String[] v48={"turbulent","���¶��ҵģ�ɧ�ҵ�",a,"0"};
    	String[] v49={"turgid","���׵ģ����͵ģ������",a,"0"};
    	String[] v50={"turmoil","���ң�ɧ��",n,"0"};
    	String[] v51={"turncoat","������",n,"0"};
        String[] v52={"turpitude","а�񣬱���(��Ϊ)",n,"0"};
        String[] v53={"turquoise","����ʯ�����̵�",n+a,"0"};
        String[] v54={"turret","��¥������",n,"0"};
        String[] v55={"tusk","(�����)����",n,"0"};
        String[] v56={"tussle","Ť�򣬲���������",n+v,"0"};
        String[] v57={"tutor","���̣��໤�ˣ�����",n+v,"0"};
        String[] v58={"tuxedo","�������β���",n,"0"};
        String[] v59={"twig","С֦����֦",n,"0"};
        String[] v60={"twinge","(��������)��ʹ",n,"0"};		
    	String[] v61={"typo","��ӡ����",n,"0"};
        String[] v62={"typographical","ӡˢ�ϵ�",a,"0"};
       	String[] v63={"tyranny","���У�������ר��ͳ��",n,"0"};
       	String[] v64={"tyrant","����",n,"0"};
       	String[] v65={"tyro","����",n,"0"};
       	String[] v66={"ubiquitous","�������ڵ�",a,"0"};
        String[] v67={"ugly","�ѿ��ģ����µ�",a,"0"};
        String[] v68={"ulcer","���񣬸�����",n,"0"};
        String[] v69={"ultimate","����",a,"0"};
        String[] v70={"umbrage","���죬��ŭ",n,"0"};
    	String[] v71={"umpire","���У���...�ٲ�",n+v,"0"};
        String[] v72={"unaffected","��Ȼ�ģ�������������",a,"0"};
       	String[] v73={"unanimous","ȫ�����һ�µ�",a,"0"};
       	String[] v74={"unassuming","���ڼ��ӵģ���������",a,"0"};
       	String[] v75={"unbecoming","������ģ��������",a,"0"};
        String[] v76={"unbend","Ūֱ������",v,"0"};
        String[] v77={"uncanny","���صģ�����˼���",a,"0"};
        String[] v78={"uncommited","����Լ���ģ����е����ε�",a,"0"};
        String[] v79={"unconscionable","�޽��Ƶģ����ȵ�",a,"0"};
        String[] v80={"unconscious","��ʡ���µģ�δ��ʶ����",a,"0"};
    	String[] v81={"uncouth","��Ұ��׾��",a,"0"};
        String[] v82={"unctuous","���ʵ�",a,"0"};
        String[] v83={"underbid","Ҫ�۹���",v,"0"};
        String[] v84={"undercut","����������",v,"0"};
        String[] v85={"underdog","ʧ���ߣ���ѹ����",n,"0"};
        String[] v86={"underestimated","�͹���",a,"0"};
        String[] v87={"undergird","��ǿ������...�ĵײ�",v,"0"};
        String[] v88={"underhanded","�������ģ�",a,"0"};
        String[] v89={"underling","����������",n,"0"};
        String[] v90={"underlying","������ģ�������",a,"0"};
        String[] v91={"undermine","�ƻ�����",v,"0"};
        String[] v92={"underplay","����...����Ҫ�ԣ�����(��ɫ)�������",v,"0"};
        String[] v93={"underrate","�͹�������",v,"0"};
        String[] v94={"underscore","��...֮�»��ߣ�ǿ��",v,"0"};
        String[] v95={"understate","���ε�˵�����赭д��˵",v,"0"};
        String[] v96={"understated","����ȫ������",a,"0"};
        String[] v97={"understatement","���赭д�ĳ���������ȫ�ĳ���",n,"0"};
        String[] v98={"understudy","Ԥ����Ա����ǣ��䵱...�����",n+v,"0"};
        String[] v99={"underutilized","Ϊ������õ�",a,"0"};
        String[] v100={"underwrite","ͬ�⸺��...�ķ��ã�Ϊ...����",v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"undeserved","��Ӧ�õ�",a,"0"};
        	String[] v102={"undesirable","���˲��õ�",a,"0"};
        	String[] v103={"undirected","δ��ָ����",a,"0"};
        	String[] v104={"unearth","�ڳ�������",v,"0"};
        	String[] v105={"unearthly","�����",a,"0"};
        	String[] v106={"unenlightened","������֪�ģ���������",a,"0"};
        	String[] v107={"unexceptionable","�޿ɷ����",a,"0"};
        	String[] v108={"unfailing","�޾��ģ������",a,"0"};
        	String[] v109={"unfasten","�⿪",v,"0"};
        	String[] v110={"unfeigned","��ʵ�ģ������ٵ�",a,"0"};
        	String[] v111={"unflappable","�����ŵģ��򶨵�",a,"0"};
        	String[] v112={"unfold","չ�����򿪣��𽥳���",v,"0"};
        	String[] v113={"unfounded","����ʵ���ݵ�",a,"0"};
        	String[] v114={"ungainly","��׾��",a,"0"};
        	String[] v115={"ungrudging","������",a,"0"};
        	String[] v116={"unguent","ҩ�࣬���",n,"0"};
        	String[] v117={"unicorn","������",n,"0"};
        	String[] v118={"unidimensional","һ����ģ�һά��",a,"0"};
        	String[] v119={"unification","ͳһ��һ��",n,"0"};
        	String[] v120={"uniform","�Ʒ�����ͬ�ģ�һ�µ�",n+a,"0"};

            String[] v1202={"unify","ͳһ��ʹ��һ�壬ʹ��ͬ",v,"0"};
        	String[] v121={"unimpassioned","û�м����",a,"0"};
        	String[] v122={"unimpeachable","�޿�ָ��ģ��޿����ɵ�",a,"0"};
        	String[] v123={"uninitiated","���еģ�ȱ�������",a,"0"};
        	String[] v124={"unique","��һ�޶��ģ����ص�",a,"0"};
        	String[] v125={"univocal","��˼��ȷ�ģ���һ��˼��",a,"0"};
        	String[] v126={"unjustified","δ��֤�������ģ��޷����͵�",a,"0"};
        	String[] v127={"unjustly","����أ�������",d,"0"};
        	String[] v128={"unkempt","(�Ǳ�)�������",a,"0"};
        	String[] v129={"unleash","��й���ͷ�",v,"0"};
        	String[] v130={"unmitigated","δ���͵ģ�δ����ģ�ȫȻ��",a,"0"};
        	String[] v131={"unmoved","�޶����Եģ���Į�ģ��򶨵�",a,"0"};
        	String[] v132={"unnoticed","������ע���",a,"0"};
        	String[] v133={"unobtrusive","������עĿ��",a,"0"};
        	String[] v134={"unpalatable","���������",a,"0"};
        	String[] v135={"unprecedented","ǰ��δ�е�",a,"0"};
        	String[] v136={"unpremeditated","��Ԥı��",a,"0"};
        	String[] v137={"unprepossessing","�������˵�",a,"0"};
        	String[] v138={"unpretentious","����ҫ��",a,"0"};
        	String[] v139={"unprincipled","���޼ɵ��ģ������µ�",a,"0"};
        	String[] v140={"unproductive","ͽȻ�ģ��޳�Ч��",a,"0"};
        	String[] v141={"unprovoked","��Ե�޹ʵ�(����)",a,"0"};
        	String[] v142={"unqualified","���ʸ�ģ������Ƶģ����Ե�",a,"0"};
        	String[] v143={"unravel","�⿪����ɢ",v,"0"};
        	String[] v144={"unregenerate","��֪�ڸĵ�",a,"0"};
        	String[] v145={"unregulated","δ�ܹ���ģ�δ��Լ����",a,"0"};
        	String[] v146={"unremitting","����ϵģ�������",a,"0"};
        	String[] v147={"unrepentant","������ģ�����ڵ�",a,"0"};
        	String[] v148={"unrequited","�ޱ����",a,"0"};
        	String[] v149={"unreserved","�����Ƶģ�δ��Ԥ����",a,"0"};
        	String[] v150={"unscathed","δ�����˵ģ�α���˺���",a,"0"};
        	String[] v151={"unscented","����ζ��",a,"0"};
        	String[] v152={"unscrupulous","���޼ɵ���",a,"0"};
        	String[] v153={"unscrupulousness","����",n,"0"};
        	String[] v154={"unseemly","���ʵ��ģ����˵�",a,"0"};
        	String[] v155={"unsettle","ʹ������������",v,"0"};
        	String[] v156={"unsettling","���˲����ģ����ҵ�",a,"0"};
        	String[] v157={"unsound","�޸��ݵģ�����ʵ�ģ�����̵�",a,"0"};
        	String[] v158={"unspoiled","δ�𻵵ģ�δ�軵��",a,"0"};
        	String[] v159={"unspotted","��׵ģ����۵��",a,"0"};
        	String[] v160={"unstinting","��Ϊ������",a,"0"};
        	String[] v161={"unsubstantiated","δ��֤ʵ�ģ�����ʵ���ݵ�",a,"0"};
        	String[] v162={"untapped","δ�����ģ�δ���õ�",a,"0"};
        	String[] v163={"unthreatening","����в��",a,"0"};
        	String[] v164={"untimely","����ģ�����ʱ��",a,"0"};
        	String[] v165={"untold","������",a,"0"};
        	String[] v166={"untoward","���ҵģ�(����)û�ϵ���",a,"0"};
        	String[] v167={"untutored","δ��������",a,"0"};
        	String[] v168={"unwarranted","û�и��ݵ�",a,"0"};
        	String[] v169={"unwieldy","���صģ���׾��",a,"0"};
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_37,v1);
    		subInitial(DBParameter.pos_wl_37,v2);
    		subInitial(DBParameter.pos_wl_37,v3);
    		subInitial(DBParameter.pos_wl_37,v4);
    		subInitial(DBParameter.pos_wl_37,v5);
    		subInitial(DBParameter.pos_wl_37,v6);
    		subInitial(DBParameter.pos_wl_37,v7);
    		subInitial(DBParameter.pos_wl_37,v8);
    		subInitial(DBParameter.pos_wl_37,v9);
    		subInitial(DBParameter.pos_wl_37,v10);
    		subInitial(DBParameter.pos_wl_37,v11);
    		subInitial(DBParameter.pos_wl_37,v12);
    		subInitial(DBParameter.pos_wl_37,v13);
    		subInitial(DBParameter.pos_wl_37,v14);
    		subInitial(DBParameter.pos_wl_37,v15);
    		subInitial(DBParameter.pos_wl_37,v16);
    		subInitial(DBParameter.pos_wl_37,v17);
    		subInitial(DBParameter.pos_wl_37,v18);
    		subInitial(DBParameter.pos_wl_37,v19);
    		subInitial(DBParameter.pos_wl_37,v20);
    		subInitial(DBParameter.pos_wl_37,v21);
    		subInitial(DBParameter.pos_wl_37,v22);
    		subInitial(DBParameter.pos_wl_37,v23);
    		subInitial(DBParameter.pos_wl_37,v24);
    		subInitial(DBParameter.pos_wl_37,v25);
    		subInitial(DBParameter.pos_wl_37,v26);
    		subInitial(DBParameter.pos_wl_37,v27);
    		subInitial(DBParameter.pos_wl_37,v28);
    		subInitial(DBParameter.pos_wl_37,v29);
    		subInitial(DBParameter.pos_wl_37,v30);
    		subInitial(DBParameter.pos_wl_37,v31);
    		subInitial(DBParameter.pos_wl_37,v32);
    		subInitial(DBParameter.pos_wl_37,v33);
    		subInitial(DBParameter.pos_wl_37,v34);
    		subInitial(DBParameter.pos_wl_37,v35);
    		subInitial(DBParameter.pos_wl_37,v36);
    		subInitial(DBParameter.pos_wl_37,v37);
    		subInitial(DBParameter.pos_wl_37,v38);
    		subInitial(DBParameter.pos_wl_37,v39);
    		subInitial(DBParameter.pos_wl_37,v40);
    		subInitial(DBParameter.pos_wl_37,v41);
    		subInitial(DBParameter.pos_wl_37,v42);
    		subInitial(DBParameter.pos_wl_37,v43);
    		
    		subInitial(DBParameter.pos_wl_37,v45);
    		subInitial(DBParameter.pos_wl_37,v46);
    		subInitial(DBParameter.pos_wl_37,v47);
    		subInitial(DBParameter.pos_wl_37,v48);
    		subInitial(DBParameter.pos_wl_37,v49);
    		subInitial(DBParameter.pos_wl_37,v50);
    		
    		subInitial(DBParameter.pos_wl_37,v51);
    		subInitial(DBParameter.pos_wl_37,v52);
    		subInitial(DBParameter.pos_wl_37,v53);
    		subInitial(DBParameter.pos_wl_37,v54);
    		subInitial(DBParameter.pos_wl_37,v55);
    		subInitial(DBParameter.pos_wl_37,v56);
    		subInitial(DBParameter.pos_wl_37,v57);
    		subInitial(DBParameter.pos_wl_37,v58);
    		subInitial(DBParameter.pos_wl_37,v59);
    		subInitial(DBParameter.pos_wl_37,v60);
    		subInitial(DBParameter.pos_wl_37,v61);
    		subInitial(DBParameter.pos_wl_37,v62);
    		subInitial(DBParameter.pos_wl_37,v63);
    		subInitial(DBParameter.pos_wl_37,v64);
    		subInitial(DBParameter.pos_wl_37,v65);
    		subInitial(DBParameter.pos_wl_37,v66);
    		subInitial(DBParameter.pos_wl_37,v67);
    		subInitial(DBParameter.pos_wl_37,v68);
    		subInitial(DBParameter.pos_wl_37,v69);
    		subInitial(DBParameter.pos_wl_37,v70);
    		subInitial(DBParameter.pos_wl_37,v71);
    		subInitial(DBParameter.pos_wl_37,v72);
    		subInitial(DBParameter.pos_wl_37,v73);
    		subInitial(DBParameter.pos_wl_37,v74);
    		subInitial(DBParameter.pos_wl_37,v75);
    		subInitial(DBParameter.pos_wl_37,v76);
    		subInitial(DBParameter.pos_wl_37,v77);
    		subInitial(DBParameter.pos_wl_37,v78);
    		subInitial(DBParameter.pos_wl_37,v79);
    		subInitial(DBParameter.pos_wl_37,v80);
    		subInitial(DBParameter.pos_wl_37,v81);
    		subInitial(DBParameter.pos_wl_37,v82);
    		subInitial(DBParameter.pos_wl_37,v83);
    		subInitial(DBParameter.pos_wl_37,v84);
    		subInitial(DBParameter.pos_wl_37,v85);
    		subInitial(DBParameter.pos_wl_37,v86);
    		subInitial(DBParameter.pos_wl_37,v87);
    		subInitial(DBParameter.pos_wl_37,v88);
    		subInitial(DBParameter.pos_wl_37,v89);
    		subInitial(DBParameter.pos_wl_37,v90);
    		subInitial(DBParameter.pos_wl_37,v91);
    		subInitial(DBParameter.pos_wl_37,v92);
    		subInitial(DBParameter.pos_wl_37,v93);
    		subInitial(DBParameter.pos_wl_37,v94);
    		subInitial(DBParameter.pos_wl_37,v95);
    		subInitial(DBParameter.pos_wl_37,v96);
    		subInitial(DBParameter.pos_wl_37,v97);
    		subInitial(DBParameter.pos_wl_37,v98);
    		subInitial(DBParameter.pos_wl_37,v99);
    		subInitial(DBParameter.pos_wl_37,v100);
    		subInitial(DBParameter.pos_wl_37,v101);
    		subInitial(DBParameter.pos_wl_37,v102);
    		subInitial(DBParameter.pos_wl_37,v103);
    		subInitial(DBParameter.pos_wl_37,v104);
    		subInitial(DBParameter.pos_wl_37,v105);
    		subInitial(DBParameter.pos_wl_37,v106);
    		subInitial(DBParameter.pos_wl_37,v107);
    		subInitial(DBParameter.pos_wl_37,v108);
    		subInitial(DBParameter.pos_wl_37,v109);
    		subInitial(DBParameter.pos_wl_37,v110);
    		subInitial(DBParameter.pos_wl_37,v111);
    		subInitial(DBParameter.pos_wl_37,v112);
    		subInitial(DBParameter.pos_wl_37,v113);
    		subInitial(DBParameter.pos_wl_37,v114);
    		subInitial(DBParameter.pos_wl_37,v115);
    		subInitial(DBParameter.pos_wl_37,v116);
    		subInitial(DBParameter.pos_wl_37,v117);
    		subInitial(DBParameter.pos_wl_37,v118);
    		
    		subInitial(DBParameter.pos_wl_37,v119);
    		subInitial(DBParameter.pos_wl_37,v120);
    		subInitial(DBParameter.pos_wl_37,v1202);
    		subInitial(DBParameter.pos_wl_37,v121);
    		subInitial(DBParameter.pos_wl_37,v122);
    		subInitial(DBParameter.pos_wl_37,v123);
    		subInitial(DBParameter.pos_wl_37,v124);
    		subInitial(DBParameter.pos_wl_37,v125);
    		subInitial(DBParameter.pos_wl_37,v126);
    		subInitial(DBParameter.pos_wl_37,v127);
    		subInitial(DBParameter.pos_wl_37,v128);
    		subInitial(DBParameter.pos_wl_37,v129);
    		subInitial(DBParameter.pos_wl_37,v130);
    		subInitial(DBParameter.pos_wl_37,v131);
    		subInitial(DBParameter.pos_wl_37,v132);
    		subInitial(DBParameter.pos_wl_37,v133);
    		subInitial(DBParameter.pos_wl_37,v134);
    		subInitial(DBParameter.pos_wl_37,v135);
    		subInitial(DBParameter.pos_wl_37,v136);
    		subInitial(DBParameter.pos_wl_37,v137);
    		subInitial(DBParameter.pos_wl_37,v138);
    		subInitial(DBParameter.pos_wl_37,v139);
    		subInitial(DBParameter.pos_wl_37,v140);
    		subInitial(DBParameter.pos_wl_37,v141);
    		subInitial(DBParameter.pos_wl_37,v142);
    		subInitial(DBParameter.pos_wl_37,v143);
    		subInitial(DBParameter.pos_wl_37,v144);
    		subInitial(DBParameter.pos_wl_37,v145);
    		subInitial(DBParameter.pos_wl_37,v146);
    		subInitial(DBParameter.pos_wl_37,v147);
    		subInitial(DBParameter.pos_wl_37,v148);
    		subInitial(DBParameter.pos_wl_37,v149);
    		subInitial(DBParameter.pos_wl_37,v150);
    		subInitial(DBParameter.pos_wl_37,v151);
    		subInitial(DBParameter.pos_wl_37,v152);
    		subInitial(DBParameter.pos_wl_37,v153);
    		subInitial(DBParameter.pos_wl_37,v154);
    		subInitial(DBParameter.pos_wl_37,v155);
    		subInitial(DBParameter.pos_wl_37,v156);
    		subInitial(DBParameter.pos_wl_37,v157);
    		subInitial(DBParameter.pos_wl_37,v158);
    		subInitial(DBParameter.pos_wl_37,v159);
    		subInitial(DBParameter.pos_wl_37,v160);
    		subInitial(DBParameter.pos_wl_37,v161);
    		subInitial(DBParameter.pos_wl_37,v162);
    		subInitial(DBParameter.pos_wl_37,v163);
    		subInitial(DBParameter.pos_wl_37,v164);
    		subInitial(DBParameter.pos_wl_37,v165);
    		subInitial(DBParameter.pos_wl_37,v166);
    		subInitial(DBParameter.pos_wl_37,v167);
    		subInitial(DBParameter.pos_wl_37,v168);
    		subInitial(DBParameter.pos_wl_37,v169);
    	
        	
    	
    }
    public void doList_38(){
    	
    	
    	
    	String[] v1={"unwitting","���ĵģ��������",a,"0"};
    	String[] v2={"unwonted","��Ѱ���ģ���ϰ�ߵ�",a,"0"};
    	String[] v3={"unworldly","�����׵ģ������ϵ�",a,"0"};
    	String[] v4={"upbraid","��������",v,"0"};
    	String[] v5={"upgrade","��������...����",v,"0"};
    	String[] v6={"upheaval","���ң���䶯",n,"0"};
    	String[] v7={"uphold","ά����֧��",v,"0"};
    	String[] v8={"upright","��ֱ�ģ���ֱ��",a,"0"};
    	String[] v9={"uproar","���֣�ɧ��",n,"0"};
    	String[] v10={"uproarious","ɧ���ģ������ģ�����������",a,"0"};
    	String[] v11={"upstage","�����ģ��߰���",a,"0"};
    	String[] v12={"upswing","����������",n,"0"};
    	String[] v13={"urgent","���еģ�������",a,"0"};
    	String[] v14={"usurp","�۶ᣬ��ռ",v,"0"};
    	String[] v15={"usury","������",n,"0"};
    	String[] v16={"utilitarian","������",a,"0"};
    	String[] v17={"utilize","���ã�ʹ��",v,"0"};
    	String[] v18={"utopia","���а�����",n,"0"};
    	String[] v19={"utopian","���а�ʽ��",a,"0"};
    	String[] v20={"utter","��ȫ�ģ���������",a+v,"0"};
    	String[] v21={"vaccinate","��...��������",v,"0"};
    	String[] v22={"vaccine","ţ���磬����",n,"0"};
    	String[] v23={"vaccillate","���Ʋ��������",v,"0"};
    	String[] v24={"vacuous","������",a,"0"};
    	String[] v25={"vagary","���룬�����쿪",n,"0"};
    	String[] v26={"vagrancy","�ε�������",n,"0"};
    	String[] v27={"vagrant","Ư���ģ����˺�������",a+n,"0"};
    	String[] v28={"vague","ģ����",a,"0"};
    	String[] v29={"vain","�Ը��ģ�ͽ�͵�",a,"0"};
    	String[] v30={"valediction","�����˵",n,"0"};
    	String[] v31={"valedictory","����",a,"0"};
    	String[] v32={"valiant","�¸ҵ�",a,"0"};
    	String[] v33={"validate","ʹ...��Ч",v,"0"};
    	String[] v34={"valorous","�¸ҵ�",a,"0"};
    	String[] v35={"valve","����",n,"0"};
    	String[] v36={"vandalism","�����ƻ�(����)",n,"0"};
    	String[] v37={"vandalize","�����ƻ�",v,"0"};
    	String[] v38={"vanilla","���",n,"0"};
    	String[] v39={"vanity","���٣��Ը�",n,"0"};
    	String[] v40={"vanquish","����",v,"0"};
    	String[] v41={"vantage","���ƣ�������λ",n,"0"};
    	String[] v42={"vapid","��Ȼ��ζ��",a,"0"};
    	String[] v43={"vaporization","����",n,"0"};
    	String[] v44={"vaporize","(ʹ)����",v,"0"};
    	String[] v45={"vaporous","��ʵ�ʵ�",a,"0"};
    	String[] v46={"variance","ì�ܣ���ͬ",n,"0"};
    	String[] v47={"variegate","ʹ...������",v,"0"};
    	String[] v48={"variegation","��ɫ���߲�",n,"0"};
    	String[] v49={"varnish","���᣻������",n+v,"0"};
    	String[] v50={"vascular","Ѫ�ܵ�",a,"0"};
    	String[] v51={"vault","�������ؽ�",n,"0"};
        String[] v52={"veer","ת�򣬸ı�(�����)",v,"0"};
        String[] v53={"vehicle","��ͨ���ߣ�����ý��",n,"0"};
        String[] v54={"veil","��ɴ���ڱ������ɴ�ڱ�",n+v,"0"};
        String[] v55={"velocity","�ٶȣ�Ѹ��",n,"0"};
        String[] v56={"venal","Ψ����ͼ�ģ�̰��������",a,"0"};
        String[] v57={"vendetta","������Թ",n,"0"};
        String[] v58={"vendor","С��",n,"0"};
        String[] v59={"veneer","����壬���",n,"0"};
        String[] v60={"venerate","�羴������",v,"0"};		
    	String[] v61={"vengeance","���𣬱���",n,"0"};
        String[] v62={"vengeful","�����ģ����������",a,"0"};
       	String[] v63={"venial","��΢�ģ���ԭ�µ�(����)",a,"0"};
       	String[] v64={"venom","��Һ���񶾣�ʹ��",n,"0"};
       	String[] v65={"vent","��й�����ף���",v+n,"0"};
       	String[] v66={"ventilate","ʹ...ͨ��",v,"0"};
        String[] v67={"ventriloquist","�ڼ�������",n,"0"};
        String[] v68={"veracious","��ʵ��",a,"0"};
        String[] v69={"veracity","��ʵ�ԣ���ʵ",n,"0"};
        String[] v70={"verbal","��ͷ�ģ����Դ��йص�",a,"0"};
    	String[] v71={"verbiage","���£��߳�",n,"0"};
        String[] v72={"verbose","�߳���",a,"0"};
       	String[] v73={"verdant","��еģ����̵�",a,"0"};
       	String[] v74={"verdict","�о�������",n,"0"};
       	String[] v75={"verdigris","ͭ�⣬ͭ��",n,"0"};
        String[] v76={"verified","����ģ���ʵ��",a,"0"};
        String[] v77={"verify","֤����֤ʵ",v,"0"};
        String[] v78={"verisimilar","������ʵ�ģ����ܵ�",a,"0"};
        String[] v79={"veritable","ȷʵ�ģ�������ʵ��",a,"0"};
        String[] v80={"vernacular","������ط���",n,"0"};
    	String[] v81={"versatile","��Ŷ��յģ�����;��",a,"0"};
        String[] v82={"verse","ʫ��",n,"0"};
        String[] v83={"vertex","(����ͼ�ε�)����",n,"0"};
        String[] v84={"vertical","��ֱ��",a,"0"};
        String[] v85={"vertigo","ѣ��",n,"0"};
        String[] v86={"verve","���ϣ�����",n,"0"};
        String[] v87={"vessel","Ѫ�ܣ���������ֻ",n,"0"};
        String[] v88={"vestige","�ۼ����ż�",n,"0"};
        String[] v89={"vestigial","�˻���",a,"0"};
        String[] v90={"vestment","���£��ٷ�",n,"0"};
        String[] v91={"veteran","�ϱ������֣�����ḻ��",n+a,"0"};
        String[] v92={"veterinary","��ҽ��",a,"0"};
        String[] v93={"veto","�������ֹ",n,"0"};
        String[] v94={"vex","�ջ�",v,"0"};
        String[] v95={"vexation","���ţ�����",n,"0"};
        String[] v96={"viability","���������������",n,"0"};
        String[] v97={"viable","���еģ��ܻ���ȥ��",a,"0"};
        String[] v98={"viaduct","�߼���",n,"0"};
        String[] v99={"vibrancy","��������������",n,"0"};
        String[] v100={"vibrant","�񶯵ģ�����ģ�����������",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"vibrate","��������",v,"0"};
        	String[] v102={"vicar","������ʦ",n,"0"};
        	String[] v103={"vicarious","����ģ������",a,"0"};
        	String[] v104={"vicinity","�������ӽ�",n,"0"};
        	String[] v105={"vicious","�п�ģ����͵ģ����ӵ�",a,"0"};
        	String[] v106={"vicissitudinous","�б仯�ģ���Ǩ��",a,"0"};
        	String[] v107={"victimize","ʹ�ܺ����Ⱥ�",v,"0"};
        	String[] v108={"vie","����",v,"0"};
        	String[] v109={"vigilant","�����ģ������",a,"0"};
        	String[] v110={"vigorous","������ʢ�ģ���׳��",a,"0"};
        	String[] v111={"vile","���ӵģ����ɵ�",a,"0"};
        	String[] v112={"vilify","����̰�",v,"0"};
        	String[] v113={"vindicate","Ϊ...ƽ����֤��...��ȷ",v,"0"};
        	String[] v114={"vindictive","�����Ե�",a,"0"};
        	String[] v115={"vintner","����",n,"0"};
        	String[] v116={"violate","Υ��������",v,"0"};
        	String[] v117={"violet","������ɫ�ģ�������",a+n,"0"};
        	String[] v118={"viral","�����Ե�",a,"0"};
        	String[] v119={"virtual","ʵ���ϵ�",a,"0"};
        	String[] v120={"virtuosity","��տ���߳�",n,"0"};
        	String[] v121={"virtuoso","���վ�տ����",n,"0"};
        	String[] v122={"virtuous","�����µģ�������ߵ�",a,"0"};
        	String[] v123={"virulent","�綾�ģ��񶾵�",a,"0"};
        	String[] v124={"virus","����",n,"0"};
        	String[] v125={"viscid","��Ե�",a,"0"};
        	String[] v126={"viscous","��",a,"0"};
        	String[] v127={"visionary","��Զ���ģ�����ģ������",a+n,"0"};
        	String[] v128={"vista","Զ����չ��",n,"0"};
        	String[] v129={"vital","������Ҫ�ģ�����������",a,"0"};
        	String[] v130={"vitalize","��������",v,"0"};
        	String[] v131={"vitiate","��������",v,"0"};
        	String[] v132={"vitrify","ʹ�ɲ���",v,"0"};
        	String[] v133={"vitriolic","�̱���",a,"0"};
        	String[] v134={"vituperate","ʹ�⣬����",v,"0"};
        	String[] v135={"vituperative","�����",a,"0"};
        	String[] v136={"vivacious","���õģ�����",a,"0"};
        	String[] v137={"vivid","�����ģ����޵ģ��󵨵ģ����õģ������",a,"0"};
        	String[] v138={"vocalist","���и��֣����ּ�",n,"0"};
        	String[] v139={"vocation","�ó���ְҵ",n,"0"};
        	String[] v140={"vogue","����(��)",n+a,"0"};
        	String[] v141={"void","�յģ�ȱ���ģ���϶�������",a+n,"0"};
        	String[] v142={"volatile","�����޳��ģ��ӷ��Ե�",a,"0"};
        	String[] v143={"volition","����������־",n,"0"};
        	String[] v144={"volley","�뷢��Ⱥ��",n+v,"0"};
        	String[] v145={"voluble","��̸�ģ�����ת��",a,"0"};
        	String[] v146={"voluminous","��ƪ�ģ������",a,"0"};
        	String[] v147={"voluptuous","���˵ģ������ھ�ɫ��",a,"0"};
        	String[] v148={"voracious","���̻��ʵģ�̰����",a,"0"};
        	String[] v149={"voracity","̰��",n,"0"};
        	String[] v150={"votary","����ߣ�����֧����",n,"0"};
        	String[] v151={"vouch","������֤��",v,"0"};
        	String[] v152={"vulgar","�޽�����",a,"0"};
        	String[] v153={"vulnerable","���ܹ�����",a,"0"};
        	String[] v154={"vulture","ͺ��",n,"0"};
        	String[] v155={"vying","������",a,"0"};
        	String[] v156={"waddle","(Ѽ�ӵ�)ҡҡ�ڰڵ���",v,"0"};
        	String[] v157={"waffle","���̺������������߶",n+v,"0"};
        	String[] v158={"waft","Ʈ��",v,"0"};
        	String[] v159={"wag","(��β��)�ڶ�����Ĭ����",v+n,"0"};
        	String[] v160={"wage","��ʼ������(ս�����˶�)",v,"0"};
        	String[] v161={"waggish","ڶг��",a,"0"};
        	String[] v162={"walrus","����",n,"0"};
        	String[] v163={"wan","�����ģ���̬��",a,"0"};
        	String[] v164={"wanderlust","����񱣬������",n,"0"};
        	String[] v165={"wane","���٣�˥΢",v,"0"};
        	String[] v166={"want","ȱ������Ҫ",n,"0"};
        	String[] v167={"wardrobe","�³���ȫ����װ",n,"0"};
        	String[] v168={"warehouse","�ֿ⣬��ջ",n,"0"};
        	String[] v169={"warmonger","��ս�ߣ�ս������",n,"0"};
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	subInitial(DBParameter.pos_wl_38,v1);
    		subInitial(DBParameter.pos_wl_38,v2);
    		subInitial(DBParameter.pos_wl_38,v3);
    		subInitial(DBParameter.pos_wl_38,v4);
    		subInitial(DBParameter.pos_wl_38,v5);
    		subInitial(DBParameter.pos_wl_38,v6);
    		subInitial(DBParameter.pos_wl_38,v7);
    		subInitial(DBParameter.pos_wl_38,v8);
    		subInitial(DBParameter.pos_wl_38,v9);
    		subInitial(DBParameter.pos_wl_38,v10);
    		subInitial(DBParameter.pos_wl_38,v11);
    		subInitial(DBParameter.pos_wl_38,v12);
    		subInitial(DBParameter.pos_wl_38,v13);
    		subInitial(DBParameter.pos_wl_38,v14);
    		subInitial(DBParameter.pos_wl_38,v15);
    		subInitial(DBParameter.pos_wl_38,v16);
    		subInitial(DBParameter.pos_wl_38,v17);
    		subInitial(DBParameter.pos_wl_38,v18);
    		subInitial(DBParameter.pos_wl_38,v19);
    		subInitial(DBParameter.pos_wl_38,v20);
    		subInitial(DBParameter.pos_wl_38,v21);
    		subInitial(DBParameter.pos_wl_38,v22);
    		subInitial(DBParameter.pos_wl_38,v23);
    		subInitial(DBParameter.pos_wl_38,v24);
    		subInitial(DBParameter.pos_wl_38,v25);
    		subInitial(DBParameter.pos_wl_38,v26);
    		subInitial(DBParameter.pos_wl_38,v27);
    		subInitial(DBParameter.pos_wl_38,v28);
    		subInitial(DBParameter.pos_wl_38,v29);
    		subInitial(DBParameter.pos_wl_38,v30);
    		subInitial(DBParameter.pos_wl_38,v31);
    		subInitial(DBParameter.pos_wl_38,v32);
    		subInitial(DBParameter.pos_wl_38,v33);
    		subInitial(DBParameter.pos_wl_38,v34);
    		subInitial(DBParameter.pos_wl_38,v35);
    		subInitial(DBParameter.pos_wl_38,v36);
    		subInitial(DBParameter.pos_wl_38,v37);
    		subInitial(DBParameter.pos_wl_38,v38);
    		subInitial(DBParameter.pos_wl_38,v39);
    		subInitial(DBParameter.pos_wl_38,v40);
    		subInitial(DBParameter.pos_wl_38,v41);
    		subInitial(DBParameter.pos_wl_38,v42);
    		subInitial(DBParameter.pos_wl_38,v43);
    		subInitial(DBParameter.pos_wl_38,v44);
    		subInitial(DBParameter.pos_wl_38,v45);
    		subInitial(DBParameter.pos_wl_38,v46);
    		subInitial(DBParameter.pos_wl_38,v47);
    		subInitial(DBParameter.pos_wl_38,v48);
    		subInitial(DBParameter.pos_wl_38,v49);
    		subInitial(DBParameter.pos_wl_38,v50);
    		
    		subInitial(DBParameter.pos_wl_38,v51);
    		subInitial(DBParameter.pos_wl_38,v52);
    		subInitial(DBParameter.pos_wl_38,v53);
    		subInitial(DBParameter.pos_wl_38,v54);
    		subInitial(DBParameter.pos_wl_38,v55);
    		subInitial(DBParameter.pos_wl_38,v56);
    		subInitial(DBParameter.pos_wl_38,v57);
    		subInitial(DBParameter.pos_wl_38,v58);
    		subInitial(DBParameter.pos_wl_38,v59);
    		subInitial(DBParameter.pos_wl_38,v60);
    		subInitial(DBParameter.pos_wl_38,v61);
    		subInitial(DBParameter.pos_wl_38,v62);
    		subInitial(DBParameter.pos_wl_38,v63);
    		subInitial(DBParameter.pos_wl_38,v64);
    		subInitial(DBParameter.pos_wl_38,v65);
    		subInitial(DBParameter.pos_wl_38,v66);
    		subInitial(DBParameter.pos_wl_38,v67);
    		subInitial(DBParameter.pos_wl_38,v68);
    		subInitial(DBParameter.pos_wl_38,v69);
    		subInitial(DBParameter.pos_wl_38,v70);
    		subInitial(DBParameter.pos_wl_38,v71);
    		subInitial(DBParameter.pos_wl_38,v72);
    		subInitial(DBParameter.pos_wl_38,v73);
    		subInitial(DBParameter.pos_wl_38,v74);
    		subInitial(DBParameter.pos_wl_38,v75);
    		subInitial(DBParameter.pos_wl_38,v76);
    		subInitial(DBParameter.pos_wl_38,v77);
    		subInitial(DBParameter.pos_wl_38,v78);
    		subInitial(DBParameter.pos_wl_38,v79);
    		subInitial(DBParameter.pos_wl_38,v80);
    		subInitial(DBParameter.pos_wl_38,v81);
    		subInitial(DBParameter.pos_wl_38,v82);
    		subInitial(DBParameter.pos_wl_38,v83);
    		subInitial(DBParameter.pos_wl_38,v84);
    		subInitial(DBParameter.pos_wl_38,v85);
    		subInitial(DBParameter.pos_wl_38,v86);
    		subInitial(DBParameter.pos_wl_38,v87);
    		subInitial(DBParameter.pos_wl_38,v88);
    		subInitial(DBParameter.pos_wl_38,v89);
    		subInitial(DBParameter.pos_wl_38,v90);
    		subInitial(DBParameter.pos_wl_38,v91);
    		subInitial(DBParameter.pos_wl_38,v92);
    		subInitial(DBParameter.pos_wl_38,v93);
    		subInitial(DBParameter.pos_wl_38,v94);
    		subInitial(DBParameter.pos_wl_38,v95);
    		subInitial(DBParameter.pos_wl_38,v96);
    		subInitial(DBParameter.pos_wl_38,v97);
    		subInitial(DBParameter.pos_wl_38,v98);
    		subInitial(DBParameter.pos_wl_38,v99);
    		subInitial(DBParameter.pos_wl_38,v100);
    		subInitial(DBParameter.pos_wl_38,v101);
    		subInitial(DBParameter.pos_wl_38,v102);
    		subInitial(DBParameter.pos_wl_38,v103);
    		subInitial(DBParameter.pos_wl_38,v104);
    		subInitial(DBParameter.pos_wl_38,v105);
    		subInitial(DBParameter.pos_wl_38,v106);
    		subInitial(DBParameter.pos_wl_38,v107);
    		subInitial(DBParameter.pos_wl_38,v108);
    		subInitial(DBParameter.pos_wl_38,v109);
    		subInitial(DBParameter.pos_wl_38,v110);
    		subInitial(DBParameter.pos_wl_38,v111);
    		subInitial(DBParameter.pos_wl_38,v112);
    		subInitial(DBParameter.pos_wl_38,v113);
    		subInitial(DBParameter.pos_wl_38,v114);
    		subInitial(DBParameter.pos_wl_38,v115);
    		subInitial(DBParameter.pos_wl_38,v116);
    		subInitial(DBParameter.pos_wl_38,v117);
    		subInitial(DBParameter.pos_wl_38,v118);
    		
    		subInitial(DBParameter.pos_wl_38,v119);
    		subInitial(DBParameter.pos_wl_38,v120);
    		subInitial(DBParameter.pos_wl_38,v121);
    		subInitial(DBParameter.pos_wl_38,v122);
    		subInitial(DBParameter.pos_wl_38,v123);
    		subInitial(DBParameter.pos_wl_38,v124);
    		subInitial(DBParameter.pos_wl_38,v125);
    		subInitial(DBParameter.pos_wl_38,v126);
    		subInitial(DBParameter.pos_wl_38,v127);
    		subInitial(DBParameter.pos_wl_38,v128);
    		subInitial(DBParameter.pos_wl_38,v129);
    		subInitial(DBParameter.pos_wl_38,v130);
    		subInitial(DBParameter.pos_wl_38,v131);
    		subInitial(DBParameter.pos_wl_38,v132);
    		subInitial(DBParameter.pos_wl_38,v133);
    		subInitial(DBParameter.pos_wl_38,v134);
    		subInitial(DBParameter.pos_wl_38,v135);
    		subInitial(DBParameter.pos_wl_38,v136);
    		subInitial(DBParameter.pos_wl_38,v137);
    		subInitial(DBParameter.pos_wl_38,v138);
    		subInitial(DBParameter.pos_wl_38,v139);
    		subInitial(DBParameter.pos_wl_38,v140);
    		subInitial(DBParameter.pos_wl_38,v141);
    		subInitial(DBParameter.pos_wl_38,v142);
    		subInitial(DBParameter.pos_wl_38,v143);
    		subInitial(DBParameter.pos_wl_38,v144);
    		subInitial(DBParameter.pos_wl_38,v145);
    		subInitial(DBParameter.pos_wl_38,v146);
    		subInitial(DBParameter.pos_wl_38,v147);
    		subInitial(DBParameter.pos_wl_38,v148);
    		subInitial(DBParameter.pos_wl_38,v149);
    		subInitial(DBParameter.pos_wl_38,v150);
    		subInitial(DBParameter.pos_wl_38,v151);
    		subInitial(DBParameter.pos_wl_38,v152);
    		subInitial(DBParameter.pos_wl_38,v153);
    		subInitial(DBParameter.pos_wl_38,v154);
    		subInitial(DBParameter.pos_wl_38,v155);
    		subInitial(DBParameter.pos_wl_38,v156);
    		subInitial(DBParameter.pos_wl_38,v157);
    		subInitial(DBParameter.pos_wl_38,v158);
    		subInitial(DBParameter.pos_wl_38,v159);
    		subInitial(DBParameter.pos_wl_38,v160);
    		subInitial(DBParameter.pos_wl_38,v161);
    		subInitial(DBParameter.pos_wl_38,v162);
    		subInitial(DBParameter.pos_wl_38,v163);
    		subInitial(DBParameter.pos_wl_38,v164);
    		subInitial(DBParameter.pos_wl_38,v165);
    		subInitial(DBParameter.pos_wl_38,v166);
    		subInitial(DBParameter.pos_wl_38,v167);
    		subInitial(DBParameter.pos_wl_38,v168);
    		subInitial(DBParameter.pos_wl_38,v169);
  
    	
    }
    public void doList_39(){
    	
    	
    	String[] v1={"warp","��������",n+v,"0"};
    	String[] v2={"warrant","�������ɣ����֤",n,"0"};
    	String[] v3={"warranted","��֤�ģ�ƾ�������ɵ�",a,"0"};
    	String[] v4={"warranty","��֤����⣬���������ɣ���׼",n,"0"};
    	String[] v5={"wary","�����ģ�С�������",a,"0"};
    	String[] v6={"waste","ʹ�������ݣ����",v,"0"};
    	String[] v7={"wastrel","�ӻ��޶ȵ���",n,"0"};
    	String[] v8={"watershed","��ˮ�룬ת�۵�",n,"0"};
    	String[] v9={"waver","ҡ�ڣ���ԥ",v,"0"};
    	String[] v10={"wax","������...����������",n+v,"0"};
    	String[] v11={"wean","���̣����",v,"0"};
    	String[] v12={"wearisome","ʹ��ƣ��ġ�ʹ������",a,"0"};
    	String[] v13={"weary","ƣ�͵ģ�ʹ�����ģ��ᷳ",a+v,"0"};
    	String[] v14={"weasel","�����ǣ��ӱ�",n+v,"0"};
    	String[] v15={"weather","����ס��ƽ���ɹ�Σ��",v,"0"};
    	String[] v16={"weed","�Ӳݣ�����",n+v,"0"};
    	String[] v17={"weld","���ӣ����",v,"0"};
    	String[] v18={"well-groomed","�ǳ������",a,"0"};
    	String[] v19={"welter","���ң���������",n,"0"};
    	String[] v20={"wheedle","��ƭ",v,"0"};
    	String[] v21={"whet","ĥ�죬�̼�",v,"0"};
    	String[] v22={"whiff","�ᴵ�����",v+n,"0"};
    	String[] v23={"whim","���ţ�����ͷ",n,"0"};
    	String[] v24={"whimsical","�Źֵģ������쿪��",a,"0"};
    	String[] v25={"whimsy","�Ź֣������쿪",n,"0"};
    	String[] v26={"whine","����",v,"0"};
    	String[] v27={"whirlpool","����",n,"0"};
    	String[] v28={"whisper","������Ļ�",v,"0"};
    	String[] v29={"whistle","����,����������������������",n+v,"0"};
    	String[] v30={"whittle","��(ľͷ)������",v,"0"};
    	String[] v31={"wholesome","�ٽ�������",a,"0"};
    	String[] v32={"wick","����о����о",n,"0"};
    	String[] v33={"wicked","�����ģ�������",a,"0"};
    	String[] v34={"wield","֧�䣬��Ȩ",v,"0"};
    	String[] v35={"willful","���Եģ������",a,"0"};
    	String[] v36={"willow","����",n,"0"};
    	String[] v37={"willowy","������",a,"0"};
    	String[] v38={"wilt","ʹ...��л����ή",v,"0"};
    	String[] v39={"wily","�ƻ���",a,"0"};
    	String[] v40={"wince","�ܿ���η��",v,"0"};
    	String[] v41={"windbag","����֮��",n,"0"};
    	String[] v42={"winding","���ѵģ��ػص�",a,"0"};
    	String[] v43={"windy","�з�ģ���ƪ��빵�",a,"0"};
    	String[] v44={"wink","ʹ��ɫ��գ��",v+n,"0"};
    	String[] v45={"winnow","��(�����)����ȥ��,��ȥ",v,"0"};
    	String[] v46={"winsome","���˵ģ�Ư����",a,"0"};
    	String[] v47={"wistful","���ģ�������",a,"0"};
    	String[] v48={"wit","����������",n,"0"};
    	String[] v49={"withdraw","���ˣ��ջأ�����",v,"0"};
    	String[] v50={"wither","��ή������",v,"0"};
    	String[] v51={"withhold","����������",v,"0"};
        String[] v52={"withstand","��ס������ס",v,"0"};
        String[] v53={"witness","Ŀ���ߣ�Ŀ��",n+v,"0"};
        String[] v54={"witticism","�����Ƥ��",n,"0"};
        String[] v55={"wizened","�����",a,"0"};
        String[] v56={"wobble","��ҡ����ԥ",v,"0"};
        String[] v57={"woe","��ʹ������",n,"0"};
        String[] v58={"woo","��(Ů��)�󰮣���ȡ...��֧��",v,"0"};
        String[] v59={"worship","��ݣ�����",v+n,"0"};
        String[] v60={"wrangler","�ڽ��ߣ������ߣ�������",n,"0"};		
    	String[] v61={"wrench","Ť��š������",v+n,"0"};
        String[] v62={"wretched","������",a,"0"};
       	String[] v63={"wrinkle","���ƣ�����",n,"0"};
       	String[] v64={"wrist","����ؽ�",n,"0"};
       	String[] v65={"writ","����״����������",n,"0"};
       	String[] v66={"wrought","���ɵģ�������",a,"0"};
        String[] v67={"wry","Ť���ģ��䳰����Ĭ��",a,"0"};
        String[] v68={"xenophobe","������",n,"0"};
        String[] v69={"xerophyte","����ֲ��",n,"0"};
        String[] v70={"yacht","��������ͧ",n,"0"};
    	String[] v71={"yarn","ɴ��",n,"0"};
        String[] v72={"yawn","���Ƿ",v,"0"};
       	String[] v73={"yearn","����������",v,"0"};
       	String[] v74={"yeast","��ĸ���˷�",n,"0"};
       	String[] v75={"yielding","��������ģ���˳��",a,"0"};
        String[] v76={"yoke","ţ���...������",n+v,"0"};
        String[] v77={"yokel","�����",n,"0"};
        String[] v78={"zealotry","������Ϊ",n,"0"};
        String[] v79={"zenith","�춥������",n,"0"};
        String[] v80={"zephyr","�ͷ磬����",n,"0"};
    	String[] v81={"zest","�̼��ԣ����ģ���Ȥ",n,"0"};
        String[] v82={"zigzag","֮����(��)(�н�)",n+a+v,"0"};
        String[] v83={"zone","�ֳ���",v,"0"};
        
        
        
        
        
        subInitial(DBParameter.pos_wl_39,v1);
		subInitial(DBParameter.pos_wl_39,v2);
		subInitial(DBParameter.pos_wl_39,v3);
		subInitial(DBParameter.pos_wl_39,v4);
		subInitial(DBParameter.pos_wl_39,v5);
		subInitial(DBParameter.pos_wl_39,v6);
		subInitial(DBParameter.pos_wl_39,v7);
		subInitial(DBParameter.pos_wl_39,v8);
		subInitial(DBParameter.pos_wl_39,v9);
		subInitial(DBParameter.pos_wl_39,v10);
		subInitial(DBParameter.pos_wl_39,v11);
		subInitial(DBParameter.pos_wl_39,v12);
		subInitial(DBParameter.pos_wl_39,v13);
		subInitial(DBParameter.pos_wl_39,v14);
		subInitial(DBParameter.pos_wl_39,v15);
		subInitial(DBParameter.pos_wl_39,v16);
		subInitial(DBParameter.pos_wl_39,v17);
		subInitial(DBParameter.pos_wl_39,v18);
		subInitial(DBParameter.pos_wl_39,v19);
		subInitial(DBParameter.pos_wl_39,v20);
		subInitial(DBParameter.pos_wl_39,v21);
		subInitial(DBParameter.pos_wl_39,v22);
		subInitial(DBParameter.pos_wl_39,v23);
		subInitial(DBParameter.pos_wl_39,v24);
		subInitial(DBParameter.pos_wl_39,v25);
		subInitial(DBParameter.pos_wl_39,v26);
		subInitial(DBParameter.pos_wl_39,v27);
		subInitial(DBParameter.pos_wl_39,v28);
		subInitial(DBParameter.pos_wl_39,v29);
		subInitial(DBParameter.pos_wl_39,v30);
		subInitial(DBParameter.pos_wl_39,v31);
		subInitial(DBParameter.pos_wl_39,v32);
		subInitial(DBParameter.pos_wl_39,v33);
		subInitial(DBParameter.pos_wl_39,v34);
		subInitial(DBParameter.pos_wl_39,v35);
		subInitial(DBParameter.pos_wl_39,v36);
		subInitial(DBParameter.pos_wl_39,v37);
		subInitial(DBParameter.pos_wl_39,v38);
		subInitial(DBParameter.pos_wl_39,v39);
		subInitial(DBParameter.pos_wl_39,v40);
		subInitial(DBParameter.pos_wl_39,v41);
		subInitial(DBParameter.pos_wl_39,v42);
		subInitial(DBParameter.pos_wl_39,v43);
		subInitial(DBParameter.pos_wl_39,v44);
		subInitial(DBParameter.pos_wl_39,v45);
		subInitial(DBParameter.pos_wl_39,v46);
		subInitial(DBParameter.pos_wl_39,v47);
		subInitial(DBParameter.pos_wl_39,v48);
		subInitial(DBParameter.pos_wl_39,v49);
		subInitial(DBParameter.pos_wl_39,v50);
		
		subInitial(DBParameter.pos_wl_39,v51);
		subInitial(DBParameter.pos_wl_39,v52);
		subInitial(DBParameter.pos_wl_39,v53);
		subInitial(DBParameter.pos_wl_39,v54);
		subInitial(DBParameter.pos_wl_39,v55);
		subInitial(DBParameter.pos_wl_39,v56);
		subInitial(DBParameter.pos_wl_39,v57);
		subInitial(DBParameter.pos_wl_39,v58);
		subInitial(DBParameter.pos_wl_39,v59);
		subInitial(DBParameter.pos_wl_39,v60);
		subInitial(DBParameter.pos_wl_39,v61);
		subInitial(DBParameter.pos_wl_39,v62);
		subInitial(DBParameter.pos_wl_39,v63);
		subInitial(DBParameter.pos_wl_39,v64);
		subInitial(DBParameter.pos_wl_39,v65);
		subInitial(DBParameter.pos_wl_39,v66);
		subInitial(DBParameter.pos_wl_39,v67);
		subInitial(DBParameter.pos_wl_39,v68);
		subInitial(DBParameter.pos_wl_39,v69);
		subInitial(DBParameter.pos_wl_39,v70);
		subInitial(DBParameter.pos_wl_39,v71);
		subInitial(DBParameter.pos_wl_39,v72);
		subInitial(DBParameter.pos_wl_39,v73);
		subInitial(DBParameter.pos_wl_39,v74);
		subInitial(DBParameter.pos_wl_39,v75);
		subInitial(DBParameter.pos_wl_39,v76);
		subInitial(DBParameter.pos_wl_39,v77);
		subInitial(DBParameter.pos_wl_39,v78);
		subInitial(DBParameter.pos_wl_39,v79);
		subInitial(DBParameter.pos_wl_39,v80);
		subInitial(DBParameter.pos_wl_39,v81);
		subInitial(DBParameter.pos_wl_39,v82);
		subInitial(DBParameter.pos_wl_39,v83);
	
    	
    }

    
    
    
    
    
    public void doList_40(){
    	
    	String[] v1={"abase","�����Լ������֣�ʹ����","v.","0"};
    	String[] v2={"abduct","��ܣ�����","v.","0"};
    	String[] v3={"abnegation","��������������","n.","0"};
    	String[] v4={"aboriginal","ԭʼ��������","n.","0"};
    	String[] v5={"abortive","�޽����ʧ�ܵ�","adj.","0"};
    	String[] v6={"abound","����","v.","0"};
    	String[] v7={"abrupt","ͻȻ�ģ�����ģ���ͻ��","adj.","0"};
    	String[] v8={"abstinent","��ʳ�жȵģ��н��Ƶģ�������","adj.","0"};
    	String[] v9={"acarpous","�����ʵ��","n.","0"};
    	String[] v10={"acerbity","ɬ���ᣬ�̱�","n.","0"};
    	String[] v11={"achromatic","�ǲ�ɫ�ģ���ɫ��","adj.","0"};
    	String[] v12={"acronym","����ĸ���Դ�","n.","0"};
    	
    	String[] v13={"actuarial","�����գ�����ģ����ռ����","adj.","0"};
    	String[] v14={"actuate","��ʹ������","v.","0"};
    	String[] v15={"addle","ʹ������ʹ����","v.","0"};

    	String[] v16={"adduce","���裨���ɣ�","v.","0"};
    	String[] v17={"adjudicate","�䵱����","v.","0"};
    	String[] v18={"adlib","��ʱ���������˱���","v.","0"};


    	String[] v19={"advert","ע�⣬����","v.","0"};
    	String[] v20={"aeronautics","����ѧ","n.","0"};
    	String[] v21={"aftermath","�¼��ĺ�����ನ","n.","0"};

    	String[] v22={"agape","���죩�����ŵ�","adv./adj.","0"};
    	String[] v23={"aghast","�����ģ��Ŵ���","adj.","0"};
    	String[] v24={"ailment","(�����ص�)����","n.","0"};

    	String[] v25={"albino","�׻����ߣ��׻�����","n.","0"};
    	String[] v26={"alliterate","Ѻͷ��","v.","0"};
    	String[] v27={"almond","����������","n.","0"};


    	String[] v28={"alms","ʩ����ȼ�Ʒ","n.","0"};
    	String[] v29={"ambience","����������","n.","0"};
    	String[] v30={"ambrosial","����ģ��ر���ζ��","adj.","0"};

    	String[] v31={"ambulatory","�������ڣ����е�","adj.","0"};
    	String[] v32={"amethyst","��ˮ��","n.","0"};
    	String[] v33={"amiss","��ë���أ�������","adv.","0"};

    	String[] v34={"amoral","������޹ص�","adj.","0"};
    	String[] v35={"amputate","��֫","v.","0"};
    	String[] v36={"anemic","ƶѪ�ģ���ƶѪ֢��","adj.","0"};

    	String[] v37={"anodyne","ֹʹҩ","n.","0"};
    	String[] v38={"antedote","�����ţ��ļ��ϣ�д�Ͻ������ڣ�����","v.","0"};
    	String[] v39={"anthropoid","�������","adj.","0"};
    	String[] v40={"anthropoid","����Գ","n.","0"};

    	String[] v41={"aperture","��϶��խ��ȱ��","n.","0"};
    	String[] v42={"apothegm","���ԣ�����","n.","0"};
    	String[] v43={"aptheosis","�񻯣��䷶","n.","0"};

    	String[] v44={"appendage","������","n.","0"};
    	String[] v45={"aquiline","ӥ�ģ���ӥ��","adj.","0"};
    	String[] v46={"arachnid","֩�����֫����","n.","0"};

    	String[] v47={"aracher","�����֣�����","n.","0"};
    	String[] v47_2={"arraign","��Ѷ��ָ��","n.","0"};
    	String[] v48={"artillery","����","n.","0"};

    	String[] v49={"asinine","�ޱ���","adj.","0"};
    	String[] v50={"askance","��Ŀ���ӣ��","v.","0"};
    	String[] v51={"askew","��б��","adj.","0"};

    	String[] v52={"asphyxia","��Ϣ","n.","0"};
    	String[] v53={"astigmatic","ɢ��ģ����ӵ�","adj.","0"};
    	String[] v54={"atheism","�����ۣ�������","n.","0"};


    	String[] v55={"atone","�������","v.","0"};
    	String[] v56={"attire","����","v.","0"};
    	String[] v57={"attrition","Ħ����ĥ��","n.","0"};

    	String[] v58={"auger","��˿�꣬��׻�","n.","0"};
    	String[] v59={"augmentation","����","n.","0"};
    	String[] v60={"auricular","����","adj.","0"};

    	String[] v61={"automation","�Զ�װ��","n.","0"};
    	String[] v62={"avowal","����","n.","0"};
    	String[] v63={"avuncular","������","adj.","0"};

    	String[] v64={"azure","����ɫ��ε����","adj./n.","0"};
    	String[] v65={"bacchanall","�񻶻�","n.","0"};
    	String[] v66={"backslide","��̬����","v.","0"};


    	String[] v67={"backwater","��ˮ","n.","0"};
    	String[] v68={"baffle","ʹ�Ի��ѵ�","v.","0"};
    	String[] v69={"balky","ֹͣ��ǰ�ģ���ǿ��","adj.","0"};

    	String[] v70={"bamboozle","��ƭ������","v.","0"};
    	String[] v71={"bandy","������������̸��","v.","0"};
    	String[] v72={"baron","����","adj.","0"};


    	String[] v73={"barrister","������ʦ","n.","0"};
    	String[] v74={"bassoon","�����ܣ����ɹ�","n.","0"};
    	String[] v75={"bather","��ԡ�ߣ�ԡ����","n.","0"};

    	String[] v76={"bauble","���ڵ�С�������û��ֵ�Ķ���","n.","0"};
    	String[] v77={"bawl","��У���","v.","0"};
    	String[] v78={"beatific","ף���ģ����ֵ�","adj.","0"};

    	String[] v79={"beckon","�ٻ�ĳ�ˣ�ʾ��","v.","0"};
    	String[] v80={"bedizen","��...װ�ε�����������","v.","0"};
    	String[] v81={"bedraggled","Ūʪ�ģ����Ҳ�����","adj.","0"};

    	String[] v82={"beet","���","n.","0"};
    	String[] v83={"befuddle","ʹ�Ի�ʹΪ�ѣ�ʹ��ƻ���","v.","0"};
    	String[] v84={"beget","����������","v.","0"};

    	String[] v85={"beguile","��ƭ����ƭ","v.","0"};
    	String[] v86={"behold","Ŀ�ã�����","v.","0"};
    	String[] v87={"beholden","�м�ĳ�˵ģ�Ƿ�����","adj.","0"};

    	String[] v88={"belch","���ã���ɽ�緢","n./v.","0"};
    	String[] v89={"belongings","������Ʋ�","n.","0"};
    	String[] v90={"bemused","ãȻ�ģ������","adj.","0"};
    	
    	String[] v91={"bereave","ɥ�ף���ȥ","v.","0"};
    	String[] v92={"berserk","��ŭ�ģ�����","adj.","0"};
    	String[] v93={"betoken","Ԥʾ����ʾ","v.","0"};

    	String[] v94={"bibulous","�߶����յ�","adj.","0"};
    	String[] v95={"biennial","����һ�ε�","adj.","0"};
    	String[] v96={"bilious","��֭�ʵģ���Ƣ����","adj.","0"};

    	String[] v97={"billow","���ˣ�����","n./v.","0"};
    	String[] v98={"blackball","Ͷ����Ʊ����ֹ","v.","0"};
    	String[] v99={"blare","��������","v.","0"};

    	String[] v100={"blase","������ֵģ���Į��","adj.","0"};
    	String[] v101={"blackball","Ͷ����Ʊ����ֹ","v.","0"};
    	String[] v102={"blare","��������","v.","0"};

    	String[] v103={"bleachers","¶����λ","n.","0"};
    	String[] v104={"bloated","���͵�","adj.","0"};
    	String[] v105={"blossom","��������","n./v.","0"};

    	String[] v106={"bludgeon","��ͷ��","n.","0"};
    	String[] v107={"bluff","�������ƣ������ͱ�","n.","0"};
    	String[] v108={"bode","Ԥʾ","v.","0"};

    	String[] v109={"boding","���ף�ǰ�ף�Ԥ��","n.","0"};
    	String[] v110={"bohemian","�ŵ���ģ��ˣ�","adj./n.","0"};
    	String[] v111={"bombardment","��ը���ں�","n.","0"};

    	String[] v112={"bonhomie","�����飬�ºͣ��Ͱ�","n.","0"};
    	String[] v113={"boo","���������꣨ĳ�ˣ�����������ʾ����","v.","0"};
    	String[] v114={"botch","Ū��ĳ��","v.","0"};

    	String[] v115={"bottleneck","ƿ���ڣ���ͨ������������","n.","0"};
    	String[] v116={"bough","�ִ����֦������","n.","0"};
    	String[] v117={"bounteous","�����ģ��ḻ��","adj.","0"};
    	
    	String[] v118={"bovine","ţ�ģ��ٶ۵�","adj.","0"};
    	String[] v119={"bowdlerize","ɾ����ɾ��","v.","0"};
    	String[] v120={"bower","��ͤ������������֮��","n.","0"};

    	String[] v121={"brackish","��ָˮ�����̵�","adj.","0"};
    	String[] v122={"brattish","����ģ��軵�ģ�����ò��","adj.","0"};
    	String[] v123={"brawny","���ˣ�ǿ׳��","adj.","0"};

    	String[] v124={"bray","�������̶��ط���","v.","0"};
    	String[] v125={"breezeway","���ݶ���ͨ·","n.","0"};
    	String[] v126={"brim","�������ߣ�Ե","n.","0"};
    		
    	String[] v127={"brindled","����ɫ���Ƶ�","adj.","0"};
    	String[] v128={"brocade","֯��","n.","0"};
    	String[] v129={"broil","�տ�","v.","0"};
    	
    	String[] v130={"brooch","����","n.","0"};
    	String[] v131={"browse","���۲ݻ�Ҷ���������ѿ","v./n.","0"};
    	
    	
    	
			subInitial(DBParameter.pos_wl_40,v1);
			subInitial(DBParameter.pos_wl_40,v2);
			subInitial(DBParameter.pos_wl_40,v3);
			subInitial(DBParameter.pos_wl_40,v4);
			subInitial(DBParameter.pos_wl_40,v5);
			subInitial(DBParameter.pos_wl_40,v6);
			subInitial(DBParameter.pos_wl_40,v7);
			subInitial(DBParameter.pos_wl_40,v8);
			subInitial(DBParameter.pos_wl_40,v9);
			subInitial(DBParameter.pos_wl_40,v10);
			subInitial(DBParameter.pos_wl_40,v11);
			subInitial(DBParameter.pos_wl_40,v12);
			subInitial(DBParameter.pos_wl_40,v13);
			subInitial(DBParameter.pos_wl_40,v14);
			subInitial(DBParameter.pos_wl_40,v15);
			subInitial(DBParameter.pos_wl_40,v16);
			subInitial(DBParameter.pos_wl_40,v17);
			subInitial(DBParameter.pos_wl_40,v18);
			subInitial(DBParameter.pos_wl_40,v19);
			subInitial(DBParameter.pos_wl_40,v20);
			subInitial(DBParameter.pos_wl_40,v21);
			subInitial(DBParameter.pos_wl_40,v22);
			subInitial(DBParameter.pos_wl_40,v23);
			subInitial(DBParameter.pos_wl_40,v24);
			subInitial(DBParameter.pos_wl_40,v25);
			subInitial(DBParameter.pos_wl_40,v26);
			subInitial(DBParameter.pos_wl_40,v27);
			subInitial(DBParameter.pos_wl_40,v28);
			subInitial(DBParameter.pos_wl_40,v29);
			subInitial(DBParameter.pos_wl_40,v30);
			subInitial(DBParameter.pos_wl_40,v31);
			subInitial(DBParameter.pos_wl_40,v32);
			subInitial(DBParameter.pos_wl_40,v33);
			subInitial(DBParameter.pos_wl_40,v34);
			subInitial(DBParameter.pos_wl_40,v35);
			subInitial(DBParameter.pos_wl_40,v36);
			subInitial(DBParameter.pos_wl_40,v37);
			subInitial(DBParameter.pos_wl_40,v38);
			subInitial(DBParameter.pos_wl_40,v39);
			subInitial(DBParameter.pos_wl_40,v40);
			subInitial(DBParameter.pos_wl_40,v41);
			subInitial(DBParameter.pos_wl_40,v42);
			subInitial(DBParameter.pos_wl_40,v43);
			subInitial(DBParameter.pos_wl_40,v44);
			subInitial(DBParameter.pos_wl_40,v45);
			subInitial(DBParameter.pos_wl_40,v46);
			subInitial(DBParameter.pos_wl_40,v47);
			subInitial(DBParameter.pos_wl_40,v47_2);
			subInitial(DBParameter.pos_wl_40,v48);
			subInitial(DBParameter.pos_wl_40,v49);
			subInitial(DBParameter.pos_wl_40,v50);
			
			subInitial(DBParameter.pos_wl_40,v51);
			subInitial(DBParameter.pos_wl_40,v52);
			subInitial(DBParameter.pos_wl_40,v53);
			subInitial(DBParameter.pos_wl_40,v54);
			subInitial(DBParameter.pos_wl_40,v55);
			subInitial(DBParameter.pos_wl_40,v56);
			subInitial(DBParameter.pos_wl_40,v57);
			subInitial(DBParameter.pos_wl_40,v58);
			subInitial(DBParameter.pos_wl_40,v59);
			subInitial(DBParameter.pos_wl_40,v60);
			subInitial(DBParameter.pos_wl_40,v61);
			subInitial(DBParameter.pos_wl_40,v62);
			subInitial(DBParameter.pos_wl_40,v63);
			subInitial(DBParameter.pos_wl_40,v64);
			subInitial(DBParameter.pos_wl_40,v65);
			subInitial(DBParameter.pos_wl_40,v66);
			subInitial(DBParameter.pos_wl_40,v67);
			subInitial(DBParameter.pos_wl_40,v68);
			subInitial(DBParameter.pos_wl_40,v69);
			subInitial(DBParameter.pos_wl_40,v70);
			subInitial(DBParameter.pos_wl_40,v71);
			subInitial(DBParameter.pos_wl_40,v72);
			subInitial(DBParameter.pos_wl_40,v73);
			subInitial(DBParameter.pos_wl_40,v74);
			subInitial(DBParameter.pos_wl_40,v75);
			subInitial(DBParameter.pos_wl_40,v76);
			subInitial(DBParameter.pos_wl_40,v77);
			subInitial(DBParameter.pos_wl_40,v78);
			subInitial(DBParameter.pos_wl_40,v79);
			subInitial(DBParameter.pos_wl_40,v80);
			subInitial(DBParameter.pos_wl_40,v81);
			subInitial(DBParameter.pos_wl_40,v82);
			subInitial(DBParameter.pos_wl_40,v83);
			subInitial(DBParameter.pos_wl_40,v84);
			subInitial(DBParameter.pos_wl_40,v85);
			subInitial(DBParameter.pos_wl_40,v86);
			subInitial(DBParameter.pos_wl_40,v87);
			subInitial(DBParameter.pos_wl_40,v88);
			subInitial(DBParameter.pos_wl_40,v89);
			subInitial(DBParameter.pos_wl_40,v90);
			subInitial(DBParameter.pos_wl_40,v91);
			subInitial(DBParameter.pos_wl_40,v92);
			subInitial(DBParameter.pos_wl_40,v93);
			subInitial(DBParameter.pos_wl_40,v94);
			subInitial(DBParameter.pos_wl_40,v95);
			subInitial(DBParameter.pos_wl_40,v96);
			subInitial(DBParameter.pos_wl_40,v97);
			subInitial(DBParameter.pos_wl_40,v98);
			subInitial(DBParameter.pos_wl_40,v99);
			subInitial(DBParameter.pos_wl_40,v100);
			subInitial(DBParameter.pos_wl_40,v101);
			subInitial(DBParameter.pos_wl_40,v102);
			subInitial(DBParameter.pos_wl_40,v103);
			subInitial(DBParameter.pos_wl_40,v104);
			subInitial(DBParameter.pos_wl_40,v105);
			subInitial(DBParameter.pos_wl_40,v106);
			subInitial(DBParameter.pos_wl_40,v107);
			subInitial(DBParameter.pos_wl_40,v108);
			subInitial(DBParameter.pos_wl_40,v109);
			subInitial(DBParameter.pos_wl_40,v110);
			subInitial(DBParameter.pos_wl_40,v111);
			subInitial(DBParameter.pos_wl_40,v112);
			subInitial(DBParameter.pos_wl_40,v113);
			subInitial(DBParameter.pos_wl_40,v114);
			subInitial(DBParameter.pos_wl_40,v115);
			subInitial(DBParameter.pos_wl_40,v116);
			subInitial(DBParameter.pos_wl_40,v117);
			subInitial(DBParameter.pos_wl_40,v118);
			
			subInitial(DBParameter.pos_wl_40,v119);
			subInitial(DBParameter.pos_wl_40,v120);
			subInitial(DBParameter.pos_wl_40,v121);
			subInitial(DBParameter.pos_wl_40,v122);
			subInitial(DBParameter.pos_wl_40,v123);
			subInitial(DBParameter.pos_wl_40,v124);
			subInitial(DBParameter.pos_wl_40,v125);
			subInitial(DBParameter.pos_wl_40,v126);
			subInitial(DBParameter.pos_wl_40,v127);
			subInitial(DBParameter.pos_wl_40,v128);
			subInitial(DBParameter.pos_wl_40,v129);
			subInitial(DBParameter.pos_wl_40,v130);
			subInitial(DBParameter.pos_wl_40,v131);
	
    	
    	
    	

    }
    public void doList_41(){
    	
    	String[] v1={"bubble","���ݣ����ݣ�ˮ��","v./n.","0"};
    	String[] v2={"buckle","Ƥ���ۻ����۽�","n./v.","0"};
    	String[] v3={"buffer","���壬Ϊ...�䵱������","v.","0"};
    	
    	String[] v4={"bugaboo","���˵Ķ���������","n.","0"};
    	String[] v5={"buggy","��������Ӥ����","n.","0"};
    	String[] v6={"bullion","����������","n.","0"};

    	String[] v7={"bumble","˵��������׾�ӵ���","v.","0"};
    	String[] v8={"bump","��ײ����ײ��","v./n.","0"};
    	String[] v9={"burrow","�ھ��������Ѱ���ض�","v./n.","0"};

    	String[] v10={"buxom","��̬������","adj.","0"};
    	String[] v11={"cachet","��ͬ�ı�־����Խ�ı�־","n.","0"};
    	String[] v12={"cactus","������","n.","0"};

    	String[] v13={"cadaver","ʬ��","n.","0"};
    	String[] v14={"cadence","����ٴ죬���࣬����","n.","0"};
    	String[] v15={"calibre","��ǹ�ȣ��ھ������˻��£�Ʒ�£�����","n.","0"};

    	String[] v16={"callus","�ϼ�","n.","0"};
    	String[] v17={"canard","ҥ�ԣ�������","n.","0"};
    	String[] v18={"canker","���񲡣�����","n.","0"};

    	String[] v19={"cantata","�峪�磬��ϳ�","n.","0"};
    	String[] v20={"capacious","������ģ�����","adj.","0"};
    	String[] v21={"caper","ȸԾ������","n./v","0"};

    	String[] v22={"capitalize","�ʱ���������������","v.","0"};
    	String[] v23={"capitation","��ͷ˰","n.","0"};
    	String[] v24={"capsize","ʹ����","v.","0"};

    	String[] v25={"carat","����","n.","0"};
    	String[] v26={"careen","��б��ʹ��б","n./v.","0"};
    	String[] v27={"carnage","����ɱ","n.","0"};

    	String[] v28={"carpentry","ľ������","n.","0"};
    	String[] v29={"cascade","С�ٲ�","n.","0"};
    	String[] v30={"cautionary","Ȱ�˽����ģ������","adj.","0"};

    	String[] v31={"cavalcade","�������","n.","0"};
    	String[] v32={"celerity","���٣�Ѹ��","n.","0"};
    	String[] v33={"celibate","�����ߣ�������","n./adj.","0"};

    	String[] v34={"cemetery","��Ĺ����Ĺ","n.","0"};
    	String[] v35={"centrifugal","���ĵ�","adj.","0"};
    	String[] v36={"centripetal","���ĵ�","adj.","0"};

    	String[] v37={"cephalic","ͷ���ģ�ͷ��","adj.","0"};
    	String[] v38={"chasten","������ĥ��","v.","0"};
    	String[] v39={"checkered","ʢ˥�޳���","adj.","0"};

    	String[] v40={"chic","Ư���ģ�ʱ�ֵ�","adj.","0"};
    	String[] v41={"chirp","�����","v.","0"};
    	String[] v42={"chore","�������£�����Ĺ���","n.","0"};

    	String[] v43={"chortle","���ĵ�Ц","adv.","0"};
    	String[] v44={"chunk","�̺��״�����","n.","0"};
    	String[] v45={"ciliate","����ë�ģ��н�ë��","adj.","0"};

    	String[] v46={"cineaste","Ӱ�ԣ������ڵ�Ӱ����","n.","0"};
    	String[] v47={"circumlocutory","ί�����۵ģ��ػص�","adj.","0"};
    	String[] v48={"citation","��֤�������ģ���Ʊ","n.","0"};

    	String[] v49={"clairvoyant","͸�ӵ�","adj.","0"};
    	String[] v50={"clench","�ս���ҧ��","v.","0"};
    	String[] v51={"cliche","�¸���","adj.","0"};

    	String[] v52={"closed-minded","��ǿ�ģ���̵�","adj.","0"};
    	String[] v53={"closure","�رգ���ֹ","n.","0"};
    	String[] v54={"cloy","������ʳ�����壬����","v.","0"};
    	
    	String[] v55={"coffer","���չ�","n.","0"};
    	String[] v56={"cognate","ͬ��Դ�ģ�ͬ���","adj.","0"};
    	String[] v57={"cognomen","���������˵ģ��գ�����","n.","0"};
    	
    	String[] v58={"colloquy","������ʽ�ģ���̸����̸","n.","0"};
    	String[] v59={"colt","С�۾ԣ�����","n.","0"};
    	String[] v60={"comestible","ʳ�ʳƷ","n.","0"};

    	String[] v61={"commiserate","ͬ�飬����","v.","0"};
    	String[] v62={"complexion","��ɫ���������","n.","0"};
    	String[] v63={"complicity","��ı����ͨ","n.","0"};

    	String[] v64={"comport","��ֹ","v.","0"};
    	String[] v65={"compulsory","ǿ���Եģ������Ե�","adj.","0"};
    	String[] v66={"concentric","��ָ����Բ����ͬһ���ĵ�","adj.","0"};

    	String[] v67={"concoct","���ƣ�����","v.","0"};
    	String[] v68={"condign","����Ӧ�õģ����˵�","adj.","0"};
    	String[] v69={"condiment","��ζƷ������","n.","0"};

    	String[] v671={"condole","��...��ο","v.","0"};
    	String[] v681={"condor","ͺӥ����ӥ","n.","0"};
    	String[] v691={"confidant","�ĸ����ѣ�֪��������","n.","0"};

    	String[] v672={"congential","�����ȣ�����ģ�������","adj.","0"};
    	String[] v682={"conjugal","�����ģ�����֮���","adj.","0"};
    	String[] v692={"connubial","�����ģ����޵�","adj.","0"};

    	String[] v70={"consecrate","�������룬�׸���ʹ��ʥ","v.","0"};
    	String[] v71={"consonance","һ�£����ͣ�����","n.","0"};
    	String[] v72={"consort","�ύ����ԣ���ż","v./n.","0"};

    	String[] v73={"conspectus","ժҪ�����","n.","0"};
    	String[] v74={"constringe","ʹ���� ","v.","0"};
    	String[] v75={"contumacy","������������","n.","0"};

    	String[] v76={"contumely","���񣬰���","n.","0"};
    	String[] v77={"convene","���ϣ��ټ� ","v.","0"};
    	String[] v78={"convoy","����������","v.","0"};

    	String[] v79={"contumely","���񣬰���","n.","0"};
    	String[] v80={"convene","���ϣ��ټ� ","v.","0"};
    	String[] v81={"convoy","����������","v.","0"};

    	String[] v82={"cordial","�ȳϵģ��˷ܼ�","adj./n.","0"};
    	String[] v83={"cornet","�̺ţ�Բ׶�ε���","n.","0"};
    	String[] v84={"corny","ƽ������ģ�����е�","adj.","0"};

    	String[] v85={"corporal","����ģ������","adj.","0"};
    	String[] v86={"corpulent","���ֵ�","adj.","0"};
    	String[] v87={"corpus","ȫ����ȫ������","n.","0"};

    	String[] v88={"coruscate","����","v.","0"};
    	String[] v89={"cosy","��ů�����ʵ�","adj.","0"};
    	String[] v90={"counterpoise","ƽ����ƽ��","n./v.","0"};

    	String[] v91={"coven","Ů�׵ļ���","n.","0"};
    	String[] v92={"crafty","��թ�ģ�������","adj.","0"};
    	String[] v93={"crag","���£��ͱ�","n.","0"};

    	String[] v94={"credo","����","n.","0"};
    	String[] v95={"crepuscular","���ʵģ�΢����","adj.","0"};
    	String[] v96={"crevice","ȱ�ڣ��ѷ�","n.","0"};

    	String[] v97={"crinkle","ʹ����","v.","0"};
    	String[] v98={"cripple","���ӣ�ʹ�з�","n./v.","0"};
    	String[] v99={"croon","�����質","v.","0"};

    	String[] v100={"crotchety","Ƣ������","adj.","0"};
    	String[] v101={"crypt","�����ң��ؽ�","n.","0"};
    	String[] v102={"cuddle","§����ӵ��","n./v.","0"};

    	String[] v103={"cuff","���","n.","0"};
    	String[] v104={"culprit","������","n.","0"};
    	String[] v105={"cumber","���ۣ�����","n.","0"};

    	String[] v106={"curd","����","n.","0"};
    	String[] v107={"curfew","����","n.","0"};
    	String[] v108={"currish","�¼��ģ����ֵ�","adj.","0"};

    	String[] v109={"cursive","�����","adj.","0"};
    	String[] v110={"curvaceous","��ȶ��˵ģ����ߵ�","adj.","0"};
    	String[] v111={"cygnet","С���","n.","0"};

    	String[] v112={"cynosure","ע��Ľ���","n.","0"};
    	String[] v113={"dalliance","��ȹ���������","n.","0"};
    	String[] v114={"damn","������������Ǵ��","v.","0"};

    	String[] v115={"damper","���������õ����أ�����բ������װ��","n.","0"};
    	String[] v116={"dangle","ҡ�ڣ�����������δ��","v.","0"};
    	String[] v117={"dank","��ʪ�ģ������","adj.","0"};

    	String[] v118={"dastard","ų�򣬵�С����","n.","0"};
    	String[] v119={"daub","ͿĨ","v.","0"};
    	String[] v120={"daubster","׾�ӵĻ���","n.","0"};

    	String[] v121={"daze","ʹãȻ","v.","0"};
    	String[] v122={"debar","��ֹ","v.","0"};
    	String[] v123={"debility","˥��������","n.","0"};

    	String[] v124={"debonair","���˵ģ��Ѻõ�","adj.","0"};
    	String[] v125={"decamp","��ʿ������Ӫ����æ�����ܵ��뿪","v.","0"};
    	String[] v126={"decant","���ɵ���","v.","0"};
    	String[] v127={"decentralize","��ɢ��Ȩ���·�","v.","0"};
    	
    	
    	
    	
    	
    	
    	subInitial(DBParameter.pos_wl_41,v1);
		subInitial(DBParameter.pos_wl_41,v2);
		subInitial(DBParameter.pos_wl_41,v3);
		subInitial(DBParameter.pos_wl_41,v4);
		subInitial(DBParameter.pos_wl_41,v5);
		subInitial(DBParameter.pos_wl_41,v6);
		subInitial(DBParameter.pos_wl_41,v7);
		subInitial(DBParameter.pos_wl_41,v8);
		subInitial(DBParameter.pos_wl_41,v9);
		subInitial(DBParameter.pos_wl_41,v10);
		subInitial(DBParameter.pos_wl_41,v11);
		subInitial(DBParameter.pos_wl_41,v12);
		subInitial(DBParameter.pos_wl_41,v13);
		subInitial(DBParameter.pos_wl_41,v14);
		subInitial(DBParameter.pos_wl_41,v15);
		subInitial(DBParameter.pos_wl_41,v16);
		subInitial(DBParameter.pos_wl_41,v17);
		subInitial(DBParameter.pos_wl_41,v18);
		subInitial(DBParameter.pos_wl_41,v19);
		subInitial(DBParameter.pos_wl_41,v20);
		subInitial(DBParameter.pos_wl_41,v21);
		subInitial(DBParameter.pos_wl_41,v22);
		subInitial(DBParameter.pos_wl_41,v23);
		subInitial(DBParameter.pos_wl_41,v24);
		subInitial(DBParameter.pos_wl_41,v25);
		subInitial(DBParameter.pos_wl_41,v26);
		subInitial(DBParameter.pos_wl_41,v27);
		subInitial(DBParameter.pos_wl_41,v28);
		subInitial(DBParameter.pos_wl_41,v29);
		subInitial(DBParameter.pos_wl_41,v30);
		subInitial(DBParameter.pos_wl_41,v31);
		subInitial(DBParameter.pos_wl_41,v32);
		subInitial(DBParameter.pos_wl_41,v33);
		subInitial(DBParameter.pos_wl_41,v34);
		subInitial(DBParameter.pos_wl_41,v35);
		subInitial(DBParameter.pos_wl_41,v36);
		subInitial(DBParameter.pos_wl_41,v37);
		subInitial(DBParameter.pos_wl_41,v38);
		subInitial(DBParameter.pos_wl_41,v39);
		subInitial(DBParameter.pos_wl_41,v40);
		subInitial(DBParameter.pos_wl_41,v41);
		subInitial(DBParameter.pos_wl_41,v42);
		subInitial(DBParameter.pos_wl_41,v43);
		subInitial(DBParameter.pos_wl_41,v44);
		subInitial(DBParameter.pos_wl_41,v45);
		subInitial(DBParameter.pos_wl_41,v46);
		subInitial(DBParameter.pos_wl_41,v47);
		subInitial(DBParameter.pos_wl_41,v48);
		subInitial(DBParameter.pos_wl_41,v49);
		subInitial(DBParameter.pos_wl_41,v50);
		
		subInitial(DBParameter.pos_wl_41,v51);
		subInitial(DBParameter.pos_wl_41,v52);
		subInitial(DBParameter.pos_wl_41,v53);
		subInitial(DBParameter.pos_wl_41,v54);
		subInitial(DBParameter.pos_wl_41,v55);
		subInitial(DBParameter.pos_wl_41,v56);
		subInitial(DBParameter.pos_wl_41,v57);
		subInitial(DBParameter.pos_wl_41,v58);
		subInitial(DBParameter.pos_wl_41,v59);
		subInitial(DBParameter.pos_wl_41,v60);
		subInitial(DBParameter.pos_wl_41,v61);
		subInitial(DBParameter.pos_wl_41,v62);
		subInitial(DBParameter.pos_wl_41,v63);
		subInitial(DBParameter.pos_wl_41,v64);
		subInitial(DBParameter.pos_wl_41,v65);
		subInitial(DBParameter.pos_wl_41,v66);
		subInitial(DBParameter.pos_wl_41,v67);
		subInitial(DBParameter.pos_wl_41,v68);
		subInitial(DBParameter.pos_wl_41,v69);
		
		subInitial(DBParameter.pos_wl_41,v671);
		subInitial(DBParameter.pos_wl_41,v681);
		subInitial(DBParameter.pos_wl_41,v691);
		
		subInitial(DBParameter.pos_wl_41,v672);
		subInitial(DBParameter.pos_wl_41,v682);
		subInitial(DBParameter.pos_wl_41,v692);
		
		subInitial(DBParameter.pos_wl_41,v70);
		subInitial(DBParameter.pos_wl_41,v71);
		subInitial(DBParameter.pos_wl_41,v72);
		subInitial(DBParameter.pos_wl_41,v73);
		subInitial(DBParameter.pos_wl_41,v74);
		subInitial(DBParameter.pos_wl_41,v75);
		subInitial(DBParameter.pos_wl_41,v76);
		subInitial(DBParameter.pos_wl_41,v77);
		subInitial(DBParameter.pos_wl_41,v78);
		subInitial(DBParameter.pos_wl_41,v79);
		subInitial(DBParameter.pos_wl_41,v80);
		subInitial(DBParameter.pos_wl_41,v81);
		subInitial(DBParameter.pos_wl_41,v82);
		subInitial(DBParameter.pos_wl_41,v83);
		subInitial(DBParameter.pos_wl_41,v84);
		subInitial(DBParameter.pos_wl_41,v85);
		subInitial(DBParameter.pos_wl_41,v86);
		subInitial(DBParameter.pos_wl_41,v87);
		subInitial(DBParameter.pos_wl_41,v88);
		subInitial(DBParameter.pos_wl_41,v89);
		subInitial(DBParameter.pos_wl_41,v90);
		subInitial(DBParameter.pos_wl_41,v91);
		subInitial(DBParameter.pos_wl_41,v92);
		subInitial(DBParameter.pos_wl_41,v93);
		subInitial(DBParameter.pos_wl_41,v94);
		subInitial(DBParameter.pos_wl_41,v95);
		subInitial(DBParameter.pos_wl_41,v96);
		subInitial(DBParameter.pos_wl_41,v97);
		subInitial(DBParameter.pos_wl_41,v98);
		subInitial(DBParameter.pos_wl_41,v99);
		subInitial(DBParameter.pos_wl_41,v100);
		subInitial(DBParameter.pos_wl_41,v101);
		subInitial(DBParameter.pos_wl_41,v102);
		subInitial(DBParameter.pos_wl_41,v103);
		subInitial(DBParameter.pos_wl_41,v104);
		subInitial(DBParameter.pos_wl_41,v105);
		subInitial(DBParameter.pos_wl_41,v106);
		subInitial(DBParameter.pos_wl_41,v107);
		subInitial(DBParameter.pos_wl_41,v108);
		subInitial(DBParameter.pos_wl_41,v109);
		subInitial(DBParameter.pos_wl_41,v110);
		subInitial(DBParameter.pos_wl_41,v111);
		subInitial(DBParameter.pos_wl_41,v112);
		subInitial(DBParameter.pos_wl_41,v113);
		subInitial(DBParameter.pos_wl_41,v114);
		subInitial(DBParameter.pos_wl_41,v115);
		subInitial(DBParameter.pos_wl_41,v116);
		subInitial(DBParameter.pos_wl_41,v117);
		subInitial(DBParameter.pos_wl_41,v118);
		
		subInitial(DBParameter.pos_wl_41,v119);
		subInitial(DBParameter.pos_wl_41,v120);
		subInitial(DBParameter.pos_wl_41,v121);
		subInitial(DBParameter.pos_wl_41,v122);
		subInitial(DBParameter.pos_wl_41,v123);
		subInitial(DBParameter.pos_wl_41,v124);
		subInitial(DBParameter.pos_wl_41,v125);
		subInitial(DBParameter.pos_wl_41,v126);
		subInitial(DBParameter.pos_wl_41,v127);
		

    	
    }
    public void doList_42(){
    	
    	String[] v1={"declassify","��������","v.","0"};
    	String[] v2={"declination","��б��˥΢","n.","0"};
    	String[] v3={"decoy","��ƭ","v.","0"};
    	String[] v4={"decree","�������䲼����","n./v.","0"};

    	String[] v5={"defalcate","���ù���","v.","0"};
    	String[] v6={"defame","�̰�������","v.","0"};
    	String[] v7={"defoliant","��Ҷ��","n.","0"};
    	String[] v8={"defoliate","ʹ...��Ҷ��","v.","0"};

    	String[] v9={"deforest","�ɷ�ɭ��","v.","0"};
    	String[] v10={"defray","����","v.","0"};
    	String[] v11={"defunct","������","adj.","0"};
    	String[] v12={"delectation","���ܣ����","n.","0"};

    	String[] v13={"demarcate","���֣�����","v.","0"};
    	String[] v14={"demeanour","��Ϊ����ֹ","n.","0"};
    	String[] v15={"demented","����","adj.","0"};
    	String[] v16={"demure","����ģ���ֵ�","adj.","0"};

    	String[] v17={"denominate","����","v.","0"};
    	String[] v18={"denunciate","����ָ�𣬹�Ȼ�����Ǵ��","v.","0"};
    	String[] v19={"deportment","��ȣ���ֹ","n.","0"};
    	String[] v20={"deposit","��ţ�ʹ����","v.","0"};

    	String[] v21={"depredatoion","�Ӷᣬ����","n.","0"};
    	String[] v22={"depressant","�������ã��򾲼�","v./n.","0"};
    	String[] v23={"depute","��...Ϊ��������","v.","0"};
    	String[] v24={"deputize","����ĳ�����»�˵��","v.","0"};

    	String[] v25={"derangement","�������","n.","0"};
    	String[] v26={"desalinize","��ȥ�η�","v.","0"};
    	String[] v27={"desideratum","����Ʒ","n.","0"};
    	String[] v28={"designate","ָ����ָ����������ָ��","v.","0"};

    	String[] v29={"desirous","������","adj.","0"};
    	String[] v30={"desolate","�����ģ���������","adj.","0"};
    	String[] v31={"desperado","����֮ͽ","n.","0"};
    	String[] v32={"despoil","��ȡ������","v.","0"};

    	String[] v33={"destitute","ƶ���ģ�������","adj.","0"};
    	String[] v34={"destructible","���ƻ���","adj.","0"};
    	String[] v35={"desuetude","��ֹ������","n.","0"};
    	String[] v36={"detestable","�Ӷ�ģ������ģ�������","adj.","0"};

    	String[] v37={"detonate","ʹ��ը������","v.","0"};
    	String[] v38={"detract","��ȥ����ͣ�ת��","v.","0"};
    	String[] v39={"devolve","��ָ������ְ���ƽ���ĳ��","v.","0"};
    	String[] v40={"diabolic","��ħ�ģ�ħ���Ը��","adj.","0"};

    	String[] v401={"dictator","������","n.","0"};
    	String[] v41={"ductum","���ԣ�����","n.","0"};
    	String[] v42={"dietetics","��ʳѧ��Ӫ��ѧ","n.","0"};
    	String[] v43={"dignitary","��Ҫ����","n.","0"};
    	
    	String[] v44={"dilapidation","�ƾɣ��ķ�","n.","0"};
    	String[] v45={"diminuendo","�����֣����ࣩ����","n.","0"};
    	String[] v46={"diocesan","���̹�����","adj.","0"};
    	String[] v47={"dipsomania","�Ⱦ�֢","n.","0"};
    	
    	String[] v48={"disavow","���ϣ��񶨣�����","v.","0"};
    	String[] v49={"disband","���","v.","0"};
    	String[] v50={"disclaimer","���ϣ��ܾ�","v.","0"};
    	String[] v51={"disembody","ʹ����ʵ�壬ʹ������ʵ","v.","0"};
    	
    	String[] v52={"disfranchise","����...��Ȩ��","v.","0"};
    	String[] v53={"dishearten","ʹ...����","v.","0"};
    	String[] v54={"dishevel","ʹ���ң�ʹͷ������","v.","0"};
    	String[] v55={"disheveled","��ָë�����·������ҵ�","adj.","0"};

    	String[] v56={"disintegrate","ʹ...�߽�","v.","0"};
    	String[] v57={"disport","��Ū����Ϸ","v.","0"};
    	String[] v58={"disquisition","��ƪ�ݽ���ר������","n.","0"};
    	String[] v59={"dissection","���ʣ�����","v.","0"};

    	String[] v60={"dissociate","���룬���룬����","v.","0"};
    	String[] v61={"distain","�����˺�����","v.","0"};
    	String[] v62={"distal","Զ�����ĵģ���ĩ�ҵ�","adj.","0"};
    	String[] v63={"distention","����","n.","0"};

    	String[] v64={"distrait","�Ĳ����ɵ�","adj.","0"};
    	String[] v65={"ditch","��������������","n.","0"};
    	String[] v66={"divagate","���⣬Ʈ��","v.","0"};
    	String[] v67={"dock","���̣��۳�...��һ���ֹ���","v.","0"};

    	String[] v68={"doggo","������","adv.","0"};
    	String[] v69={"dotage","�����Ϳ���簮","n.","0"};
    	String[] v70={"double-cross","��ƭ������","v.","0"};
    	String[] v71={"dowdy","�����࣬���ɵ�","adj.","0"};

    	String[] v641={"dowry","��ױ","n.","0"};
    	String[] v651={"doze","�˯������","v.","0"};
    	String[] v661={"dribble","���µΣ���","v.","0"};
    	String[] v671={"drollery","Ц̸������","n.","0"};

    	String[] v681={"ductile","�������ģ��ױ��Ե�","adj.","0"};
    	String[] v691={"dulcet","�����","adj.","0"};
    	String[] v701={"dullard","���ˣ�����","n.","0"};
    	String[] v711={"dumbfound","ʹ...���ȣ����","v.","0"};

    	String[] v72={"dunce","����","n.","0"};
    	String[] v73={"eaglet","Сӥ","n.","0"};
    	String[] v74={"earthshaking","������Ҫ����Ҫ��","adj.","0"};
    	String[] v75={"ecdysis","�������Ƥ������ë","v.","0"};

    	String[] v76={"eclat","�Իͳɾ�","n.","0"};
    	String[] v77={"eclogue","��԰ʫ������","n.","0"};
    	String[] v78={"ecumenical","���緶Χ��","adj.","0"};
    	String[] v79={"edict","����","n.","0"};

    	String[] v80={"eerie","���µģ���ɭ�ֲ���","adj.","0"};
    	String[] v81={"effeminate","ȱ�������ģ�������","adj.","0"};
    	String[] v82={"effigy","ģ����","n.","0"};
    	String[] v83={"egoism","��������","n.","0"};

    	String[] v84={"ejaculate","ͻȻ�г���˵��","v.","0"};
    	String[] v85={"electorate","ѡ��ѡ������ѡ��Ȩ��","n.","0"};
    	String[] v86={"elixir","����ҩ����������ҩ","n.","0"};
    	String[] v87={"emasculate","�������˸������","v./adj.","0"};

    	String[] v88={"embankment","�̰�","n.","0"};
    	String[] v89={"embitter","ʹʹ�࣬ʹ����","v.","0"};
    	String[] v90={"emblazon","�����»�������ʽװ��","v.","0"};
    	String[] v91={"embodiment","��������","n.","0"};

    	String[] v92={"embroil","ǣ�����������","v.","0"};
    	String[] v93={"embryonic","��̥�ģ���ѿ�ڵ�","adj.","0"};
    	String[] v94={"emerald","��䣻����ɫ��","n./adj.","0"};
    	String[] v95={"emolument","���꣬нˮ","n.","0"};

    	String[] v96={"empyrean","��գ�����Ӵ�","n.","0"};
    	String[] v97={"encipher","�������","v.","0"};
    	String[] v98={"encyclopedic","�㲩�ģ�֪ʶԨ����","adj.","0"};
    	String[] v99={"endue","����","v.","0"};

    	String[] v100={"engrossment","��ʽ��д���ļ�","n.","0"};
    	String[] v101={"ennoble","�����λ��ʹ�߹�","v.","0"};
    	String[] v102={"enshrine","��Ϊ��ʥ","v.","0"};
    	String[] v103={"enslave","ū��","v.","0"};

    	String[] v104={"ensnare","��������","v.","0"};
    	String[] v105={"enthrall","�Ի���ס","v.","0"};
    	String[] v106={"entourage","��ӣ�����","n.","0"};
    	String[] v107={"entrench","�ں�����ȷ��","v.","0"};

    	String[] v108={"entwine","ʹ���ƣ���֯","v.","0"};
    	String[] v109={"environs","���⣬����","n.","0"};
    	String[] v110={"envisage","���ӣ�����","v.","0"};
    	String[] v111={"epicurean","�����ֵģ����������","adj.","0"};

    	String[] v112={"episode","һ�����","n.","0"};
    	String[] v113={"equestrian","��ʦ�������","n./adj.","0"};
    	String[] v114={"escort","���ͣ�������","v./n.","0"};
    	String[] v115={"estrange","ʹ��Զ","n.","0"};

    	String[] v116={"estuary","�ӿڣ�������","n.","0"};
    	String[] v117={"eugenic","������","adj.","0"};
    	String[] v118={"even-tempered","����ƽ�͵ģ�����������","adj.","0"};
    	String[] v119={"everlasting","����ģ��־õģ���ֹ���ģ����õ�","adj.","0"};

    	String[] v120={"eviscerate","ȡ����������","v.","0"};
    	String[] v121={"exceptionable","���𷴸е�","adj.","0"};
    	String[] v122={"excerpt","ժ¼��ѡ¼����¼","n.","0"};
    	String[] v123={"exchequer","���⣬��Դ","n.","0"};

    	String[] v124={"excogitate","��������","v.","0"};
    	String[] v125={"excruciate","ʩ���̣����ʣ���ĥ","v.","0"};
    	String[] v126={"execration","���ޣ����","n.","0"};
    	String[] v127={"exhume","���������","v.","0"};

    	String[] v128={"exiguous","̫�ٵģ������","adj.","0"};
    	String[] v129={"expatiate","ϸ˵������","v.","0"};
    	String[] v130={"expatriate","����������������","v.","0"};
    	String[] v131={"expiation","�������","n.","0"};

    	
    	
    	
    	subInitial(DBParameter.pos_wl_42,v1);
		subInitial(DBParameter.pos_wl_42,v2);
		subInitial(DBParameter.pos_wl_42,v3);
		subInitial(DBParameter.pos_wl_42,v4);
		subInitial(DBParameter.pos_wl_42,v5);
		subInitial(DBParameter.pos_wl_42,v6);
		subInitial(DBParameter.pos_wl_42,v7);
		subInitial(DBParameter.pos_wl_42,v8);
		subInitial(DBParameter.pos_wl_42,v9);
		subInitial(DBParameter.pos_wl_42,v10);
		subInitial(DBParameter.pos_wl_42,v11);
		subInitial(DBParameter.pos_wl_42,v12);
		subInitial(DBParameter.pos_wl_42,v13);
		subInitial(DBParameter.pos_wl_42,v14);
		subInitial(DBParameter.pos_wl_42,v15);
		subInitial(DBParameter.pos_wl_42,v16);
		subInitial(DBParameter.pos_wl_42,v17);
		subInitial(DBParameter.pos_wl_42,v18);
		subInitial(DBParameter.pos_wl_42,v19);
		subInitial(DBParameter.pos_wl_42,v20);
		subInitial(DBParameter.pos_wl_42,v21);
		subInitial(DBParameter.pos_wl_42,v22);
		subInitial(DBParameter.pos_wl_42,v23);
		subInitial(DBParameter.pos_wl_42,v24);
		subInitial(DBParameter.pos_wl_42,v25);
		subInitial(DBParameter.pos_wl_42,v26);
		subInitial(DBParameter.pos_wl_42,v27);
		subInitial(DBParameter.pos_wl_42,v28);
		subInitial(DBParameter.pos_wl_42,v29);
		subInitial(DBParameter.pos_wl_42,v30);
		subInitial(DBParameter.pos_wl_42,v31);
		subInitial(DBParameter.pos_wl_42,v32);
		subInitial(DBParameter.pos_wl_42,v33);
		subInitial(DBParameter.pos_wl_42,v34);
		subInitial(DBParameter.pos_wl_42,v35);
		subInitial(DBParameter.pos_wl_42,v36);
		subInitial(DBParameter.pos_wl_42,v37);
		subInitial(DBParameter.pos_wl_42,v38);
		subInitial(DBParameter.pos_wl_42,v39);
		subInitial(DBParameter.pos_wl_42,v40);
		
		subInitial(DBParameter.pos_wl_42,v401);
		
		subInitial(DBParameter.pos_wl_42,v41);
		subInitial(DBParameter.pos_wl_42,v42);
		subInitial(DBParameter.pos_wl_42,v43);
		subInitial(DBParameter.pos_wl_42,v44);
		subInitial(DBParameter.pos_wl_42,v45);
		subInitial(DBParameter.pos_wl_42,v46);
		subInitial(DBParameter.pos_wl_42,v47);
		subInitial(DBParameter.pos_wl_42,v48);
		subInitial(DBParameter.pos_wl_42,v49);
		subInitial(DBParameter.pos_wl_42,v50);
		
		subInitial(DBParameter.pos_wl_42,v51);
		subInitial(DBParameter.pos_wl_42,v52);
		subInitial(DBParameter.pos_wl_42,v53);
		subInitial(DBParameter.pos_wl_42,v54);
		subInitial(DBParameter.pos_wl_42,v55);
		subInitial(DBParameter.pos_wl_42,v56);
		subInitial(DBParameter.pos_wl_42,v57);
		subInitial(DBParameter.pos_wl_42,v58);
		subInitial(DBParameter.pos_wl_42,v59);
		subInitial(DBParameter.pos_wl_42,v60);
		subInitial(DBParameter.pos_wl_42,v61);
		subInitial(DBParameter.pos_wl_42,v62);
		subInitial(DBParameter.pos_wl_42,v63);
		subInitial(DBParameter.pos_wl_42,v64);
		subInitial(DBParameter.pos_wl_42,v65);
		subInitial(DBParameter.pos_wl_42,v66);
		subInitial(DBParameter.pos_wl_42,v67);
		subInitial(DBParameter.pos_wl_42,v68);
		subInitial(DBParameter.pos_wl_42,v69);
		subInitial(DBParameter.pos_wl_42,v70);
		subInitial(DBParameter.pos_wl_42,v71);
		
		subInitial(DBParameter.pos_wl_42,v641);
		subInitial(DBParameter.pos_wl_42,v651);
		subInitial(DBParameter.pos_wl_42,v661);
		subInitial(DBParameter.pos_wl_42,v671);
		subInitial(DBParameter.pos_wl_42,v681);
		subInitial(DBParameter.pos_wl_42,v691);
		subInitial(DBParameter.pos_wl_42,v701);
		subInitial(DBParameter.pos_wl_42,v711);
		
		subInitial(DBParameter.pos_wl_42,v72);
		subInitial(DBParameter.pos_wl_42,v73);
		subInitial(DBParameter.pos_wl_42,v74);
		subInitial(DBParameter.pos_wl_42,v75);
		subInitial(DBParameter.pos_wl_42,v76);
		subInitial(DBParameter.pos_wl_42,v77);
		subInitial(DBParameter.pos_wl_42,v78);
		subInitial(DBParameter.pos_wl_42,v79);
		subInitial(DBParameter.pos_wl_42,v80);
		subInitial(DBParameter.pos_wl_42,v81);
		subInitial(DBParameter.pos_wl_42,v82);
		subInitial(DBParameter.pos_wl_42,v83);
		subInitial(DBParameter.pos_wl_42,v84);
		subInitial(DBParameter.pos_wl_42,v85);
		subInitial(DBParameter.pos_wl_42,v86);
		subInitial(DBParameter.pos_wl_42,v87);
		subInitial(DBParameter.pos_wl_42,v88);
		subInitial(DBParameter.pos_wl_42,v89);
		subInitial(DBParameter.pos_wl_42,v90);
		subInitial(DBParameter.pos_wl_42,v91);
		subInitial(DBParameter.pos_wl_42,v92);
		subInitial(DBParameter.pos_wl_42,v93);
		subInitial(DBParameter.pos_wl_42,v94);
		subInitial(DBParameter.pos_wl_42,v95);
		subInitial(DBParameter.pos_wl_42,v96);
		subInitial(DBParameter.pos_wl_42,v97);
		subInitial(DBParameter.pos_wl_42,v98);
		subInitial(DBParameter.pos_wl_42,v99);
		subInitial(DBParameter.pos_wl_42,v100);
		subInitial(DBParameter.pos_wl_42,v101);
		subInitial(DBParameter.pos_wl_42,v102);
		subInitial(DBParameter.pos_wl_42,v103);
		subInitial(DBParameter.pos_wl_42,v104);
		subInitial(DBParameter.pos_wl_42,v105);
		subInitial(DBParameter.pos_wl_42,v106);
		subInitial(DBParameter.pos_wl_42,v107);
		subInitial(DBParameter.pos_wl_42,v108);
		subInitial(DBParameter.pos_wl_42,v109);
		subInitial(DBParameter.pos_wl_42,v110);
		subInitial(DBParameter.pos_wl_42,v111);
		subInitial(DBParameter.pos_wl_42,v112);
		subInitial(DBParameter.pos_wl_42,v113);
		subInitial(DBParameter.pos_wl_42,v114);
		subInitial(DBParameter.pos_wl_42,v115);
		subInitial(DBParameter.pos_wl_42,v116);
		subInitial(DBParameter.pos_wl_42,v117);
		subInitial(DBParameter.pos_wl_42,v118);
		
		subInitial(DBParameter.pos_wl_42,v119);
		subInitial(DBParameter.pos_wl_42,v120);
		subInitial(DBParameter.pos_wl_42,v121);
		subInitial(DBParameter.pos_wl_42,v122);
		subInitial(DBParameter.pos_wl_42,v123);
		subInitial(DBParameter.pos_wl_42,v124);
		subInitial(DBParameter.pos_wl_42,v125);
		subInitial(DBParameter.pos_wl_42,v126);
		subInitial(DBParameter.pos_wl_42,v127);
		subInitial(DBParameter.pos_wl_42,v128);
		subInitial(DBParameter.pos_wl_42,v129);
		subInitial(DBParameter.pos_wl_42,v130);
		subInitial(DBParameter.pos_wl_42,v131);
		
    }
    public void doList_43(){
    	
    	
    	String[] v1={"explicable","�ɽ��͵�","adj.","0"};
    	String[] v2={"expropriate","�乫��û��","v.","0"};
    	String[] v3={"expulsion","���𣬿���","n.","0"};
    	String[] v4={"extradite","���ɻع����û�鰸","v.","0"};
    	String[] v5={"explicable","�ɽ��͵�","adj.","0"};
    	
    	String[] v6={"extrinsic","�����ģ����ڵģ��ⲿ��","adj.","0"};
    	String[] v7={"extrude","���������","v.","0"};
    	String[] v8={"exultant","�ǳ����ˣ����õ�","adj.","0"};
    	String[] v9={"fabulous","�������ŵģ�Ԣ�����","adj.","0"};
    	String[] v10={"facsimile","���Ʊ���ġ��","n.","0"};

    	String[] v11={"factitious","��Ϊ�ģ�����ʵ��","adj.","0"};
    	String[] v12={"fag","��ɣ��๤","v./n.","0"};
    	String[] v13={"fail-safe","�Զ�������װ��","n.","0"};
    	String[] v14={"fainthearted","ų���ģ��޾���ģ���С��","adj.","0"};
    	String[] v15={"fake","α�죬��װ","v.","0"};

    	String[] v16={"falsify","�۸ģ�˵��","v.","0"};
    	String[] v17={"fanfare","��ҫ�����У�������������","n.","0"};
    	String[] v18={"fantasia","���������������","n.","0"};
    	String[] v19={"farrow","��ĸ��������һ��С��","v./n.","0"};
    	String[] v20={"fascia","�δ�������","n.","0"};

    	String[] v21={"fascinate","�Ի���ס","v.","0"};
    	String[] v22={"fealthy","Ч��","n.","0"};
    	String[] v23={"febrile","���յģ��Ȳ���","adj.","0"};
    	String[] v24={"feisty","��Ծ�ģ�һŭ��","adj.","0"};
    	String[] v25={"felicitate","ף�أ���ף","v.","0"};

    	String[] v26={"feline","è��","n.","0"};
    	String[] v27={"fencing","������������","n.","0"};
    	String[] v28={"ferocious","���͵ģ��б���","adj.","0"};
    	String[] v29={"ferry","�ɴ����ɿڣ�����","n./v.","0"};
    	String[] v30={"festal","���յģ����ֵ�","adj.","0"};

    	String[] v31={"fetish","���ż��","n.","0"};
    	String[] v32={"fiend","��ħ","n.","0"};
    	String[] v33={"filament","��˿��ϸ˿","n.","0"};
    	String[] v34={"filch","͵","v.","0"};
    	String[] v35={"filial","��Ů��","adj.","0"};

    	String[] v36={"fillet","������������Ƭ","n.","0"};
    	String[] v37={"finable","Ӧ�����","adj.","0"};
    	String[] v38={"finery","���������ŵķ�װ�����","n.","0"};
    	String[] v39={"firebrand","ȼ�յ�ľ�飬�����ҵ���","n.","0"};
    	String[] v40={"fishery","�泡����ҵ","n.","0"};

    	String[] v41={"fissile","�׷��ѵ�","adj.","0"};
    	String[] v42={"fitful","һ����ģ�������","adj.","0"};
    	String[] v43={"flabby","����ģ���־������","adj.","0"};
    	String[] v44={"flagellate","�޴򣬱���","v.","0"};
    	String[] v45={"flair","�츳�����죬�Ż�","n.","0"};

    	String[] v46={"flannel","������","n.","0"};
    	String[] v47={"flatulence","��θ����","n.","0"};
    	String[] v48={"flavoring","���ϣ���ζƷ","n.","0"};
    	String[] v49={"flay","��Ƥ��թȡ������Ǵ��","v.","0"};
    	String[] v50={"fleck","�ߵ㣬΢��","n.","0"};

    	String[] v51={"fleece","����Ƥ����ë��ƭȡ","n./v.","0"};
    	String[] v52={"fleet","���ٵģ���ĥ�����ۣ����ţ��ӹ�","adj./v.","0"};
    	String[] v53={"flick","����ᵯ","v./n.","0"};
    	String[] v54={"flicker","��˸��ҡҷ","v.","0"};
    	String[] v55={"floppy","����ģ�˥����","adj.","0"};

    	String[] v56={"florescence","����ʱ��","n.","0"};
    	String[] v57={"flunk","���Բ�����","n.","0"};
    	String[] v58={"fodder","����","n.","0"};
    	String[] v59={"fondle","��Ū������","v.","0"};
    	String[] v60={"foothold","����㣬���ݵ�","n.","0"};

    	String[] v61={"footle","���֣��˷ѣ�ʱ�䣩","v.","0"};
    	String[] v62={"fop","��������","n.","0"};
    	String[] v63={"foray","ͻϮ��͵Ϯ","v./n.","0"};
    	String[] v64={"forefear","���ڣ�����","n.","0"};
    	String[] v65={"foreclose","�ų���ȡ��ѺƷ�����Ȩ","v.","0"};

    	String[] v66={"forensic","��ͥ�ģ����۵�","adj.","0"};
    	String[] v67={"foreword","ǰ�ԣ���","n.","0"};
    	String[] v68={"forfeiture","�������ȣ�ɥʧ","n.","0"};
    	String[] v69={"forlorn","�¶��ģ�������","adj.","0"};
    	String[] v70={"formative","�γɵģ�Ӱ�췢չ��","adj.","0"};

    	String[] v71={"forswear","�ľ�������","v.","0"};
    	String[] v72={"fort","Ҫ�����Ǳ�","n.","0"};
    	String[] v73={"fractional","΢Ц�ģ���С��","adj.","0"};
    	String[] v74={"fraternal","�ֵܵģ����Ƶ�","adj.","0"};
    	String[] v75={"fraternity","ͬ���ˣ��Ѱ�","n.","0"};

    	String[] v76={"fray","���ܣ��򶷣�ĥ��","n./v.","0"};
    	String[] v77={"freak","������£�������","n./adj.","0"};
    	String[] v78={"fretwork","����ϸ��","n.","0"};
    	String[] v79={"frisk","��Ծ������","v./n.","0"};
    	String[] v80={"fritter","�޴����˷ѣ�����","v.","0"};

    	String[] v81={"frolic","��Ϸ��ȸԾ","v./n.","0"};
    	String[] v82={"frolicsome","���ģ����ֵ�","adj.","0"};
    	String[] v83={"frowzy","������ģ��ۻ��","adj.","0"};
    	String[] v84={"fructify","���ʵ���ɹ�","v.","0"};
    	String[] v85={"funereal","��������ģ�������","adj.","0"};

    	String[] v86={"furbish","ĥ�⣬ˢ��","v.","0"};
    	String[] v87={"fury","��ŭ���񱩣����ң���ŭ���ˣ�����Ů��","n.","0"};
    	String[] v88={"fustian","�ն��Ļ���������ĸߵ�","n.","0"};
    	String[] v89={"gab","���࣬��˵�������᰸��Ϲ�����й䣬�ε�","n./v.","0"};
    	String[] v90={"gabble","���֣����","n.","0"};

    	String[] v91={"gaiety","���֣����","n.","0"};
    	String[] v92={"gale","��磬һ��(��Ц)","n.","0"};
    	String[] v93={"gallop","�ɱ�������","v.","0"};
    	String[] v94={"gallows","����̨","n.","0"};
    	String[] v95={"gamut","ȫ���ף�ȫ��֪ʶ","n.","0"};
    	
    	String[] v96={"gander","�۶죬���ˣ��й�","n./v.","0"};
    	String[] v97={"gangling","�ݳ��ѿ���","n./adj.","0"};
    	String[] v98={"gangly","����ݳ���","adj.","0"};
    	String[] v99={"gangrene","����","n.","0"};
    	String[] v100={"garland","��������Ʒ","n.","0"};

    	String[] v101={"garret","��¥����¥С��","n.","0"};
    	String[] v102={"gastric","θ�ģ�θ����","adj.","0"};
    	String[] v103={"gastritis","θ��","n.","0"};
    	String[] v104={"gastronomy","��ʳ��","n.","0"};
    	String[] v105={"gauche","��׾�ģ������罻��","adj.","0"};

    	String[] v106={"gaunt","�㲵ģ��ݵ�","adj.","0"};
    	String[] v107={"genuflect","��ϥ�����ʾ���⣩","v.","0"};
    	String[] v108={"gestate","���У�����","v.","0"};
    	String[] v109={"gesticulate","�����Ʊ��","v.","0"};
    	String[] v110={"ghastly","���µģ����˵�","adj.","0"};
    	
    	String[] v111={"girdle","������ת�������","n./v.","0"};
    	String[] v112={"glamorous","���˵ģ�����������","adj.","0"};
    	String[] v113={"gleam","���⣬���⣻ʹ����","n./v.","0"};
    	String[] v114={"glee","��ϲ������","n.","0"};
    	String[] v115={"glimpse","Ƴ������һ��","n./v.","0"};

    	String[] v116={"glitter","��˸����ҫ�����õĹ⻪���ջ���������","v./n.","0"};
    	String[] v117={"gloaming","�ƻ裬��ĺ","n.","0"};
    	String[] v118={"gloss-over","�ʲݵػ���ܵش���ĳ��","v.","0"};
    	String[] v119={"gnat","��С�½��ƽ�","n.","0"};
    	String[] v120={"gnawing","ʹ��ģ���ĥ�˵�","adj.","0"};

    	String[] v121={"gnome","���±��ص��ػ���","n.","0"};
    	String[] v122={"gnomic","���Եģ����ٵ�","adj.","0"};
    	String[] v123={"goggle","��Ŀ�������ۿ�","n./v.","0"};
    	String[] v124={"gorgeous","�����ģ����õ�","adj.","0"};
    	String[] v125={"gormandize","ƴ���ԣ�̰��","v.","0"};
    	
    	String[] v126={"gosling","С�죬������֪����","n.","0"};
    	String[] v127={"governance","ͳ�Σ�֧��","n.","0"};
    	String[] v128={"granary","�Ȳ֣�����","n.","0"};
    	String[] v129={"granule","С����΢��","n.","0"};
    	String[] v130={"gratis","������ģ���ѵ�","adj.","0"};

    	String[] v131={"greenhorn","��ѧ�ߣ�������ƭ����","n.","0"};
    	String[] v132={"gridiron","���ܣ������","n.","0"};
    	String[] v133={"grotesque","�ֵ��ģ��Źֵ�","adj.","0"};
    	String[] v134={"growl","���������","v.","0"};
    	String[] v135={"grudge","���ģ�����","v.","0"};

    	String[] v136={"gruesome","����ë���Ȼ�ģ����ĵ�","adj.","0"};
    	String[] v137={"gruff","��ָ�ˡ���������Ұ��","adj.","0"};
    	String[] v138={"grumpy","Ƣ�������","adj.","0"};
    	String[] v139={"gulch","��ȣ�Ͽ��","n.","0"};
    	String[] v140={"gull","��Ÿ�����ϵ����ˣ���ƭ","n./v.","0"};

    	String[] v141={"gusto","���ã����²���","n.","0"};
    	String[] v142={"gutless","û����������ų��","adj.","0"};
    	String[] v143={"guttle","���̻���","v.","0"};
    	String[] v144={"gynaecocracy","��Ů����","n.","0"};
    	String[] v145={"habitable","�ɾ�ס��","adj.","0"};

    	String[] v146={"haft","�����ѱ�","n.","0"};
    	String[] v147={"haggard","�㲵ģ����ݵ�","adj.","0"};
    	String[] v148={"haggle","�ּۻ���","v.","0"};
    	String[] v149={"hamstring","�ж��Ƚ�ʹ�з�","v.","0"};
    	String[] v150={"hardbitten","�����ģ���ǿ��","adj.","0"};
    	
    	String[] v151={"hardihood","�󵨣�³ç","n.","0"};
    	String[] v152={"hassle","���ҵı���","n.","0"};
    	String[] v153={"hatchet","�̱�С��","n.","0"};
    	String[] v154={"hawker","�ؽֽ�����С��","n.","0"};
    	String[] v155={"hawser","�����������","n.","0"};

    	String[] v156={"hearsay","ҥ��������;˵","n.","0"};
    	String[] v157={"heave","������","v.","0"};
    	String[] v158={"hedgehog","���","n.","0"};
    	
    	
    	
    	
    	
    	
    	subInitial(DBParameter.pos_wl_43,v1);
		subInitial(DBParameter.pos_wl_43,v2);
		subInitial(DBParameter.pos_wl_43,v3);
		subInitial(DBParameter.pos_wl_43,v4);
		subInitial(DBParameter.pos_wl_43,v5);
		subInitial(DBParameter.pos_wl_43,v6);
		subInitial(DBParameter.pos_wl_43,v7);
		subInitial(DBParameter.pos_wl_43,v8);
		subInitial(DBParameter.pos_wl_43,v9);
		subInitial(DBParameter.pos_wl_43,v10);
		subInitial(DBParameter.pos_wl_43,v11);
		subInitial(DBParameter.pos_wl_43,v12);
		subInitial(DBParameter.pos_wl_43,v13);
		subInitial(DBParameter.pos_wl_43,v14);
		subInitial(DBParameter.pos_wl_43,v15);
		subInitial(DBParameter.pos_wl_43,v16);
		subInitial(DBParameter.pos_wl_43,v17);
		subInitial(DBParameter.pos_wl_43,v18);
		subInitial(DBParameter.pos_wl_43,v19);
		subInitial(DBParameter.pos_wl_43,v20);
		subInitial(DBParameter.pos_wl_43,v21);
		subInitial(DBParameter.pos_wl_43,v22);
		subInitial(DBParameter.pos_wl_43,v23);
		subInitial(DBParameter.pos_wl_43,v24);
		subInitial(DBParameter.pos_wl_43,v25);
		subInitial(DBParameter.pos_wl_43,v26);
		subInitial(DBParameter.pos_wl_43,v27);
		subInitial(DBParameter.pos_wl_43,v28);
		subInitial(DBParameter.pos_wl_43,v29);
		subInitial(DBParameter.pos_wl_43,v30);
		subInitial(DBParameter.pos_wl_43,v31);
		subInitial(DBParameter.pos_wl_43,v32);
		subInitial(DBParameter.pos_wl_43,v33);
		subInitial(DBParameter.pos_wl_43,v34);
		subInitial(DBParameter.pos_wl_43,v35);
		subInitial(DBParameter.pos_wl_43,v36);
		subInitial(DBParameter.pos_wl_43,v37);
		subInitial(DBParameter.pos_wl_43,v38);
		subInitial(DBParameter.pos_wl_43,v39);
		subInitial(DBParameter.pos_wl_43,v40);
		subInitial(DBParameter.pos_wl_43,v41);
		subInitial(DBParameter.pos_wl_43,v42);
		subInitial(DBParameter.pos_wl_43,v43);
		subInitial(DBParameter.pos_wl_43,v44);
		subInitial(DBParameter.pos_wl_43,v45);
		subInitial(DBParameter.pos_wl_43,v46);
		subInitial(DBParameter.pos_wl_43,v47);
		subInitial(DBParameter.pos_wl_43,v48);
		subInitial(DBParameter.pos_wl_43,v49);
		subInitial(DBParameter.pos_wl_43,v50);
		
		subInitial(DBParameter.pos_wl_43,v51);
		subInitial(DBParameter.pos_wl_43,v52);
		subInitial(DBParameter.pos_wl_43,v53);
		subInitial(DBParameter.pos_wl_43,v54);
		subInitial(DBParameter.pos_wl_43,v55);
		subInitial(DBParameter.pos_wl_43,v56);
		subInitial(DBParameter.pos_wl_43,v57);
		subInitial(DBParameter.pos_wl_43,v58);
		subInitial(DBParameter.pos_wl_43,v59);
		subInitial(DBParameter.pos_wl_43,v60);
		subInitial(DBParameter.pos_wl_43,v61);
		subInitial(DBParameter.pos_wl_43,v62);
		subInitial(DBParameter.pos_wl_43,v63);
		subInitial(DBParameter.pos_wl_43,v64);
		subInitial(DBParameter.pos_wl_43,v65);
		subInitial(DBParameter.pos_wl_43,v66);
		subInitial(DBParameter.pos_wl_43,v67);
		subInitial(DBParameter.pos_wl_43,v68);
		subInitial(DBParameter.pos_wl_43,v69);
		subInitial(DBParameter.pos_wl_43,v70);
		subInitial(DBParameter.pos_wl_43,v71);
		subInitial(DBParameter.pos_wl_43,v72);
		subInitial(DBParameter.pos_wl_43,v73);
		subInitial(DBParameter.pos_wl_43,v74);
		subInitial(DBParameter.pos_wl_43,v75);
		subInitial(DBParameter.pos_wl_43,v76);
		subInitial(DBParameter.pos_wl_43,v77);
		subInitial(DBParameter.pos_wl_43,v78);
		subInitial(DBParameter.pos_wl_43,v79);
		subInitial(DBParameter.pos_wl_43,v80);
		subInitial(DBParameter.pos_wl_43,v81);
		subInitial(DBParameter.pos_wl_43,v82);
		subInitial(DBParameter.pos_wl_43,v83);
		subInitial(DBParameter.pos_wl_43,v84);
		subInitial(DBParameter.pos_wl_43,v85);
		subInitial(DBParameter.pos_wl_43,v86);
		subInitial(DBParameter.pos_wl_43,v87);
		subInitial(DBParameter.pos_wl_43,v88);
		subInitial(DBParameter.pos_wl_43,v89);
		subInitial(DBParameter.pos_wl_43,v90);
		subInitial(DBParameter.pos_wl_43,v91);
		subInitial(DBParameter.pos_wl_43,v92);
		subInitial(DBParameter.pos_wl_43,v93);
		subInitial(DBParameter.pos_wl_43,v94);
		subInitial(DBParameter.pos_wl_43,v95);
		subInitial(DBParameter.pos_wl_43,v96);
		subInitial(DBParameter.pos_wl_43,v97);
		subInitial(DBParameter.pos_wl_43,v98);
		subInitial(DBParameter.pos_wl_43,v99);
		subInitial(DBParameter.pos_wl_43,v100);
		subInitial(DBParameter.pos_wl_43,v101);
		subInitial(DBParameter.pos_wl_43,v102);
		subInitial(DBParameter.pos_wl_43,v103);
		subInitial(DBParameter.pos_wl_43,v104);
		subInitial(DBParameter.pos_wl_43,v105);
		subInitial(DBParameter.pos_wl_43,v106);
		subInitial(DBParameter.pos_wl_43,v107);
		subInitial(DBParameter.pos_wl_43,v108);
		subInitial(DBParameter.pos_wl_43,v109);
		subInitial(DBParameter.pos_wl_43,v110);
		subInitial(DBParameter.pos_wl_43,v111);
		subInitial(DBParameter.pos_wl_43,v112);
		subInitial(DBParameter.pos_wl_43,v113);
		subInitial(DBParameter.pos_wl_43,v114);
		subInitial(DBParameter.pos_wl_43,v115);
		subInitial(DBParameter.pos_wl_43,v116);
		subInitial(DBParameter.pos_wl_43,v117);
		subInitial(DBParameter.pos_wl_43,v118);
		
		subInitial(DBParameter.pos_wl_43,v119);
		subInitial(DBParameter.pos_wl_43,v120);
		subInitial(DBParameter.pos_wl_43,v121);
		subInitial(DBParameter.pos_wl_43,v122);
		subInitial(DBParameter.pos_wl_43,v123);
		subInitial(DBParameter.pos_wl_43,v124);
		subInitial(DBParameter.pos_wl_43,v125);
		subInitial(DBParameter.pos_wl_43,v126);
		subInitial(DBParameter.pos_wl_43,v127);
		subInitial(DBParameter.pos_wl_43,v128);
		subInitial(DBParameter.pos_wl_43,v129);
		subInitial(DBParameter.pos_wl_43,v130);
		subInitial(DBParameter.pos_wl_43,v131);
		subInitial(DBParameter.pos_wl_43,v132);
		subInitial(DBParameter.pos_wl_43,v133);
		subInitial(DBParameter.pos_wl_43,v134);
		subInitial(DBParameter.pos_wl_43,v135);
		subInitial(DBParameter.pos_wl_43,v136);
		subInitial(DBParameter.pos_wl_43,v137);
		subInitial(DBParameter.pos_wl_43,v138);
		subInitial(DBParameter.pos_wl_43,v139);
		subInitial(DBParameter.pos_wl_43,v140);
		subInitial(DBParameter.pos_wl_43,v141);
		subInitial(DBParameter.pos_wl_43,v142);
		subInitial(DBParameter.pos_wl_43,v143);
		subInitial(DBParameter.pos_wl_43,v144);
		subInitial(DBParameter.pos_wl_43,v145);
		subInitial(DBParameter.pos_wl_43,v146);
		subInitial(DBParameter.pos_wl_43,v147);
		subInitial(DBParameter.pos_wl_43,v148);
		subInitial(DBParameter.pos_wl_43,v149);
		subInitial(DBParameter.pos_wl_43,v150);
		subInitial(DBParameter.pos_wl_43,v151);
		subInitial(DBParameter.pos_wl_43,v152);
		subInitial(DBParameter.pos_wl_43,v153);
		subInitial(DBParameter.pos_wl_43,v154);
		subInitial(DBParameter.pos_wl_43,v155);
		subInitial(DBParameter.pos_wl_43,v156);
		subInitial(DBParameter.pos_wl_43,v157);
		subInitial(DBParameter.pos_wl_43,v158);

    	
    }
    public void doList_44(){
    	
    	
    	
    	String[] v1={"hedonic","���ֵģ���������ѧ˵","adj./n.","0"};
    	String[] v2={"hedonism","�������壬����","n.","0"};
    	String[] v3={"heliotrope","����ֲ��","n.","0"};
    	String[] v4={"helm","�棬��ʻ��","n.","0"};
    	String[] v5={"helot","ū�����������ӵ���","n.","0"};

    	String[] v6={"helve","����","n.","0"};
    	String[] v7={"henpecked","˳�����ӵģ����ڵ�","adj.","0"};
    	String[] v8={"hepatitis","����","n.","0"};
    	String[] v9={"herald","����٣�Ԥʾ������","n.","0"};
    	String[] v10={"herdsman","����","n.","0"};

    	String[] v11={"heyday","ȫʢʱ�ڣ��ഺ��","n.","0"};
    	String[] v12={"hilt","������֮����","n.","0"};
    	String[] v13={"hinterland","�ڵ�","n.","0"};
    	String[] v14={"hippopotamus","����","n.","0"};
    	String[] v15={"hoarse","˻�Ƶģ����Ƶ�","adj.","0"};

    	String[] v16={"hobble","����","n.","0"};
    	String[] v17={"holocaust","����ɱ���ƽ�","n.","0"};
    	String[] v18={"holograph","�ױ���","n.","0"};
    	String[] v19={"homely","��ʵ��","adj.","0"};
    	String[] v20={"homily","˵�̣�ѵ��","n.","0"};

    	String[] v21={"homograph","ͬ��������","n.","0"};
    	String[] v22={"horology","��ʱ�����ӱ�������","n.","0"};
    	String[] v23={"horrendous","���µģ����˿־��","adj.","0"};
    	String[] v24={"howler","���е��˻��������Ц�Ĵ���","n.","0"};
    	String[] v25={"hubbub","���ӣ�����","v.","0"};

    	String[] v26={"huddle","����һ�ѣ�һ����","v./n.","0"};
    	String[] v27={"hunk","��飨ʳ�","n.","0"};
    	String[] v28={"hut","��ª�ķ���","n.","0"};
    	String[] v29={"hygiene","����ѧ������","n.","0"};
    	String[] v30={"hypodermic","Ƥ��ע���","adj.","0"};

    	String[] v31={"icing","���£���˪","n.","0"};
    	String[] v32={"idol","����ż��","n.","0"};
    	String[] v33={"idolatrize","��Ϊż��äĿ���","v.","0"};
    	String[] v34={"idolize","��...����ż���ݣ�����ϲ������Ľ","v.","0"};
    	String[] v35={"illegible","�Ѷ��ģ����ϵ�","adj.","0"};

    	String[] v36={"illiberal","������խ��","adj.","0"};
    	String[] v37={"illustrious","�����ģ��Ժյ�","adj.","0"};
    	String[] v38={"imbecile","�����������͵���","n.","0"};
    	String[] v39={"immortal","����ģ�����������","adj.","0"};
    	String[] v40={"impend","������в����������","v.","0"};

    	String[] v41={"imperil","ʹ����Σ���У�Σ��","v.","0"};
    	String[] v42={"imprecation","��������","n.","0"};
    	String[] v43={"imputation","��̣�����","n.","0"};
    	String[] v44={"impute","�����","v.","0"};
    	String[] v45={"incertitude","�ɻ󣬲�ȷ��","n.","0"};

    	String[] v46={"incisor","����","n.","0"};
    	String[] v47={"incongruent","��Э���ģ�����г�ģ������ʵ�","adj.","0"};
    	String[] v48={"incorporeal","��ʵ��ģ������ʵģ�����","adj.","0"};
    	String[] v49={"incrustation","Ӳ�ǣ����","n.","0"};
    	String[] v50={"indite","д����","v.","0"};

    	String[] v51={"ineffaceable","Ĩ������","adj.","0"};
    	String[] v52={"ineligible","û���ʸ��","adj.","0"};
    	String[] v53={"inexpedient","���ʵ��ģ������ǵ�","adj.","0"};
    	String[] v54={"inexpiable","���ܲ�����","adj.","0"};
    	String[] v55={"infatuate","ʹ������ʹ��Ϳ","v.","0"};

    	String[] v56={"infatuated","�������ˣ���","adj.","0"};
    	String[] v57={"infernal","�����ģ��ɶ��","adj.","0"};
    	String[] v58={"infliction","ʹ�࣬�̷�","n.","0"};
    	String[] v59={"informer","�淢�ߣ�������","n.","0"};
    	String[] v60={"ingress","����","n.","0"};

    	String[] v511={"insane","����","adj.","0"};
    	String[] v521={"insanity","�������","n.","0"};
    	String[] v531={"inscription","���̣�����","n.","0"};
    	String[] v541={"insolate","ʹ��ɹ","v.","0"};
    	String[] v551={"insouciance","Į�����ģ���������","n.","0"};

    	String[] v561={"installment","���ڸ����װ","v.","0"};
    	String[] v571={"insuperable","���Կ˷���","adj.","0"};
    	String[] v581={"interdisciplinary","��ѧ�Ƶ�","adj.","0"};
    	String[] v591={"interlace","��֯������","v.","0"};
    	String[] v601={"interlocutor","�Ի��ߣ�̸����","n.","0"};

    	String[] v61={"interlope","��������֮�£�����","v.","0"};
    	String[] v62={"interloper","����","n.","0"};
    	String[] v63={"interstice","ϸ�ѷ죬��϶","n.","0"};
    	String[] v64={"interweave","��֯�����","v.","0"};
    	String[] v65={"intestate","δ��������","adj.","0"};

    	String[] v66={"intestine","�����ڲ���","v.","0"};
    	String[] v67={"intumescence","�״�����","n.","0"};
    	String[] v68={"investiture","���ڽ̣���ְ��ʽ����Ȩ��ʽ","n.","0"};
    	String[] v69={"invigilate","�࿼","v.","0"};
    	String[] v70={"invoice","��Ʊ�������嵥��������Ʊ","n./v.","0"};

    	String[] v71={"iridescence","�ʺ�ɫ","n.","0"};
    	String[] v72={"irradiate","ʹ����","n.","0"};
    	String[] v73={"iterate","��������������","v.","0"};
    	String[] v74={"jamboree","���֣����ֵļ���","n.","0"};
    	String[] v75={"jape","����Ц����","v.","0"};

    	String[] v76={"jesting","�����ģ�������Ц��","adj.","0"};
    	String[] v77={"jitters","���Ų���","n.","0"};
    	String[] v78={"jolly","ϲ�õģ�������","adj.","0"};
    	String[] v79={"jubilant","���õģ�������","adj.","0"};
    	String[] v80={"juncture","Σ����ͷ����ϴ�","n.","0"};

    	String[] v81={"jurisprudence","����ѧ����ѧ","n.","0"};
    	String[] v82={"kaleidoscopic","ǧ���򻯵�","adj.","0"};
    	String[] v83={"kiosk","�ۻ�ͤ���绰ͤ","n.","0"};
    	String[] v84={"knoll","Сɽ��СԲ��","n.","0"};
    	String[] v85={"laceration","˺�ѣ��ѿ�","n.","0"};

    	String[] v86={"lackey","������ϥ�ߣ�����","n.","0"};
    	String[] v87={"laggerd","�����ģ����ģ������","adj./n.","0"};
    	String[] v88={"lamentable","������ϧ�ģ����ں޵�","adj.","0"};
    	String[] v89={"laminate","�гɱ���","v.","0"};
    	String[] v90={"lapidary","��ʯ������ʯר��","n.","0"};

    	String[] v91={"latch","�Űѣ����Űѿ���","n./v.","0"};
    	String[] v92={"layman","��ͨ��ͽ�����⺺","n.","0"};
    	String[] v93={"layover","��;�еĶ���ͣ��","n.","0"};
    	String[] v94={"lean","��б��б�����ݹ����","v./adj.","0"};
    	String[] v95={"lash","��ϵ���ģ�����","n.","0"};

    	String[] v96={"leeward","˳���","adj.","0"};
    	String[] v97={"leeway","���ɹ���ģ����","adj./n.","0"};
    	String[] v98={"legible","�׶���","adj.","0"};
    	String[] v99={"lesion","�˿ڣ���","n.","0"};
    	String[] v100={"lexical","�ʻ�ģ��ʵ��","adj.","0"};

    	String[] v101={"lexicon","�ʵ�","n.","0"};
    	String[] v102={"libelous","�̰���","adj.","0"};
    	String[] v103={"libido","������������","n.","0"};
    	String[] v104={"licit","����ֹ�ģ��Ϸ���","adj.","0"};
    	String[] v105={"ligature","��֮��","n.","0"};

    	String[] v106={"limbo","���ȶ����м�״̬","n.","0"};
    	String[] v107={"lineal","ֱϵ�ģ���ϵ��","adj.","0"};
    	String[] v108={"lineaments","���沿�ȵģ�����������","n.","0"};
    	String[] v109={"lingual","���","adj.","0"};
    	String[] v110={"littoral","�����ģ��������غ�����","adj./n.","0"};

    	String[] v111={"livid","���ɫ�ģ��԰׵ģ���ŭ��","adj.","0"};
    	String[] v112={"loam","����","n.","0"};
    	String[] v113={"locust","�ȳ棬̰�Ե���","n.","0"};
    	String[] v114={"locution","���Է�񣬹�����","n.","0"};
    	String[] v115={"loft","��¥����¥","n.","0"};

    	String[] v116={"logjam","��ľ����������״̬������","n.","0"};
    	String[] v117={"loiter","�ε����ǻ�","n.","0"};
    	String[] v118={"lore","֪ʶ����˵","n.","0"};
    	String[] v119={"lout","����","n.","0"};
    	String[] v120={"lowbred","��Ұ�ģ�³ç��","adj.","0"};

    	String[] v121={"lubricious","�⻬�ģ���ɫ��","adj.","0"};
    	String[] v122={"locre","Ǯ������","n.","0"};
    	String[] v123={"lucubrate","�̿๥������ͷ���","v.","0"};
    	String[] v124={"lure","�ջ���������","n./v.","0"};
    	String[] v125={"luscious","��ζ�ģ���е�","adj.","0"};

    	String[] v126={"lusty","���������","adj.","0"};
    	String[] v127={"lynch","˽�̴���","v.","0"};
    	String[] v128={"mackintosh","���£���ˮ����","n.","0"};
    	String[] v129={"maculate","�аߵ��","adj.","0"};
    	String[] v130={"maestro","������ʦ�����ִ�ʦ","n.","0"};

    	String[] v131={"magniloquent","���ŵ�","adj.","0"};
    	String[] v132={"maim","ʹ�з�","v.","0"};
    	String[] v133={"makeshift","����Ʒ��Ȩ��֮��","n.","0"};
    	String[] v134={"malediction","����","n.","0"};
    	String[] v135={"malefactor","�ﷸ��������","n.","0"};

    	String[] v136={"maleficent","�к��ģ������","n.","0"};
    	String[] v137={"malice","���⣬Թ��","n.","0"};
    	String[] v138={"malignant","�񶾵ģ����������","adj.","0"};
    	String[] v139={"mallet","ľ鳣���ͷ��","n.","0"};
    	String[] v140={"malodor","���","n.","0"};

    	String[] v141={"manacle","����","n.","0"};
    	String[] v142={"maneuver","��ǲ�����ԣ�����","v./n.","0"};
    	String[] v143={"mangy","����޺��","adj.","0"};
    	String[] v144={"maraud","���ӣ��Ӷ�","v.","0"};
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	subInitial(DBParameter.pos_wl_44,v1);
		subInitial(DBParameter.pos_wl_44,v2);
		subInitial(DBParameter.pos_wl_44,v3);
		subInitial(DBParameter.pos_wl_44,v4);
		subInitial(DBParameter.pos_wl_44,v5);
		subInitial(DBParameter.pos_wl_44,v6);
		subInitial(DBParameter.pos_wl_44,v7);
		subInitial(DBParameter.pos_wl_44,v8);
		subInitial(DBParameter.pos_wl_44,v9);
		subInitial(DBParameter.pos_wl_44,v10);
		subInitial(DBParameter.pos_wl_44,v11);
		subInitial(DBParameter.pos_wl_44,v12);
		subInitial(DBParameter.pos_wl_44,v13);
		subInitial(DBParameter.pos_wl_44,v14);
		subInitial(DBParameter.pos_wl_44,v15);
		subInitial(DBParameter.pos_wl_44,v16);
		subInitial(DBParameter.pos_wl_44,v17);
		subInitial(DBParameter.pos_wl_44,v18);
		subInitial(DBParameter.pos_wl_44,v19);
		subInitial(DBParameter.pos_wl_44,v20);
		subInitial(DBParameter.pos_wl_44,v21);
		subInitial(DBParameter.pos_wl_44,v22);
		subInitial(DBParameter.pos_wl_44,v23);
		subInitial(DBParameter.pos_wl_44,v24);
		subInitial(DBParameter.pos_wl_44,v25);
		subInitial(DBParameter.pos_wl_44,v26);
		subInitial(DBParameter.pos_wl_44,v27);
		subInitial(DBParameter.pos_wl_44,v28);
		subInitial(DBParameter.pos_wl_44,v29);
		subInitial(DBParameter.pos_wl_44,v30);
		subInitial(DBParameter.pos_wl_44,v31);
		subInitial(DBParameter.pos_wl_44,v32);
		subInitial(DBParameter.pos_wl_44,v33);
		subInitial(DBParameter.pos_wl_44,v34);
		subInitial(DBParameter.pos_wl_44,v35);
		subInitial(DBParameter.pos_wl_44,v36);
		subInitial(DBParameter.pos_wl_44,v37);
		subInitial(DBParameter.pos_wl_44,v38);
		subInitial(DBParameter.pos_wl_44,v39);
		subInitial(DBParameter.pos_wl_44,v40);
		subInitial(DBParameter.pos_wl_44,v41);
		subInitial(DBParameter.pos_wl_44,v42);
		subInitial(DBParameter.pos_wl_44,v43);
		subInitial(DBParameter.pos_wl_44,v44);
		subInitial(DBParameter.pos_wl_44,v45);
		subInitial(DBParameter.pos_wl_44,v46);
		subInitial(DBParameter.pos_wl_44,v47);
		subInitial(DBParameter.pos_wl_44,v48);
		subInitial(DBParameter.pos_wl_44,v49);
		subInitial(DBParameter.pos_wl_44,v50);
		
		subInitial(DBParameter.pos_wl_44,v51);
		subInitial(DBParameter.pos_wl_44,v52);
		subInitial(DBParameter.pos_wl_44,v53);
		subInitial(DBParameter.pos_wl_44,v54);
		subInitial(DBParameter.pos_wl_44,v55);
		subInitial(DBParameter.pos_wl_44,v56);
		subInitial(DBParameter.pos_wl_44,v57);
		subInitial(DBParameter.pos_wl_44,v58);
		subInitial(DBParameter.pos_wl_44,v59);
		subInitial(DBParameter.pos_wl_44,v60);
		
		
		subInitial(DBParameter.pos_wl_44,v511);
		subInitial(DBParameter.pos_wl_44,v521);
		subInitial(DBParameter.pos_wl_44,v531);
		subInitial(DBParameter.pos_wl_44,v541);
		subInitial(DBParameter.pos_wl_44,v551);
		subInitial(DBParameter.pos_wl_44,v561);
		subInitial(DBParameter.pos_wl_44,v571);
		subInitial(DBParameter.pos_wl_44,v581);
		subInitial(DBParameter.pos_wl_44,v591);
		subInitial(DBParameter.pos_wl_44,v601);
		
		
		
		subInitial(DBParameter.pos_wl_44,v61);
		subInitial(DBParameter.pos_wl_44,v62);
		subInitial(DBParameter.pos_wl_44,v63);
		subInitial(DBParameter.pos_wl_44,v64);
		subInitial(DBParameter.pos_wl_44,v65);
		subInitial(DBParameter.pos_wl_44,v66);
		subInitial(DBParameter.pos_wl_44,v67);
		subInitial(DBParameter.pos_wl_44,v68);
		subInitial(DBParameter.pos_wl_44,v69);
		subInitial(DBParameter.pos_wl_44,v70);
		subInitial(DBParameter.pos_wl_44,v71);
		subInitial(DBParameter.pos_wl_44,v72);
		subInitial(DBParameter.pos_wl_44,v73);
		subInitial(DBParameter.pos_wl_44,v74);
		subInitial(DBParameter.pos_wl_44,v75);
		subInitial(DBParameter.pos_wl_44,v76);
		subInitial(DBParameter.pos_wl_44,v77);
		subInitial(DBParameter.pos_wl_44,v78);
		subInitial(DBParameter.pos_wl_44,v79);
		subInitial(DBParameter.pos_wl_44,v80);
		subInitial(DBParameter.pos_wl_44,v81);
		subInitial(DBParameter.pos_wl_44,v82);
		subInitial(DBParameter.pos_wl_44,v83);
		subInitial(DBParameter.pos_wl_44,v84);
		subInitial(DBParameter.pos_wl_44,v85);
		subInitial(DBParameter.pos_wl_44,v86);
		subInitial(DBParameter.pos_wl_44,v87);
		subInitial(DBParameter.pos_wl_44,v88);
		subInitial(DBParameter.pos_wl_44,v89);
		subInitial(DBParameter.pos_wl_44,v90);
		subInitial(DBParameter.pos_wl_44,v91);
		subInitial(DBParameter.pos_wl_44,v92);
		subInitial(DBParameter.pos_wl_44,v93);
		subInitial(DBParameter.pos_wl_44,v94);
		subInitial(DBParameter.pos_wl_44,v95);
		subInitial(DBParameter.pos_wl_44,v96);
		subInitial(DBParameter.pos_wl_44,v97);
		subInitial(DBParameter.pos_wl_44,v98);
		subInitial(DBParameter.pos_wl_44,v99);
		subInitial(DBParameter.pos_wl_44,v100);
		subInitial(DBParameter.pos_wl_44,v101);
		subInitial(DBParameter.pos_wl_44,v102);
		subInitial(DBParameter.pos_wl_44,v103);
		subInitial(DBParameter.pos_wl_44,v104);
		subInitial(DBParameter.pos_wl_44,v105);
		subInitial(DBParameter.pos_wl_44,v106);
		subInitial(DBParameter.pos_wl_44,v107);
		subInitial(DBParameter.pos_wl_44,v108);
		subInitial(DBParameter.pos_wl_44,v109);
		subInitial(DBParameter.pos_wl_44,v110);
		subInitial(DBParameter.pos_wl_44,v111);
		subInitial(DBParameter.pos_wl_44,v112);
		subInitial(DBParameter.pos_wl_44,v113);
		subInitial(DBParameter.pos_wl_44,v114);
		subInitial(DBParameter.pos_wl_44,v115);
		subInitial(DBParameter.pos_wl_44,v116);
		subInitial(DBParameter.pos_wl_44,v117);
		subInitial(DBParameter.pos_wl_44,v118);
		
		subInitial(DBParameter.pos_wl_44,v119);
		subInitial(DBParameter.pos_wl_44,v120);
		subInitial(DBParameter.pos_wl_44,v121);
		subInitial(DBParameter.pos_wl_44,v122);
		subInitial(DBParameter.pos_wl_44,v123);
		subInitial(DBParameter.pos_wl_44,v124);
		subInitial(DBParameter.pos_wl_44,v125);
		subInitial(DBParameter.pos_wl_44,v126);
		subInitial(DBParameter.pos_wl_44,v127);
		subInitial(DBParameter.pos_wl_44,v128);
		subInitial(DBParameter.pos_wl_44,v129);
		subInitial(DBParameter.pos_wl_44,v130);
		subInitial(DBParameter.pos_wl_44,v131);
		subInitial(DBParameter.pos_wl_44,v132);
		subInitial(DBParameter.pos_wl_44,v133);
		subInitial(DBParameter.pos_wl_44,v134);
		subInitial(DBParameter.pos_wl_44,v135);
		subInitial(DBParameter.pos_wl_44,v136);
		subInitial(DBParameter.pos_wl_44,v137);
		subInitial(DBParameter.pos_wl_44,v138);
		subInitial(DBParameter.pos_wl_44,v139);
		subInitial(DBParameter.pos_wl_44,v140);
		subInitial(DBParameter.pos_wl_44,v141);
		subInitial(DBParameter.pos_wl_44,v142);
		subInitial(DBParameter.pos_wl_44,v143);
		subInitial(DBParameter.pos_wl_44,v144);
		


    	
    }
    public void doList_45(){
    	
    	
    	
    	String[] v1={"mariner","ˮ�֣���Ա","n.","0"};
    	String[] v2={"marrow","���裬����","n.","0"};
    	String[] v3={"matador","��ţʿ","n.","0"};
    	String[] v4={"matriarchy","ĸȨ�ƣ���Ůͳ��","n.","0"};
    	String[] v5={"matriculate","¼ȡ","v.","0"};

    	String[] v6={"maxim","���ԣ��ձ�����","n.","0"};
    	String[] v7={"mayhem","�����˺���","n.","0"};
    	String[] v8={"medicate","��ҩҽ�Σ�����ҩ��","v.","0"};
    	String[] v9={"megalomania","�Դ��","n.","0"};
    	String[] v10={"memento","����Ʒ","n.","0"};

    	String[] v11={"menial","���˵ģ���΢�ģ�����","adj./n.","0"};
    	String[] v12={"mermaid","������","n.","0"};
    	String[] v13={"mesmerism","������������״̬","n.","0"};
    	String[] v14={"mesmerize","��...���ߣ���ס","v.","0"};
    	String[] v15={"metallurgy","ұ��","n.","0"};

    	String[] v16={"miasma","�������������Ļ�����Ӱ��","n.","0"};
    	String[] v17={"midget","٪��","n.","0"};
    	String[] v18={"mien","��ɣ����","n.","0"};
    	String[] v19={"militant","��ս�ģ��ñ�����","adj.","0"};
    	String[] v20={"millennium","һǧ�̫꣬ƽʢ��","n.","0"};

    	String[] v21={"miraculous","�漣�ģ�����˼���","adj.","0"};
    	String[] v22={"miscellany","�����","n.","0"};
    	String[] v23={"missive","�ż�������","n.","0"};
    	String[] v24={"mistimed","����ʱ����","adj.","0"};
    	String[] v25={"mistral","��������ǿ��","n.","0"};

    	String[] v26={"molest","ɧ�ţ�����","v.","0"};
    	String[] v27={"monastery","���޵�Ժ��ɮԺ","n.","0"};
    	String[] v28={"monograph","ר������","n.","0"};
    	String[] v29={"monopolize","¢�ϣ���ռ","v.","0"};
    	String[] v30={"monotone","������","adj.","0"};

    	String[] v31={"monstrous","�޴�ģ����µ�","adj.","0"};
    	String[] v32={"moody","ϲŭ�޳��ģ�Ƣ������","adj.","0"};
    	String[] v33={"moor","��Ұ�أ���Ұ��ʹ������ͣ��","n./v.","0"};
    	String[] v34={"mope","�������֣����������������ˣ���������","v./n.","0"};
    	String[] v35={"morass","����أ���������������","n./v.","0"};

    	String[] v36={"moron","����֮�ˣ����ܶ�","n.","0"};
    	String[] v37={"motile","�ܶ��ģ����Զ�����","adj.","0"};
    	String[] v38={"mottle","ʹ����ɫ","v.","0"};
    	String[] v39={"mountebank","�������У�ƭ��","n.","0"};
    	String[] v40={"muddle","���ң��Ի�","n.","0"};

    	String[] v41={"muddy","����ģ����ǵģ�������","adj.","0"};
    	String[] v42={"muggy","���ȶ���ʪ��","adj.","0"};
    	String[] v43={"mulct","���𣻴��Է���թȡ","n./v.","0"};
    	String[] v44={"multifarious","���ֵģ���ʽ������","adj.","0"};
    	String[] v45={"multitude","���������ڣ�ƽ��","n.","0"};

    	String[] v46={"muniments","���ݣ�����","n.","0"};
    	String[] v47={"musty","��ù�ģ���ù����","adj.","0"};
    	String[] v48={"mutilate","�к����ж�","v.","0"};
    	String[] v49={"mutinous","�ѱ�ģ�������","adj.","0"};
    	String[] v50={"mutton","����","n.","0"};

    	String[] v51={"muzzy","ͷ�Ժ�Ϳ��","adj.","0"};
    	String[] v52={"naivety","���棬����","n.","0"};
    	String[] v53={"nasai","�ǵģ��б�����","adj.","0"};
    	String[] v54={"natation","��Ӿ����Ӿ��","n.","0"};
    	String[] v55={"naysayer","�����ߣ�����","n.","0"};

    	String[] v56={"necessitous","ƶ���ģ������","n.","0"};
    	String[] v57={"necropolis","��Ĺ�أ���Ĺ","n.","0"};
    	String[] v58={"nectar","����Һ������","n.","0"};
    	String[] v59={"nemesis","��Ӧ���췣","n.","0"};
    	String[] v60={"neonate","������","n.","0"};

    	String[] v71={"nephritis","����","n.","0"};
    	String[] v72={"nestle","���ʵذ��٣�����","v.","0"};
    	String[] v73={"nestling","��δ�볲��С��","n.","0"};
    	String[] v74={"nethermost","��͵ģ����·���","adj.","0"};
    	String[] v75={"niggard","���Ĺ�","n.","0"};

    	String[] v76={"niggling","�����","adj.","0"};
    	String[] v77={"nihilism","�������壬�������","n.","0"};
    	String[] v78={"nimble","���ݵģ�����","adj.","0"};
    	String[] v79={"nippers","ǯ�ӣ�����","n.","0"};
    	String[] v80={"nipping","����ģ��̹ǵ�","adj.","0"};

    	String[] v81={"nonesuch","��ƥ�е���","n.","0"};
    	String[] v82={"nonpareil","��ƥ�еģ��ˣ�","adj./v.","0"};
    	String[] v83={"noose","����������","n.","0"};
    	String[] v84={"notability","����������","n.","0"};
    	String[] v85={"nude","������ģ�������","adj./n.","0"};

    	String[] v86={"numerology","��������ѧ","n.","0"};
    	String[] v87={"numismatic","Ǯ��ѧ��","adj.","0"};
    	String[] v88={"nuptial","�����ģ������","adj.","0"};
    	String[] v89={"nymph","����Ů����Ů","n.","0"};
    	String[] v90={"oar","������","n./v.","0"};


    	String[] v91={"oatmeal","����Ƭ","n.","0"};
    	String[] v92={"obelisk","���Ɱ","n.","0"};
    	String[] v93={"oblation","�ڽ̵Ĺ�Ʒ","n.","0"};
    	String[] v94={"observance","���أ�����","n.","0"};
    	String[] v95={"obstrude","ͻ����ǿ��","v.","0"};

    	String[] v96={"ocular","�۾��ģ��Ӿ���","adj.","0"};
    	String[] v97={"oddment","�������ͷ","n.","0"};
    	String[] v98={"odoriferous","����ζ��","adj.","0"};
    	String[] v99={"olfactory","�����","adj.","0"};
    	String[] v100={"oligarch","��ͷ����ִ����","n.","0"};

    	String[] v101={"omnivorous","��ʳ�ģ���Ȥ���","adj.","0"};
    	String[] v102={"onslaught","�͹�����Ϯ","n.","0"};
    	String[] v103={"onus","���񣬸���","n.","0"};
    	String[] v104={"ooze","��������������������ʧ","v.","0"};
    	String[] v105={"opiate","����ҩ��ѻƬ�Ƽ�","n.","0"};

    	String[] v106={"optimization","���Ż�","n.","0"};
    	String[] v107={"opus","������������Ʒ","n.","0"};
    	String[] v108={"oracular","���͵ģ���ʶģ����","adj.","0"};
    	String[] v109={"orifice","С���ڣ�С��","n.","0"};
    	String[] v110={"orotund","�����ģ����ŵ�","adj.","0"};

    	String[] v111={"otiose","����Ҫ�ģ������","adj.","0"};
    	String[] v112={"outfox","�Ի���ʤ��","v.","0"};
    	String[] v113={"oversight","�����ʧ��","v.","0"};
    	String[] v114={"overweening","�ַ��ģ��������ŵ�","adj.","0"};
    	String[] v115={"palaver","��̸�����","v./n.","0"};

    	String[] v116={"paling","��ʣ�ľդ��","n.","0"};
    	String[] v117={"pamper","���ݣ����ֹػ�","v.","0"};
    	String[] v118={"pane","������","n.","0"};
    	String[] v119={"panoramic","ȫ���ģ�ȫò�ģ����۵�","adj.","0"};
    	String[] v120={"pantechnicon","�Ҿֿ߲⣬�Ҿ߰��˳�","n.","0"};

    	String[] v121={"pantheon","�����","n.","0"};
    	String[] v122={"paralyze","ʹ̱��","v.","0"};
    	String[] v123={"parley","��̸����̸����̸����̸","n./v.","0"};
    	String[] v124={"parlous","����ס�ģ�Σ�յ�","adj.","0"};
    	String[] v125={"parochial","�����ģ��ط��Եģ���С��","adj.","0"};

    	String[] v126={"parturition","����������","v.","0"};
    	String[] v127={"pastor","��ʦ������","n.","0"};
    	String[] v128={"pathetic","���������ģ������ѹ���","adj.","0"};
    	String[] v129={"pathos","���ϣ�����","v.","0"};
    	String[] v130={"pawn","�䵱����Ѻ�������õ�С����","n./v.","0"};

    	String[] v131={"peaky","���ݵģ�������","adj.","0"};
    	String[] v132={"peculate","Ų�ã����","v.","0"};
    	String[] v133={"pecuniary","��Ǯ��","adj.","0"};
    	String[] v134={"peddle","����","adj.","0"};
    	String[] v135={"peek","͵��","v.","0"};

    	String[] v136={"peep","Ƴ����͵��","n./v.","0"};
    	String[] v137={"peery","���ӵģ������","adj.","0"};
    	String[] v138={"pelt","�ӣ�ëƤ","v./n.","0"};
    	String[] v139={"pendent","���ŵģ����ҵ�","adj.","0"};
    	String[] v140={"penetration","��͸��������","n.","0"};

    	String[] v141={"pension","���Ͻ����ݽ�","n.","0"};
    	String[] v142={"pensive","��˼�ģ���ü������","adj.","0"};
    	String[] v143={"penumbra","�����밵֮������Ե����","n.","0"};
    	String[] v144={"peptic","����θø�ģ���������","adj.","0"};
    	String[] v145={"peptic","���˳�����͸","v.","0"};

    	String[] v146={"percussion","�û�����","n.","0"};
    	String[] v147={"perigee","���ص�","adj.","0"};
    	String[] v148={"periphrastic","�ػصģ���׸��","adj.","0"};
    	String[] v149={"perishable","�׸��ܵģ����ܵĶ���","adj.","0"};
    	String[] v150={"persnickety","�����ģ����޵�","adj.","0"};

    	String[] v151={"personage","���ˣ���ɫ","n.","0"};
    	String[] v152={"perverse","�����ʵģ�������õģ��������Ե�","adj.","0"};
    	String[] v153={"pervert","ʹ���䣬���ã�����","v.","0"};
    	
    	
    	
    	
    	
    	
    	
    	subInitial(DBParameter.pos_wl_45,v1);
		subInitial(DBParameter.pos_wl_45,v2);
		subInitial(DBParameter.pos_wl_45,v3);
		subInitial(DBParameter.pos_wl_45,v4);
		subInitial(DBParameter.pos_wl_45,v5);
		subInitial(DBParameter.pos_wl_45,v6);
		subInitial(DBParameter.pos_wl_45,v7);
		subInitial(DBParameter.pos_wl_45,v8);
		subInitial(DBParameter.pos_wl_45,v9);
		subInitial(DBParameter.pos_wl_45,v10);
		subInitial(DBParameter.pos_wl_45,v11);
		subInitial(DBParameter.pos_wl_45,v12);
		subInitial(DBParameter.pos_wl_45,v13);
		subInitial(DBParameter.pos_wl_45,v14);
		subInitial(DBParameter.pos_wl_45,v15);
		subInitial(DBParameter.pos_wl_45,v16);
		subInitial(DBParameter.pos_wl_45,v17);
		subInitial(DBParameter.pos_wl_45,v18);
		subInitial(DBParameter.pos_wl_45,v19);
		subInitial(DBParameter.pos_wl_45,v20);
		subInitial(DBParameter.pos_wl_45,v21);
		subInitial(DBParameter.pos_wl_45,v22);
		subInitial(DBParameter.pos_wl_45,v23);
		subInitial(DBParameter.pos_wl_45,v24);
		subInitial(DBParameter.pos_wl_45,v25);
		subInitial(DBParameter.pos_wl_45,v26);
		subInitial(DBParameter.pos_wl_45,v27);
		subInitial(DBParameter.pos_wl_45,v28);
		subInitial(DBParameter.pos_wl_45,v29);
		subInitial(DBParameter.pos_wl_45,v30);
		subInitial(DBParameter.pos_wl_45,v31);
		subInitial(DBParameter.pos_wl_45,v32);
		subInitial(DBParameter.pos_wl_45,v33);
		subInitial(DBParameter.pos_wl_45,v34);
		subInitial(DBParameter.pos_wl_45,v35);
		subInitial(DBParameter.pos_wl_45,v36);
		subInitial(DBParameter.pos_wl_45,v37);
		subInitial(DBParameter.pos_wl_45,v38);
		subInitial(DBParameter.pos_wl_45,v39);
		subInitial(DBParameter.pos_wl_45,v40);
		subInitial(DBParameter.pos_wl_45,v41);
		subInitial(DBParameter.pos_wl_45,v42);
		subInitial(DBParameter.pos_wl_45,v43);
		subInitial(DBParameter.pos_wl_45,v44);
		subInitial(DBParameter.pos_wl_45,v45);
		subInitial(DBParameter.pos_wl_45,v46);
		subInitial(DBParameter.pos_wl_45,v47);
		subInitial(DBParameter.pos_wl_45,v48);
		subInitial(DBParameter.pos_wl_45,v49);
		subInitial(DBParameter.pos_wl_45,v50);
		
		subInitial(DBParameter.pos_wl_45,v51);
		subInitial(DBParameter.pos_wl_45,v52);
		subInitial(DBParameter.pos_wl_45,v53);
		subInitial(DBParameter.pos_wl_45,v54);
		subInitial(DBParameter.pos_wl_45,v55);
		subInitial(DBParameter.pos_wl_45,v56);
		subInitial(DBParameter.pos_wl_45,v57);
		subInitial(DBParameter.pos_wl_45,v58);
		subInitial(DBParameter.pos_wl_45,v59);
		subInitial(DBParameter.pos_wl_45,v60);

		subInitial(DBParameter.pos_wl_45,v71);
		subInitial(DBParameter.pos_wl_45,v72);
		subInitial(DBParameter.pos_wl_45,v73);
		subInitial(DBParameter.pos_wl_45,v74);
		subInitial(DBParameter.pos_wl_45,v75);
		subInitial(DBParameter.pos_wl_45,v76);
		subInitial(DBParameter.pos_wl_45,v77);
		subInitial(DBParameter.pos_wl_45,v78);
		subInitial(DBParameter.pos_wl_45,v79);
		subInitial(DBParameter.pos_wl_45,v80);
		subInitial(DBParameter.pos_wl_45,v81);
		subInitial(DBParameter.pos_wl_45,v82);
		subInitial(DBParameter.pos_wl_45,v83);
		subInitial(DBParameter.pos_wl_45,v84);
		subInitial(DBParameter.pos_wl_45,v85);
		subInitial(DBParameter.pos_wl_45,v86);
		subInitial(DBParameter.pos_wl_45,v87);
		subInitial(DBParameter.pos_wl_45,v88);
		subInitial(DBParameter.pos_wl_45,v89);
		subInitial(DBParameter.pos_wl_45,v90);
		subInitial(DBParameter.pos_wl_45,v91);
		subInitial(DBParameter.pos_wl_45,v92);
		subInitial(DBParameter.pos_wl_45,v93);
		subInitial(DBParameter.pos_wl_45,v94);
		subInitial(DBParameter.pos_wl_45,v95);
		subInitial(DBParameter.pos_wl_45,v96);
		subInitial(DBParameter.pos_wl_45,v97);
		subInitial(DBParameter.pos_wl_45,v98);
		subInitial(DBParameter.pos_wl_45,v99);
		subInitial(DBParameter.pos_wl_45,v100);
		subInitial(DBParameter.pos_wl_45,v101);
		subInitial(DBParameter.pos_wl_45,v102);
		subInitial(DBParameter.pos_wl_45,v103);
		subInitial(DBParameter.pos_wl_45,v104);
		subInitial(DBParameter.pos_wl_45,v105);
		subInitial(DBParameter.pos_wl_45,v106);
		subInitial(DBParameter.pos_wl_45,v107);
		subInitial(DBParameter.pos_wl_45,v108);
		subInitial(DBParameter.pos_wl_45,v109);
		subInitial(DBParameter.pos_wl_45,v110);
		subInitial(DBParameter.pos_wl_45,v111);
		subInitial(DBParameter.pos_wl_45,v112);
		subInitial(DBParameter.pos_wl_45,v113);
		subInitial(DBParameter.pos_wl_45,v114);
		subInitial(DBParameter.pos_wl_45,v115);
		subInitial(DBParameter.pos_wl_45,v116);
		subInitial(DBParameter.pos_wl_45,v117);
		subInitial(DBParameter.pos_wl_45,v118);
		
		subInitial(DBParameter.pos_wl_45,v119);
		subInitial(DBParameter.pos_wl_45,v120);
		subInitial(DBParameter.pos_wl_45,v121);
		subInitial(DBParameter.pos_wl_45,v122);
		subInitial(DBParameter.pos_wl_45,v123);
		subInitial(DBParameter.pos_wl_45,v124);
		subInitial(DBParameter.pos_wl_45,v125);
		subInitial(DBParameter.pos_wl_45,v126);
		subInitial(DBParameter.pos_wl_45,v127);
		subInitial(DBParameter.pos_wl_45,v128);
		subInitial(DBParameter.pos_wl_45,v129);
		subInitial(DBParameter.pos_wl_45,v130);
		subInitial(DBParameter.pos_wl_45,v131);
		subInitial(DBParameter.pos_wl_45,v132);
		subInitial(DBParameter.pos_wl_45,v133);
		subInitial(DBParameter.pos_wl_45,v134);
		subInitial(DBParameter.pos_wl_45,v135);
		subInitial(DBParameter.pos_wl_45,v136);
		subInitial(DBParameter.pos_wl_45,v137);
		subInitial(DBParameter.pos_wl_45,v138);
		subInitial(DBParameter.pos_wl_45,v139);
		subInitial(DBParameter.pos_wl_45,v140);
		subInitial(DBParameter.pos_wl_45,v141);
		subInitial(DBParameter.pos_wl_45,v142);
		subInitial(DBParameter.pos_wl_45,v143);
		subInitial(DBParameter.pos_wl_45,v144);
		subInitial(DBParameter.pos_wl_45,v145);
		subInitial(DBParameter.pos_wl_45,v146);
		subInitial(DBParameter.pos_wl_45,v147);
		subInitial(DBParameter.pos_wl_45,v148);
		subInitial(DBParameter.pos_wl_45,v149);
		subInitial(DBParameter.pos_wl_45,v150);
		subInitial(DBParameter.pos_wl_45,v151);
		subInitial(DBParameter.pos_wl_45,v152);
		subInitial(DBParameter.pos_wl_45,v153);
		
    }
    public void doList_46(){
    	
    	
    	
    	
    	String[] v1={"pesky","����ģ����˵�","adj.","0"};
    	String[] v2={"pettish","��ŭ�ģ�ʹ���ӵ�","adj.","0"};
    	String[] v3={"pharisaic","α�Ƶģ�αװ�ϵ�","adj.","0"};
    	String[] v4={"phial","Сƿ","n.","0"};
    	String[] v5={"philology","����ѧ����ѧ����ѧ","n.","0"};

    	String[] v6={"phobia","�־�֢","n.","0"};
    	String[] v7={"phony","�ٵģ�α���","adj.","0"};
    	String[] v8={"piazza","��̨���㳡","n.","0"};
    	String[] v9={"piebald","���ߵģ��߲���","adj.","0"};
    	String[] v10={"piecemeal","һ��һ���ģ������","adj.","0"};

    	String[] v11={"pier","�Ŷ�","n.","0"};
    	String[] v12={"pilfer","͵��","v.","0"};
    	String[] v13={"pillage","���٣��Ӷ�","v.","0"};
    	String[] v14={"pincers","ǯ�ӣ�����","n.","0"};
    	String[] v15={"piscatorial","����ģ������","adj.","0"};

    	String[] v16={"pitiless","����ģ����ģ�������֮�ĵ�","adj.","0"};
    	String[] v17={"pivot","���ᣬ���ģ���ת","n./v.","0"};
    	String[] v18={"plank","��ľ�壬Ҫ��","n.","0"};
    	String[] v19={"plaza","�㳡������","n.","0"};
    	String[] v20={"plebeian","ȫȨ�ģ�ȫ���ϯ��","adj.","0"};

    	String[] v21={"plenary","ȫȨ�ģ�ȫ���ϯ��","adj.","0"};
    	String[] v22={"plentitude","���","n.","0"};
    	String[] v23={"pleonastic","���µ�","adj.","0"};
    	String[] v24={"pliers","ǯ��","n.","0"};
    	String[] v25={"plump","���ֵģ�������","adj.","0"};

    	String[] v26={"poach","͵ȡ����ȡ","v.","0"};
    	String[] v27={"poltroon","ų��","n.","0"};
    	String[] v28={"polyandry","һ�޶����","n.","0"};
    	String[] v29={"polyglot","ͨ���������Ե�","adj.","0"};
    	String[] v30={"polymath","֪ʶ�㲩��","n.","0"};

    	String[] v31={"pony","С����","n.","0"};
    	String[] v32={"porcine","��ģ������","adj.","0"};
    	String[] v33={"porridge","��Ƭ��","n.","0"};
    	String[] v34={"portable","���ģ�����ʽ��","adj.","0"};
    	String[] v35={"portend","Ԥ�ף�Ԥʾ","n.","0"};

    	String[] v36={"positiveness","�϶���ȷ��","v.","0"};
    	String[] v37={"posterior","�Ϻ��","adj.","0"};
    	String[] v38={"postscript","���ԣ����","n.","0"};
    	String[] v39={"potboiler","���������������Ʒ","n.","0"};
    	String[] v40={"prance","��������","v.","0"};

    	String[] v41={"prefigure","Ԥʾ��Ԥ��","v.","0"};
    	String[] v42={"prehensile","��ץ�����ģ��ܲ��ƶ�����","adj.","0"};
    	String[] v43={"preponderant","�������ģ����Ƶģ�ѹ���Ե�","adj.","0"};
    	String[] v44={"prepossessing","���˺øе�","adj.","0"};
    	String[] v45={"presentiment","Ԥ�У�Ԥ��","n.","0"};

    	String[] v46={"presumable","���ܵģ��ɼٶ���","adj.","0"};
    	String[] v47={"pretence","��α���ӿ�","n.","0"};
    	String[] v48={"prevision","�ȼ���Ԥ��","n.","0"};
    	String[] v49={"prick","С�̣���ʹ�����ˣ�����","n./v.","0"};
    	String[] v50={"prickle","�̣�������ʹ","n./v.","0"};

    	String[] v51={"prig","���������⣬��ѧ����","n.","0"};
    	String[] v52={"prissy","��С��΢�ģ����ʵģ�ΪС�¹��ǵ�","adj.","0"};
    	String[] v53={"procreate","����","v.","0"};
    	String[] v54={"procrustean","ǿ��һ�µ�","adj.","0"};
    	String[] v55={"progenitor","���ȣ�ʼ��","n.","0"};

    	String[] v56={"prognosticate","Ԥʾ��Ԥ��","v.","0"};
    	String[] v57={"proofread","У��","v.","0"};
    	String[] v58={"prorogue","��ᣬ����","v.","0"};
    	String[] v59={"protrude","ͻ�������","v.","0"};
    	String[] v60={"proverbially","���˲�֪��","adv.","0"};

    	String[] v61={"psalm","����ʫ��ʥʫ","n.","0"};
    	String[] v62={"puberty","�ഺ��","n.","0"};
    	String[] v63={"puffery","�������ޣ����Ĺ�棬����","n.","0"};
    	String[] v64={"pullulate","��ֳ������","v.","0"};
    	String[] v65={"pulpit","��̳","n.","0"};

    	String[] v66={"pulsate","�й��ɵ���","v.","0"};
    	String[] v67={"pulsation","�������������н���ĹĶ�","n.","0"};
    	String[] v68={"pummel","�����ش򣬴��","v.","0"};
    	String[] v69={"purblind","�޶۵ģ��������ѵ�","adj.","0"};
    	String[] v70={"purport","���壬����","n.","0"};

    	String[] v71={"purse","��£�����Ǯ��","v./n.","0"};
    	String[] v72={"putative","���ϵģ��ձ���Ϊ��","adj.","0"};
    	String[] v73={"putrefy","ʹ����","v.","0"};
    	String[] v74={"putrid","������","adj.","0"};
    	String[] v75={"pygmy","���ˣ�٪��","n.","0"};

    	String[] v76={"pyromania","�ݻ��","n.","0"};
    	String[] v77={"quadrangle","�ı���","n.","0"};
    	String[] v78={"quadruped","������","n.","0"};
    	String[] v79={"quagmire","����أ�����","n.","0"};
    	String[] v80={"qualm","�ɾ壬���Ų���","n.","0"};

    	String[] v81={"queasy","���˶��ĵģ��������ǵ�","adj.","0"};
    	String[] v82={"queer","��ֵģ�����","adj.","0"};
    	String[] v83={"quintessence","�����İ���������","n.","0"};
    	String[] v84={"quip","��Ƥ��������","n.","0"};
    	String[] v85={"racketeer","��թ�ߣ���ȡ������Ǯ�Ƶ���","n.","0"};

    	String[] v86={"raillery","����ĳ�Ū","v.","0"};
    	String[] v87={"rapscallion","��å�����","n.","0"};
    	String[] v88={"rasp","�����̶�������","v.","0"};
    	String[] v89={"ratify","��׼����Э���ȣ�","v.","0"};
    	String[] v90={"ravish","��ס��ǿ��","v.","0"};

    	String[] v91={"rebarbative","��������ģ�ð���˵�","adj.","0"};
    	String[] v92={"reckon","�ƶϣ����ƣ����룬����","v.","0"};
    	String[] v93={"recline","б�У�����","v.","0"};
    	String[] v94={"reconnoiter","��飬����","v.","0"};
    	String[] v95={"reedy","����«έ�ģ����������߶����","n.","0"};

    	String[] v96={"regal","�����ģ�������","adj.","0"};
    	String[] v97={"regent","������","n.","0"};
    	String[] v98={"regiment","�ţ��ϸ����","n./v.","0"};
    	String[] v99={"reincarnate","ʹ����ת��","v.","0"};
    	String[] v100={"rejoin","�ش𣬴��","v.","0"};

    	String[] v101={"rejoinder","�ش𣬴��","n.","0"};
    	String[] v102={"remission","����","n.","0"};
    	String[] v103={"remit","���","v.","0"};
    	String[] v104={"remittance","���","n.","0"};
    	String[] v105={"remittent","��Ъ�Եģ����ú�����","adj.","0"};

    	String[] v106={"remonstrance","���飬��Թ","n.","0"};
    	String[] v107={"remunerate","���꣬����","v.","0"};
    	String[] v108={"renascent","�����ģ������","adj.","0"};
    	String[] v109={"rendition","���ݣ����ݣ����࣬�ݳ�","n.","0"};
    	String[] v110={"renunciate","����","v.","0"};

    	String[] v111={"repent","�ûڣ����","v.","0"};
    	String[] v112={"replica","����Ʒ","n.","0"};
    	String[] v113={"reportage","��������������Ϣ��������ѧ","v.","0"};
    	String[] v114={"repository","�����ң��ֿ�","n.","0"};
    	String[] v115={"rescript","���棬����","n.","0"};

    	String[] v116={"reshuffle","��ϴ�ƣ�����","v.","0"};
    	String[] v117={"restorative","�ָ�������","adj.","0"};
    	String[] v118={"resurge","����","v.","0"};
    	String[] v119={"retention","����������","n.","0"};
    	String[] v120={"retentive","�м������","adj.","0"};

    	String[] v121={"reticulation","��Ŀ����״","n.","0"};
    	String[] v122={"retrenchment","��ʡ������","v.","0"};
    	String[] v123={"retroactive","�ݼ������ģ���׷��Ч����","adj.","0"};
    	String[] v124={"reversion","���أ���ת","n.","0"};
    	String[] v125={"revulsion","������񣬾��ҷ�Ӧ","n.","0"};

    	String[] v126={"rhapsody","����֮ʫ��������","n.","0"};
    	String[] v127={"riffle","����","n.","0"};
    	String[] v128={"riffraff","�ں�֮�ڣ�Ⱥå","n.","0"};
    	String[] v129={"rigmarole","�߳��ķϻ�","n.","0"};
    	String[] v130={"rinse","����ˮ��ϴ��Ưϴ","v.","0"};

    	String[] v1211={"rip","˺�ѣ�˺��","v.","0"};
    	String[] v1221={"roister","�Ⱦ�����","v.","0"};
    	String[] v1231={"rollicking","���ֵ�","adj.","0"};
    	String[] v1241={"rosy","õ��ɫ�ģ����õģ��ֹ۵ģ�������","adj.","0"};
    	String[] v1251={"rote","����Ӳ��","n.","0"};

    	String[] v1261={"rotund","Բ�ֵ�","n.","0"};
    	String[] v1271={"roundabout","��Զ���ģ�ת��Ĩ�ǵ�","adj.","0"};
    	String[] v1281={"rout","��ܣ�����","n.","0"};
    	String[] v1291={"rove","���ˣ�Ư��","v.","0"};
    	String[] v1301={"rowdy","���ֵģ��ֱ���","adj.","0"};

    	String[] v131={"rubble","��һ�ѣ���ʯ������","n.","0"};
    	String[] v132={"ruck","����","n.","0"};
    	String[] v133={"rucksack","�����еȵģ�����","n.","0"};
    	String[] v134={"ruddy","����ɫ������ģ���ɫ��","adj.","0"};
    	String[] v135={"rumble","�����ͳ���¡¡��","v.","0"};

    	String[] v136={"ruminate","��˼","v.","0"};
    	String[] v137={"rustle","��ʹĳ��������ˬ������","v.","0"};
    	String[] v138={"rustler","͵ţ��","n.","0"};
    	String[] v139={"saccharine","��̬�ȣ����ĵģ���˵���������εε�","v.","0"};
    	String[] v140={"sack","�ֲ������Ӷ�","n./v.","0"};

    	String[] v141={"sacrament","ʥ��ʥ��","n.","0"};
    	String[] v142={"sadistic","ʩŰ��ģ���ʩŰ���","adj.","0"};
    	String[] v143={"safe","���չ�����ң�����","n.","0"};
    	String[] v144={"saga","Ӣ�۹��£���ƪС˵","n.","0"};
    	String[] v145={"saliferous","���εģ����ε�","adj.","0"};
    	
    	
    	
    	
    	
    	subInitial(DBParameter.pos_wl_46,v1);
		subInitial(DBParameter.pos_wl_46,v2);
		subInitial(DBParameter.pos_wl_46,v3);
		subInitial(DBParameter.pos_wl_46,v4);
		subInitial(DBParameter.pos_wl_46,v5);
		subInitial(DBParameter.pos_wl_46,v6);
		subInitial(DBParameter.pos_wl_46,v7);
		subInitial(DBParameter.pos_wl_46,v8);
		subInitial(DBParameter.pos_wl_46,v9);
		subInitial(DBParameter.pos_wl_46,v10);
		subInitial(DBParameter.pos_wl_46,v11);
		subInitial(DBParameter.pos_wl_46,v12);
		subInitial(DBParameter.pos_wl_46,v13);
		subInitial(DBParameter.pos_wl_46,v14);
		subInitial(DBParameter.pos_wl_46,v15);
		subInitial(DBParameter.pos_wl_46,v16);
		subInitial(DBParameter.pos_wl_46,v17);
		subInitial(DBParameter.pos_wl_46,v18);
		subInitial(DBParameter.pos_wl_46,v19);
		subInitial(DBParameter.pos_wl_46,v20);
		subInitial(DBParameter.pos_wl_46,v21);
		subInitial(DBParameter.pos_wl_46,v22);
		subInitial(DBParameter.pos_wl_46,v23);
		subInitial(DBParameter.pos_wl_46,v24);
		subInitial(DBParameter.pos_wl_46,v25);
		subInitial(DBParameter.pos_wl_46,v26);
		subInitial(DBParameter.pos_wl_46,v27);
		subInitial(DBParameter.pos_wl_46,v28);
		subInitial(DBParameter.pos_wl_46,v29);
		subInitial(DBParameter.pos_wl_46,v30);
		subInitial(DBParameter.pos_wl_46,v31);
		subInitial(DBParameter.pos_wl_46,v32);
		subInitial(DBParameter.pos_wl_46,v33);
		subInitial(DBParameter.pos_wl_46,v34);
		subInitial(DBParameter.pos_wl_46,v35);
		subInitial(DBParameter.pos_wl_46,v36);
		subInitial(DBParameter.pos_wl_46,v37);
		subInitial(DBParameter.pos_wl_46,v38);
		subInitial(DBParameter.pos_wl_46,v39);
		subInitial(DBParameter.pos_wl_46,v40);
		subInitial(DBParameter.pos_wl_46,v41);
		subInitial(DBParameter.pos_wl_46,v42);
		subInitial(DBParameter.pos_wl_46,v43);
		subInitial(DBParameter.pos_wl_46,v44);
		subInitial(DBParameter.pos_wl_46,v45);
		subInitial(DBParameter.pos_wl_46,v46);
		subInitial(DBParameter.pos_wl_46,v47);
		subInitial(DBParameter.pos_wl_46,v48);
		subInitial(DBParameter.pos_wl_46,v49);
		subInitial(DBParameter.pos_wl_46,v50);
		
		subInitial(DBParameter.pos_wl_46,v51);
		subInitial(DBParameter.pos_wl_46,v52);
		subInitial(DBParameter.pos_wl_46,v53);
		subInitial(DBParameter.pos_wl_46,v54);
		subInitial(DBParameter.pos_wl_46,v55);
		subInitial(DBParameter.pos_wl_46,v56);
		subInitial(DBParameter.pos_wl_46,v57);
		subInitial(DBParameter.pos_wl_46,v58);
		subInitial(DBParameter.pos_wl_46,v59);
		subInitial(DBParameter.pos_wl_46,v60);
		subInitial(DBParameter.pos_wl_46,v61);
		subInitial(DBParameter.pos_wl_46,v62);
		subInitial(DBParameter.pos_wl_46,v63);
		subInitial(DBParameter.pos_wl_46,v64);
		subInitial(DBParameter.pos_wl_46,v65);
		subInitial(DBParameter.pos_wl_46,v66);
		subInitial(DBParameter.pos_wl_46,v67);
		subInitial(DBParameter.pos_wl_46,v68);
		subInitial(DBParameter.pos_wl_46,v69);
		subInitial(DBParameter.pos_wl_46,v70);
		subInitial(DBParameter.pos_wl_46,v71);
		subInitial(DBParameter.pos_wl_46,v72);
		subInitial(DBParameter.pos_wl_46,v73);
		subInitial(DBParameter.pos_wl_46,v74);
		subInitial(DBParameter.pos_wl_46,v75);
		subInitial(DBParameter.pos_wl_46,v76);
		subInitial(DBParameter.pos_wl_46,v77);
		subInitial(DBParameter.pos_wl_46,v78);
		subInitial(DBParameter.pos_wl_46,v79);
		subInitial(DBParameter.pos_wl_46,v80);
		subInitial(DBParameter.pos_wl_46,v81);
		subInitial(DBParameter.pos_wl_46,v82);
		subInitial(DBParameter.pos_wl_46,v83);
		subInitial(DBParameter.pos_wl_46,v84);
		subInitial(DBParameter.pos_wl_46,v85);
		subInitial(DBParameter.pos_wl_46,v86);
		subInitial(DBParameter.pos_wl_46,v87);
		subInitial(DBParameter.pos_wl_46,v88);
		subInitial(DBParameter.pos_wl_46,v89);
		subInitial(DBParameter.pos_wl_46,v90);
		subInitial(DBParameter.pos_wl_46,v91);
		subInitial(DBParameter.pos_wl_46,v92);
		subInitial(DBParameter.pos_wl_46,v93);
		subInitial(DBParameter.pos_wl_46,v94);
		subInitial(DBParameter.pos_wl_46,v95);
		subInitial(DBParameter.pos_wl_46,v96);
		subInitial(DBParameter.pos_wl_46,v97);
		subInitial(DBParameter.pos_wl_46,v98);
		subInitial(DBParameter.pos_wl_46,v99);
		subInitial(DBParameter.pos_wl_46,v100);
		subInitial(DBParameter.pos_wl_46,v101);
		subInitial(DBParameter.pos_wl_46,v102);
		subInitial(DBParameter.pos_wl_46,v103);
		subInitial(DBParameter.pos_wl_46,v104);
		subInitial(DBParameter.pos_wl_46,v105);
		subInitial(DBParameter.pos_wl_46,v106);
		subInitial(DBParameter.pos_wl_46,v107);
		subInitial(DBParameter.pos_wl_46,v108);
		subInitial(DBParameter.pos_wl_46,v109);
		subInitial(DBParameter.pos_wl_46,v110);
		subInitial(DBParameter.pos_wl_46,v111);
		subInitial(DBParameter.pos_wl_46,v112);
		subInitial(DBParameter.pos_wl_46,v113);
		subInitial(DBParameter.pos_wl_46,v114);
		subInitial(DBParameter.pos_wl_46,v115);
		subInitial(DBParameter.pos_wl_46,v116);
		subInitial(DBParameter.pos_wl_46,v117);
		subInitial(DBParameter.pos_wl_46,v118);
		
		subInitial(DBParameter.pos_wl_46,v119);
		subInitial(DBParameter.pos_wl_46,v120);
		subInitial(DBParameter.pos_wl_46,v121);
		subInitial(DBParameter.pos_wl_46,v122);
		subInitial(DBParameter.pos_wl_46,v123);
		subInitial(DBParameter.pos_wl_46,v124);
		subInitial(DBParameter.pos_wl_46,v125);
		subInitial(DBParameter.pos_wl_46,v126);
		subInitial(DBParameter.pos_wl_46,v127);
		subInitial(DBParameter.pos_wl_46,v128);
		subInitial(DBParameter.pos_wl_46,v129);
		subInitial(DBParameter.pos_wl_46,v130);
		subInitial(DBParameter.pos_wl_46,v1211);
		subInitial(DBParameter.pos_wl_46,v1221);
		subInitial(DBParameter.pos_wl_46,v1231);
		subInitial(DBParameter.pos_wl_46,v1241);
		subInitial(DBParameter.pos_wl_46,v1251);
		subInitial(DBParameter.pos_wl_46,v1261);
		subInitial(DBParameter.pos_wl_46,v1271);
		subInitial(DBParameter.pos_wl_46,v1281);
		subInitial(DBParameter.pos_wl_46,v1291);
		subInitial(DBParameter.pos_wl_46,v1301);
		subInitial(DBParameter.pos_wl_46,v131);
		subInitial(DBParameter.pos_wl_46,v132);
		subInitial(DBParameter.pos_wl_46,v133);
		subInitial(DBParameter.pos_wl_46,v134);
		subInitial(DBParameter.pos_wl_46,v135);
		subInitial(DBParameter.pos_wl_46,v136);
		subInitial(DBParameter.pos_wl_46,v137);
		subInitial(DBParameter.pos_wl_46,v138);
		subInitial(DBParameter.pos_wl_46,v139);
		subInitial(DBParameter.pos_wl_46,v140);
		subInitial(DBParameter.pos_wl_46,v141);
		subInitial(DBParameter.pos_wl_46,v142);
		subInitial(DBParameter.pos_wl_46,v143);
		subInitial(DBParameter.pos_wl_46,v144);
		subInitial(DBParameter.pos_wl_46,v145);

    }
    public void doList_47(){
    	String[] v1={"sanatorium","����Ժ","n.","0"};
    	String[] v2={"sangfroid","���ţ���Σ����","n.","0"};
    	String[] v3={"sanitary","�����ģ�����","adj.","0"};
    	String[] v4={"sapling","���磬������","n.","0"};
    	String[] v5={"sardonic","��Ц��","adj.","0"};

    	String[] v6={"satanic","���׼����","adj.","0"};
    	String[] v7={"sated","�����","adj.","0"};
    	String[] v8={"scab","����������İ�","n.","0"};
    	String[] v9={"scabrous","�ֲڵ�","adj.","0"};
    	String[] v10={"scads","�������޶�","n.","0"};

    	String[] v11={"scald","�̣��÷�ˮ����","v.","0"};
    	String[] v12={"scamper","���ܣ�����","v.","0"};
    	String[] v13={"scan","ϸ�飬ϸ���������ɨ�裬��������","v.","0"};
    	String[] v14={"scar","�˺ۣ��˰�","n.","0"};
    	String[] v15={"scare","���ţ��ܾ�������","n./v.","0"};

    	String[] v16={"scarp","���£�����","n.","0"};
    	String[] v17={"scathe","�𺦣����ˣ��ս�����������","n./v.","0"};
    	String[] v18={"sceptical","���ɵģ������ŵ�","adj.","0"};
    	String[] v19={"scintillate","��˸����¶����","v.","0"};
    	String[] v20={"scission","�жϣ����룬����","n.","0"};

    	String[] v21={"scooter","���г���̤�峵","n.","0"};
    	String[] v22={"scorching","���ȵ�","adj.","0"};
    	String[] v23={"scour","��ϴ���������Ĵ�����","v.","0"};
    	String[] v24={"scramble","�ʵǣ����� ","n.","0"};
    	String[] v25={"scrape","�ε�������","v.","0"};

    	String[] v26={"screed","�߳�����˵����ƪ���۵�����","n.","0"};
    	String[] v27={"scrumptious","��ʳ��ܿɿڵ�","adj.","0"};
    	String[] v28={"scud","���У���ʻ","v.","0"};
    	String[] v29={"scutter","����","v.","0"};
    	String[] v30={"scuttle","�տڸ�","n.","0"};

    	String[] v31={"seafaring","�����ģ��������йص�","adj.","0"};
    	String[] v32={"seclude","�ͱ��˸���","v.","0"};
    	String[] v33={"sect","���ڽ̵ȣ���ϵ","v.","0"};
    	String[] v34={"sedition","ɿ������","n.","0"};
    	String[] v35={"seditious","ɿ���Ե�","adj.","0"};

    	String[] v36={"self-abasement","�Ա�����ǫ","n.","0"};
    	String[] v37={"self-absorbed","������","adj.","0"};
    	String[] v38={"self-assertion","��ּ���","n.","0"};
    	String[] v39={"senile","���ϵ�","adj.","0"};
    	String[] v40={"sensitize","ʹĳ�˻�ĳ��������","v.","0"};

    	String[] v41={"sensual","�����ģ�������","adj.","0"};
    	String[] v42={"sententious","��˵�̵�","adj.","0"};
    	String[] v43={"sentry","�ڱ�������","n.","0"};
    	String[] v44={"sequacious","ä�ӵ�","adj.","0"};
    	String[] v45={"sequela","����ߣ�����֢","n.","0"};

    	String[] v46={"sequestrate","��Ѻ��û��","v.","0"};
    	String[] v47={"serenade","ҹ��","n.","0"};
    	String[] v48={"serendipity","���ڷ�������������츳","n.","0"};
    	String[] v49={"serfdom","ũū��ݣ�ũū����","n.","0"};
    	String[] v50={"sermonize","˵�̣�����","v.","0"};

    	String[] v51={"serpentine","���߰������ģ����ѵ�","adj.","0"};
    	String[] v52={"shabby","���õģ����ɵ�","adj.","0"};
    	String[] v53={"shack","��ªС�ݣ�����","n.","0"};
    	String[] v54={"shanty","��ª��Сľ��","n.","0"};
    	String[] v55={"shawl","����Ů�ã�����","n.","0"};

    	String[] v56={"sheaf","һ����һ��","n.","0"};
    	String[] v57={"sheen","��ԣ�����","n.","0"};
    	String[] v58={"shibboleth","�¾����","n.","0"};
    	String[] v59={"shimmer","��˸��΢΢����","v.","0"};
    	String[] v60={"shipwright","�촬��","n.","0"};

    	String[] v61={"showy","���޵ģ���ҫ��","adj.","0"};
    	String[] v62={"shred","��Ƭ���Ʋ�","n.","0"};
    	String[] v63={"shrivel","ʹ��ή","v.","0"};
    	String[] v64={"shuffle","�ϲ��ߣ�֧�ᣬϴ��","v.","0"};
    	String[] v65={"shuttle","ʹ�����ƶ�����������","v.","0"};

    	String[] v66={"sidesplitting","����������Ц��","adj.","0"};
    	String[] v67={"sidle","��͵͵�أ��������","v.","0"};
    	String[] v68={"signatory","ǩ���ߣ�ǩ���","n.","0"};
    	String[] v69={"signature","ǩ����ǩ��","n.","0"};
    	String[] v70={"simian","Գ�ģ���ģ�������Գ","adj./n.","0"};

    	String[] v71={"simile","����","n.","0"};
    	String[] v72={"sinister","������ģ��ն��","adj.","0"};
    	String[] v73={"sizzler","����������������","n.","0"};
    	String[] v74={"skein","һ��","n.","0"};
    	String[] v75={"skittish","�ḡ�ģ���٬��","adj.","0"};

    	String[] v76={"skullduggery","���","n.","0"};
    	String[] v77={"skunk","�����������ǣ���ƭ","n./v.","0"};
    	String[] v78={"skyrocket","����������","v.","0"};
    	String[] v79={"slapdash","���أ��ģ�","adv./adj.","0"};
    	String[] v80={"slaver","����ˮ����У���ˮ","v./n.","0"};

    	String[] v81={"slay","ɱ����ɱ","v.","0"};
    	String[] v82={"sleazy","���ݵģ�������µ�","adj.","0"};
    	String[] v83={"sledge","ѩ��","n.","0"};
    	String[] v84={"sledgehammer","������","n.","0"};
    	String[] v85={"sleight","�����ַ����ɼ�","n.","0"};

    	String[] v86={"sling","Ͷ�����ӣ������������","v./n.","0"};
    	String[] v87={"slit","˺�ѣ��ѷ�","v./n.","0"};
    	String[] v88={"slobber","��ˮ������ˮ","n./v.","0"};
    	String[] v89={"sloven","���ޱ߷�����","n.","0"};
    	String[] v90={"slue","��ʹ����ת","v.","0"};

    	String[] v91={"slump","��Ȼ���£�����","v.","0"};
    	String[] v92={"smirch","���ۣ��۵�","v./n.","0"};
    	String[] v93={"snappish","Ƣ�������","adj.","0"};
    	String[] v94={"snappy","��������ģ�������","adj.","0"};
    	String[] v95={"snicker","��Ц����Ц","v./n.","0"};

    	String[] v96={"snob","����С��","n.","0"};
    	String[] v97={"snuggle","����������","v.","0"};
    	String[] v98={"sociable","�ý��ʵģ��Ѻõģ���Ⱥ��","adj.","0"};
    	String[] v99={"sojourn","�������ľ�","v./n.","0"};
    	String[] v100={"somnolent","˼˯�ģ����ߵ�","adj.","0"};

    	String[] v101={"sonorous","��������������","adj.","0"};
    	String[] v102={"souse","����ˮ��","v.","0"};
    	String[] v103={"spacious","�����ģ�����","adj.","0"};
    	String[] v104={"spangle","�������·��ϵģ�����Ƭ������","n./v.","0"};
    	String[] v105={"spasmodic","���εģ���Ъ�Ե�","adj.","0"};

    	String[] v106={"speleology","����ѧ","n.","0"};
    	String[] v107={"splashy","��ˮ�ģ���ҫ���۵�","adj.","0"};
    	String[] v108={"spool","����¼�����ȵģ�����","n.","0"};
    	String[] v109={"spout","���","v.","0"};
    	String[] v110={"sprawl","��չ�ֽŶ���","v.","0"};

    	String[] v111={"sprint","�̾���ȫ�ٱ���","v.","0"};
    	String[] v112={"spunk","����������","n.","0"};
    	String[] v113={"spurn","�ܾ�������","v.","0"};
    	String[] v114={"squeamish","���ܾ���","adj.","0"};
    	String[] v115={"stab","���ˣ���","v.","0"};

    	String[] v116={"stagger","���ǣ�ҡ��","v.","0"};
    	String[] v117={"stagy","����Ȼ�ģ���ϰһ���","adj.","0"};
    	String[] v118={"standstill","����ͣ��״̬����ֹ","n.","0"};
    	String[] v119={"star-crossed","ʱ�˲��õ�","adj.","0"};
    	String[] v120={"stash","���䣬����","v.","0"};

    	String[] v121={"steeple","���������","n.","0"};
    	String[] v122={"stoop","�����������","v.","0"};
    	String[] v123={"stouthearted","����ģ��󵨵�","adj.","0"};
    	String[] v124={"straggle","��·�����飬����","v.","0"};
    	String[] v125={"strangulation","��ɱ������","v.","0"};

    	String[] v126={"studio","�����ң����ң��ݲ���","n.","0"};
    	String[] v127={"stun","ʹ�ε���ʹ���ţ�����","v.","0"};
    	String[] v128={"stupefy","ʹãȻ���Ŵ�","v.","0"};
    	String[] v129={"stupendous","�޴�ģ���þ��˵�","adj.","0"};
    	String[] v130={"sublimate","ʹ����","v.","0"};

    	String[] v131={"subscribe","����������","v.","0"};
    	String[] v132={"subsist","�����������","v.","0"};
    	String[] v133={"substratum","�������ػ�","n.","0"};
    	String[] v134={"subvention","�����𣬽���","n.","0"};
    	String[] v135={"sully","���ۣ���Ⱦ","v.","0"};

    	String[] v136={"sundry","��ʽ�����ģ����ֵ�","adj.","0"};
    	String[] v137={"superannuated","������","adj.","0"};
    	String[] v138={"superlative","��ѵ�","adj.","0"};
    	String[] v139={"superstition","���ţ�äĿ�־�","v.","0"};
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	subInitial(DBParameter.pos_wl_47,v1);
		subInitial(DBParameter.pos_wl_47,v2);
		subInitial(DBParameter.pos_wl_47,v3);
		subInitial(DBParameter.pos_wl_47,v4);
		subInitial(DBParameter.pos_wl_47,v5);
		subInitial(DBParameter.pos_wl_47,v6);
		subInitial(DBParameter.pos_wl_47,v7);
		subInitial(DBParameter.pos_wl_47,v8);
		subInitial(DBParameter.pos_wl_47,v9);
		subInitial(DBParameter.pos_wl_47,v10);
		subInitial(DBParameter.pos_wl_47,v11);
		subInitial(DBParameter.pos_wl_47,v12);
		subInitial(DBParameter.pos_wl_47,v13);
		subInitial(DBParameter.pos_wl_47,v14);
		subInitial(DBParameter.pos_wl_47,v15);
		subInitial(DBParameter.pos_wl_47,v16);
		subInitial(DBParameter.pos_wl_47,v17);
		subInitial(DBParameter.pos_wl_47,v18);
		subInitial(DBParameter.pos_wl_47,v19);
		subInitial(DBParameter.pos_wl_47,v20);
		subInitial(DBParameter.pos_wl_47,v21);
		subInitial(DBParameter.pos_wl_47,v22);
		subInitial(DBParameter.pos_wl_47,v23);
		subInitial(DBParameter.pos_wl_47,v24);
		subInitial(DBParameter.pos_wl_47,v25);
		subInitial(DBParameter.pos_wl_47,v26);
		subInitial(DBParameter.pos_wl_47,v27);
		subInitial(DBParameter.pos_wl_47,v28);
		subInitial(DBParameter.pos_wl_47,v29);
		subInitial(DBParameter.pos_wl_47,v30);
		subInitial(DBParameter.pos_wl_47,v31);
		subInitial(DBParameter.pos_wl_47,v32);
		subInitial(DBParameter.pos_wl_47,v33);
		subInitial(DBParameter.pos_wl_47,v34);
		subInitial(DBParameter.pos_wl_47,v35);
		subInitial(DBParameter.pos_wl_47,v36);
		subInitial(DBParameter.pos_wl_47,v37);
		subInitial(DBParameter.pos_wl_47,v38);
		subInitial(DBParameter.pos_wl_47,v39);
		subInitial(DBParameter.pos_wl_47,v40);
		subInitial(DBParameter.pos_wl_47,v41);
		subInitial(DBParameter.pos_wl_47,v42);
		subInitial(DBParameter.pos_wl_47,v43);
		subInitial(DBParameter.pos_wl_47,v44);
		subInitial(DBParameter.pos_wl_47,v45);
		subInitial(DBParameter.pos_wl_47,v46);
		subInitial(DBParameter.pos_wl_47,v47);
		subInitial(DBParameter.pos_wl_47,v48);
		subInitial(DBParameter.pos_wl_47,v49);
		subInitial(DBParameter.pos_wl_47,v50);
		
		subInitial(DBParameter.pos_wl_47,v51);
		subInitial(DBParameter.pos_wl_47,v52);
		subInitial(DBParameter.pos_wl_47,v53);
		subInitial(DBParameter.pos_wl_47,v54);
		subInitial(DBParameter.pos_wl_47,v55);
		subInitial(DBParameter.pos_wl_47,v56);
		subInitial(DBParameter.pos_wl_47,v57);
		subInitial(DBParameter.pos_wl_47,v58);
		subInitial(DBParameter.pos_wl_47,v59);
		subInitial(DBParameter.pos_wl_47,v60);
		subInitial(DBParameter.pos_wl_47,v61);
		subInitial(DBParameter.pos_wl_47,v62);
		subInitial(DBParameter.pos_wl_47,v63);
		subInitial(DBParameter.pos_wl_47,v64);
		subInitial(DBParameter.pos_wl_47,v65);
		subInitial(DBParameter.pos_wl_47,v66);
		subInitial(DBParameter.pos_wl_47,v67);
		subInitial(DBParameter.pos_wl_47,v68);
		subInitial(DBParameter.pos_wl_47,v69);
		subInitial(DBParameter.pos_wl_47,v70);
		subInitial(DBParameter.pos_wl_47,v71);
		subInitial(DBParameter.pos_wl_47,v72);
		subInitial(DBParameter.pos_wl_47,v73);
		subInitial(DBParameter.pos_wl_47,v74);
		subInitial(DBParameter.pos_wl_47,v75);
		subInitial(DBParameter.pos_wl_47,v76);
		subInitial(DBParameter.pos_wl_47,v77);
		subInitial(DBParameter.pos_wl_47,v78);
		subInitial(DBParameter.pos_wl_47,v79);
		subInitial(DBParameter.pos_wl_47,v80);
		subInitial(DBParameter.pos_wl_47,v81);
		subInitial(DBParameter.pos_wl_47,v82);
		subInitial(DBParameter.pos_wl_47,v83);
		subInitial(DBParameter.pos_wl_47,v84);
		subInitial(DBParameter.pos_wl_47,v85);
		subInitial(DBParameter.pos_wl_47,v86);
		subInitial(DBParameter.pos_wl_47,v87);
		subInitial(DBParameter.pos_wl_47,v88);
		subInitial(DBParameter.pos_wl_47,v89);
		subInitial(DBParameter.pos_wl_47,v90);
		subInitial(DBParameter.pos_wl_47,v91);
		subInitial(DBParameter.pos_wl_47,v92);
		subInitial(DBParameter.pos_wl_47,v93);
		subInitial(DBParameter.pos_wl_47,v94);
		subInitial(DBParameter.pos_wl_47,v95);
		subInitial(DBParameter.pos_wl_47,v96);
		subInitial(DBParameter.pos_wl_47,v97);
		subInitial(DBParameter.pos_wl_47,v98);
		subInitial(DBParameter.pos_wl_47,v99);
		subInitial(DBParameter.pos_wl_47,v100);
		subInitial(DBParameter.pos_wl_47,v101);
		subInitial(DBParameter.pos_wl_47,v102);
		subInitial(DBParameter.pos_wl_47,v103);
		subInitial(DBParameter.pos_wl_47,v104);
		subInitial(DBParameter.pos_wl_47,v105);
		subInitial(DBParameter.pos_wl_47,v106);
		subInitial(DBParameter.pos_wl_47,v107);
		subInitial(DBParameter.pos_wl_47,v108);
		subInitial(DBParameter.pos_wl_47,v109);
		subInitial(DBParameter.pos_wl_47,v110);
		subInitial(DBParameter.pos_wl_47,v111);
		subInitial(DBParameter.pos_wl_47,v112);
		subInitial(DBParameter.pos_wl_47,v113);
		subInitial(DBParameter.pos_wl_47,v114);
		subInitial(DBParameter.pos_wl_47,v115);
		subInitial(DBParameter.pos_wl_47,v116);
		subInitial(DBParameter.pos_wl_47,v117);
		subInitial(DBParameter.pos_wl_47,v118);
		
		subInitial(DBParameter.pos_wl_47,v119);
		subInitial(DBParameter.pos_wl_47,v120);
		subInitial(DBParameter.pos_wl_47,v121);
		subInitial(DBParameter.pos_wl_47,v122);
		subInitial(DBParameter.pos_wl_47,v123);
		subInitial(DBParameter.pos_wl_47,v124);
		subInitial(DBParameter.pos_wl_47,v125);
		subInitial(DBParameter.pos_wl_47,v126);
		subInitial(DBParameter.pos_wl_47,v127);
		subInitial(DBParameter.pos_wl_47,v128);
		subInitial(DBParameter.pos_wl_47,v129);
		subInitial(DBParameter.pos_wl_47,v130);
		subInitial(DBParameter.pos_wl_47,v131);
		subInitial(DBParameter.pos_wl_47,v132);
		subInitial(DBParameter.pos_wl_47,v133);
		subInitial(DBParameter.pos_wl_47,v134);
		subInitial(DBParameter.pos_wl_47,v135);
		subInitial(DBParameter.pos_wl_47,v136);
		subInitial(DBParameter.pos_wl_47,v137);
		subInitial(DBParameter.pos_wl_47,v138);
		subInitial(DBParameter.pos_wl_47,v139);
		

    }
    public void doList_48(){
    	String[] v1={"surveillance","���ӣ�����","n.","0"};
    	String[] v2={"swank","��ҫ����ҫ","v.","0"};
    	String[] v3={"swarm","���۷䣩һȺ��һȺ��","n.","0"};
    	String[] v4={"swarthy","��ڵ�","adj.","0"};
    	String[] v5={"swear","����","v.","0"};

    	String[] v6={"swipe","�ͻ�","n./v.","0"};
    	String[] v7={"symposium","ר�����ۻ�","n.","0"};
    	String[] v8={"tack","��ͷ����ͼ��","n.","0"};
    	String[] v9={"tarry","�ǻ�������","v.","0"};
    	String[] v10={"tattered","�������ڵģ��ƾɵ�","adj.","0"};

    	String[] v11={"tautological","�����ظ���","adj.","0"};
    	String[] v12={"teem","�������������ǣ����������","v.","0"};
    	String[] v13={"teetotal","�ξƲ�մ��","adj.","0"};
    	String[] v14={"tendinous","���","adj.","0"};
    	String[] v15={"tensile","�����ģ�����չ��","adj.","0"};

    	String[] v16={"thespian","Ϸ��ģ���Ϸ��","adj.","0"};
    	String[] v17={"thorny","��̵ģ�ʹ��ģ����ѵ�","adj.","0"};
    	String[] v18={"thrall","ū����ũū","n.","0"};
    	String[] v19={"thrash","�޴�","v.","0"};
    	String[] v20={"thrifty","��ȣ�����","v.","0"};

    	String[] v21={"throes","��ʹ","n.","0"};
    	String[] v22={"throttle","�����ӣ���ɱ��������","v./n.","0"};
    	String[] v23={"timeworn","�¾ɵģ��Ͼɵ�","adj.","0"};
    	String[] v24={"tinge","Ⱦɫ��ʹ����Ϣ","v.","0"};
    	String[] v25={"tipple","���","v.","0"};

    	String[] v26={"topsy-turvy","�ߵ��ģ��෴�ģ����߰���ģ����ҵ�","adj.","0"};
    	String[] v27={"torpedo","����","n.","0"};
    	String[] v28={"torrid","���ȵ�","adj.","0"};
    	String[] v29={"torso","���ɣ�������","n.","0"};
    	String[] v30={"tortune","���̣���ĥ����ʩ�Կ���","n./v.","0"};

    	String[] v31={"touching","����ͬ���","adj.","0"};
    	String[] v32={"touchstone","�Խ�ʯ","n.","0"};
    	String[] v33={"tousle","Ū��","v.","0"};
    	String[] v34={"traduce","���ˣ��̰�","v.","0"};
    	String[] v35={"trammel","����������","v./n.","0"};

    	String[] v36={"tramp","�ز��ߣ���;����","v.","0"};
    	String[] v37={"transfuse","��Ѫ������","v.","0"};
    	String[] v38={"trawl","����������������","n./v.","0"};
    	String[] v39={"treachery","���գ�����","n.","0"};
    	String[] v40={"tread","��̤�����ģ�����","v./n.","0"};

    	String[] v41={"treasurer","˾�⣬����Ա������Ա","n.","0"};
    	String[] v42={"trek","������","v.","0"};
    	String[] v43={"tremulous","�߶��ģ�������","adj.","0"};
    	String[] v44={"trench","��������","n.","0"};
    	String[] v45={"tresses","Ů�˵�ͷ��","n.","0"};

    	String[] v46={"tribulation","���ѣ�����","n.","0"};
    	String[] v47={"tributary","���ѣ�����","adj.","0"};
    	String[] v48={"trickery","��ƭ�����","n.","0"};
    	String[] v49={"trident","�����","n.","0"};
    	String[] v50={"trivia","���£��޼�ֵ֮��","n.","0"};

    	String[] v51={"truant","�ӱ����εģ���ѧ�ߣ��ӱ���","adj./n.","0"};
    	String[] v52={"truism","����֮������","n.","0"};
    	String[] v53={"trumpery","�п������õ�","adj.","0"};
    	String[] v54={"tumid","�����","adj.","0"};
    	String[] v55={"tundra","��ԭ��̦ԭ","n.","0"};

    	String[] v56={"tutelage","�໤��ָ��","n.","0"};
    	String[] v57={"twaddle","��˵�˵���Ϲ��","v.","0"};
    	String[] v58={"tycoon","��Ǯ���Ƶ���ҵ�ң����","n.","0"};
    	String[] v59={"typhoon","̨��","n.","0"};
    	String[] v60={"ulcerate","���ã�����","v.","0"};

    	String[] v61={"ulterior","����ģ���Զ�ģ����ɸ��˵�","adj.","0"};
    	String[] v62={"ultramundane","���׵ģ�����֮���","adj.","0"};
    	String[] v63={"unbidden","δ�������","adj.","0"};
    	String[] v64={"unbridled","���ݵ�","adj.","0"};
    	String[] v65={"uncoopoerative","��Ը������","adj.","0"};

    	String[] v66={"undisputable","�޿�����ģ��������ʵ�","adj.","0"};
    	String[] v67={"undulate","���������","v.","0"};
    	String[] v68={"unexceptional","������ģ���ͨ�ģ�ƽ����","adj.","0"};
    	String[] v69={"unilateral","�������","adj.","0"};
    	String[] v70={"unison","���࣬�볪��һ�µ��ж�","n.","0"};

    	String[] v71={"upfront","̹�ʵ�","adj.","0"};
    	String[] v72={"upstart","ͻȻ���ٵ���","n.","0"};
    	String[] v73={"upsurge","������������","n.","0"};
    	String[] v74={"uptight","���ǲ�����","adj.","0"};
    	String[] v75={"urchin","��ͯ������","n.","0"};

    	String[] v76={"ursine","�ܵģ����ܵ�","adj.","0"};
    	String[] v77={"utensil","���ߣ��þ�","n.","0"};
    	String[] v78={"uxorious","�谮���ӵ�","adj.","0"};
    	String[] v79={"vagabond","�˵��ӣ������ߣ����˵�","n./adj.","0"};
    	String[] v80={"valetudinarian","�������ˣ����ֵ�����������","n.","0"};

    	String[] v81={"valor","���䣬Ӣ��","n.","0"};
    	String[] v82={"vampire","��Ѫ��","n.","0"};
    	String[] v83={"vanguard","ǰ��","n.","0"};
    	String[] v84={"vegetate","��ֲ��������������","v.","0"};
    	String[] v85={"ventral","������","adj.","0"};

    	String[] v86={"verbatim","���ֵģ��������","adj.","0"};
    	String[] v87={"verge","��Ե","n.","0"};
    	String[] v88={"vermin","���棬������","n.","0"};
    	String[] v89={"vernal","�����ģ������Ƶ�","adj.","0"};
    	String[] v90={"versemonger","׾��ʫ�ˣ�����ʫ��","n.","0"};

    	String[] v91={"vesture","�·���������","n.","0"};
    	String[] v92={"viand","ʳƷ��ʳ��","n.","0"};
    	String[] v93={"vicissitude","�仯����Ǩ���ٿݣ�ʢ˥","n.","0"};
    	String[] v94={"villainous","а��ģ��񶾵�","adj.","0"};
    	String[] v95={"vim","����������","n.","0"};

    	String[] v96={"vindication","ϴԩ��֤ʵ","n.","0"};
    	String[] v97={"vinegared","��ģ���̵�","adj.","0"};
    	String[] v98={"virago","�ø��������˻��֧���˵�Ů��","n.","0"};
    	String[] v99={"virile","���������ģ��۽���","adj.","0"};
    	String[] v100={"visage","������ò","n.","0"};

    	String[] v101={"visceral","�������","adj.","0"};
    	String[] v102={"vitreous","�����ģ�����״��","adj.","0"};
    	String[] v103={"vomit","Ż�£�Ż����","n.","0"};
    	String[] v104={"vulpine","�����ģ��ƻ���","adj.","0"};
    	String[] v105={"wade","��ˮ������","v.","0"};

    	String[] v106={"wail","���ţ�ʹ��","v.","0"};
    	String[] v107={"waive","�������Ƴٿ���","v.","0"};
    	String[] v108={"wallop","�ػ����ʹ�","n./v.","0"};
    	String[] v109={"wallow","����ȣ�����ˮ�д��������","n./v.","0"};
    	String[] v110={"wangle","���ɼƻ���������ĳ����","v.","0"};

    	String[] v111={"wanton","�޽��Ƶģ����ݵģ���Ƥ��","adj.","0"};
    	String[] v112={"warble","����ָ�񣩽г���͵Ĳ���","v.","0"};
    	String[] v113={"warden","�����ˣ�����Ա","n.","0"};
    	String[] v114={"waspish","��ŭ�ģ���̵�","adj.","0"};
    	String[] v115={"waylay","���������","v.","0"};

    	String[] v116={"weird","�Źֵģ����Ƶ�","adj.","0"};
    	String[] v117={"welsh","��ծ������ʧ��","v.","0"};
    	String[] v118={"whelm","��...���ǣ���û","v.","0"};
    	String[] v119={"whelp","Ȯ�Ƶ�����","n.","0"};
    	String[] v120={"whit","һ���������","n.","0"};

    	String[] v121={"wig","�ٷ�","n.","0"};
    	String[] v122={"wiggle","Ť�����䶯","v.","0"};
    	String[] v123={"windfall","�紵��Ĺ�ʵ������ĺ���","n.","0"};
    	String[] v124={"winkle","�����������ذ�ĳ��Ū��","v.","0"};
    	String[] v125={"wiretap","����","n.","0"};

    	String[] v126={"witch","���ţ�Ů��","n.","0"};
    	String[] v127={"wizardry","ħ��������","n.","0"};
    	String[] v128={"wizen","��л�ģ���ή��","adj.","0"};
    	String[] v129={"wont","ϰ�ߣ�ϰ��","n.","0"};
    	String[] v130={"woodcut","ľ�̣�ľ�滭","n.","0"};

    	String[] v131={"wraith","���飬����������","n.","0"};
    	String[] v132={"wrangle","����������","v.","0"};
    	String[] v133={"wrath","��ŭ����ŭ","n.","0"};
    	String[] v134={"wreak","��йŭ�𣬱���","v.","0"};
    	String[] v135={"wreathe","���ƣ���...���ɻ���","v.","0"};
    	
    	String[] v136={"wreckage","�к�","n.","0"};
    	String[] v137={"xenophobia","���⣬����","n.","0"};
    	String[] v138={"yaw","ƫ��","v.","0"};
    	String[] v139={"yeoman","�Ը�ũ","n.","0"};
    	String[] v140={"zesty","������","adj.","0"};
    	
    	
    	
    	
    	
    	subInitial(DBParameter.pos_wl_48,v1);
		subInitial(DBParameter.pos_wl_48,v2);
		subInitial(DBParameter.pos_wl_48,v3);
		subInitial(DBParameter.pos_wl_48,v4);
		subInitial(DBParameter.pos_wl_48,v5);
		subInitial(DBParameter.pos_wl_48,v6);
		subInitial(DBParameter.pos_wl_48,v7);
		subInitial(DBParameter.pos_wl_48,v8);
		subInitial(DBParameter.pos_wl_48,v9);
		subInitial(DBParameter.pos_wl_48,v10);
		subInitial(DBParameter.pos_wl_48,v11);
		subInitial(DBParameter.pos_wl_48,v12);
		subInitial(DBParameter.pos_wl_48,v13);
		subInitial(DBParameter.pos_wl_48,v14);
		subInitial(DBParameter.pos_wl_48,v15);
		subInitial(DBParameter.pos_wl_48,v16);
		subInitial(DBParameter.pos_wl_48,v17);
		subInitial(DBParameter.pos_wl_48,v18);
		subInitial(DBParameter.pos_wl_48,v19);
		subInitial(DBParameter.pos_wl_48,v20);
		subInitial(DBParameter.pos_wl_48,v21);
		subInitial(DBParameter.pos_wl_48,v22);
		subInitial(DBParameter.pos_wl_48,v23);
		subInitial(DBParameter.pos_wl_48,v24);
		subInitial(DBParameter.pos_wl_48,v25);
		subInitial(DBParameter.pos_wl_48,v26);
		subInitial(DBParameter.pos_wl_48,v27);
		subInitial(DBParameter.pos_wl_48,v28);
		subInitial(DBParameter.pos_wl_48,v29);
		subInitial(DBParameter.pos_wl_48,v30);
		subInitial(DBParameter.pos_wl_48,v31);
		subInitial(DBParameter.pos_wl_48,v32);
		subInitial(DBParameter.pos_wl_48,v33);
		subInitial(DBParameter.pos_wl_48,v34);
		subInitial(DBParameter.pos_wl_48,v35);
		subInitial(DBParameter.pos_wl_48,v36);
		subInitial(DBParameter.pos_wl_48,v37);
		subInitial(DBParameter.pos_wl_48,v38);
		subInitial(DBParameter.pos_wl_48,v39);
		subInitial(DBParameter.pos_wl_48,v40);
		subInitial(DBParameter.pos_wl_48,v41);
		subInitial(DBParameter.pos_wl_48,v42);
		subInitial(DBParameter.pos_wl_48,v43);
		subInitial(DBParameter.pos_wl_48,v44);
		subInitial(DBParameter.pos_wl_48,v45);
		subInitial(DBParameter.pos_wl_48,v46);
		subInitial(DBParameter.pos_wl_48,v47);
		subInitial(DBParameter.pos_wl_48,v48);
		subInitial(DBParameter.pos_wl_48,v49);
		subInitial(DBParameter.pos_wl_48,v50);
		
		subInitial(DBParameter.pos_wl_48,v51);
		subInitial(DBParameter.pos_wl_48,v52);
		subInitial(DBParameter.pos_wl_48,v53);
		subInitial(DBParameter.pos_wl_48,v54);
		subInitial(DBParameter.pos_wl_48,v55);
		subInitial(DBParameter.pos_wl_48,v56);
		subInitial(DBParameter.pos_wl_48,v57);
		subInitial(DBParameter.pos_wl_48,v58);
		subInitial(DBParameter.pos_wl_48,v59);
		subInitial(DBParameter.pos_wl_48,v60);
		subInitial(DBParameter.pos_wl_48,v61);
		subInitial(DBParameter.pos_wl_48,v62);
		subInitial(DBParameter.pos_wl_48,v63);
		subInitial(DBParameter.pos_wl_48,v64);
		subInitial(DBParameter.pos_wl_48,v65);
		subInitial(DBParameter.pos_wl_48,v66);
		subInitial(DBParameter.pos_wl_48,v67);
		subInitial(DBParameter.pos_wl_48,v68);
		subInitial(DBParameter.pos_wl_48,v69);
		subInitial(DBParameter.pos_wl_48,v70);
		subInitial(DBParameter.pos_wl_48,v71);
		subInitial(DBParameter.pos_wl_48,v72);
		subInitial(DBParameter.pos_wl_48,v73);
		subInitial(DBParameter.pos_wl_48,v74);
		subInitial(DBParameter.pos_wl_48,v75);
		subInitial(DBParameter.pos_wl_48,v76);
		subInitial(DBParameter.pos_wl_48,v77);
		subInitial(DBParameter.pos_wl_48,v78);
		subInitial(DBParameter.pos_wl_48,v79);
		subInitial(DBParameter.pos_wl_48,v80);
		subInitial(DBParameter.pos_wl_48,v81);
		subInitial(DBParameter.pos_wl_48,v82);
		subInitial(DBParameter.pos_wl_48,v83);
		subInitial(DBParameter.pos_wl_48,v84);
		subInitial(DBParameter.pos_wl_48,v85);
		subInitial(DBParameter.pos_wl_48,v86);
		subInitial(DBParameter.pos_wl_48,v87);
		subInitial(DBParameter.pos_wl_48,v88);
		subInitial(DBParameter.pos_wl_48,v89);
		subInitial(DBParameter.pos_wl_48,v90);
		subInitial(DBParameter.pos_wl_48,v91);
		subInitial(DBParameter.pos_wl_48,v92);
		subInitial(DBParameter.pos_wl_48,v93);
		subInitial(DBParameter.pos_wl_48,v94);
		subInitial(DBParameter.pos_wl_48,v95);
		subInitial(DBParameter.pos_wl_48,v96);
		subInitial(DBParameter.pos_wl_48,v97);
		subInitial(DBParameter.pos_wl_48,v98);
		subInitial(DBParameter.pos_wl_48,v99);
		subInitial(DBParameter.pos_wl_48,v100);
		subInitial(DBParameter.pos_wl_48,v101);
		subInitial(DBParameter.pos_wl_48,v102);
		subInitial(DBParameter.pos_wl_48,v103);
		subInitial(DBParameter.pos_wl_48,v104);
		subInitial(DBParameter.pos_wl_48,v105);
		subInitial(DBParameter.pos_wl_48,v106);
		subInitial(DBParameter.pos_wl_48,v107);
		subInitial(DBParameter.pos_wl_48,v108);
		subInitial(DBParameter.pos_wl_48,v109);
		subInitial(DBParameter.pos_wl_48,v110);
		subInitial(DBParameter.pos_wl_48,v111);
		subInitial(DBParameter.pos_wl_48,v112);
		subInitial(DBParameter.pos_wl_48,v113);
		subInitial(DBParameter.pos_wl_48,v114);
		subInitial(DBParameter.pos_wl_48,v115);
		subInitial(DBParameter.pos_wl_48,v116);
		subInitial(DBParameter.pos_wl_48,v117);
		subInitial(DBParameter.pos_wl_48,v118);
		
		subInitial(DBParameter.pos_wl_48,v119);
		subInitial(DBParameter.pos_wl_48,v120);
		subInitial(DBParameter.pos_wl_48,v121);
		subInitial(DBParameter.pos_wl_48,v122);
		subInitial(DBParameter.pos_wl_48,v123);
		subInitial(DBParameter.pos_wl_48,v124);
		subInitial(DBParameter.pos_wl_48,v125);
		subInitial(DBParameter.pos_wl_48,v126);
		subInitial(DBParameter.pos_wl_48,v127);
		subInitial(DBParameter.pos_wl_48,v128);
		subInitial(DBParameter.pos_wl_48,v129);
		subInitial(DBParameter.pos_wl_48,v130);
		subInitial(DBParameter.pos_wl_48,v131);
		subInitial(DBParameter.pos_wl_48,v132);
		subInitial(DBParameter.pos_wl_48,v133);
		subInitial(DBParameter.pos_wl_48,v134);
		subInitial(DBParameter.pos_wl_48,v135);
		subInitial(DBParameter.pos_wl_48,v136);
		subInitial(DBParameter.pos_wl_48,v137);
		subInitial(DBParameter.pos_wl_48,v138);
		subInitial(DBParameter.pos_wl_48,v139);
		subInitial(DBParameter.pos_wl_48,v140);
		
    }
    public void doList_49(){
    	
    	
    	
    	String[] v1={"access","�õ�","v.","0"};
    	String[] v2={"annex","����","n.","0"};
    	String[] v3={"asphalt","����","n.","0"};
    	String[] v4={"barbarian","Ұ����","n.","0"};
    	String[] v5={"bar code","������","n.","0"};

    	String[] v6={"behoove","Ӧ�ã��б�Ҫ������","v.","0"};
    	String[] v7={"bewitching","���˵�","adj.","0"};
    	String[] v8={"bumpkingly","����е�","adj.","0"};
    	String[] v9={"cell","�����η�","n.","0"};
    	String[] v10={"chaperone","������Ů�Ͻ��ʳ����ģ�Ů��","n.","0"};

    	String[] v11={"coat","ͿĨ","v.","0"};
    	String[] v12={"columnist","ר������","n.","0"};
    	String[] v13={"dab","����","v.","0"};
    	String[] v14={"dashing","ʱ�ֵģ���Ծ��","adj.","0"};
    	String[] v15={"dike","�̷�","n.","0"};

    	String[] v16={"dissect","��ϸ����������","v.","0"};
    	String[] v17={"employ","ʹ��","v.","0"};
    	String[] v18={"epistolary","�������","adj.","0"};
    	String[] v19={"evildoer","���ˣ�����","n.","0"};
    	String[] v20={"fair-minded","��ƽ�ģ�������","adj.","0"};

    	String[] v21={"fetching","���˵ģ����˵�","adj.","0"};
    	String[] v22={"fibrous","��ά��","adj.","0"};
    	String[] v23={"foreordain","Ԥ��ע��","v.","0"};
    	String[] v24={"gag","�����磬����Ц����ƴ�ڻ","n.","0"};
    	String[] v25={"granulate","ʹ�ʿ���״��","v.","0"};

    	String[] v26={"hardihood","�󵨣�³ç","n.","0"};
    	String[] v27={"heavy-handed","��׾��","adj.","0"};
    	String[] v28={"jettison","����","n.","0"};
    	String[] v29={"ladle","��ӣ������","n.","0"};
    	String[] v30={"lance","�п�","v.","0"};

    	String[] v31={"leverage","�ܸ����ã������ϵ�����","n.","0"};
    	String[] v32={"liken","��...����","v.","0"};
    	String[] v33={"madcap","���ʵģ�������","adj.","0"};
    	String[] v34={"marbled","�д���ʯ���Ƶģ����ݻ�ϵ�","adj.","0"};
    	String[] v35={"mastermind","�߻��������","n.","0"};

    	String[] v36={"memorandum","����¼","n.","0"};
    	String[] v37={"nicety","��ȷ","n.","0"};
    	String[] v38={"observant","ע��ģ����ĵ�","adj.","0"};
    	String[] v39={"pat","���ʵ�","adj.","0"};
    	String[] v40={"photorespiration","���������","n.","0"};

    	String[] v51={"privy","���˵ģ����ܲ����","adj.","0"};
    	String[] v52={"proscenium","��̨","n.","0"};
    	String[] v53={"radical","������","adj.","0"};
    	String[] v54={"rascal","��å������ʵ����","n.","0"};
    	String[] v55={"rosy","�ֹ۵ģ���ϣ����","adj.","0"};

    	String[] v66={"scratch","��Ϳ�һ�","v.","0"};
    	String[] v67={"screen","ɸѡ��ϵͳ�ز����Ծ����Ƿ��ʺ�","v.","0"};
    	String[] v68={"scrimp","��ʡ�򾫴�ϸ��","v.","0"};
    	String[] v69={"simpleton","������ɵ��","n.","0"};
    	String[] v70={"slink","Ǳ��","v.","0"};

    	String[] v71={"snarl","������ŭ��","v.","0"};
    	String[] v72={"spike","���Σ�����","v.","0"};
    	String[] v73={"spoilsport","�ƻ��������µ���","adj.","0"};
    	String[] v74={"staunch","�ᶨ��","adj.","0"};
    	String[] v75={"steward","����Ա���ܼ�","n.","0"};

    	String[] v76={"traipse","�������й�","v.","0"};
    	String[] v77={"tureen","�иĵ�����","n.","0"};
    	String[] v78={"untrammeled","�������ڵ�","adj.","0"};
    	String[] v79={"verisimilitude","����","n.","0"};
    	String[] v80={"weather","����ס����","v.","0"};

    	String[] v81={"windfall","����֮��ĺ��˻�����","n.","0"};
    	String[] v82={"willy-nilly","���ɱ���ģ��������","adj.","0"};
    	String[] v83={"winning","���˵�","adj.","0"};
    	String[] v84={"wrest","�����ҵģ�����Ť�Ķ���ȡ��","v.","0"};
    	
    	
    	
    	
    	subInitial(DBParameter.pos_wl_49,v1);
		subInitial(DBParameter.pos_wl_49,v2);
		subInitial(DBParameter.pos_wl_49,v3);
		subInitial(DBParameter.pos_wl_49,v4);
		subInitial(DBParameter.pos_wl_49,v5);
		subInitial(DBParameter.pos_wl_49,v6);
		subInitial(DBParameter.pos_wl_49,v7);
		subInitial(DBParameter.pos_wl_49,v8);
		subInitial(DBParameter.pos_wl_49,v9);
		subInitial(DBParameter.pos_wl_49,v10);
		subInitial(DBParameter.pos_wl_49,v11);
		subInitial(DBParameter.pos_wl_49,v12);
		subInitial(DBParameter.pos_wl_49,v13);
		subInitial(DBParameter.pos_wl_49,v14);
		subInitial(DBParameter.pos_wl_49,v15);
		subInitial(DBParameter.pos_wl_49,v16);
		subInitial(DBParameter.pos_wl_49,v17);
		subInitial(DBParameter.pos_wl_49,v18);
		subInitial(DBParameter.pos_wl_49,v19);
		subInitial(DBParameter.pos_wl_49,v20);
		subInitial(DBParameter.pos_wl_49,v21);
		subInitial(DBParameter.pos_wl_49,v22);
		subInitial(DBParameter.pos_wl_49,v23);
		subInitial(DBParameter.pos_wl_49,v24);
		subInitial(DBParameter.pos_wl_49,v25);
		subInitial(DBParameter.pos_wl_49,v26);
		subInitial(DBParameter.pos_wl_49,v27);
		subInitial(DBParameter.pos_wl_49,v28);
		subInitial(DBParameter.pos_wl_49,v29);
		subInitial(DBParameter.pos_wl_49,v30);
		subInitial(DBParameter.pos_wl_49,v31);
		subInitial(DBParameter.pos_wl_49,v32);
		subInitial(DBParameter.pos_wl_49,v33);
		subInitial(DBParameter.pos_wl_49,v34);
		subInitial(DBParameter.pos_wl_49,v35);
		subInitial(DBParameter.pos_wl_49,v36);
		subInitial(DBParameter.pos_wl_49,v37);
		subInitial(DBParameter.pos_wl_49,v38);
		subInitial(DBParameter.pos_wl_49,v39);
		subInitial(DBParameter.pos_wl_49,v40);
		
		
		subInitial(DBParameter.pos_wl_49,v51);
		subInitial(DBParameter.pos_wl_49,v52);
		subInitial(DBParameter.pos_wl_49,v53);
		subInitial(DBParameter.pos_wl_49,v54);
		subInitial(DBParameter.pos_wl_49,v55);
		
		subInitial(DBParameter.pos_wl_49,v66);
		subInitial(DBParameter.pos_wl_49,v67);
		subInitial(DBParameter.pos_wl_49,v68);
		subInitial(DBParameter.pos_wl_49,v69);
		subInitial(DBParameter.pos_wl_49,v70);
		subInitial(DBParameter.pos_wl_49,v71);
		subInitial(DBParameter.pos_wl_49,v72);
		subInitial(DBParameter.pos_wl_49,v73);
		subInitial(DBParameter.pos_wl_49,v74);
		subInitial(DBParameter.pos_wl_49,v75);
		subInitial(DBParameter.pos_wl_49,v76);
		subInitial(DBParameter.pos_wl_49,v77);
		subInitial(DBParameter.pos_wl_49,v78);
		subInitial(DBParameter.pos_wl_49,v79);
		subInitial(DBParameter.pos_wl_49,v80);
		subInitial(DBParameter.pos_wl_49,v81);
		subInitial(DBParameter.pos_wl_49,v82);
		subInitial(DBParameter.pos_wl_49,v83);
		subInitial(DBParameter.pos_wl_49,v84);
		


    }
    
    
    
    
    public void subInitial(int tablePosition,String[] values)
{
	ContentValues cv=new ContentValues();
	for(int i=0;i<DBParameter.WORDLIST_FIELD_LENGTH;i++)
	{
		cv.put(DBParameter.fieldsInsert[i], values[i]);
	}
	dbInitial.insert(TableNames[tablePosition], null, cv);
}


/*
 
    String[] v1={"","",,"0"};
	String[] v2={"","",,"0"};
	String[] v3={"","",,"0"};
	String[] v4={"","",,"0"};
	String[] v5={"","",,"0"};
	String[] v6={"","",,"0"};
	String[] v7={"","",,"0"};
	String[] v8={"","",,"0"};
	String[] v9={"","",,"0"};
	String[] v10={"","",,"0"};
	String[] v11={"","",,"0"};
	String[] v12={"","",,"0"};
	String[] v13={"","",,"0"};
	String[] v14={"","",,"0"};
	String[] v15={"","",,"0"};
	String[] v16={"","",,"0"};
	String[] v17={"","",,"0"};
	String[] v18={"","",,"0"};
	String[] v19={"","",,"0"};
	String[] v20={"","",,"0"};
	String[] v21={"","",,"0"};
	String[] v22={"","",,"0"};
	String[] v23={"","",,"0"};
	String[] v24={"","",,"0"};
	String[] v25={"","",,"0"};
	String[] v26={"","",,"0"};
	String[] v27={"","",,"0"};
	String[] v28={"","",,"0"};
	String[] v29={"","",,"0"};
	String[] v30={"","",,"0"};
	String[] v31={"","",,"0"};
	String[] v32={"","",,"0"};
	String[] v33={"","",,"0"};
	String[] v34={"","",,"0"};
	String[] v35={"","",,"0"};
	String[] v36={"","",,"0"};
	String[] v37={"","",,"0"};
	String[] v38={"","",,"0"};
	String[] v39={"","",,"0"};
	String[] v40={"","",,"0"};
	String[] v41={"","",,"0"};
	String[] v42={"","",,"0"};
	String[] v43={"","",,"0"};
	String[] v44={"","",,"0"};
	String[] v45={"","",,"0"};
	String[] v46={"","",,"0"};
	String[] v47={"","",,"0"};
	String[] v48={"","",,"0"};
	String[] v49={"","",,"0"};
	String[] v50={"","",,"0"};
	String[] v51={"","",,"0"};
    String[] v52={"","",,"0"};
    String[] v53={"","",,"0"};
    String[] v54={"","",,"0"};
    String[] v55={"","",,"0"};
    String[] v56={"","",,"0"};
    String[] v57={"","",,"0"};
    String[] v58={"","",,"0"};
    String[] v59={"","",,"0"};
    String[] v60={"","",,"0"};		
	String[] v61={"","",,"0"};
    String[] v62={"","",,"0"};
   	String[] v63={"","",,"0"};
   	String[] v64={"","",,"0"};
   	String[] v65={"","",,"0"};
   	String[] v66={"","",,"0"};
    String[] v67={"","",,"0"};
    String[] v68={"","",,"0"};
    String[] v69={"","",,"0"};
    String[] v70={"","",,"0"};
	String[] v71={"","",,"0"};
    String[] v72={"","",,"0"};
   	String[] v73={"","",,"0"};
   	String[] v74={"","",,"0"};
   	String[] v75={"","",,"0"};
    String[] v76={"","",,"0"};
    String[] v77={"","",,"0"};
    String[] v78={"","",,"0"};
    String[] v79={"","",,"0"};
    String[] v80={"","",,"0"};
	String[] v81={"","",,"0"};
    String[] v82={"","",,"0"};
    String[] v83={"","",,"0"};
    String[] v84={"","",,"0"};
    String[] v85={"","",,"0"};
    String[] v86={"","",,"0"};
    String[] v87={"","",,"0"};
    String[] v88={"","",,"0"};
    String[] v89={"","",,"0"};
    String[] v90={"","",,"0"};
    String[] v91={"","",,"0"};
    String[] v92={"","",,"0"};
    String[] v93={"","",,"0"};
    String[] v94={"","",,"0"};
    String[] v95={"","",,"0"};
    String[] v96={"","",,"0"};
    String[] v97={"","",,"0"};
    String[] v98={"","",,"0"};
    String[] v99={"","",,"0"};
    String[] v100={"","",,"0"};
       
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	String[] v101={"","",,"0"};
    	String[] v102={"","",,"0"};
    	String[] v103={"","",,"0"};
    	String[] v104={"","",,"0"};
    	String[] v105={"","",,"0"};
    	String[] v106={"","",,"0"};
    	String[] v107={"","",,"0"};
    	String[] v108={"","",,"0"};
    	String[] v109={"","",,"0"};
    	String[] v110={"","",,"0"};
    	String[] v111={"","",,"0"};
    	String[] v112={"","",,"0"};
    	String[] v113={"","",,"0"};
    	String[] v114={"","",,"0"};
    	String[] v115={"","",,"0"};
    	String[] v116={"","",,"0"};
    	String[] v117={"","",,"0"};
    	String[] v118={"","",,"0"};
    	String[] v119={"","",,"0"};
    	String[] v120={"","",,"0"};
    	String[] v121={"","",,"0"};
    	String[] v122={"","",,"0"};
    	String[] v123={"","",,"0"};
    	String[] v124={"","",,"0"};
    	String[] v125={"","",,"0"};
    	String[] v126={"","",,"0"};
    	String[] v127={"","",,"0"};
    	String[] v128={"","",,"0"};
    	String[] v129={"","",,"0"};
    	String[] v130={"","",,"0"};
    	String[] v131={"","",,"0"};
    	String[] v132={"","",,"0"};
    	String[] v133={"","",,"0"};
    	String[] v134={"","",,"0"};
    	String[] v135={"","",,"0"};
    	String[] v136={"","",,"0"};
    	String[] v137={"","",,"0"};
    	String[] v138={"","",,"0"};
    	String[] v139={"","",,"0"};
    	String[] v140={"","",,"0"};
    	String[] v141={"","",,"0"};
    	String[] v142={"","",,"0"};
    	String[] v143={"","",,"0"};
    	String[] v144={"","",,"0"};
    	String[] v145={"","",,"0"};
    	String[] v146={"","",,"0"};
    	String[] v147={"","",,"0"};
    	String[] v148={"","",,"0"};
    	String[] v149={"","",,"0"};
    	String[] v150={"","",,"0"};
    	String[] v151={"","",,"0"};
    	String[] v152={"","",,"0"};
    	String[] v153={"","",,"0"};
    	String[] v154={"","",,"0"};
    	String[] v155={"","",,"0"};
    	String[] v156={"","",,"0"};
    	String[] v157={"","",,"0"};
    	String[] v158={"","",,"0"};
    	String[] v159={"","",,"0"};
    	String[] v160={"","",,"0"};
    	String[] v161={"","",,"0"};
    	String[] v162={"","",,"0"};
    	String[] v163={"","",,"0"};
    	String[] v164={"","",,"0"};
    	String[] v165={"","",,"0"};
    	String[] v166={"","",,"0"};
    	String[] v167={"","",,"0"};
    	String[] v168={"","",,"0"};
    	String[] v169={"","",,"0"};
    	String[] v170={"","",,"0"};
    	String[] v171={"","",,"0"};
    	String[] v172={"","",,"0"};
    	String[] v173={"","",,"0"};
    	String[] v174={"","",,"0"};
    	String[] v175={"","",,"0"};
    	String[] v176={"","",,"0"};
    	String[] v177={"","",,"0"};
    	String[] v178={"","",,"0"};
    	String[] v179={"","",,"0"};
    	String[] v180={"","",,"0"};
    	String[] v181={"","",,"0"};
    	String[] v182={"","",,"0"};
    	String[] v183={"","",,"0"};
    	String[] v184={"","",,"0"};
    	String[] v185={"","",,"0"};
    	String[] v186={"","",,"0"};
    	String[] v187={"","",,"0"};
    	String[] v188={"","",,"0"};
    	String[] v189={"","",,"0"};
    	String[] v190={"","",,"0"};
    	String[] v191={"","",,"0"};
    	String[] v192={"","",,"0"};
    	String[] v193={"","",,"0"};
    	String[] v194={"","",,"0"};
    	String[] v195={"","",,"0"};
    	String[] v196={"","",,"0"};
    	String[] v197={"","",,"0"};
    	String[] v198={"","",,"0"};
    	String[] v199={"","",,"0"};
    	String[] v200={"","",,"0"};
    	
    	
    	
    	
    	
    	
    	
    	
    			subInitial(DBParameter.pos_wl_1,v1);
		subInitial(DBParameter.pos_wl_1,v2);
		subInitial(DBParameter.pos_wl_1,v3);
		subInitial(DBParameter.pos_wl_1,v4);
		subInitial(DBParameter.pos_wl_1,v5);
		subInitial(DBParameter.pos_wl_1,v6);
		subInitial(DBParameter.pos_wl_1,v7);
		subInitial(DBParameter.pos_wl_1,v8);
		subInitial(DBParameter.pos_wl_1,v9);
		subInitial(DBParameter.pos_wl_1,v10);
		subInitial(DBParameter.pos_wl_1,v11);
		subInitial(DBParameter.pos_wl_1,v12);
		subInitial(DBParameter.pos_wl_1,v13);
		subInitial(DBParameter.pos_wl_1,v14);
		subInitial(DBParameter.pos_wl_1,v15);
		subInitial(DBParameter.pos_wl_1,v16);
		subInitial(DBParameter.pos_wl_1,v17);
		subInitial(DBParameter.pos_wl_1,v18);
		subInitial(DBParameter.pos_wl_1,v19);
		subInitial(DBParameter.pos_wl_1,v20);
		subInitial(DBParameter.pos_wl_1,v21);
		subInitial(DBParameter.pos_wl_1,v22);
		subInitial(DBParameter.pos_wl_1,v23);
		subInitial(DBParameter.pos_wl_1,v24);
		subInitial(DBParameter.pos_wl_1,v25);
		subInitial(DBParameter.pos_wl_1,v26);
		subInitial(DBParameter.pos_wl_1,v27);
		subInitial(DBParameter.pos_wl_1,v28);
		subInitial(DBParameter.pos_wl_1,v29);
		subInitial(DBParameter.pos_wl_1,v30);
		subInitial(DBParameter.pos_wl_1,v31);
		subInitial(DBParameter.pos_wl_1,v32);
		subInitial(DBParameter.pos_wl_1,v33);
		subInitial(DBParameter.pos_wl_1,v34);
		subInitial(DBParameter.pos_wl_1,v35);
		subInitial(DBParameter.pos_wl_1,v36);
		subInitial(DBParameter.pos_wl_1,v37);
		subInitial(DBParameter.pos_wl_1,v38);
		subInitial(DBParameter.pos_wl_1,v39);
		subInitial(DBParameter.pos_wl_1,v40);
		subInitial(DBParameter.pos_wl_1,v41);
		subInitial(DBParameter.pos_wl_1,v42);
		subInitial(DBParameter.pos_wl_1,v43);
		subInitial(DBParameter.pos_wl_1,v44);
		subInitial(DBParameter.pos_wl_1,v45);
		subInitial(DBParameter.pos_wl_1,v46);
		subInitial(DBParameter.pos_wl_1,v47);
		subInitial(DBParameter.pos_wl_1,v48);
		subInitial(DBParameter.pos_wl_1,v49);
		subInitial(DBParameter.pos_wl_1,v50);
		
		subInitial(DBParameter.pos_wl_1,v51);
		subInitial(DBParameter.pos_wl_1,v52);
		subInitial(DBParameter.pos_wl_1,v53);
		subInitial(DBParameter.pos_wl_1,v54);
		subInitial(DBParameter.pos_wl_1,v55);
		subInitial(DBParameter.pos_wl_1,v56);
		subInitial(DBParameter.pos_wl_1,v57);
		subInitial(DBParameter.pos_wl_1,v58);
		subInitial(DBParameter.pos_wl_1,v59);
		subInitial(DBParameter.pos_wl_1,v60);
		subInitial(DBParameter.pos_wl_1,v61);
		subInitial(DBParameter.pos_wl_1,v62);
		subInitial(DBParameter.pos_wl_1,v63);
		subInitial(DBParameter.pos_wl_1,v64);
		subInitial(DBParameter.pos_wl_1,v65);
		subInitial(DBParameter.pos_wl_1,v66);
		subInitial(DBParameter.pos_wl_1,v67);
		subInitial(DBParameter.pos_wl_1,v68);
		subInitial(DBParameter.pos_wl_1,v69);
		subInitial(DBParameter.pos_wl_1,v70);
		subInitial(DBParameter.pos_wl_1,v71);
		subInitial(DBParameter.pos_wl_1,v72);
		subInitial(DBParameter.pos_wl_1,v73);
		subInitial(DBParameter.pos_wl_1,v74);
		subInitial(DBParameter.pos_wl_1,v75);
		subInitial(DBParameter.pos_wl_1,v76);
		subInitial(DBParameter.pos_wl_1,v77);
		subInitial(DBParameter.pos_wl_1,v78);
		subInitial(DBParameter.pos_wl_1,v79);
		subInitial(DBParameter.pos_wl_1,v80);
		subInitial(DBParameter.pos_wl_1,v81);
		subInitial(DBParameter.pos_wl_1,v82);
		subInitial(DBParameter.pos_wl_1,v83);
		subInitial(DBParameter.pos_wl_1,v84);
		subInitial(DBParameter.pos_wl_1,v85);
		subInitial(DBParameter.pos_wl_1,v86);
		subInitial(DBParameter.pos_wl_1,v87);
		subInitial(DBParameter.pos_wl_1,v88);
		subInitial(DBParameter.pos_wl_1,v89);
		subInitial(DBParameter.pos_wl_1,v90);
		subInitial(DBParameter.pos_wl_1,v91);
		subInitial(DBParameter.pos_wl_1,v92);
		subInitial(DBParameter.pos_wl_1,v93);
		subInitial(DBParameter.pos_wl_1,v94);
		subInitial(DBParameter.pos_wl_1,v95);
		subInitial(DBParameter.pos_wl_1,v96);
		subInitial(DBParameter.pos_wl_1,v97);
		subInitial(DBParameter.pos_wl_1,v98);
		subInitial(DBParameter.pos_wl_1,v99);
		subInitial(DBParameter.pos_wl_1,v100);
		subInitial(DBParameter.pos_wl_1,v101);
		subInitial(DBParameter.pos_wl_1,v102);
		subInitial(DBParameter.pos_wl_1,v103);
		subInitial(DBParameter.pos_wl_1,v104);
		subInitial(DBParameter.pos_wl_1,v105);
		subInitial(DBParameter.pos_wl_1,v106);
		subInitial(DBParameter.pos_wl_1,v107);
		subInitial(DBParameter.pos_wl_1,v108);
		subInitial(DBParameter.pos_wl_1,v109);
		subInitial(DBParameter.pos_wl_1,v110);
		subInitial(DBParameter.pos_wl_1,v111);
		subInitial(DBParameter.pos_wl_1,v112);
		subInitial(DBParameter.pos_wl_1,v113);
		subInitial(DBParameter.pos_wl_1,v114);
		subInitial(DBParameter.pos_wl_1,v115);
		subInitial(DBParameter.pos_wl_1,v116);
		subInitial(DBParameter.pos_wl_1,v117);
		subInitial(DBParameter.pos_wl_1,v118);
		
		subInitial(DBParameter.pos_wl_1,v119);
		subInitial(DBParameter.pos_wl_1,v120);
		subInitial(DBParameter.pos_wl_1,v121);
		subInitial(DBParameter.pos_wl_1,v122);
		subInitial(DBParameter.pos_wl_1,v123);
		subInitial(DBParameter.pos_wl_1,v124);
		subInitial(DBParameter.pos_wl_1,v125);
		subInitial(DBParameter.pos_wl_1,v126);
		subInitial(DBParameter.pos_wl_1,v127);
		subInitial(DBParameter.pos_wl_1,v128);
		subInitial(DBParameter.pos_wl_1,v129);
		subInitial(DBParameter.pos_wl_1,v130);
		subInitial(DBParameter.pos_wl_1,v131);
		subInitial(DBParameter.pos_wl_1,v132);
		subInitial(DBParameter.pos_wl_1,v133);
		subInitial(DBParameter.pos_wl_1,v134);
		subInitial(DBParameter.pos_wl_1,v135);
		subInitial(DBParameter.pos_wl_1,v136);
		subInitial(DBParameter.pos_wl_1,v137);
		subInitial(DBParameter.pos_wl_1,v138);
		subInitial(DBParameter.pos_wl_1,v139);
		subInitial(DBParameter.pos_wl_1,v140);
		subInitial(DBParameter.pos_wl_1,v141);
		subInitial(DBParameter.pos_wl_1,v142);
		subInitial(DBParameter.pos_wl_1,v143);
		subInitial(DBParameter.pos_wl_1,v144);
		subInitial(DBParameter.pos_wl_1,v145);
		subInitial(DBParameter.pos_wl_1,v146);
		subInitial(DBParameter.pos_wl_1,v147);
		subInitial(DBParameter.pos_wl_1,v148);
		subInitial(DBParameter.pos_wl_1,v149);
		subInitial(DBParameter.pos_wl_1,v150);
		subInitial(DBParameter.pos_wl_1,v151);
		subInitial(DBParameter.pos_wl_1,v152);
		subInitial(DBParameter.pos_wl_1,v153);
		subInitial(DBParameter.pos_wl_1,v154);
		subInitial(DBParameter.pos_wl_1,v155);
		subInitial(DBParameter.pos_wl_1,v156);
		subInitial(DBParameter.pos_wl_1,v157);
		subInitial(DBParameter.pos_wl_1,v158);
		subInitial(DBParameter.pos_wl_1,v159);
		subInitial(DBParameter.pos_wl_1,v160);
		subInitial(DBParameter.pos_wl_1,v161);
		subInitial(DBParameter.pos_wl_1,v162);
		subInitial(DBParameter.pos_wl_1,v163);
		subInitial(DBParameter.pos_wl_1,v164);
		subInitial(DBParameter.pos_wl_1,v165);
		subInitial(DBParameter.pos_wl_1,v166);
		subInitial(DBParameter.pos_wl_1,v167);
		subInitial(DBParameter.pos_wl_1,v168);
		subInitial(DBParameter.pos_wl_1,v169);
		subInitial(DBParameter.pos_wl_1,v170);
		subInitial(DBParameter.pos_wl_1,v171);
		subInitial(DBParameter.pos_wl_1,v172);
		subInitial(DBParameter.pos_wl_1,v173);
		subInitial(DBParameter.pos_wl_1,v174);
		subInitial(DBParameter.pos_wl_1,v175);
		subInitial(DBParameter.pos_wl_1,v176);
		subInitial(DBParameter.pos_wl_1,v177);
		subInitial(DBParameter.pos_wl_1,v178);
		subInitial(DBParameter.pos_wl_1,v179);
		subInitial(DBParameter.pos_wl_1,v180);
		subInitial(DBParameter.pos_wl_1,v181);
		subInitial(DBParameter.pos_wl_1,v182);
		subInitial(DBParameter.pos_wl_1,v183);
		subInitial(DBParameter.pos_wl_1,v184);
		subInitial(DBParameter.pos_wl_1,v185);
		subInitial(DBParameter.pos_wl_1,v186);
		subInitial(DBParameter.pos_wl_1,v187);
		subInitial(DBParameter.pos_wl_1,v188);
		subInitial(DBParameter.pos_wl_1,v189);
		subInitial(DBParameter.pos_wl_1,v190);
		subInitial(DBParameter.pos_wl_1,v191);
		subInitial(DBParameter.pos_wl_1,v192);
		subInitial(DBParameter.pos_wl_1,v193);
		subInitial(DBParameter.pos_wl_1,v194);
		subInitial(DBParameter.pos_wl_1,v195);
		subInitial(DBParameter.pos_wl_1,v196);
		subInitial(DBParameter.pos_wl_1,v197);
		subInitial(DBParameter.pos_wl_1,v198);
		subInitial(DBParameter.pos_wl_1,v199);
		subInitial(DBParameter.pos_wl_1,v200);
 */



}
