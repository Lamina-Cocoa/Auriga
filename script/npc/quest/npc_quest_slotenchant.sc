//==============================================================================
// Ragnarok Online Slot Enchant Script     by Blaze
//==============================================================================
-	script	�Z���u������#slot	84,{
	mes "[�Z���u������]";
	mes "���͈�ʓI�ȕ����h���";
	mes "�X���b�g�G���`�����g��";
	mes "�ł���Z�p�҂ł��B";
	mes "�X���b�g�G���`�����g�Ƃ́A";
	mes "�����i�ɃX���b�g��ǉ�����";
	mes "�Z�p�̎��ł��B";
	next;
	mes "[�Z���u������]";
	mes "�X���b�g�̒ǉ��Ƃ���������";
	mes "�ȒP�����Ɏv���ł��傤���A";
	mes "����Ȏ��͂���܂���B";
	next;
	mes "[�Z���u������]";
	mes "���̏؋��ɁA���ȊO�ɂ���ȋZ�p��";
	mes "�������l�����܂����ˁH";
	mes "���ꂾ���X���b�g��ǉ�����Z�p��";
	mes "����Ƃ������ł��B";
	next;
	mes "[�Z���u������]";
	mes "���āA�X���b�g��ǉ�������";
	mes "�����i�͂���܂����H";
	mes "�i�ɂ���āA�萔����K�v�ȍޗ��A";
	mes "�����m�����Ⴂ�܂��̂ł����ӂ��B";
	next;
	switch(select("����","�h��","�������ڂ�������","�b����߂�")) {
	case 1:
		set '@equip$,"����";
		break;
	case 2:
		set '@equip$,"�h��";
		break;
	case 3:
		mes "[�Z���u������]";
		mes "�X���b�g�G���`�����g�Ƃ́A";
		mes "�����i�ɃX���b�g��ǉ�����Z�p�B";
		mes "���ۂɊւ�炸�ޗ��͑S�ď��ł��܂��B";
		mes "�܂��A�Ⴆ���������Ƃ��Ă�";
		mes "���B�E�J�[�h�E�������̕t�^���ʂ�";
		mes "�S�ď��ł��܂��B";
		next;
		mes "[�Z���u������]";
		mes "����ɁA�ꕔ�̑����i�����ł���";
		mes "�X���b�g�������ɕ����ǉ����ꂽ��A";
		mes "��{���\���ω����镨������܂��B";
		next;
		mes "[�Z���u������]";
		mes "�����āA�C�����Ȃ���΂Ȃ�Ȃ��_��";
		mes "�����܂��B";
		mes "�Ⴆ�΁c�c�u+7�}���g [0]�v��";
		mes "�����́u�}���g [0]�v�������āA";
		mes "���ɃX���b�g�G���`�����g���˗������";
		mes "�ǂ��炪�ΏۂɂȂ�Ǝv���܂����H";
		next;
		mes "[�Z���u������]";
		mes "�����͂킩��Ȃ��c�c";
		mes "�܂�A�Ώۂ̃A�C�e����";
		mes "�ǂ������������A���͈��";
		mes "�C�ɂ����ɍ�Ƃ���Ƃ������ł��B";
		next;
		mes "[�Z���u������]";
		mes "^FF0000�X���b�g���ȊO�́A";
		mes "��؊֌W����܂���B";
		mes "�Ⴆ���Ӓ肾�낤���A";
		mes "�j�����Ă��悤���A";
		mes "�X���b�g�G���`�����g���s���܂��B^000000";
		next;
		mes "[�Z���u������]";
		mes "^FF0000�������A�N��������������i����";
		mes "�X���b�g�̐��Ɋ֌W�Ȃ�";
		mes "�X���b�g�G���`�����g��";
		mes "�ΏۃA�C�e���ƂȂ�܂��B^000000";
		next;
		mes "[�Z���u������]";
		mes "^FF0000����̃A�C�e��������";
		mes "�X���b�g�G���`�����g��";
		mes "�s�������̂Ȃ�A�������O��";
		mes "�A�C�e����q�ɂɂł�";
		mes "�a���Ă��������������ł��B^000000";
		next;
		mes "[�Z���u������]";
		mes "���̎���Y��A�ʂ̃A�C�e����";
		mes "�X���b�g�G���`�����g�̑ΏۂɂȂ��Ă�";
		mes "���͈�ؐӔC�����܂���B";
		mes "�\���ɒ��ӂ��Ă��������B";
		next;
		mes "[�Z���u������]";
		mes "���ɐ������鎖�͓��ɂ���܂���B";
		mes "�S���͈ꌩ�ɂ������B";
		mes "�܂��̓X���b�g�G���`�����g��";
		mes "���킵�Ă݂���ǂ��ł����H";
		close;
	case 4:
		mes "[�Z���u������]";
		mes "�����ł����c�c";
		close;
	}
	mes "[�Z���u������]";
	mes "OK�A" +'@equip$+ "�ł��ˁB";
	mes '@equip$+ "�ƂȂ�Ɓc�c";
	mes "�萔����ޗ��Ȃǂɂ����";
	mes "4�K���ɕ�����Ă��܂��B";
	mes "�܂��A�X���b�g��ǉ��������A�C�e����";
	mes "�K����I��ł��������B";
	next;
	set '@class,select("C��","B��","A��","S��");
	switch('@class) {
	case 1:
		mes "[�Z���u������]";
		mes "�킩��܂����B";
		mes "C���̂ǂ�" +'@equip$+ "�ɂ��܂����H";
		next;
		if('@equip$ == "����") {
			switch(select("�g���C�f���g [2]","���[�v [3]","�o�C�I���� [3]")) {
			case 1: //�g���C�f���g
				setarray '@delid,1460,1462;
				set '@getid,1461;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,200000;
				break;
			case 2: //���[�v
				set '@delid,1950;
				set '@getid,1951;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,200000;
				break;
			case 3: //�o�C�I����
				set '@delid,1901;
				set '@getid,1902;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,200000;
				break;
			}
		}
		else {
			switch(select("�����g�� [0]","�����O�R�[�g [0]","�T�[�N���b�g [0]","�r���^ [0]")) {
			case 1: //�����g��
				set '@delid,2307;
				set '@getid,2308;
				set '@need,999;
				set '@amount,3;
				set '@zeny,200000;
				break;
			case 2: //�����O�R�[�g
				set '@delid,2309;
				set '@getid,2310;
				set '@need,999;
				set '@amount,3;
				set '@zeny,200000;
				break;
			case 3: //�T�[�N���b�g
				set '@delid,2232;
				set '@getid,2233;
				set '@need,999;
				set '@amount,3;
				set '@zeny,200000;
				break;
			case 4: //�r���^
				set '@delid,2216;
				set '@getid,2217;
				set '@need,999;
				set '@amount,3;
				set '@zeny,200000;
				break;
			}
		}
		break;
	case 2:
		mes "[�Z���u������]";
		mes "�����B���ł��ˁB";
		mes "�ǂ�" +'@equip$+ "�ɂ��܂����H";
		next;
		if('@equip$ == "����") {
			switch(select("�`�F�C�� [2]","�O���f�B�E�X [2]","�p�| [1]","�p�C�N [3]","�C���� [1]","�����[�g [2]","���C���[ [2]","�o�O�i�E [3]","�A�[�o���X�g [1]")) {
			case 1: //�`�F�C��
				setarray '@delid,1519,1521;
				set '@getid,1520;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,300000;
				break;
			case 2: //�O���f�B�E�X
				setarray '@delid,1219,1221;
				set '@getid,1220;
				setarray '@need,984,999;
				setarray '@amount,1,5;
				set '@zeny,300000;
				break;
			case 3: //�p�|
				set '@delid,1714;
				set '@getid,1716;
				setarray '@need,984,999;
				setarray '@amount,2,5;
				set '@zeny,300000;
				break;
			case 4: //�p�C�N
				setarray '@delid,1407,1409;
				set '@getid,1408;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,300000;
				break;
			case 5: //�C����
				set '@delid,1123;
				set '@getid,1128;
				setarray '@need,984,999;
				setarray '@amount,2,5;
				set '@zeny,300000;
				break;
			case 6: //�����[�g
				set '@delid,1905;
				set '@getid,1906;
				set '@need,1011;
				set '@amount,10;
				set '@zeny,300000;
				break;
			case 7: //���C���[
				set '@delid,1954;
				set '@getid,1955;
				set '@need,1011;
				set '@amount,10;
				set '@zeny,300000;
				break;
			case 8: //�o�O�i�E
				set '@delid,1801;
				set '@getid,1802;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,300000;
				break;
			case 9: //�A�[�o���X�g
				set '@delid,1713;
				set '@getid,1715;
				setarray '@need,984,999;
				setarray '@amount,2,5;
				set '@zeny,300000;
				break;
			}
		}
		else {
			switch(select("�~���[�V�[���h [0]","���C�� [0]","�Z�C���g���[�u [0]","�V���N���[�u [0]","�u�[�c [0]","�V���[�Y [0]","�}�t���[ [0]","�K�[�h [0]","�o�b�N���[ [0]","�V�[���h [0]","�{���S���X [0]")) {
			case 1: //�~���[�V�[���h
				set '@delid,2107;
				set '@getid,2108;
				set '@need,999;
				set '@amount,5;
				set '@zeny,250000;
				break;
			case 2: //���C��
				set '@delid,2314;
				set '@getid,2315;
				set '@need,999;
				set '@amount,5;
				set '@zeny,250000;
				break;
			case 3: //�Z�C���g���[�u
				set '@delid,2325;
				set '@getid,2326;
				set '@need,999;
				set '@amount,5;
				set '@zeny,300000;
				break;
			case 4: //�V���N���[�u
				set '@delid,2321;
				set '@getid,2322;
				set '@need,999;
				set '@amount,5;
				set '@zeny,300000;
				break;
			case 5: //�u�[�c
				set '@delid,2405;
				set '@getid,2406;
				set '@need,999;
				set '@amount,5;
				set '@zeny,300000;
				break;
			case 6: //�V���[�Y
				set '@delid,2403;
				set '@getid,2404;
				set '@need,999;
				set '@amount,5;
				set '@zeny,300000;
				break;
			case 7: //�}�t���[
				set '@delid,2503;
				set '@getid,2504;
				set '@need,999;
				set '@amount,5;
				set '@zeny,300000;
				break;
			case 8: //�K�[�h
				set '@delid,2101;
				set '@getid,2102;
				set '@need,999;
				set '@amount,5;
				set '@zeny,300000;
				break;
			case 9: //�o�b�N���[
				set '@delid,2103;
				set '@getid,2104;
				set '@need,999;
				set '@amount,5;
				set '@zeny,300000;
				break;
			case 10: //�V�[���h
				set '@delid,2105;
				set '@getid,2106;
				set '@need,999;
				set '@amount,5;
				set '@zeny,250000;
				break;
			case 11: //�{���S���X
				set '@delid,5046;
				set '@getid,5168;
				set '@need,999;
				set '@amount,5;
				set '@zeny,250000;
				break;
			}
		}
		break;
	case 3:
		mes "[�Z���u������]";
		mes "A���c�c��������ł��ˁB";
		mes "�ǂ�" +'@equip$+ "�ɂ��܂����H";
		next;
		if('@equip$ == "����") {
			switch(select("�n���^�[�{�E [0]","�T�o�C�o�����b�h(INT) [0]","�c���@�C�n���_�[ [0]","�t�����x���W�F [0]","���؂�� [0]","�o���X�^ [0]","�X�^�i�[ [0]","�x���Z���N [0]","�N���C���A [0]")) {
			case 1: //�n���^�[�{�E
				set '@delid,1718;
				set '@getid,1726;
				setarray '@need,984,999;
				setarray '@amount,2,10;
				set '@zeny,500000;
				break;
			case 2: //�T�o�C�o�����b�h�iINT�j
				set '@delid,1619;
				set '@getid,1620;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,500000;
				break;
			case 3: //�c���@�C�n���_�[
				set '@delid,1168;
				set '@getid,1171;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,800000;
				break;
			case 4: //�t�����x���W�F
				set '@delid,1129;
				set '@getid,1149;
				setarray '@need,984,999;
				setarray '@amount,2,10;
				set '@zeny,500000;
				break;
			case 5: //���؂��
				set '@delid,1261;
				set '@getid,1266;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,700000;
				break;
			case 6: //�o���X�^
				set '@delid,1722;
				set '@getid,1727;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,500000;
				break;
			case 7: //�X�^�i�[
				set '@delid,1522;
				set '@getid,1532;
				setarray '@need,984,999;
				setarray '@amount,2,10;
				set '@zeny,500000;
				break;
			case 8: //�x���Z���N
				set '@delid,1814;
				set '@getid,1816;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,500000;
				break;
			case 9: //�N���C���A
				set '@delid,1163;
				set '@getid,1172;
				setarray '@need,984,999;
				setarray '@amount,2,10;
				set '@zeny,500000;
				break;
			}
		}
		else {
			switch(select("�W���G���w���� [0]","���炩���X�q [0]","�������C�Y�u�b�N [0]","�^�C�c [0]","�t���v���[�g [0]","�v���[�g [0]","�V�[�t�N���[�X [0]","�O���[�u [0]","�C�����̃��F�[�� [0]","�}���g [0]","�w���� [0]","�E�҃X�[�c [0]","�I�[�N���̃w���� [0]","�̗̂̎�̃}���g [0]","���E�҂̖X�q [0]","�S�[���f���w�b�h�M�A [0]","�u���[�` [0]","���i�b�N�X [0]")) {
			case 1: //�W���G���w����
				set '@delid,2230;
				set '@getid,2231;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 2: //���炩���X�q
				set '@delid,5114;
				set '@getid,5120;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 3: //�������C�Y�u�b�N
				set '@delid,2109;
				set '@getid,2121;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 4: //�^�C�c
				set '@delid,2330;
				set '@getid,2331;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 5: //�t���v���[�g
				set '@delid,2341;
				set '@getid,2342;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 6: //�v���[�g
				set '@delid,2316;
				set '@getid,2317;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 7: //�V�[�t�N���[�X
				set '@delid,2335;
				set '@getid,2336;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 8: //�O���[�u
				set '@delid,2411;
				set '@getid,2412;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 9: //�C�����̃��F�[��
				set '@delid,5092;
				set '@getid,5093;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 10: //�}���g
				set '@delid,2505;
				set '@getid,2506;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 11: //�w����
				set '@delid,2228;
				set '@getid,2229;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 12: //�E�҃X�[�c
				set '@delid,2337;
				set '@getid,2359;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 13: //�I�[�N���̃w����
				set '@delid,2299;
				set '@getid,5157;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 14: //�̗̂̎�̃}���g
				set '@delid,2507;
				set '@getid,2525;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 15: //���E�҂̖X�q
				set '@delid,2251;
				set '@getid,5158;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 16: //�S�[���f���w�b�h�M�A
				set '@delid,2246;
				set '@getid,5159;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 17: //�u���[�`
				set '@delid,2605;
				set '@getid,2625;
				set '@need,985;
				set '@amount,1;
				set '@zeny,400000;
				break;
			case 18: //���i�b�N�X
				set '@delid,2264;
				set '@getid,5167;
				set '@need,985;
				set '@amount,1;
				set '@zeny,300000;
				break;
			}
		}
		break;
	case 4:
		mes "[�Z���u������]";
		mes "���c�cS���ł����I";
		mes "�c�c�ǂ�" +'@equip$+ "�ł����H";
		next;
		if('@equip$ == "����") {
			switch(select("�O���O�j�[�� [0]","�|�C�Y���i�C�t [0]","�� [0]","�X�N�T�}�b�h [0]","�M���k���K�K�b�v [0]","�J�g���X [0]","�N���Z���g�T�C�_�[ [0]","�T�o�C�o�����b�h(DEX) [0]")) {
			case 1: //�O���O�j�[��
				set '@delid,1413;
				set '@getid,1418;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 2: //�|�C�Y���i�C�t
				set '@delid,1239;
				set '@getid,13016;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 3: //��
				set '@delid,1230;
				set '@getid,13017;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 4: //�X�N�T�}�b�h
				set '@delid,1236;
				set '@getid,13018;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 5: //�M���k���K�K�b�v
				set '@delid,13002;
				set '@getid,13019;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,700000;
				break;
			case 6: //�J�g���X
				set '@delid,1135;
				set '@getid,13400;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 7: //�N���Z���g�T�C�_�[
				set '@delid,1466;
				set '@getid,1476;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 8: //�T�o�C�o�����b�h(DEX)
				set '@delid,1617;
				set '@getid,1618;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,2000000;
				break;
			}
		}
		else {
			switch(select("�}�W�F�X�e�B�b�N�S�[�g [0]","�V���[�v�w�b�h�M�A [0]","�{�[���w���� [0]","�R���Z�A [0]","�N���E�� [0]","�e�B�A�� [0]","�X�t�B���N�X�X [0]","�L���X�e�B���O���[�u [0]","�C�������O [0]","�����O [0]","�|�p�̎w�� [0]")) {
			case 1: //�}�W�F�X�e�B�b�N�S�[�g
				set '@delid,2256;
				set '@getid,5160;
				set '@need,985;
				set '@amount,2;
				set '@zeny,2000000;
				break;
			case 2: //�V���[�v�w�b�h�M�A
				set '@delid,2258;
				set '@getid,5161;
				set '@need,985;
				set '@amount,2;
				set '@zeny,2000000;
				break;
			case 3: //�{�[���w����
				set '@delid,5017;
				set '@getid,5162;
				set '@need,985;
				set '@amount,2;
				set '@zeny,2000000;
				break;
			case 4: //�R���Z�A
				set '@delid,5019;
				set '@getid,5163;
				set '@need,985;
				set '@amount,2;
				set '@zeny,2000000;
				break;
			case 5: //�N���E��
				set '@delid,2235;
				set '@getid,5165;
				set '@need,985;
				set '@amount,2;
				set '@zeny,2000000;
				break;
			case 6: //�e�B�A��
				set '@delid,2234;
				set '@getid,5164;
				set '@need,985;
				set '@amount,2;
				set '@zeny,2000000;
				break;
			case 7: //�X�t�B���N�X�X
				set '@delid,5053;
				set '@getid,5166;
				set '@need,985;
				set '@amount,2;
				set '@zeny,1000000;
				break;
			case 8: //�L���X�e�B���O���[�u
				set '@delid,2343;
				set '@getid,2360;
				set '@need,985;
				set '@amount,2;
				set '@zeny,1000000;
				break;
			case 9: //�C�������O
				set '@delid,2602;
				set '@getid,2622;
				set '@need,985;
				set '@amount,2;
				set '@zeny,1000000;
				break;
			case 10: //�����O
				set '@delid,2601;
				set '@getid,2621;
				set '@need,985;
				set '@amount,2;
				set '@zeny,1000000;
				break;
			case 11: //�|�p�̎w��
				set '@delid,2619;
				set '@getid,2671;
				set '@need,985;
				set '@amount,2;
				set '@zeny,1000000;
				break;
			}
		}
		break;
	}
	mes "[�Z���u������]";
	mes getitemname('@delid)+ " [" +getiteminfo('@delid,10)+ "]�ł��ˁB";
	mes "�萔����^FF0000" +'@zeny/10000+ "��Zeny^000000�A";
	if('@amount[1]) {
		mes "�ޗ���" +getitemname('@need[0])+'@amount[0]+ "��^000000�A";
		mes "^FF0000" +getitemname('@need[1])+'@amount[1]+ "��^000000�ł��B";
	}
	else
		mes "�ޗ���" +getitemname('@need)+'@amount+ "��^000000�ł��B";
	mes "�������A" +getitemname('@delid)+ " [" +getiteminfo('@delid,10)+ "]���K�v�ł��B";
	next;
	mes "[�Z���u������]";
	mes "�Ȃ��A���ӓ_�Ƃ���";
	mes "�X���b�g�G���`�����g���s����";
	mes "���ۂɊւ�炸�ޗ��͑S�ď��ł��܂��B";
	mes "�܂��A�Ⴆ���������Ƃ��Ă�";
	mes "���B�E�J�[�h�E�������̕t�^���ʂ�";
	mes "�S�ď��ł��܂��B";
	next;
	if(select("�X���b�g�G���`�����g�𗊂�","�b����߂�")==2) {
		mes "[�Z���u������]";
		mes "�܂����Ă��������B";
		close;
	}
	if((countitem('@delid[0]) < 1 && countitem('@delid[1]) < 1) || Zeny < '@zeny) {
		mes "[�Z���u������]";
		mes "�ޗ�������������܂����H";
		close;
	}
	for(set '@i,0; '@amount['@i]!=0; set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[�Z���u������]";
			mes "�ޗ�������������܂����H";
			close;
		}
	}
	if(countitem('@delid))
		delitem '@delid,1;
	else
		delitem '@delid[1],1;
	for(set '@i,0; '@amount['@i]!=0; set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	set Zeny,Zeny-'@zeny;
	switch('@class) {
		case 1: set '@success,25; break; //C��
		case 2: set '@success,20; break; //B��
		case 3: set '@success,20; break; //A��
		case 4: set '@success,10; break; //S��
	}
	if(rand(100) < '@success) {
		if('@class == 4)
			misceffect 90;
		else
			misceffect 83;
		mes "[�Z���u������]";
		mes "OK�A�������܂����B";
		mes "���߂łƂ��������܂��B";
		getitem '@getid,1;
	}
	else {
		misceffect 183;
		mes "[�Z���u������]";
		mes "���c�c���s�ł��B";
		mes "�ǂ����^�����������悤�ł��B";
		mes "�c�c�����������܂Ȃ��ł��������B";
		mes "���x�͂����Ɛ������܂���B";
	}
	next;
	mes "[�Z���u������]";
	mes "����ł́A�܂������p���������B";
	close;
}

-	script	�N#slot	97,{
	mes "[�N]";
	mes "�C�����Ă��������B";
	mes "�X���b�g�G���`�����g���s���ƁA";
	mes "�����i�ɕt�^���ꂽ���ʂ�";
	mes "�����Ă��܂��܂��B";
	next;
	mes "[�N]";
	mes "�܂��A�X���b�g�G���`�����g��";
	mes "����p�ɂ��A��{���\��";
	mes "�ω����鑕���i������܂��B";
	next;
	mes "[�N]";
	mes "�����āA�ƂĂ����������ł����A";
	mes "�X���b�g�������ǉ������";
	mes "�����i������܂��B";
	mes "�������A�S�Ă̑����i��";
	mes "�N���鎖�ł͂���܂���B";
	mes "�����܂ňꕔ�̑����i�݂̂ł��B";
	next;
	mes "[�N]";
	mes "����������׋����āA";
	mes "�Z���u����������̂悤��";
	mes "�X���b�g��ǉ�����Z�p��";
	mes "�g�ɂ������ł��B";
	close;
}

prt_in.gat,33,69,4	duplicate(�Z���u������#slot)	�Z���u������	84
prt_in.gat,31,57,0	duplicate(�N#slot)	�N	97
morocc.gat,51,41,5	duplicate(�Z���u������#slot)	�Z���u������	84
morocc.gat,60,42,3	duplicate(�N#slot)	�N	97
payon.gat,140,151,5	duplicate(�Z���u������#slot)	�Z���u������	84
payon.gat,143,143,7	duplicate(�N#slot)	�N	97
lhz_in02.gat,281,35,4	duplicate(�Z���u������#slot)	�Z���u������	84
lhz_in02.gat,269,33,4	duplicate(�N#slot)	�N	97
//==============================================================================
-	script	���A�u������#slot	86,{
	mes "[���A�u������]";
	mes "���͈�ʓI�ȕ����h���";
	mes "�X���b�g�G���`�����g��";
	mes "�ł���Z�p�҂ł��B";
	mes "�X���b�g�G���`�����g�Ƃ́A";
	mes "�����i�ɃX���b�g��ǉ�����";
	mes "�Z�p�̎��ł��B";
	next;
	mes "[���A�u������]";
	mes "�Z�ł���Z���u��������";
	mes "�Z�p�w�������Ė���Ă���̂�";
	mes "���̎��͏o���܂��B";
	next;
	mes "[���A�u������]";
	mes "�܂��A�c�c�Z�Ɣ�ׂ��";
	mes "�o���鎖�͏��Ȃ��̂ł����B";
	next;
	mes "[���A�u������]";
	mes "�Z�͋Z�p�������Ă���Ȃ���";
	mes "���̌��������Ȃ��悤��";
	mes "���ɋC��z���Ă���܂��āB";
	mes "���A�ŁA���ɂ����o���Ȃ�";
	mes "���ʂȃX���b�g�G���`�����g��";
	mes "�K�����܂����B";
	next;
	mes "[���A�u������]";
	mes "�Z�͗]��ɂ��댯������A��";
	mes "���ʂȃX���b�g�G���`�����g��";
	mes "���C�ɏ����Ȃ������悤�ł����c�c";
	next;
	mes "[���A�u������]";
	mes "���āA�X���b�g��ǉ�������";
	mes "�����i�͂���܂����H";
	mes "�i�ɂ���āA�萔����K�v�ȍޗ��A";
	mes "�����m�����Ⴂ�܂��̂ł����ӂ��B";
	next;
	switch(select("����","�h��","���ʂȃX���b�g�G���`�����g�H","�������ڂ�������","�b����߂�")) {
	case 1:
		set '@equip$,"����";
		break;
	case 2:
		set '@equip$,"�h��";
		break;
	case 3:
		mes "[���A�u������]";
		mes "�����B";
		mes "�Z�������ɂ́A�l�Ԃ��s���Ă����s��";
		mes "�ł͂Ȃ��ƁB";
		mes "�_�ɑ΂���s���ȍs���炵���ł��B";
		next;
		mes "[���A�u������]";
		mes "�������͂ƂĂ������̂ł����A";
		mes "�ޗ�����Ƃɂ�����萔��������ŁA";
		mes "�˗�����l������̂��ǂ����c�c";
		mes "�����A�^��ł��B";
		next;
		mes "[���A�u������]";
		mes "�c�c�c�c";
		next;
		mes "[���A�u������]";
		mes "�c�c�c�c";
		next;
		mes "[���A�u������]";
		mes "�c�c�c�c";
		next;
		mes "[���A�u������]";
		mes "�����������ł��ˁH";
		mes "�܂��A�������炢�Ȃ�c�c";
		mes "�������A�Z�ɂ͔閧�ł��肢���܂���H";
		mes "��������Șb���������Ƃ��o������";
		mes "�����ڂɉ�킳��Ă��܂��܂�����I";
		next;
		mes "[���A�u������]";
		mes "�������� 90%�A���� 2�A";
		mes "2��Zeny���̑����������܂��B";
		next;
		mes "[���A�u������]";
		mes "���̋Z�p�Ƃ́c�c";
		mes "���̑��z�_�̊��ɃX���b�g��ǉ�����";
		mes "�Ƃ�������Z�p�Ȃ̂ł�!!";
		next;
		if(select("�X���b�g�G���`�����g�𗊂�","�b����߂�")==2) {
			mes "[���A�u������]";
			mes "�܂����Ă��������B";
			close;
		}
		mes "[���A�u������]";
		mes "�c�c�c�c";
		next;
		mes "[���A�u������]";
		mes "�c�c�c�c";
		next;
		mes "[���A�u������]";
		mes "���̘b�𕷂��Ă��܂����H";
		mes "����́A�^�u�[�s�ׂȂ�ł���I";
		mes "����Ă͂����Ȃ��̂ł��I";
		next;
		mes "[���A�u������]";
		mes "���܂����I";
		next;
		mes "[���A�u������]";
		mes "���܂�����Ă΁I";
		next;
		mes "[���A�u������]";
		mes "�c�c���܂���B";
		next;
		mes "[���A�u������]";
		mes "�c�c�c�c";
		next;
		mes "[���A�u������]";
		mes "�c�c";
		next;
		mes "[���A�u������]";
		mes "�c�c�c�c���[��B";
		mes "�킩��܂����I";
		mes "���񂾂��́A��O�ł���I";
		next;
		mes "[���A�u������]";
		mes "���z�_�̊��ł��ˁB";
		mes "�萔����^FF0000 2��Zeny^000000�A";
		mes "�ޗ���^FF0000���� 2��^000000�ł��B";
		mes "�������A���z�_�̊�[0]��";
		mes "�K�v�ł��B";
		next;
		mes "[���A�u������]";
		mes "�Ȃ��A���ӓ_�Ƃ���";
		mes "�X���b�g�G���`�����g���s����";
		mes "���ۂɊւ�炸�ޗ��͑S�ď��ł��܂��B";
		mes "�܂��A�Ⴆ���������Ƃ��Ă�";
		mes "���B�E�J�[�h�E�������̕t�^���ʂ�";
		mes "�S�ď��ł��܂��B";
		next;
		if(countitem(5022) < 1 || countitem(969) < 2 || Zeny < 200000000) {
			mes "[���A�u������]";
			mes "�ޗ�������������܂����H";
			close;
		}
		if(select("�X���b�g�G���`�����g�𗊂�","�b����߂�")==2) {
			mes "[���A�u������]";
			mes "�܂����Ă��������B";
			close;
		}
		delitem 5022,1;
		delitem 969,2;
		set Zeny,Zeny-200000000;
		if(rand(100) < 90) {
			misceffect 90;
			mes "[���A�u������]";
			mes "OK�A�������܂����B";
			mes "���߂łƂ��������܂��B";
			getitem 5353,1;
		}
		else {
			misceffect 183;
			mes "[���A�u������]";
			mes "���c�c���s�ł��B";
			mes "�ǂ����^�����������悤�ł��B";
			mes "�c�c�����������܂Ȃ��ł��������B";
			mes "���x�͂����Ɛ������܂���B";
		}
		next;
		mes "[���A�u������]";
		mes "����ł́A�܂������p���������B";
		close;
	case 4:
		mes "[���A�u������]";
		mes "�X���b�g�G���`�����g�Ƃ́A";
		mes "�����i�ɃX���b�g��ǉ�����Z�p�B";
		mes "���ۂɊւ�炸�ޗ��͑S�ď��ł��܂��B";
		mes "�܂��A�Ⴆ���������Ƃ��Ă�";
		mes "���B�E�J�[�h�E�������̕t�^���ʂ�";
		mes "�S�ď��ł��܂��B";
		next;
		mes "[���A�u������]";
		mes "����ɁA�ꕔ�̑����i�����ł���";
		mes "�X���b�g�������ɕ����ǉ����ꂽ��A";
		mes "��{���\���ω����镨������܂��B";
		next;
		mes "[���A�u������]";
		mes "�����āA�C�����Ȃ���΂Ȃ�Ȃ��_��";
		mes "�����܂��B";
		mes "�Ⴆ�΁c�c�u+7�}���g [0]�v��";
		mes "�����́u�}���g [0]�v�������āA";
		mes "���ɃX���b�g�G���`�����g���˗������";
		mes "�ǂ��炪�ΏۂɂȂ�Ǝv���܂����H";
		next;
		mes "[���A�u������]";
		mes "�����͂킩��Ȃ��c�c";
		mes "�܂�A�Ώۂ̃A�C�e����";
		mes "�ǂ������������A���͈��";
		mes "�C�ɂ����ɍ�Ƃ���Ƃ������ł��B";
		next;
		mes "[���A�u������]";
		mes "^FF0000�X���b�g���ȊO�́A";
		mes "��؊֌W����܂���B";
		mes "�Ⴆ���Ӓ肾�낤���A";
		mes "�j�����Ă��悤���A";
		mes "�X���b�g�G���`�����g���s���܂��B^000000";
		next;
		mes "[���A�u������]";
		mes "^FF0000�������A�N��������������i����";
		mes "�X���b�g�̐��Ɋ֌W�Ȃ�";
		mes "�X���b�g�G���`�����g��";
		mes "�ΏۃA�C�e���ƂȂ�܂��B^000000";
		next;
		mes "[���A�u������]";
		mes "^FF0000����̃A�C�e��������";
		mes "�X���b�g�G���`�����g��";
		mes "�s�������̂Ȃ�A�������O��";
		mes "�A�C�e����q�ɂɂł�";
		mes "�a���Ă��������������ł��B^000000";
		next;
		mes "[���A�u������]";
		mes "���̎���Y��A�ʂ̃A�C�e����";
		mes "�X���b�g�G���`�����g�̑ΏۂɂȂ��Ă�";
		mes "���͈�ؐӔC�����܂���B";
		mes "�\���ɒ��ӂ��Ă��������B";
		next;
		mes "[���A�u������]";
		mes "���ɐ������鎖�͓��ɂ���܂���B";
		mes "�S���͈ꌩ�ɂ������B";
		mes "�܂��̓X���b�g�G���`�����g��";
		mes "���킵�Ă݂���ǂ��ł����H";
		close;
	case 5:
		mes "[���A�u������]";
		mes "�����ł����c�c";
		close;
	}
	mes "[���A�u������]";
	mes "OK�A" +'@equip$+ "�ł��ˁB";
	mes '@equip$+ "�ƂȂ�Ɓc�c";
	mes "�萔����ޗ��Ȃǂɂ����";
	mes "4�K���ɕ�����Ă��܂��B";
	mes "�܂��A�X���b�g��ǉ��������A�C�e����";
	mes "�K����I��ł��������B";
	next;
	set '@class,select("C��","B��","A��","S��");
	switch('@class) {
	case 1:
		mes "[���A�u������]";
		mes "�킩��܂����B";
		mes "C���̂ǂ�" +'@equip$+ "�ɂ��܂����H";
		next;
		if('@equip$ == "����") {
			switch(select("�􂯂���n�̏�","�r�ꋶ���g�̏�","�����Ă镗�̏�","�R���鑾�z�̏�")) {
			case 1: //�􂯂���n�̏�
				set '@delid,1554;
				set '@getid,1569;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,200000;
				break;
			case 2: //�r�ꋶ���g�̏�
				set '@delid,1553;
				set '@getid,1568;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,200000;
				break;
			case 3: //�����Ă镗�̏�
				set '@delid,1556;
				set '@getid,1571;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,200000;
				break;
			case 4: //�R���鑾�z�̏�
				set '@delid,1555;
				set '@getid,1570;
				set '@need,1010;
				set '@amount,10;
				set '@zeny,200000;
				break;
			}
		}
		else {
			switch(select("�����p�Ђ܂��","�w�ҖX","�傫�ȃ��{��","�w���X")) {
			case 1: //�����p�Ђ܂��
				set '@delid,2253;
				set '@getid,5351;
				set '@need,999;
				set '@amount,3;
				set '@zeny,100000;
				break;
			case 2: //�w�ҖX
				set '@delid,5012;
				set '@getid,5347;
				set '@need,999;
				set '@amount,3;
				set '@zeny,100000;
				break;
			case 3: //�傫�ȃ��{��
				set '@delid,2244;
				set '@getid,5348;
				set '@need,999;
				set '@amount,5;
				set '@zeny,100000;
				break;
			case 4: //�w���X
				set '@delid,5016;
				set '@getid,5349;
				set '@need,999;
				set '@amount,5;
				set '@zeny,100000;
				break;
			}
		}
		break;
	case 2:
		mes "[���A�u������]";
		mes "�����B���ł��ˁB";
		mes "�ǂ�" +'@equip$+ "�ɂ��܂����H";
		next;
		if('@equip$ == "����") {
			switch(select("�I�[�L�b�V���A�b�N�X","�V�~�^�[","�X�p�C�N")) {
			case 1: //�I�[�L�b�V���A�b�N�X
				set '@delid,1304;
				set '@getid,1309;
				set '@need,984;
				set '@amount,1;
				set '@zeny,200000;
				break;
			case 2: //�V�~�^�[
				setarray '@delid,1113,1115;
				set '@getid,1114;
				set '@need,984;
				set '@amount,1;
				set '@zeny,200000;
				break;
			case 3: //�X�p�C�N
				set '@delid,1523;
				set '@getid,1538;
				set '@need,984;
				set '@amount,1;
				set '@zeny,300000;
				break;
			}
		}
		else {
			switch(select("�[���̎w��","�n�C�q�[��")) {
			case 1: //�[���̎w��
				set '@delid,2609;
				set '@getid,2715;
				set '@need,999;
				set '@amount,5;
				set '@zeny,300000;
				break;
			case 2: //�n�C�q�[��
				set '@delid,2409;
				set '@getid,2432;
				set '@need,999;
				set '@amount,5;
				set '@zeny,300000;
				break;
			}
		}
		break;
	case 3:
		mes "[���A�u������]";
		mes "A���c�c��������ł��ˁB";
		mes "�ǂ�" +'@equip$+ "�ɂ��܂����H";
		next;
		if('@equip$ == "����") {
			switch(select("�h���S���L���[","����Ă邢�΂�̃J�^�[��","�����̃J�^�[��","�₽���X���̃J�^�[��","�����̃J�^�[��","�S�[���f�����C�X","���i","�����̕�","�d���̑�","�Q�C�{���O","�V���o�C�`�F���T�[�x��")) {
			case 1: //�h���S���L���[
				set '@delid,13001;
				set '@getid,13030;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 2: //����Ă邢�΂�̃J�^�[��
				set '@delid,1257;
				set '@getid,1276;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 3: //�����̃J�^�[��
				set '@delid,1258;
				set '@getid,1277;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 4: //�₽���X���̃J�^�[��
				set '@delid,1256;
				set '@getid,1275;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 5: //�����̃J�^�[��
				set '@delid,1259;
				set '@getid,1278;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 6: //�S�[���f�����C�X
				set '@delid,1524;
				set '@getid,1539;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 7: //���i
				set '@delid,1918;
				set '@getid,1922;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 8: //�����̕�
				set '@delid,1970;
				set '@getid,1976;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 9: //�d���̑�
				set '@delid,1477;
				set '@getid,1479;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 10: //�Q�C�{���O
				set '@delid,1474;
				set '@getid,1480;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			case 11: //�V���o�C�`�F���T�[�x��
				set '@delid,1167;
				set '@getid,1178;
				set '@need,984;
				set '@amount,2;
				set '@zeny,500000;
				break;
			}
		}
		else {
			switch(select("�C���̓���","���v�̃u�[�c","����E�҃X�[�c")) {
			case 1: //�C���̓���
				set '@delid,2287;
				set '@getid,5350;
				set '@need,985;
				set '@amount,1;
				set '@zeny,500000;
				break;
			case 2: //���v�̃u�[�c
				set '@delid,2425;
				set '@getid,2434;
				set '@need,985;
				set '@amount,1;
				set '@zeny,500000;
				break;
			case 3: //����E�҃X�[�c
				set '@delid,15053;
				set '@getid,15056;
				set '@need,985;
				set '@amount,1;
				set '@zeny,500000;
				break;
			}
		}
		break;
	case 4:
		mes "[���A�u������]";
		mes "���c�cS���ł����I";
		mes "�c�c�ǂ�" +'@equip$+ "�ł����H";
		next;
		if('@equip$ == "����") {
			switch(select("�[�s�����X","���C���u���C�J�[","�h���S���X���C���[","�\�[�h�u���C�J�[","�A�T�V���_�K�[","�O�����h�N���X","�G�N�X�L���[�V���i�[")) {
			case 1: //�[�s�����X
				set '@delid,1468;
				set '@getid,1481;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 2: //���C���u���C�J�[
				set '@delid,1225;
				set '@getid,13032;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 3: //�h���S���X���C���[
				set '@delid,1166;
				set '@getid,1180;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 4: //�\�[�h�u���C�J�[
				set '@delid,1224;
				set '@getid,13031;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 5: //�A�T�V���_�K�[
				set '@delid,1232;
				set '@getid,13033;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 6: //�O�����h�N���X
				set '@delid,1528;
				set '@getid,1540;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			case 7: //�G�N�X�L���[�V���i�[
				set '@delid,1169;
				set '@getid,1179;
				setarray '@need,984,999;
				setarray '@amount,5,10;
				set '@zeny,1000000;
				break;
			}
		}
		else {
			switch(select("�}�W�b�N�R�[�g","�z�[���[���[�u","�_�̎g��","�����j���O�V���c","�u���[�t")) {
			case 1: //�}�W�b�N�R�[�g
				set '@delid,2334;
				set '@getid,2372;
				set '@need,985;
				set '@amount,1;
				set '@zeny,1000000;
				break;
			case 2: //�z�[���[���[�u
				set '@delid,2327;
				set '@getid,2373;
				set '@need,985;
				set '@amount,1;
				set '@zeny,1000000;
				break;
			case 3: //�_�̎g��
				set '@delid,2111;
				set '@getid,2128;
				set '@need,985;
				set '@amount,1;
				set '@zeny,1000000;
				break;
			case 4: //�����j���O�V���c
				set '@delid,2522;
				set '@getid,2523;
				set '@need,985;
				set '@amount,1;
				set '@zeny,1000000;
				break;
			case 5: //�u���[�t
				set '@delid,2339;
				set '@getid,2371;
				set '@need,985;
				set '@amount,1;
				set '@zeny,1000000;
				break;
			}
		}
		break;
	}
	mes "[���A�u������]";
	mes getitemname('@delid)+ "�ł����B";
	mes "�萔����^FF0000" +'@zeny/10000+ "��Zeny^000000�A";
	if('@amount[1]) {
		mes "�ޗ���" +getitemname('@need[0])+'@amount[0]+ "��^000000�A";
		mes "^FF0000" +getitemname('@need[1])+'@amount[1]+ "��^000000�ł��B";
	}
	else
		mes "�ޗ���" +getitemname('@need)+'@amount+ "��^000000�ł��B";
	mes "�������A" +getitemname('@delid)+ " [" +getiteminfo('@delid,10)+ "]���K�v�ł��B";
	next;
	mes "[���A�u������]";
	mes "�Ȃ��A���ӓ_�Ƃ���";
	mes "�X���b�g�G���`�����g���s����";
	mes "���ۂɊւ�炸�ޗ��͑S�ď��ł��܂��B";
	mes "�܂��A�Ⴆ���������Ƃ��Ă�";
	mes "���B�E�J�[�h�E�������̕t�^���ʂ�";
	mes "�S�ď��ł��܂��B";
	next;
	if(select("�X���b�g�G���`�����g�𗊂�","�b����߂�")==2) {
		mes "[���A�u������]";
		mes "�܂����Ă��������B";
		close;
	}
	if((countitem('@delid[0]) < 1 && countitem('@delid[1]) < 1) || Zeny < '@zeny) {
		mes "[���A�u������]";
		mes "�ޗ�������������܂����H";
		close;
	}
	for(set '@i,0; '@amount['@i]!=0; set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[���A�u������]";
			mes "�ޗ�������������܂����H";
			close;
		}
	}
	if(countitem('@delid))
		delitem '@delid,1;
	else
		delitem '@delid[1],1;
	for(set '@i,0; '@amount['@i]!=0; set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	set Zeny,Zeny-'@zeny;
	switch('@class) {
		case 1: set '@success,25; break; //C��
		case 2: set '@success,20; break; //B��
		case 3: set '@success,20; break; //A��
		case 4: set '@success,10; break; //S��
	}
	if(rand(100) < '@success) {
		if('@class == 4)
			misceffect 90;
		else
			misceffect 83;
		mes "[���A�u������]";
		mes "OK�A�������܂����B";
		mes "���߂łƂ��������܂��B";
		getitem '@getid,1;
	}
	else {
		misceffect 183;
		mes "[���A�u������]";
		mes "���c�c���s�ł��B";
		mes "�ǂ����^�����������悤�ł��B";
		mes "�c�c�����������܂Ȃ��ł��������B";
		mes "���x�͂����Ɛ������܂���B";
	}
	next;
	mes "[���A�u������]";
	mes "����ł́A�܂������p���������B";
	close;
}

prontera.gat,244,169,5	duplicate(���A�u������#slot)	���A�u������	86
moc_ruins.gat,154,86,3	duplicate(���A�u������#slot)	���A�u������	86
payon.gat,236,199,3	duplicate(���A�u������#slot)	���A�u������	86
lighthalzen.gat,96,137,3	duplicate(���A�u������#slot)	���A�u������	86

//==================================================
// �v���u������
//==================================================
prontera.gat,81,106,6	script	�v���u������	97,{
	mes "[�v���u������]";
	mes "���ِ͈��E�̋Z�p���g��";
	mes "�h��ɃX���b�g�G���`�����g��";
	mes "�ł���Z�p�҂ł��B";
	mes "�X���b�g�G���`�����g�Ƃ́A";
	mes "�����i�ɃX���b�g��ǉ�����";
	mes "�Z�p�̎��ł��B";
	next;
	mes "[�v���u������]";
	mes "��l�̌Z�Ɏw�����Ă�������Z�p��";
	mes "�Ǝ��ɓ��肵���ِ��E�̋Z�p��Z����";
	mes "���ɍ��x�ȃX���b�g�G���`�����g��";
	mes "�������鎖���o���܂����B";
	next;
	mes "[�v���u������]";
	mes "���܂�ɂ��댯�ȋZ�p�ׁ̈A";
	mes "��l�̌Z�͔��΂��܂�����";
	mes "���͂��̃X���b�g�G���`�����g��";
	mes "�����Ɛ��E�ɍL�߂�";
	mes "�L���Ɏg���ė~�����Ǝv���Ă��܂��B";
	next;
	mes "[�v���u������]";
	mes "�����A����ɑ΂���";
	mes "�X���b�g��ǉ�������������";
	mes "�o�q�̌Z�̃A���u��������";
	mes "����Ō��Ă��������B";
	next;
	mes "[�v���u������]";
	mes "���āA�X���b�g��ǉ�������";
	mes "�h��͂���܂����H";
	mes "�i�ɂ���āA�萔����K�v�ȍޗ��A";
	mes "���������Ⴂ�܂��̂ł����ӂ��B";
	next;
	switch(select("�h���I��","�������ڂ�������","�b����߂�")) {
	case 1:
		mes "[�v���u������]";
		mes "�萔����ޗ��Ȃǂɂ����";
		mes "4�i���ɕ�����Ă��܂��B";
		mes "�܂��A�X���b�g��ǉ��������A�C�e����";
		mes "�K����I��ŉ������B";
		next;
		set '@class,select("C��","B��","A��","S��","��߂�");
		switch('@class) {
			case 1:	//C��
				mes "[�v���u������]";
				mes "�킩��܂����B";
				mes "C���̂ǂ̖h��ɂ��܂����H";
				next;
				switch(select("�S���j���̌R�C","�}�O�j�L���b�v","�t���C�V���[�Y","�얂�̐���","��߂�")) {
					case 1:	//�S���j���̌R�C
						set '@delid,2419;
						set '@getid,2493;
						set '@need,999;
						set '@amount,10;
						set '@price,50000;
						break;
					case 2:	//�}�O�j�L���b�v
						set '@delid,5122;
						set '@getid,18594;
						set '@need,999;
						set '@amount,30;
						set '@price,100000;
						break;
					case 3:	//�t���C�V���[�Y
						set '@delid,2417;
						set '@getid,2488;
						set '@need,999;
						set '@amount,50;
						set '@price,200000;
						break;
					case 4:	//�얂�̐���
						set '@delid,2129;
						set '@getid,2166;
						set '@need,999;
						set '@amount,50;
						set '@price,200000;
						break;
					case 5:	//��߂�
						mes "[�v���u������]";
						mes "�킩��܂����B";
						mes "�����������킫�܂�����";
						mes "�܂����z�����������B";
						close;
				}
				break;
			case 2:	//B��
				mes "[�v���u������]";
				mes "�킩��܂����B";
				mes "B���̂ǂ̖h��ɂ��܂����H";
				next;
				switch(select("�V���h�E�E�H�[�J�[","�ڂ�}���g","�N���e�B�J�������O","��߂�")) {
					case 1:	//�V���h�E�E�H�[�J�[
						set '@delid,2426;
						set '@getid,2486;
						set '@need,985;
						set '@amount,15;
						set '@price,400000;
						break;
					case 2:	//�ڂ�}���g
						set '@delid,2508;
						set '@getid,2588;
						set '@need,985;
						set '@amount,20;
						set '@price,500000;
						break;
					case 3:	//�N���e�B�J�������O
						set '@delid,2616;
						set '@getid,2943;
						set '@need,985;
						set '@amount,20;
						set '@price,500000;
						break;
					case 4:	//��߂�
						mes "[�v���u������]";
						mes "�킩��܂����B";
						mes "�����������킫�܂�����";
						mes "�܂����z�����������B";
						close;
				}
				break;
			case 3:	//A��
				mes "[�v���u������]";
				mes "�킩��܂����B";
				mes "A���̂ǂ̖h��ɂ��܂����H";
				next;
				switch(select("���B�_���̃u�[�c","�Z�t�B���g�V���[�Y","�����K���̃x���g","�����t�F�E�X�̘r��","�S���j���̌�����","��߂�")) {
					case 1:	//���B�_���̃u�[�c
						set '@delid,2418;
						set '@getid,2489;
						set '@need,985;
						set '@amount,30;
						set '@price,700000;
						break;
					case 2:	//�Z�t�B���g�V���[�Y
						set '@delid,2450;
						set '@getid,2487;
						set '@need,985;
						set '@amount,30;
						set '@price,700000;
						break;
					case 3:	//�����K���̃x���g
						set '@delid,2650;
						set '@getid,2900;
						set '@need,985;
						set '@amount,50;
						set '@price,800000;
						break;
					case 4:	//�����t�F�E�X�̘r��
						set '@delid,2649;
						set '@getid,2903;
						set '@need,985;
						set '@amount,50;
						set '@price,800000;
						break;
					case 5:	//�S���j���̌�����
						set '@delid,2520;
						set '@getid,2599;
						set '@need,985;
						set '@amount,50;
						set '@price,800000;
						break;
					case 6:	//��߂�
						mes "[�v���u������]";
						mes "�킩��܂����B";
						mes "�����������킫�܂�����";
						mes "�܂����z�����������B";
						close;
				}
				break;
			case 4:	//S��
				mes "[�v���u������]";
				mes "�킩��܂����B";
				mes "S���̂ǂ̖h��ɂ��܂����H";
				next;
				switch(select("�����K���̃y���_���g","�����t�F�E�X�̎w��","�K���X�̌C","�G�x�V���̂��˂�","�N���C�g�X��n�̗􂯖�","�V���s�j�n�C�̋���","���V�E�X�ΎR�̌�����","���[���u�[�c","��߂�")) {
					case 1:	//�����K���̃y���_���g
						set '@delid,2651;
						set '@getid,2901;
						set '@need,6223;
						set '@amount,1;
						set '@price,1000000;
						break;
					case 2:	//�����t�F�E�X�̎w��
						set '@delid,2648;
						set '@getid,2902;
						set '@need,6223;
						set '@amount,1;
						set '@price,1000000;
						break;
					case 3:	//�K���X�̌C
						set '@delid,2407;
						set '@getid,2494;
						set '@need,6223;
						set '@amount,1;
						set '@price,1000000;
						break;
					case 4:	//�G�x�V���̂��˂�
						set '@delid,2348;
						set '@getid,2349;
						set '@need,6223;
						set '@amount,2;
						set '@price,2000000;
						break;
					case 5:	//�N���C�g�X��n�̗􂯖�
						set '@delid,2350;
						set '@getid,2351;
						set '@need,6223;
						set '@amount,2;
						set '@price,2000000;
						break;
					case 6:	//�V���s�j�n�C�̋���
						set '@delid,2346;
						set '@getid,2347;
						set '@need,6223;
						set '@amount,2;
						set '@price,2000000;
						break;
					case 7:	//���V�E�X�ΎR�̌�����
						set '@delid,2344;
						set '@getid,2345;
						set '@need,6223;
						set '@amount,2;
						set '@price,2000000;
						break;
					case 8:	//���[���u�[�c
						set '@delid,2481;
						set '@getid,2490;
						set '@need,969;
						set '@amount,1;
						set '@price,3000000;
						break;
					case 9:	//��߂�
						mes "[�v���u������]";
						mes "�킩��܂����B";
						mes "�����������킫�܂�����";
						mes "�܂����z�����������B";
						close;
				}
				break;
			case 5:	//��߂�
				mes "[�v���u������]";
				mes "�킩��܂����B";
				mes "�����������킫�܂�����";
				mes "�܂����z�����������B";
				close;
		}
		mes "[�v���u������]";
		mes "^3355FF" +getitemname('@delid)+ "^000000�ł��ˁB";
		mes "�ł͂��m�F���܂��B";
		mes "�@";
		mes "�܂��A�萔���Ƃ���^3355FF" +'@price+ "Zeny^000000��";
		mes "^3355FF" +getitemname('@need)+ "^000000��^3355FF" +'@amount+ "��^000000���������܂��B";
		next;
		mes "[�v���u������]";
		mes "�����āA�G���`�����g��";
		mes "�K��������������Ƃ͌���܂���B";
		mes "^FF0000���s����ƁA�h��͏����Ă��܂��܂��B^000000";
		mes "�܂��A��������ƁA���܂ł�";
		mes "^FF0000���B�l�y�ё}���Ă����J�[�h��^000000";
		mes "^FF0000�����Ă��܂��܂��B";
		next;
		mes "[�v���u������]";
		mes "�G���`�����g���s���܂����H";
		next;
		if(select("^FF0000����͂�߂Ă���^000000","^3355FF���肢���܂�^000000") == 1) {
			mes "[�v���u������]";
			mes "�킩��܂����B";
			mes "�����������킫�܂�����";
			mes "�܂����z�����������B";
			close;
		}
		if(countitem('@delid) < 1 || countitem('@need) < '@amount || Zeny < '@price) {
			mes "[�v���u������]";
			mes "�ޗ�������������܂����H";
			close;
		}
		delitem '@delid,1;
		delitem '@need,'@amount;
		set Zeny,Zeny-'@price;
		switch('@class) {
			case 1: set '@success,25; break; //C��
			case 2: set '@success,20; break; //B��
			case 3: set '@success,15; break; //A��
			case 4: set '@success,10; break; //S��
		}
		if(rand(100) < '@success) {
			if('@class == 4)
				misceffect 90;
			else
				misceffect 83;
			mes "[�v���u������]";
			mes "OK�A�������܂����B";
			mes "���߂łƂ��������܂��B";
			getitem '@getid,1;
		}
		else {
			misceffect 183;
			mes "[�v���u������]";
			mes "���c�c���s�ł��B";
			mes "�ǂ����^�����������悤�ł��B";
			mes "�c�c�����������܂Ȃ��ł��������B";
			mes "���x�͂����Ɛ������܂���B";
		}
		next;
		mes "[�v���u������]";
		mes "����ł́A�܂������p���������B";
		close;
	case 2:
		mes "[�v���u������]";
		mes "�X���b�g�G���`�����g�Ƃ́A";
		mes "�����i�ɃX���b�g��ǉ�����Z�p�B";
		mes "���ۂɊւ�炸�ޗ��͑S�ď��ł��܂��B";
		next;
		mes "[�v���u������]";
		mes "�܂��A�Ⴆ���������Ƃ��Ă�";
		mes "���B�E�J�[�h�E�����A";
		mes "�q�h�D���X���b�g�G���`�����g����";
		mes "�t�^���ʂ͑S�ď��ł��܂��B";
		next;
		mes "[�v���u������]";
		mes "����ɁA�ꕔ�̑����i�����ł���";
		mes "�X���b�g�������ɕ����ǉ����ꂽ��A";
		mes "��{���\���ω����镨������܂��B";
		next;
		mes "[�v���u������]";
		mes "�����āA�C�����Ȃ���΂Ȃ�Ȃ��_��";
		mes "�����܂��B";
		mes "�Ⴆ�΁c�c�u+7�}���g [0]�v��";
		mes "�����́u�}���g [0]�v�������āA";
		mes "���ɃX���b�g�G���`�����g���˗������";
		mes "�ǂ��炪�ΏۂɂȂ�Ǝv���܂����H";
		next;
		mes "[�v���u������]";
		mes "�����͂킩��Ȃ��c�c";
		mes "�܂�A�Ώۂ̃A�C�e����";
		mes "�ǂ������������A���͈��";
		mes "�C�ɂ����ɍ�Ƃ���Ƃ������ł��B";
		next;
		mes "[�v���u������]";
		mes "^FF0000�X���b�g���ȊO�́A^000000";
		mes "^FF0000��؊֌W����܂���B^000000";
		mes "^FF0000�Ⴆ���Ӓ肾�낤���A^000000";
		mes "^FF0000�j�����Ă��悤���A^000000";
		mes "^FF0000�X���b�g�G���`�����g���s���܂��B^000000";
		next;
		mes "[�v���u������]";
		mes "^FF0000�������A�N��������������i����^000000";
		mes "^FF0000�X���b�g�̐��Ɋ֌W�Ȃ�^000000";
		mes "^FF0000�X���b�g�G���`�����g��^000000";
		mes "^FF0000�ΏۃA�C�e���ƂȂ�܂��B^000000";
		next;
		mes "[�v���u������]";
		mes "^FF0000����̃A�C�e��������^000000";
		mes "^FF0000�X���b�g�G���`�����g��^000000";
		mes "^FF0000�s�������̂Ȃ�A�������O��^000000";
		mes "^FF0000�A�C�e����q�ɂɂł�^000000";
		mes "^FF0000�a���Ă��������������ł��B^000000";
		next;
		mes "[�v���u������]";
		mes "���̎���Y��A�ʂ̃A�C�e����";
		mes "�X���b�g�G���`�����g�̑ΏۂɂȂ��Ă�";
		mes "���͈�ؐӔC�����܂���B";
		mes "�\���ɒ��ӂ��Ă��������B";
		next;
		mes "[�v���u������]";
		mes "���ɐ������鎖�͓��ɂ���܂���B";
		mes "�S���͈ꌩ�ɂ������B";
		mes "�܂��̓X���b�g�G���`�����g��";
		mes "���킵�Ă݂���ǂ��ł����H";
		close;
	case 3:
		mes "[�v���u������]";
		mes "�����ł����c�c";
		close;
	}
}

//==================================================
// �A���u������
//==================================================
prontera.gat,79,104,6	script	�A���u������	97,{
	mes "[�A���u������]";
	mes "���ِ͈��E�̋Z�p���g��";
	mes "����ɃX���b�g�G���`�����g��";
	mes "�ł���Z�p�҂ł��B";
	mes "�X���b�g�G���`�����g�Ƃ́A";
	mes "�����i�ɃX���b�g��ǉ�����";
	mes "�Z�p�̎��ł��B";
	next;
	mes "[�A���u������]";
	mes "��l�̌Z�Ɏw�����Ă�������Z�p��";
	mes "�Ǝ��ɓ��肵���ِ��E�̋Z�p��Z����";
	mes "���ɍ��x�ȃX���b�g�G���`�����g��";
	mes "�������鎖���o���܂����B";
	next;
	mes "[�A���u������]";
	mes "���܂�ɂ��댯�ȋZ�p�ׁ̈A";
	mes "��l�̌Z�͔��΂��܂�����";
	mes "���͂��̃X���b�g�G���`�����g��";
	mes "�����Ɛ��E�ɍL�߂�";
	mes "�L���Ɏg���ė~�����Ǝv���Ă��܂��B";
	next;
	mes "[�A���u������]";
	mes "�����A�h��ɑ΂���";
	mes "�X���b�g��ǉ�������������";
	mes "�o�q�̒�̃v���u��������";
	mes "����Ō��Ă��������B";
	next;
	mes "[�A���u������]";
	mes "���āA�X���b�g��ǉ�������";
	mes "����͂���܂����H";
	mes "�i�ɂ���āA�萔����K�v�ȍޗ��A";
	mes "���������Ⴂ�܂��̂ł����ӂ��B";
	next;
	switch(select("�����I��","�������ڂ�������","�b����߂�")) {
	case 1:
		mes "[�A���u������]";
		mes "�萔����ޗ��Ȃǂɂ����";
		mes "4�i���ɕ�����Ă��܂��B";
		mes "�܂��A�X���b�g��ǉ��������A�C�e����";
		mes "�K����I��ŉ������B";
		next;
		set '@class,select("C��","B��","A��","S��","��߂�");
		switch('@class) {
			case 1:	//C��
				mes "[�A���u������]";
				mes "�킩��܂����B";
				mes "C���̂ǂ̕���ɂ��܂����H";
				next;
				switch(select("�[���̏�","�I�[�L�b�V���\�[�h","�t�@�C�A�[�u�����h","�A�C�X�t�@���V�I��","�����̏�","��߂�")) {
					case 1:	//�[���̏�
						set '@delid,1615;
						set '@getid,1662;
						set '@need,999;
						set '@amount,30;
						set '@price,100000;
						break;
					case 2:	//�I�[�L�b�V���\�[�h
						set '@delid,1124;
						set '@getid,13437;
						set '@need,999;
						set '@amount,30;
						set '@price,100000;
						break;
					case 3:	//�t�@�C�A�[�u�����h
						set '@delid,1133;
						set '@getid,13435;
						set '@need,999;
						set '@amount,50;
						set '@price,200000;
						break;
					case 4:	//�A�C�X�t�@���V�I��
						set '@delid,1131;
						set '@getid,13436;
						set '@need,999;
						set '@amount,50;
						set '@price,200000;
						break;
					case 5:	//�����̏�
						set '@delid,1625;
						set '@getid,1666;
						set '@need,999;
						set '@amount,50;
						set '@price,200000;
						break;
					case 6:	//��߂�
						mes "[�A���u������]";
						mes "�킩��܂����B";
						mes "�����������킫�܂�����";
						mes "�܂����z�����������B";
						close;
				}
				break;
			case 2:	//B��
				mes "[�A���u������]";
				mes "�킩��܂����B";
				mes "B���̂ǂ̕���ɂ��܂����H";
				next;
				switch(select("�l���V�X","�h���S���̈�Y","�J�E���^�[�_�K�[","�A�C�{���[�i�C�t","�u���f�B�E���n���}�[","��߂�")) {
					case 1:	//�l���V�X
						set '@delid,1541;
						set '@getid,16022;
						set '@need,984;
						set '@amount,3;
						set '@price,300000;
						break;
					case 2:	//�h���S���̈�Y
						set '@delid,1559;
						set '@getid,1589;
						set '@need,984;
						set '@amount,3;
						set '@price,300000;
						break;
					case 3:	//�J�E���^�[�_�K�[
						set '@delid,1242;
						set '@getid,13073;
						set '@need,984;
						set '@amount,5;
						set '@price,400000;
						break;
					case 4:	//�A�C�{���[�i�C�t
						set '@delid,13039;
						set '@getid,13082;
						set '@need,984;
						set '@amount,5;
						set '@price,400000;
						break;
					case 5:	//�u���f�B�E���n���}�[
						set '@delid,1385;
						set '@getid,1397;
						set '@need,984;
						set '@amount,10;
						set '@price,500000;
						break;
					case 6:	//��߂�
						mes "[�A���u������]";
						mes "�킩��܂����B";
						mes "�����������킫�܂�����";
						mes "�܂����z�����������B";
						close;
				}
				break;
			case 3:	//A��
				mes "[�A���u������]";
				mes "�킩��܂����B";
				mes "A���̂ǂ̕���ɂ��܂����H";
				next;
				switch(select("�X�^�b�t�I�u�I���h","�C���o�[�X�X�P�C��","�u���b�f�B�e�B�A�[�Y","�f�B�o�C���N���X","�X�^�b�t�I�u�s�A�[�V���O","��߂�")) {
					case 1:	//�X�^�b�t�I�u�I���h
						set '@delid,1648;
						set '@getid,1663;
						set '@need,6224;
						set '@amount,5;
						set '@price,700000;
						break;
					case 2:	//�C���o�[�X�X�P�C��
						set '@delid,1269;
						set '@getid,1297;
						set '@need,6224;
						set '@amount,5;
						set '@price,700000;
						break;
					case 3:	//�u���b�f�B�e�B�A�[�Y
						set '@delid,1271;
						set '@getid,1295;
						set '@need,6224;
						set '@amount,10;
						set '@price,800000;
						break;
					case 4:	//�f�B�o�C���N���X
						set '@delid,2001;
						set '@getid,2017;
						set '@need,6224;
						set '@amount,10;
						set '@price,800000;
						break;
					case 5:	//�X�^�b�t�I�u�s�A�[�V���O
						set '@delid,1626;
						set '@getid,1665;
						set '@need,6224;
						set '@amount,10;
						set '@price,800000;
						break;
					case 6:	//��߂�
						mes "[�A���u������]";
						mes "�킩��܂����B";
						mes "�����������킫�܂�����";
						mes "�܂����z�����������B";
						close;
				}
				break;
			case 4:	//S��
				mes "[�A���u������]";
				mes "�킩��܂����B";
				mes "S���̂ǂ̕���ɂ��܂����H";
				next;
				switch(select("����","�A���J�u�����K�[","�J�h���[��","��̏�","�I�[�N�A�[�`���[�̋|","��߂�")) {
					case 1:	//����
						set '@delid,1164;
						set '@getid,21003;
						set '@need,6224;
						set '@amount,15;
						set '@price,1000000;
						break;
					case 2:	//�A���J�u�����K�[
						set '@delid,1191;
						set '@getid,21004;
						set '@need,6224;
						set '@amount,15;
						set '@price,1000000;
						break;
					case 3:	//�J�h���[��
						set '@delid,1527;
						set '@getid,16024;
						set '@need,6224;
						set '@amount,15;
						set '@price,1000000;
						break;
					case 4:	//��̏�
						set '@delid,1636;
						set '@getid,1664;
						set '@need,6224;
						set '@amount,20;
						set '@price,2000000;
						break;
					case 5:	//�I�[�N�A�[�`���[�̋|
						set '@delid,1734;
						set '@getid,18115;
						set '@need,6224;
						set '@amount,20;
						set '@price,2000000;
						break;
					case 6:	//��߂�
						mes "[�A���u������]";
						mes "�킩��܂����B";
						mes "�����������킫�܂�����";
						mes "�܂����z�����������B";
						close;
				}
				break;
			case 5:	//��߂�
				mes "[�A���u������]";
				mes "�킩��܂����B";
				mes "�����������킫�܂�����";
				mes "�܂����z�����������B";
				close;
			}
		mes "[�A���u������]";
		mes "^3355FF" +getitemname('@delid)+ "^000000�ł��ˁB";
		mes "�ł͂��m�F���܂��B";
		mes "�@";
		mes "�܂��A�萔���Ƃ���^3355FF" +'@price+ "Zeny^000000��";
		mes "^3355FF" +getitemname('@need)+ "^000000��^3355FF" +'@amount+ "��^000000���������܂��B";
		next;
		mes "[�A���u������]";
		mes "�����āA�G���`�����g��";
		mes "�K��������������Ƃ͌���܂���B";
		mes "^FF0000���s����ƁA�h��͏����Ă��܂��܂��B^000000";
		mes "�܂��A��������ƁA���܂ł�";
		mes "^FF0000���B�l�y�ё}���Ă����J�[�h��^000000";
		mes "^FF0000�����Ă��܂��܂��B";
		next;
		mes "[�A���u������]";
		mes "�G���`�����g���s���܂����H";
		next;
		if(select("^FF0000����͂�߂Ă���^000000","^3355FF���肢���܂�^000000") == 1) {
			mes "[�A���u������]";
			mes "�킩��܂����B";
			mes "�����������킫�܂�����";
			mes "�܂����z�����������B";
			close;
		}
		if(countitem('@delid) < 1 || countitem('@need) < '@amount || Zeny < '@price) {
			mes "[�A���u������]";
			mes "�ޗ�������������܂����H";
			close;
		}
		delitem '@delid,1;
		delitem '@need,'@amount;
		set Zeny,Zeny-'@price;
		switch('@class) {
			case 1: set '@success,25; break; //C��
			case 2: set '@success,20; break; //B��
			case 3: set '@success,15; break; //A��
			case 4: set '@success,10; break; //S��
		}
		if(rand(100) < '@success) {
			if('@class == 4)
				misceffect 90;
			else
				misceffect 83;
			mes "[�A���u������]";
			mes "OK�A�������܂����B";
			mes "���߂łƂ��������܂��B";
			getitem '@getid,1;
		}
		else {
			misceffect 183;
			mes "[�A���u������]";
			mes "���c�c���s�ł��B";
			mes "�ǂ����^�����������悤�ł��B";
			mes "�c�c�����������܂Ȃ��ł��������B";
			mes "���x�͂����Ɛ������܂���B";
		}
		next;
		mes "[�A���u������]";
		mes "����ł́A�܂������p���������B";
		close;
	case 2:
		mes "[�A���u������]";
		mes "�X���b�g�G���`�����g�Ƃ́A";
		mes "�����i�ɃX���b�g��ǉ�����Z�p�B";
		mes "���ۂɊւ�炸�ޗ��͑S�ď��ł��܂��B";
		next;
		mes "[�A���u������]";
		mes "�܂��A�Ⴆ���������Ƃ��Ă�";
		mes "���B�E�J�[�h�E�����A";
		mes "�q�h�D���X���b�g�G���`�����g����";
		mes "�t�^���ʂ͑S�ď��ł��܂��B";
		next;
		mes "[�A���u������]";
		mes "����ɁA�ꕔ�̑����i�����ł���";
		mes "�X���b�g�������ɕ����ǉ����ꂽ��A";
		mes "��{���\���ω����镨������܂��B";
		next;
		mes "[�A���u������]";
		mes "�����āA�C�����Ȃ���΂Ȃ�Ȃ��_��";
		mes "�����܂��B";
		mes "�Ⴆ�΁c�c�u+7�}���g [0]�v��";
		mes "�����́u�}���g [0]�v�������āA";
		mes "���ɃX���b�g�G���`�����g���˗������";
		mes "�ǂ��炪�ΏۂɂȂ�Ǝv���܂����H";
		next;
		mes "[�A���u������]";
		mes "�����͂킩��Ȃ��c�c";
		mes "�܂�A�Ώۂ̃A�C�e����";
		mes "�ǂ������������A���͈��";
		mes "�C�ɂ����ɍ�Ƃ���Ƃ������ł��B";
		next;
		mes "[�A���u������]";
		mes "^FF0000�X���b�g���ȊO�́A^000000";
		mes "^FF0000��؊֌W����܂���B^000000";
		mes "^FF0000�Ⴆ���Ӓ肾�낤���A^000000";
		mes "^FF0000�j�����Ă��悤���A^000000";
		mes "^FF0000�X���b�g�G���`�����g���s���܂��B^000000";
		next;
		mes "[�A���u������]";
		mes "^FF0000�������A�N��������������i����^000000";
		mes "^FF0000�X���b�g�̐��Ɋ֌W�Ȃ�^000000";
		mes "^FF0000�X���b�g�G���`�����g��^000000";
		mes "^FF0000�ΏۃA�C�e���ƂȂ�܂��B^000000";
		next;
		mes "[�A���u������]";
		mes "^FF0000����̃A�C�e��������^000000";
		mes "^FF0000�X���b�g�G���`�����g��^000000";
		mes "^FF0000�s�������̂Ȃ�A�������O��^000000";
		mes "^FF0000�A�C�e����q�ɂɂł�^000000";
		mes "^FF0000�a���Ă��������������ł��B^000000";
		next;
		mes "[�A���u������]";
		mes "���̎���Y��A�ʂ̃A�C�e����";
		mes "�X���b�g�G���`�����g�̑ΏۂɂȂ��Ă�";
		mes "���͈�ؐӔC�����܂���B";
		mes "�\���ɒ��ӂ��Ă��������B";
		next;
		mes "[�A���u������]";
		mes "���ɐ������鎖�͓��ɂ���܂���B";
		mes "�S���͈ꌩ�ɂ������B";
		mes "�܂��̓X���b�g�G���`�����g��";
		mes "���킵�Ă݂���ǂ��ł����H";
		close;
	case 3:
		mes "[�A���u������]";
		mes "�����ł����c�c";
		close;
	}
}