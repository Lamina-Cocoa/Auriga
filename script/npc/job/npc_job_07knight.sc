//= Athena Script ==============================================================
// Ragnarok Online Knight Jobchange Script	by Blaze
//= Registry ===================================================================
// CHANGE_KN -> 0�`14
//==============================================================================

//============================================================
// �����\������ѓ]�E
//------------------------------------------------------------
prt_in.gat,88,101,4	script	�v�����e���R�m�c��	56,{
	if(Job == Job_Novice) {
		mes "[�R�m�c���w���}��]";
		mes "������̓v�����e���R�m�c�ł��B";
		mes "���̗p�����ȁH";
		next;
		switch (select("���m�ɓ]�E�������ł�","�i�C�g�ɓ]�E�������ł�","�����ɗ�����ł�")) {
		case 1:
			mes "[�R�m�c���w���}��]";
			mes "�n�n�n�I�Ȃ�قǁc";
			mes "�K�˂鏊���ԈႦ���ȁ`";
			next;
			mes "[�R�m�c���w���}��]";
			mes "�����͌��m�M���h�ł͂Ȃ��A�R�m�c���B";
			mes "���m�ɂȂ肽����΁A�C�Y���[�h��";
			mes "���m�M���h�֍s���Ȃ����B";
			break;
		case 2:
			mes "[�R�m�c���w���}��]";
			mes "�ӂށA����傫�����̂͂������Ƃ��B";
			mes "�����A�i�C�g�ɂȂ邽�߂ɂ͂܂�";
			mes "���m�ɂȂ�Ȃ���΂Ȃ�Ȃ����B";
			next;
			mes "[�R�m�c���w���}��]";
			mes "�C�Y���[�h�̌��m�M���h��";
			mes "�s���Ă݂Ȃ����B";
			mes "���m�Ƃ��Ă�����x�r�𖁂�����";
			mes "�܂����Ȃ����B";
			break;
		case 3:
			mes "[�R�m�c���w���}��]";
			mes "�������A�������ǂ����A";
			mes "�ɂȂ烂���X�^�[����C�ł�����";
			mes "�|���̂��B";
			break;
		}
		next;
		mes "[�R�m�c���w���}��]";
		mes "����ł́A�܂��K�v�ȂƂ���";
		mes "�K�˂ė��Ȃ����B";
		close;
	}
	if(Job == Job_Knight) {
		mes "[�R�m�c���w���}��]";
		mes "�����A�R�m�c����c���̌��������t��";
		mes "�o���Ă��邩�ȁH";
		mes "�킪�R�m�c���́A���Ƃ����ɕm���Ă�";
		mes "���X�Ƃ��Ă��邱�ƁB";
		close;
	}
	if(Job != Job_Swordman) {
		mes "[�R�m�c���w���}��]";
		mes "�v�����e���R�m�c�ɖK�˂Ă���";
		mes "���Ƃ����}����B";
		mes "������肵�Ă����Ȃ����B";
		close;
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[�R�m�c���w���}��]";
		mes "������̓v�����e���R�m�c�ł��B";
		mes "���̗p�����ȁH";
		next;
		if(select("�i�C�g�ɓ]�E�������ł�","�����ɗ�����ł�")==2) {
			mes "[�R�m�c���w���}��]";
			mes "�ق��A�N�͌��m�ł͂Ȃ����B";
			mes "�����Ƃ���N�͍��܂ł�";
			mes "�����r�𖁂����悤�����c";
			next;
			mes "[�R�m�c���w���}��]";
			mes "���m�Ȃ��x�A�i�C�g�ւ̓]�E��";
			mes "�l���Ă݂Ă͂ǂ����H";
			mes "�����i�C�g�ɓ]�E����ӎu�������";
			mes "����K�˂Ȃ����B";
			next;
			mes "[�R�m�c���w���}��]";
			mes "����ł͂�����茩�Ă����Ȃ����B";
			close;
		}
		if(Upper == UPPER_HIGH) {
			mes "[�R�m�c���w���}��]";
			mes "�Ȃ񂾁c�c�H";
			mes "���������Ȃ�ʋC�z����������ȁB";
			mes "�N�͒����ԋR�m�Ƃ��Ă���Ă���";
			mes "���ɂ��������Ă������邱�Ƃ�";
			mes "�����ȁB";
			next;
			mes "[�R�m�c���w���}��]";
			mes "�ǂ�Ȏ����ɂ������Ȃ��S��";
			mes "���̐l�X�ɂ��`����悤�ɁB";
			mes "�N�ɉh������I";
			close;
		}
		mes "[�R�m�c���w���}��]";
		mes "�����A�i�C�g��ڎw��" +(Sex? "�N": "���삳��")+ "���I";
		mes "���B�v�����e���R�m���N��";
		mes "�ʓ|�����邼�B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "���͂����v�����e���R�m�c��";
		mes "�R�m�c���ł���";
		mes "�w���}��=�t�H��=�G�y�\�X";
		mes "�Ƃ����B";
		mes "�ӗ~���ӂ���ҒB������x��";
		mes "���̋�������B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "���B�v�����e���R�m�c�́A";
		mes "JobLv40�ȏ�̌��m�ɂ̂�";
		mes "�������󂯂����Ă���B";
		mes "�L���҂��i�C�g�ɂ����邱�Ƃ�";
		mes "�ł��Ȃ�����ȁI";
		next;
		mes "[�R�m�c���w���}��]";
		mes "����ł͓]�E�̐\�����݂�";
		mes "���邩�ˁH";
		next;
		if(select("�͂��A�\�����݂܂�","����������ƍl���Ă݂܂�")==2) {
			mes "[�R�m�c���w���}��]";
			mes "�͂́A�����b���}���������H";
			mes "����Ȃ�΂������ƍl���Ă݂Ȃ����B";
			next;
			mes "[�R�m�c���w���}��]";
			mes "�]�E����p�ӂ��ł�����";
			mes "�܂����Ȃ����B";
			close;
		}
		if(JobLevel < 40) {
			mes "[�R�m�c���w���}��]";
			mes "�͂́A�N�͂܂��i�C�g�ɂȂ�ɂ�";
			mes "�������B";
			mes "JobLv��40�ȏ�K�v����";
			mes "�������͂������I";
			next;
			mes "[�R�m�c���w���}��]";
			mes "������񂻂̈ӗ~�͂�����";
			mes "�܂����߂��B";
			mes "�������������̃����X�^�[��";
			mes "����Ă���܂����Ȃ����B";
			mes "�҂��Ă��邩��ȁB";
			close;
		}
		if(SkillPoint) {
			mes "[�R�m�c���փ��}��]";
			mes "�ނށA�X�L���|�C���g���c���Ă����";
			mes "�]�E�������Ȃ����B";
			mes "�K���ł���X�L�����擾���Ă���";
			mes "�܂����Ȃ����B";
			close;
		}
		mes "[�R�m�c���փ��}��]";
		mes "�悵�A�N�̐\�����݂����}���悤�B";
		mes "���O�� " +strcharinfo(0);
		mes "�����ǂނ񂾂ȁB";
		next;
		mes "[�R�m�c���փ��}��]";
		mes "����ł͓]�E�����ɂ���";
		mes "�������悤�B";
		mes "�䂪�R�m�c�̋R�m�B��";
		mes "��l����A�ނ炪�o��";
		mes "�����ɊF�p�X����Ηǂ��B";
		next;
		mes "[�R�m�c���փ��}��]";
		mes "���ׂĂ̎������I���A�䂪";
		mes "�R�m�B�S�������i������o�������A";
		mes "�i�C�g�ւ̓]�E���\�ƂȂ�B";
		mes "���t�ʂ薞���v�I��l�ł�";
		mes "���΂�����Ύ������܂��ŏ�����";
		mes "�󂯂Ȃ���΂Ȃ�Ȃ��B";
		next;
		mes "[�R�m�c���փ��}��]";
		mes "�������^���Ȏp���ŗՂ߂�";
		mes "�N�̈ӎu���F�ɓ`���͂��ł���B";
		next;
		if(JobLevel >= 50) {	//������
			mes "[�R�m�c���w���}��]";
			mes "���Ȃ���JobLv��50�ł��ˁB";
			mes "���h�ł��B���܂ŔM�S�ɏC�s��";
			mes "�ς�ł����悤�ł��ˁB";
			next;
			mes "[�R�m�c���w���}��]";
			mes "���Ȃ���JobLv��50�ł��̂ŁB";
			mes "�ŏ��̎����͕K�v�Ȃ��ł��ˁB";
			mes "����ł͎��Ɉڂ�܂��傤���B";
			next;
			mes "[�R�m�c���w���}��]";
			mes "�W�F�[���Y=�V���L���[�Y�̂Ƃ����";
			mes "�s���Ȃ����B";
			mes "�ނ����̎������s���Ă���܂��B";
			mes "�����A�s���Ȃ����B";
			set CHANGE_KN,5;
		}
		else {
			mes "[�R�m�c���փ��}��]";
			mes "�S���͈ꌩ�ɔ@�����I";
			mes "�����ɋR�m�����ɉ�A";
			mes "�������󂯂Ȃ����B";
			mes "���ׂĂ̎������I�������";
			mes "�����ɖ߂��Ă��Ȃ����B";
			set CHANGE_KN,1;
		}
		close;
	case 1:
		mes "[�R�m�c���w���}��]";
		mes "����H " +strcharinfo(0)+ " �A���̗p���B";
		mes "�ӂށc�N�ɉ�Ηǂ��̂�";
		mes "�킩��Ȃ��悤���ȁB";
		next;
		mes "[�R�m�c���w���}��]";
		mes "��琫�i���C����āA";
		mes "�����B���m�ŉ����菇�����߂�";
		mes "�����悤���B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�܂��A�R�m�A���h�����[=�V���C���b�N";
		mes "�ɉ���Ă݂Ȃ����B";
		mes "�����������ْ��������Ȃ��悤�ɂȁB";
		close;
	case 4:
		mes "[�R�m�c���w���}��]";
		mes "���� " +strcharinfo(0)+ " ���ȁB";
		mes "��H�N�̂Ƃ���ɍs���Ηǂ��̂�";
		mes "�킩��Ȃ����āH";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�������P�I�����悤���ˁB";
		mes "�Ƃ������Ƃ́c�V���C���b�N�I";
		mes "���̒S���͒N���I";
		next;
		mes "[�R�m�A���h�����[]";
		mes "�W�F�[���Y�ƌ����Ă���܂��I";
		mes "�������L���ł��Ȃ��҂�";
		mes "�i�C�g�ɂȂ��Ăǂ�����!!";
		next;
		mes "[�R�m�c���w���}��]";
		mes "���������ȁH";
		mes "�R�m�W�F�[���Y=�V���L���[�Y��";
		mes "�������󂯂Ȃ����B";
		mes "����Ԃ��ԈႦ�Ȃ��悤�ɂȁB";
		close;
	case 6:
		mes "[�R�m�c���w���}��]";
		mes "���� " +strcharinfo(0)+ " ���ȁB";
		mes "��H�N�̂Ƃ���ɍs���Ηǂ��̂�";
		mes "�킩��Ȃ����āH";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�������Q�I�����悤���ˁB";
		mes "�Ƃ������Ƃ́c�V���L���[�Y�I";
		mes "���̒S���͒N���I";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "�́I�E�C���U�[�ɉ��";
		mes "�\���グ�܂����I";
		mes "�o���Ă��Ȃ���������̂ł��I";
		next;
		mes "[�R�m�c���w���}��]";
		mes "���������ȁH";
		mes "�R�m�E�C���U�[=�x�l�f�B�N�g��";
		mes "�������󂯂Ȃ����B";
		mes "����Ԃ��ԈႦ�Ȃ��悤�ɂȁB";
		close;
	case 8:
		mes "[�R�m�c���w���}��]";
		mes "���� " +strcharinfo(0)+ " ���ȁB";
		mes "��H�N�̂Ƃ���ɍs���Ηǂ��̂�";
		mes "�킩��Ȃ����āH";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�������R�I�����悤���ˁB";
		mes "�Ƃ������Ƃ́c�x�l�f�B�N�g�I";
		mes "���̒S���͒N���I";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�c�G�C�~�[=�x�A�g���X�I";
		mes "�c���o���̈������m���I";
		next;
		mes "[�R�m�c���w���}��]";
		mes "���������ȁH";
		mes "�R�m�G�C�~�[=�x�A�g���X��";
		mes "�������󂯂Ȃ����B";
		mes "����Ԃ��ԈႦ�Ȃ��悤�ɂȁB";
		close;
	case 10:
		mes "[�R�m�c���w���}��]";
		mes "���� " +strcharinfo(0)+ " ���ȁB";
		mes "��H�N�̂Ƃ���ɍs���Ηǂ��̂�";
		mes "�킩��Ȃ����āH";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�������S�I�����悤���ˁB";
		mes "�Ƃ������Ƃ́c�x�A�g���X�I";
		mes "���̒S���͒N���I";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�܂������c�B�G�h�����h��";
		mes "��Ȃ����ƌ������ł��傤�I";
		mes "�K������Ȏq�����������X�^�[��";
		mes "�ǂ��ƈ����A��ē����Ă����̂�B";
		mes "�����Ă������Y��邵�c";
		next;
		mes "[�R�m�c���w���}��]";
		mes "���������ȁH";
		mes "�R�m�G�h�����h=�O���X�g��";
		mes "�������󂯂Ȃ����B";
		mes "����Ԃ��ԈႦ�Ȃ��悤�ɂȁB";
		close;
	case 12:
		mes "[�R�m�c���w���}��]";
		mes "���� " +strcharinfo(0)+ " ���ȁB";
		mes "��H�N�̂Ƃ���ɍs���Ηǂ��̂�";
		mes "�킩��Ȃ����āH";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�Ō�̋R�m�̂Ƃ��낾�낤�c�B";
		mes "�R�m�O���[=�v���X�t�F����";
		mes "�������󂯂ė��Ȃ����B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "�c�c�c";
		next;
		mes "[�R�m�G�h�����h]";
		mes "�l������������c";
		mes "����������ɂ������ƌ��ʂ�����B";
		mes "����̎�������΂킩�邱�Ɓc";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�Ō�̎��������炵������ƂȁB";
		mes "�܂��A���l�ɗ���̂͋R�m�̓���";
		mes "�����邱�Ƃł���B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "����ł͎������I��点�Ă��Ȃ����B";
		mes "�����ĊF�̈ӌ��𕷂��Ă݂悤�B";
		close;
	case 13:
		mes "[�R�m�c���w���}��]";
		mes "����ł͎������I��点�Ă��Ȃ����B";
		mes "�܂������͏I����ĂȂ����B";
		close;
	default:
		mes "[�R�m�c���w���}��]";
		mes "���� " +strcharinfo(0)+ " ���ȁB";
		mes "�����͓����������Ȃ����A";
		mes "�撣���Ă��ꂽ�܂��B";
		close;
	case 14:
		if(SkillPoint) {
			mes "[�R�m�c���փ��}��]";
			mes "�ނށA�X�L���|�C���g���c���Ă����";
			mes "�]�E�������Ȃ����B";
			mes "�K���ł���X�L�����擾���Ă���";
			mes "�܂����Ȃ����B";
			close;
		}
		mes "[�R�m�c���w���}��]";
		mes "���ށA�R�m�̎�����S�ďI���Ă����ȁB";
		mes "�������������I�����S�Ă̌��m��";
		mes "�R�m�ɂȂ��킯�ł͂Ȃ��B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�����̉ߒ��łǂꂭ�炢�^�ʖ�";
		mes "�ł��������A�_�ꂠ�������A";
		mes "���������������c";
		mes "��V���d�񂶂����A�h�ӂ�\�������A";
		mes "�������邱�Ƃ��ł������c";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�����̊Ԍ������Ă�������B";
		mes "�����Ď��B��7�l�̕]���ɂ����";
		mes "�R�m�]�E�ւ̌��肪����̂��B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "����ł́A�F�̕]����";
		mes "�����Ă݂悤���B";
		mes "���̎҂��i�C�g�ɓ]�E�����邩�H";
		mes "�V���C���b�N�A�M���̍l���͂ǂ����I ";
		next;
		mes "[�R�m�A���h�����[]";
		mes "���ȕi�𗊂�ł��A";
		mes "��������Ǝ�ɓ���ė��܂����B";
		mes "�^���ł��I";
		mes (Sex? "��": "�ޏ�")+ "�̓i�C�g�ɂȂ������";
		mes "�܂��߂ɕ�炷�ł��傤�B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "���ށA���ɗǂ��]�����ȁB";
		mes "�V���L���[�Y�͂ǂ��v�����H";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "�܂��ǂ��ł��傤�B";
		mes "���͂��܂�C�ɓ���܂���";
		mes "�i�C�g�ɂȂ�����ɖ�����";
		mes "���߂Ă���邱�Ƃł��傤�B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "���ށB�x�l�f�B�N�g�A�M���́H";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�^���c";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�N�ɕs��������킯�ł͂Ȃ��������B";
		mes "����ł̓x�A�g���X�̕]����";
		mes "�����Č��悤���B";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "����A�ǂ��ł��ˁI";
		if(Sex) {
			mes "�ނ͏\����V�������ł�����B";
			mes "���͂܂��܂��ł����A";
			mes "�i�C�g�ɂȂ�Αf�G�ɂȂ肻���ł��B";
			mes "�ӂӁc";
		}
		else {
			mes "�ޏ��͏\����V�������ł�����B";
			mes "��������������_���������Ɓc";
			mes "�Ȃ�Č����Ă͂����܂���ˁH";
		}
		next;
		mes "[�R�m�c���w���}��]";
		mes "�����ςȕ]�������A�^���ł��邱�Ƃ�";
		mes "�ԈႢ�Ȃ��������B";
		mes "�O���X�g�A�M�����ꌾ�B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "�܂��r��肾���A";
		mes "�ǂ����m�������Ă���B";
		mes (Sex? "��": "�ޏ�")+ "�̉B���ꂽ��΂�";
		mes "���B�Ɍ����������������ł��傤�B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�Ō�ɁA�v���X�t�F���B";
		mes "�b�𕷂��Ă݂悤���B";
		next;
		mes "[�R�m�O���[]";
		mes "������͂����������Ƃ�����܂���ȁB";
		mes "�Ⴂ" +(Sex? "���": "���삳��")+ "���A�E���ɂ�";
		mes "�R�m�ɂȂ邱�Ƃ�]�񂾂�����";
		mes "�\���ł��B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�F�^�����B���΂͋��Ȃ��̂��ȁB";
		mes "����ł͍Ō�Ɏ�����̕]�����B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�c";
		next;
		mes "[�R�m�c���w���}��]";
		mes "�^�����B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "���ׂĂ̎����������ɃN���A������";
		mes "�ǂ����͓�����A�R�m�Ƃ��Ă̓���";
		mes "�\���ɋ�Ă���Ɣ��f�����B";
		next;
		unequip;
		jobchange Job_Knight;
		set CHANGE_KN,0;
		mes "[�R�m�c���w���}��]";
		mes "����ŋM�������B�v�����e���R�m�c��";
		mes "������B";
		mes "�ア�҂����A�_�ꍂ���R�m��";
		mes "�ڎw���Ȃ����B";
		next;
		getitem 656,7;
		mes "[�R�m�c���w���}��]";
		mes "�����Ď��B�F�A�M���̓]�E���j����";
		mes "���蕨��p�ӂ����B";
		next;
		mes "[�R�m�c���w���}��]";
		mes "����ł͍s���Ȃ����I";
		mes "�M���̖����E�R�m�c�̖�����";
		mes "������񂱂Ƃ��I";
		close;
	}
}

//============================================================
// �ꎟ�����i�A�C�e�����W�j
//------------------------------------------------------------
prt_in.gat,75,107,4	script	�R�m�A���h�����[	65,{
	if(Job == Job_Novice) {
		mes "[�R�m�A���h�����[]";
		mes "�m�[�r�X�ł��ˁB";
		mes "�v�����e���R�m�c�ɂ悤�����B";
		next;
		mes "[�R�m�A���h�����[]";
		mes "���͌���Ȃ��������キ�������邪�A";
		mes "�w�͂�����΋����Ȃ�܂��B";
		next;
		mes "[�R�m�A���h�����[]";
		mes "���邢�����𖲌��āA�����̓���";
		mes "�فX�ƕ����čs���Ȃ����B";
		close;
	}
	if(Job == Job_Knight) {
		mes "[�R�m�A���h�����[]";
		mes "�R�m�c���ł��ˁB�ŋ߂ǂ��ł����H";
		next;
		mes "[�R�m�A���h�����[]";
		mes "�����𐮂��ĐH�ו�������ɂ�";
		mes "�����ȏK�����d�v�ł��ˁB";
		mes "�����̐퓬�œ�����[���s�[1��";
		mes "�c�����W�߂܂��傤�B";
		next;
		mes "[�R�m�A���h�����[]";
		mes "������Ƃ����āA��������̕�����";
		mes "�Â�̂��ǂ��Ȃ��ł��ˁB";
		mes "���B�͋R�m�ł�����B";
		close;
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[�R�m�A���h�����[]";
		mes "���B�v�����e���R�m�c�́A";
		mes "���̑嗤�̕��a�̂��߂�";
		mes "�w�͂��Ă��܂��B";
		next;
		mes "[�R�m�A���h�����[]";
		mes "�����̐퓬�̒��ɂ��A";
		mes "�������閾�邢������";
		mes "�v���`���Ă��܂��B";
		close;
	case 1:
		mes "[�R�m�A���h�����[]";
		mes "����ɂ��́B�������p�ł����H";
		next;
		if(select("�i�C�g�]�E�������󂯂����ł�","���ł��Ȃ��ł�")==2) {
			mes "[�R�m�A���h�����[]";
			mes "�����ł����c�B";
			close;
		}
		mes "[�R�m�A���h�����[]";
		mes "���A�i�C�g�ւ̓]�E��";
		mes "��]�Ȃ�����ł��ˁB�����O�́c";
		mes strcharinfo(0)+ " �Ő������ł����H";
		next;
		mes "[�R�m�A���h�����[]";
		mes "���̓v�����e���R�m�c�̋R�m�A";
		mes "�A���h�����[�V���C���b�N�ƌ����܂��B";
		mes "���Ȃ��̍ŏ��̓]�E������S�����܂��B";
		next;
		mes "[�R�m�A���h�����[]";
		mes "�����m�肽���̂͐������ł��B";
		mes "�R�m�Ȃ�N���������Ă��Ȃ����";
		mes "�Ȃ�Ȃ����̈�ł��B";
		mes "������̎����́A�퓬�œ�����";
		mes "�험�i�����W���Ă��邱�Ƃł��B";
		next;
		mes "[�R�m�A���h�����[]";
		mes "���āA�����n�߂܂��傤���B";
		next;
		mes "[�R�m�A���h�����[]";
		mes "���̃A�C�e�����W�߂Ă��Ă��������B";
		next;
		set CHANGE_KN,rand(2,3);
		mes "[�R�m�A���h�����[]";
		if(CHANGE_KN == 2) {
			mes "�N���d���̂Ђ� 5��,";
			mes "�Ԃ��R�E�����̗� 5��,";
			mes "��̉H�� 5��,";
			mes "�I�[�N��m�̏� 5��,";
			mes "঒��ނ̐� 5��,";
			mes "���̂����̂��Ă��� 5��,";
		}
		else {
			mes "�Z���� 5��,";
			mes "�l���̐S�� 5��,";
			mes "�H�l�A���̉� 5��,";
			mes "�L�̂ނ��� 5��,";
			mes "�Â��t���C�p�� 5��,";
			mes "�J�^�V�����̔� 5��,";
		}
		next;
		mes "[�R�m�A���h�����[]";
		mes "�ȏ�ł��B";
		mes "��������W�߂Ă��Ă��������B";
		close;
	case 2:
		setarray '@need,1040,7006,1057,931,903,1028;
		break;
	case 3:
		setarray '@need,1042,950,1032,966,7031,946;
		break;
	case 4:
		mes "[�R�m�A���h�����[]";
		mes "�ق�A������̎����͏I���܂�����B";
		mes "�R�m�W�F�[���Y���҂��Ă��܂��B";
		mes "�����s���Č��Ă��������B";
		close;
	default:
		mes "[�R�m�A���h�����[]";
		mes "�������ɘb���������Ƃ�����̂ł����H";
		mes "���̂悤�ȉɂ�����Ȃ�A���̎�����";
		mes "�󂯂Ă��Ȃ����B";
		mes "������x�\���グ�邪�A";
		mes "�܂��߂Ɏ����ɗՂ�ł��������B";
		close;
	case 14:
		mes "[�R�m�A���h�����[]";
		mes "�������F�I���܂����ˁB�����l�B";
		mes "����ł͎������̋R�m�c���̏���";
		mes "�F�̕]���𕷂��Ă�����Ă��������B";
		close;
	}
	//2-3�̑���
	mes "[�R�m�A���h�����[]";
	mes "���A��Ȃ����B";
	mes "�A�C�e���͏W�߂Ă��܂������H";
	mes "����ł͌��Ă݂܂��傤�B";
	next;
	for(set '@i,0; '@i<6; set '@i,'@i+1) {
		if(countitem('@need['@i]) < 5) {
			mes "[�R�m�A���h�����[]";
			mes "������Ƒ҂��Ă��������B";
			mes "�S�������ĂȂ����Ⴀ��܂��񂩁B";
			next;
			mes "[�R�m�A���h�����[]";
			mes "�܂Ƃ��ȏ��������Ȃ��Ńi�C�g��";
			mes "�Ȃ��Ƃł��v�����̂ł����H";
			mes "���񂾃A�C�e����Y��Ă��܂����Ȃ�";
			mes "������x�����܂���B";
			next;
			mes "[�R�m�A���h�����[]";
			for(set '@i,0; '@i<6; set '@i,'@i+1)
				mes getitemname('@need['@i])+ " 5��,";
			next;
			mes "[�R�m�A���h�����[]";
			mes "������x�\���グ�邪�A";
			mes "�^�ʖڂɎ����ɗՂ�ł��������B";
			mes "�ł͍s���Ȃ����B";
			close;
		}
	}
	mes "[�R�m�A���h�����[]";
	mes "�����ł��ˁB�����l�ł����B";
	mes "���̃A�C�e���́A�R�m�c��";
	mes "�����ɑ傫���v������ł��傤�B";
	next;
	mes "[�R�m�A���h�����[]";
	mes "����ł͎��̓����R�m�ł���";
	mes "�W�F�[���Y=�V���L���[�Y�̂Ƃ����";
	mes "�s���Ă݂Ă��������B";
	mes "�c�����������A���܂ŕ�炵�Ă���";
	mes "�悤�ɐ^�ʖڂɖ]�ނ悤���肢���܂��B";
	for(set '@i,0; '@i<6; set '@i,'@i+1)
		delitem '@need['@i],5;
	set CHANGE_KN,4;
	close;
}

//============================================================
// �񎟎����i��������j
//------------------------------------------------------------
prt_in.gat,71,91,0	script	�R�m�W�F�[���Y	65,{
	if(Job == Job_Novice) {
		mes "[�R�m�W�F�[���Y]";
		mes "�����A�m�[�r�X������ȏ���";
		mes "�ǂ�ȗp���ȁH";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "�����i�C�g�Ɋ֐S�������Ă��A";
		mes "�m�[�r�X����i�C�g�ɓ]�E���邱�Ƃ�";
		mes "�ł��Ȃ��񂾁B";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "���m�ŏC����ς�ł���";
		mes "�܂���������Ⴂ";
		close;
	}
	if(Job == Job_Knight) {
		mes "[�R�m�W�F�[���Y]";
		mes "�悤���C���I�R�m�c���̂̂܂܂���B";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "�V�����R�m�c���B�������Ǝ󂯎�����";
		mes "�������A�����z�΂��肾�B";
		mes "�Ƃ���ŁA�ǂ����ŉ��R�m�c��";
		mes "���_�������悤�Ȃ������������";
		mes "���Ȃ��������H";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "��������Ȃ������������A";
		mes "���̑���Ɏ����Ă���Ă���B";
		close;
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[�R�m�W�F�[���Y]";
		mes "�U���Ɩh��A�����𓯎���";
		mes "�ł��Ȃ����߂��A���茕���g����";
		mes "�����̂Ă鎖�ɂȂ�̂�";
		mes "�h�䂪�キ�Ȃ�B���̌��_��";
		mes "�����ł��镐��͂Ȃ��̂��ȁB";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "����ȃ��m����邱�Ƃ��ł�����";
		mes "�R�m�B�̖��ɗ��͂������B";
		close;
	case 1:
	case 2:
	case 3:
	case 4:
		mes "[�R�m�W�F�[���Y]";
		mes "��A���ɉ����p�����H";
		break;
	case 5:
		mes "[�R�m�W�F�[���Y]";
		mes "��A�܂����O���B���̗p���H";
		break;
	case 6:
		mes "[�R�m�W�F�[���Y]";
		mes "��A�܂����ɗp�����H";
		break;
	default:
		mes "[�R�m�W�F�[���Y]";
		mes "���A���܂񂪉��͖Z�����B";
		mes "������S���I��点�ȁB";
		close;
	case 14:
		mes "[�R�m�W�F�[���Y]";
		mes "�ӂށA���̓����̎�����S�ďI�������B";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "�Ȃ�A�R�m�c���̘b�𕷂��Ă����B";
		mes "���B���Q�����邩��B";
		close;
	}
	next;
	if(select("�i�C�g�]�E�������󂯂����ł�","���ł��Ȃ��ł�")==2) {
		mes "[�R�m�W�F�[���Y]";
		mes (CHANGE_KN == 5)? "�p�������Ȃ�A��I": "�Ȃ񂾁A���L���ȁB";
		close;
	}
	switch(CHANGE_KN) {
	case 1:
		mes "[�R�m�W�F�[���Y]";
		mes "�i�C�g�]�E�������c";
		mes "���������΁A�\������ł����c���ȁB";
		mes "���O�� " +strcharinfo(0)+ " ���������c";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "�ł��A���ɉ�O�ɑ��̓�����";
		mes "����Ă��痈�Ă���B";
		mes "�܂������Ƃ����߂̎�����";
		mes "�󂯂Ă��Ȃ����낤�H";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "��ł��������󂯂Ă�����";
		mes "���̎������󂯂����Ă��B";
		close;
	default:	//2�`3�̂Ƃ�
		mes "[�R�m�W�F�[���Y]";
		mes "�͂́A���炱��c";
		mes "���O�̓A���h�����[�̎�����";
		mes "�󂯂Ă�Œ����낤�H";
		mes "����𖳎����ĉ��̏��ɗ���Ȃ�āc�B";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "�ق�A�������ƍs���I";
		close;
	case 4:
		mes "[�R�m�W�F�[���Y]";
		mes "�����A��߂̎������I��������B";
		mes "�悵�A�������O�̂��߂ɂ������";
		mes "���Ԃ�����Ă�낤�B";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "���̖��̓W�F�[���Y=�V���L���[�Y�B";
		mes "���R�v�����e���R�m�c�����̋R�m���B";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "���O�����ꂩ��󂯂鎎���́A";
		mes "���O���ǂꂾ���R�m�Ƃ������̂�";
		mes "�������Ă��邩�A�܂��A�R�m�̖��_";
		mes "�Ɋւ���N�̍l���𕷂������ˁB";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "�ْ����Ȃ��Ă������B";
		mes "����ȂɎ��Ԃ͂�����Ȃ��B";
		mes "�ȒP�Ȏ��₾�B";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "����ł͎n�߂�B�����������B";
		set CHANGE_KN,5;
		break;
	case 5:
		mes "[�R�m�W�F�[���Y]";
		mes "�������B���x�͂܂Ƃ��ȓ�����";
		mes "���҂��Ă��邼�B";
		mes "���ԈႦ����c�o�債���I";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "����ł͎n�߂�B";
		break;
	case 6:
		mes "[�R�m�W�F�[���Y]";
		mes "����A���O�͂������̎������󂯂�";
		mes "���낤�I���̓����̏��ɍs���Ă���B";
		mes "�R�m�E�C���U�[���҂��Ă����";
		mes "�������͂������B";
		close;
	}
	//�������₱������
	next;
	mes "[�R�m�W�F�[���Y]";
	mes "�i�C�g�͍��������U���͂Ɩh��́A";
	mes "�U�����x�Ƌ��ɗ͋������茕�X�L����";
	mes "���Ȃ����E�Ƃ��B";
	mes "�����ŁA��\�I�ȗ��茕�X�L���ł���";
	mes "�u�c�[�n���h�N�C�b�P���v���g�����Ƃ�";
	mes "�ł��Ȃ�����𓚂���B";
	next;
	if(select("�J�^�i","�X���C���[","�u���[�h�\�[�h","�t�����x���W�F") != 4) {
		mes "[�R�m�W�F�[���Y]";
		mes "�Ⴄ�I����͗��茕������g����I";
		mes "�i�C�g�ɂȂ낤�Ƃ�������i�C�g��";
		mes "�X�L����m��Ȃ��Ăǂ�����I";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "������Ȃ���΁A�X���o��";
		mes "���̕ӂ̃i�C�g�����܂���";
		mes "�����Ă݂ȁB";
		mes "�i�C�g�ɂ��Ă����������";
		mes "���ׂĂ���悤�ɁB";
		close;
	}
	mes "[�R�m�W�F�[���Y]";
	mes "�悵�A���ꂶ��X�L���ɂ���";
	mes "���������w��ł݂悤���B";
	mes "�u�{�E�����O�o�b�V���v���K������̂�";
	mes "�K�v�łȂ��X�L���́H";
	next;
	if(select("���茕�C�� Lv.5","�}�O�i���u���C�N Lv.3","�v���{�b�N Lv.10","�o�b�V�� Lv.10") != 3) {
		mes "[�R�m�W�F�[���Y]";
		mes "�Ⴄ�I������o���Ȃ����";
		mes "�i���Ƀ{�E�����O�o�b�V����";
		mes "�g���Ȃ����I";
		mes "�i�C�g�ɂȂ낤�Ƃ�������i�C�g��";
		mes "�X�L����m��Ȃ��Ăǂ�����I";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "������Ȃ���΁A�X���o��";
		mes "���̕ӂ̃i�C�g�����܂���";
		mes "�����Ă݂ȁB";
		mes "�i�C�g�ɂ��Ă����������";
		mes "���ׂĂ���悤�ɁB";
		close;
	}
	mes "[�R�m�W�F�[���Y]";
	mes "�i�C�g�͑����������Ƃ��ł���B";
	mes "�����đ��𗘗p�����X�L����";
	mes "�g�����Ƃ��ł���B���̒��̈�A";
	mes "�u�u�����f�B�b�V���X�s�A�v�̂��߂�";
	mes "�K�����K�v�łȂ����̂𓚂���B";
	next;
	if(select("�s�A�[�X Lv.5","�X�s�A�X�^�u Lv.3","�X�s�A�u�[������ Lv.3","���C�f�B���O Lv.1") != 3) {
		mes "[�R�m�W�F�[���Y]";
		mes "�Ⴄ�I������o���Ȃ����";
		mes "�i���Ƀu�����f�B�b�V���X�s�A��";
		mes "�g���Ȃ����I";
		mes "�i�C�g�ɂȂ낤�Ƃ�������i�C�g��";
		mes "�X�L����m��Ȃ��Ăǂ�����I";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "������Ȃ���΁A�X���o��";
		mes "���̕ӂ̃i�C�g�����܂���";
		mes "�����Ă݂ȁB";
		mes "�i�C�g�ɂ��Ă����������";
		mes "���ׂĂ���悤�ɁB";
		close;
	}
	mes "[�R�m�W�F�[���Y]";
	mes "���̒��ɂ��A���̕��퓯�l";
	mes "���������������̂����݂���B";
	mes "�ł͎��̒��ŁA�u�O�v�����ł���";
	mes "�i�C�g���A�Ƀ_���[�W��^������";
	mes "���͂ǂꂩ�B";
	next;
	if(select("�[�s�����X","�����X","�M�U����","�N���Z���g�T�C�_�[") != 1) {
		mes "[�R�m�W�F�[���Y]";
		mes "�Ⴄ�I����Ȃ��̂œ˂����Ƃ����";
		mes "��U�肷�邾�����I";
		mes "�i�C�g�ɂȂ낤�Ƃ�������i�C�g��";
		mes "����ɂ��Ēm��Ȃ��Ăǂ�����I";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "������Ȃ���΁A�X���o��";
		mes "���̕ӂ̃i�C�g�����܂���";
		mes "�����Ă݂ȁB";
		mes "�i�C�g�ɂ��Ă����������";
		mes "���ׂĂ���悤�ɁB";
		close;
	}
	mes "[�R�m�W�F�[���Y]";
	mes "�i�C�g�ɂȂ�΃y�R�y�R�ɏ����";
	mes "�ړ����邱�Ƃ��\�ɂȂ�B";
	mes "���̑���U�����x��������B";
	mes "�������A�R���C���X�L�����K������";
	mes "���Ƃɂ��U�����x���グ�邱�Ƃ�";
	mes "�ł���B";
	next;
	mes "[�R�m�W�F�[���Y]";
	mes "�ł́A�R���C���� Lv.3�܂�";
	mes "�K���������̍U�����x��";
	mes "�ǂ��Ȃ邩�H";
	next;
	if(select("�ʏ�� 70%","�ʏ�� 80%","�ʏ�� 90%","�ʏ�� 100%") != 2) {
		mes "[�R�m�W�F�[���Y]";
		mes "�Ⴄ�I�R���C���ɂ��Ēm��Ȃ��Ȃ�";
		mes "�y�R�y�R�ɂȂǏ��ȁI";
		mes "�i�C�g�ɂȂ낤�Ƃ�������i�C�g��";
		mes "����ɂ��Ēm��Ȃ��Ăǂ�����I";
		next;
		mes "[�R�m�W�F�[���Y]";
		mes "������Ȃ���΁A�X���o��";
		mes "���̕ӂ̃i�C�g�����܂���";
		mes "�����Ă݂ȁB";
		mes "�i�C�g�ɂ��Ă����������";
		mes "���ׂĂ���悤�ɁB";
		close;
	}
	mes "[�R�m�W�F�[���Y]";
	mes "�悵�A���̈ʓ�������Ȃ�";
	mes "�i�C�g�̒m���͂ЂƂ܂��ǂ����낤�B";
	mes "����ł̓i�C�g�ɂ��Ă̌l�I��";
	mes "������������Ă݂悤���B";
	next;
	mes "[�R�m�W�F�[���Y]";
	mes "�X�ŃA�h�o�C�X�����߂鏉�S�҂�";
	mes "�o��������ǂ�����ׂ����H";
	next;
	switch(select("�K���Ȏ����E�߂Ă�����","�U�����󂯂Ă����ď�����","�����ƃA�C�e���������Ղ肠����")) {
	case 1:
		mes "[�R�m�W�F�[���Y]";
		mes "�������B���S�҂������͎���";
		mes "���Ă����Ȃ���΂Ȃ�Ȃ��B";
		mes "�����̗͂Ő������Ă����̂�";
		mes "�K�����ꏊ�������Ă����邱�Ƃ�";
		mes "���ɑ�؂Ȃ��Ƃ��B";
		next;
		break;
	case 2:
		mes "[�R�m�W�F�[���Y]";
		mes "�����v���Ⴂ�����Ă���ˁB";
		mes "���ꂪ�{���ɂ��̐l�̂��߂�";
		mes "�Ȃ邾�낤���H";
		mes "���ʂڂꂪ�����B�o�����I";
		close;
	case 3:
		mes "[�R�m�W�F�[���Y]";
		mes "�ӂށB����͊�Ԃ�������Ȃ����A";
		mes "����͓ł�������悤�Ȃ��̂��B";
		mes "������ǂ��납�A��������߂ɂ���";
		mes "���܂��B�o�����I";
		close;
	}
	mes "[�R�m�W�F�[���Y]";
	mes "���Ⴀ�A�p�[�e�B���ł�";
	mes "�ǂ̂悤�ɓ����ׂ����H";
	next;
	switch(select("�擪�ɗ����ĊF�����","�����X�^�[���W�߂ĊF�E���ɂ�����","�퓬�Ɗ֌W�Ȃ��A�C�e�����E��")) {
	case 1:
		mes "[�R�m�W�F�[���Y]";
		mes "�܂��ɂ������I���B�R�m�̋��x��";
		mes "�̗͂ƍU���͂̓p�[�e�B����";
		mes "�{���ɏd�v�Ȗ���������B";
		mes "��ɂ��̍l���ł���悤�ɁB";
		next;
		break;
	case 2:
		mes "[�R�m�W�F�[���Y]";
		mes "�c���O�{�C���H";
		mes "����łǂꂾ������ɔ�Q���o�邩";
		mes "�킩�������̂���Ȃ����B";
		mes "�����A��I";
		close;
	case 3:
		mes "[�R�m�W�F�[���Y]";
		mes "�c";
		mes "���C�������Ȃ�A���Ă������B";
		close;
	}
	mes "[�R�m�W�F�[���Y]";
	mes "�Ō�ɁA�R�m�ɂƂ��Ĉ�ԑ厖��";
	mes "���̂Ƃ͉����H";
	next;
	switch(select("���_","���K","�n��")) {
	case 1:
		mes "[�R�m�W�F�[���Y]";
		mes "�����A�R�m�͖��_���I";
		mes "���_�̂��߂ɐ����A���_�̂��߂Ɏ��ʁB";
		mes "�����S�ɓ���Ă����˂΂Ȃ�Ȃ��B";
		next;
		break;
	case 2:
		mes "[�R�m�W�F�[���Y]";
		mes "�������������I�ǂ��ւł��s���I";
		mes "���B�̋R�m�c�ł́A���O�̂悤�ȓz��";
		mes "�󂯓���邱�Ƃ͂ł��Ȃ��B";
		close;
	case 3:
		mes "[�R�m�W�F�[���Y]";
		mes "�o���̂��߂ɐ키�悤�ȍ�����";
		mes "�Ȃ������z�́A���B�̋R�m�c��";
		mes "����邱�Ƃ͂ł��Ȃ��B";
		close;
	}
	mes "[�R�m�W�F�[���Y]";
	mes "�悵�A������̎����͏I��肾�B";
	next;
	mes "[�R�m�W�F�[���Y]";
	mes "�R�m�E�C���U�[�����O��҂��Ă���B";
	mes "�����Ȃ�����猾�t�ɋC������B";
	set CHANGE_KN,6;
	close;
}

//============================================================
// �O�������i�퓬�����j
//------------------------------------------------------------
prt_in.gat,79,94,4	script	�R�m�E�C���U�[	733,{
	mes "[�R�m�E�C���U�[]";
	mes "�c�c";
	next;
	if(Job == Job_Novice) {
		mes "[�R�m�E�C���U�[]";
		mes "�O�ŗV�тȂ����c";
		close;
	}
	if(Job == Job_Knight) {
		mes "[�R�m�E�C���U�[]";
		mes "�b��������ȁc";
		close;
	}
	if(Job != Job_Swordman) {
		mes "[�R�m�E�C���U�[]";
		mes "���̗p���c";
		close;
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[�R�m�E�C���U�[]";
		mes "�b���|����ȁc";
		close;
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		mes "[�R�m�E�C���U�[]";
		mes "���̗p���c";
		next;
		if(select("�i�C�g�]�E�������󂯂����ł�","���ł��Ȃ��ł�")==2) {
			mes "[�R�m�E�C���U�[]";
			mes "�c�c";
			close;
		}
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "���̔Ԃł͂Ȃ��c";
		close;
	case 6:
	case 7:
		mes "[�R�m�E�C���U�[]";
		mes (CHANGE_KN == 7)? "�c�܂����c���̗p���B": "���̗p���c";
		next;
		if(select("�i�C�g�]�E�������󂯂����ł�","���ł��Ȃ��ł�")==2) {
			mes "[�R�m�E�C���U�[]";
			mes "�c�c";
			close;
		}
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�c���ė��Ȃ����B";
		if(CHANGE_KN == 6)
			set CHANGE_KN,7;
		close2;
		warp "job_knt.gat",89,101;
		end;
	default:
		mes "[�R�m�E�C���U�[]";
		mes "�퓬���������̂��c";
		close;
	case 14:
		mes "[�R�m�E�C���U�[]";
		mes "�c���̂Ƃ���ցc";
		close;
	}
}

job_knt.gat,89,106,4	script	�R�m�E�C���U�[#Test	733,{
	mes "[�R�m�E�C���U�[]";
	mes "�c�c";
	next;
	mes "[�R�m�E�C���U�[]";
	mes "���₪����̂��c�H";
	next;
	switch(select("�ǂ�Ȏ����Ȃ�ł��傤�H","�����͂ǂ̂悤�ɐi�ނ�ł����H","��������o�����ł�","������")) {
	case 1:
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�����X�^�[�Ƃ̐퓬���c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�S�ē|���Ȃ����c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�R�i�K�S�ďI��点�Ȃ����c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�P�i�K�R���^����c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		close;
	case 2:
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�T�����ɓ���Ȃ����c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "����ł͂����Ɏn�߂�B";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "���̎҂��������Ȃ�҂B";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "��l�I������炷���ɓ���B";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		close;
	case 3:
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		next;
		mes "[�R�m�E�C���U�[]";
		mes "�c�������c�c";
		close2;
		warp "prt_in.gat",80,100;
		end;
	case 4:
		mes "[�R�m�E�C���U�[]";
		mes "�c�c";
		close;
	}
OnInit:
	waitingroom "�T��",20,"�R�m�E�C���U�[#Test::OnWarp",1;
	end;
OnWarp:
	disablewaitingroomevent;
	initnpctimer "KN_Timer";
	set getvariableofnpc('count,"KN_Test3"),12;
	monster "job_knt.gat",39,150,"--ja--",1114,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",39,142,"--ja--",1114,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",35,146,"--ja--",1100,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",47,150,"--ja--",1114,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",47,142,"--ja--",1114,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",43,137,"--ja--",1160,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",43,137,"--ja--",1095,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",43,137,"--ja--",1105,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",43,155,"--ja--",1160,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",43,155,"--ja--",1095,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",43,155,"--ja--",1105,1,"KN_Test3::OnKilled1";
	monster "job_knt.gat",52,146,"--ja--",1100,1,"KN_Test3::OnKilled1";
	warpwaitingpc "job_knt.gat",43,147,1;
	end;
}

job_knt.gat,0,0,0	script	KN_Test3	-1,{
	end;
OnKilled1:
	set 'count,'count-1;
	if('count)
		end;
	initnpctimer "KN_Timer";	//���b�Z�[�W�I��҂��^�C����3��
	mes "[�R�m�E�C���U�[]";
	mes "�c�c";
	next;
	mes "[�R�m�E�C���U�[]";
	mes "���̒i�K�ɐi�݂Ȃ����c";
	close2;
	initnpctimer "KN_Timer";	//�I�������̂Ń^�C�}�[������
	set 'count,12;
	monster "job_knt.gat",34,52,"--ja--",1119,1,"KN_Test3::OnKilled2";
	monster "job_knt.gat",29,52,"--ja--",1111,2,"KN_Test3::OnKilled2";
	monster "job_knt.gat",53,52,"--ja--",1119,1,"KN_Test3::OnKilled2";
	monster "job_knt.gat",58,52,"--ja--",1111,2,"KN_Test3::OnKilled2";
	monster "job_knt.gat",43,42,"--ja--",1106,1,"KN_Test3::OnKilled2";
	monster "job_knt.gat",43,62,"--ja--",1106,1,"KN_Test3::OnKilled2";
	monster "job_knt.gat",57,64,"--ja--",1030,1,"KN_Test3::OnKilled2";
	monster "job_knt.gat",57,39,"--ja--",1030,1,"KN_Test3::OnKilled2";
	monster "job_knt.gat",31,64,"--ja--",1030,1,"KN_Test3::OnKilled2";
	monster "job_knt.gat",31,39,"--ja--",1030,1,"KN_Test3::OnKilled2";
	warp "job_knt.gat",43,52;
	end;
OnKilled2:
	set 'count,'count-1;
	if('count)
		end;
	initnpctimer "KN_Timer";
	mes "[�R�m�E�C���U�[]";
	mes "�c�c";
	next;
	mes "[�R�m�E�C���U�[]";
	mes "���ƈ�i�K�c";
	close2;
	initnpctimer "KN_Timer";
	set 'count,7;
	monster "job_knt.gat",136,152,"--ja--",1122,1,"KN_Test3::OnKilled3";
	monster "job_knt.gat",150,152,"--ja--",1123,1,"KN_Test3::OnKilled3";
	monster "job_knt.gat",143,145,"--ja--",1124,1,"KN_Test3::OnKilled3";
	monster "job_knt.gat",136,158,"--ja--",1280,1,"KN_Test3::OnKilled3";
	monster "job_knt.gat",130,165,"--ja--",1125,1,"KN_Test3::OnKilled3";
	monster "job_knt.gat",156,165,"--ja--",1126,1,"KN_Test3::OnKilled3";
	monster "job_knt.gat",143,167,"--ja--",1258,1,"KN_Test3::OnKilled3";
	warp "job_knt.gat",143,152;
	end;
OnKilled3:
	set 'count,'count-1;
	if('count)
		end;
	initnpctimer "KN_Timer";
	mes "[�R�m�E�C���U�[]";
	mes "�c�c";
	next;
	mes "[�R�m�E�C���U�[]";
	mes "�����I���c";
	next;
	mes "[�R�m�E�C���U�[]";
	mes "�������o��";
	mes "�G�C�~�[=�x�A�g���X��";
	mes "��Ȃ����B";
	close2;
	stopnpctimer "KN_Timer";
	set CHANGE_KN,8;
	warp "prt_in.gat",80,100;
	killmonster "job_knt.gat","KN_Test3::OnKilled1";
	killmonster "job_knt.gat","KN_Test3::OnKilled2";
	killmonster "job_knt.gat","KN_Test3::OnKilled3";
	enablewaitingroomevent "�R�m�E�C���U�[#Test";
	end;
}

job_knt.gat,0,0,0	script	KN_Timer	-1,{	//����������ъe�i�K�N���A���next�҂��^�C�}�[
	end;
OnTimer180000:
	stopnpctimer;
	areawarp "job_knt.gat",22,126,65,165,"prt_in.gat",80,100;
	areawarp "job_knt.gat",22,32,65,71,"prt_in.gat",80,100;
	areawarp "job_knt.gat",122,132,165,171,"prt_in.gat",80,100;
	killmonster "job_knt.gat","KN_Test3::OnKilled1";
	killmonster "job_knt.gat","KN_Test3::OnKilled2";
	killmonster "job_knt.gat","KN_Test3::OnKilled3";
	enablewaitingroomevent "�R�m�E�C���U�[#Test";
	end;
}

//============================================================
// �l�������i���i�����j
//------------------------------------------------------------
prt_in.gat,69,107,6	script	�R�m�G�C�~�[	728,{
	if(Job == Job_Novice) {
		mes "[�R�m�G�C�~�[]";
		mes "����A���킢���m�[�r�X����B";
		mes "�Ƃ��Ă����킢����`�B";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�˂��A��Ńi�C�g�ɂȂ�Ȃ��H";
		mes "�i�C�g�ɂȂ����炫����";
		mes "�������悭�Ȃ��I";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�������A�o���Ă�������c";
		mes "���������i�C�g�ɂȂ��ĂˁI";
		mes "�񑩂�I";
		close;
	}
	if(Job == Job_Knight) {
		mes "[�R�m�G�C�~�[]";
		mes "����H����K�˂Ă���Ȃ��";
		mes "���̗p������H";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�R�m�����ɖ�肪����킯����";
		mes "�������ˁH";
		mes "�G�C�~�[�͋R�m�l�����܂������";
		mes "���邱�Ƃ�M���Ă��܂��B";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "����ł́I";
		mes "�䂪�v�����e���R�m�c���l�I";
		close;
	}
	if(Job != Job_Swordman) {
		mes "[�R�m�G�C�~�[]";
		mes "�v�����e���R�m�c�ւ悤�����I";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�����͋R�m�΂��肾����";
		mes "������肵�Ă����Ȃ����`�B";
		close;
	}
	if(CHANGE_KN == 0) {
		mes "[�R�m�G�C�~�[]";
		mes "����A���m����B";
		mes "�i�C�g�ɓ]�E���ɂ����́H";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�i�C�g�ւ̓]�E�́A�܂���������";
		mes "����������R�m�c���l�̂��b��";
		mes "�����Ă݂ĂˁB";
		close;
	}
	mes "[�R�m�G�C�~�[]";
	mes "����H�G�C�~�[�ɉ��̗p������H";
	next;
	if(CHANGE_KN < 10) {
		if(select("�i�C�g�]�E�������󂯂����ł�","�Ȃ�ł��Ȃ��ł�")==2) {
			mes "[�R�m�G�C�~�[]";
			mes "�G�C�~�[�܂�Ȃ���c";
			close;
		}
	}
	switch(CHANGE_KN) {
	default:
		mes "[�R�m�G�C�~�[]";
		mes "����I�]�E�\�����݂͍ς܂����̂ˁI";
		mes "���ꂶ��A�������̑O�ɑ��̋R�m�l��";
		mes "�������󂯂Ă��Ă��傤�����I";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "���߂��猩�Ă�����������";
		mes "���ꂶ��[���߁I";
		close;
	case 8:
		mes "[�R�m�G�C�~�[]";
		mes "�ق�A�����Ƃ������ɗ��Ȃ����I";
		mes "���x�̓G�C�~�[�̎�����B�ӂӁB";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�������̖��O��";
		mes "�G�C�~�[=�x�A�g���X�B";
		mes "�v�����e���R�m�c�̍g��_�ł��B";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�G�C�~�[�̎����ł́A";
		mes "�i�C�g�ɂȂ�̂ɏ\����";
		mes "��߂����Ȃ���Ă��邩��";
		mes "���܂��B";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "���������������Ƃ𕷂��Ȃ���";
		mes "���܂Ɏ���ɓ����Ă����΁A";
		mes "���̂Ǖ]�����Ă����܂��B";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�Ȃ̂ŁA�悭�����āA�i�C�g�Ƃ���";
		mes "�������Ǝv���l���������Ă�����";
		mes "�����́B�킩������ˁH";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "���ꂶ��A�͂��߂܂��B";
		break;
	case 9:
		mes "[�R�m�G�C�~�[]";
		mes "����A���x�͗�V�ɂ���";
		mes "�׋����Ă����̂��ȁH";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "���x����������A�G�C�~�[��";
		mes "�{�����Ⴄ���I";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�����āA�R�m�c���l�ɐ\���グ�āA";
		mes "�i�C�g�ɂ����Ȃ��悤��";
		mes "�����Ⴄ�񂾂���B";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�Ȃ̂ł悭�����āA�i�C�g�Ƃ���";
		mes "�������������o����ł���I";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "����ł́A�����Ă݂܂��傤�I";
		break;
	case 10:
		mes "[�R�m�G�C�~�[]";
		mes "�G�h�����h�l�̂Ƃ���֍s���āB";
		mes "�G�C�~�[�̎����͂����I������́B";
		close;
	case 11:
	case 12:
	case 13:
		mes "[�R�m�G�C�~�[]";
		mes "�܂��A���̋R�m�l�̎�����";
		mes "�c���Ă�����I";
		mes "�ق�ق瑁���s���āI";
		close;
	case 14:
		mes "[�R�m�G�C�~�[]";
		mes "���A�����F�Ō��ʂ��o�����ԁI";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�R�m�c���l�̂��b�𕷂��āB";
		mes "���܂�ْ����Ȃ��łˁB";
		close;
	}
	//���i������������
	next;
	mes "[�R�m�G�C�~�[]";
	mes "���Ȃ��̓i�C�g�B�����N�̒ʂ��";
	mes "�p�[�e�B�[�����߂Ă��܂��B";
	mes "�ǂ̂悤�ɕ�W����Ηǂ��ł��傤���H";
	next;
	if(select("�p�[�e�B�[���W���Ă���Ƌ���","�`���b�g���[��������đ҂�","�i�C�g�����߂�l�X��T��") != 1)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "���x���̋߂��l�X�ƃp�[�e�B�[��";
	mes "���т܂����B�v���[�X�g�E�E�B�U�[�h";
	mes "�n���^�[�E�A�T�V���E�u���b�N�X�~�X";
	mes "�Ƃł��B";
	next;
	mes "[�R�m�G�C�~�[]";
	mes "���̂܂܂U�l�Ńs���~�b�h�ɍs�����Ƃ�";
	mes "�Ȃ�܂����B";
	next;
	mes "[�R�m�G�C�~�[]";
	mes "�S�K�ɒ����܂����B";
	mes "���āA�ǂ�ȍs�������܂����H";
	next;
	if(select("���͂����񂵂ė�Âɔ��f����","�p�[�e�B�[�̂��߂Ƀ����X�^�[���W�߂�","�擪���������i��") != 2)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "�����ցA����l�������X�^�[�𑽂�";
	mes "�����A��A�ˑR�����܂����B";
	mes "���̎����Ȃ��́H";
	next;
	if(select("�p�[�e�B�[������čU�����󂯂�","�P�ނ��Ȃ���키","�y�R�y�R�őf����������") != 3)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "�K���ɂ��p�[�e�B�[�̊F�͖�����";
	mes "��@����E���܂����B";
	mes "���āA�����ƕ����Ă�����";
	mes "�p�[�e�B�[�����o�[�ł͂Ȃ��l��";
	mes "�|��Ă��܂��B";
	next;
	mes "[�R�m�G�C�~�[]";
	mes "���̐l�́A�蓖�Ă����Ăق�����";
	mes "���J�ɂ��肢���Ă��܂����B";
	next;
	if(select("�p�[�e�B�[�̃v���[�X�g�ɒm�点��","���������ꂽ��蓖�Ă���ƌ���","�������Ēʂ�߂���")==1)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "���낻�둼�̏ꏊ�ɍs���p�����邽��";
	mes "�p�[�e�B�[�����o�[�����Ƃ��ʂ��";
	mes "���Ȃ���΂Ȃ�Ȃ��B";
	next;
	mes "[�R�m�G�C�~�[]";
	mes "���̎��A�퓬���Ɋl������";
	mes "�험�i�̕��z�͂ǂ����܂����H";
	next;
	if(select("���J�̑����l�ɓn��","�����Ղ�����Ď����Ŏ����A��","�F�Řb�������Č��߂�")==3)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "�p�[�e�B�[�����o�[�ƕʂꂽ��A";
	mes "�M�d�ȃA�C�e���𔄂邽�߂�";
	mes "�v�����e���ɗ����B";
	mes "�L��ł͂�������̐l�X���I�X��";
	mes "�J������E����`���b�g�𗧂Ă�";
	mes "���܂��B";
	next;
	mes "[�R�m�G�C�~�[]";
	mes "�����ǂ̂悤�ɃA�C�e���� ";
	mes "����ɏo���܂��傤���H";
	next;
	if(select("�l�X�ɌĂт����ĕ���","�`���b�g���[�����J���đ҂�","�A�C�e�������߂Ă���l��T��") != 1)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "�����������Ă�����A";
	mes "���������l�ɉ�����B";
	mes "�ǂ�������ǂ��ł��傤���B";
	next;
	if(select("���̂����ƃA�C�e���𕪂���","�������ċ���","���̐l�ɓK��������������")==3)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "���x�͈�l�Ŗ��{�̐X�ɍs����";
	mes "�݂邱�Ƃɂ��܂����B";
	mes "�y�R�y�R�ɏ���ĕ@�̂܂����";
	mes "�i��ł��܂��B";
	next;
	mes "[�R�m�G�C�~�[]";
	mes "�����ŁA���ɖ����Ă��܂����l��";
	mes "�o���킵�܂����B�ǂ����܂����H";
	next;
	if(select("�A�蓹�������Ă�����","�o���܂ňē�����","���̉H���������") != 3)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "�X�̒��ő����̃����X�^�[�Ɉ͂܂�A";
	mes "�񕜖򂪐s���Ă��܂��܂����B";
	mes "�̗͂͐ԐF�ɕ\������āA";
	mes "��Ȃ��󋵂ł��B";
	next;
	mes "[�R�m�G�C�~�[]";
	mes "���A���傤�ǃv���[�X�g���ʂ肩����";
	mes "�܂����B�ǂ̂悤�ɗ��݂܂����H";
	next;
	if(select("��낵��������q�[����������������","�q�[����������","�q�[��") != 3)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "���������Ԕ��܂����B";
	mes "�X�ɖ߂鎞�Ԃł��B";
	next;
	mes "[�R�m�G�C�~�[]";
	mes "�A��r���A���ɍ����ȃA�C�e����";
	mes "�����Ă���̂𔭌����܂����B";
	next;
	if(select("�E���Ď����������A��","�N�̕����{���Ă݂�","�����ʂ�߂���")==2)
		set '@point,'@point+10;
	mes "[�R�m�G�C�~�[]";
	mes "�͂��A����ł������̎����͏I���I";
	next;
	if(CHANGE_KN == 8 && '@point < 90) {
		set CHANGE_KN,10;
		mes "[�R�m�G�C�~�[]";
		mes "���[��c�l���Ă݂����ǂ��߂ˁB";
		mes "�{���ɂ���Ȃӂ��ɍs�����Ă�����";
		mes "�����̋R�m�l�݂͂�Ȗ���Ȑl��";
		mes "�������ƂɂȂ��B";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "������������ɂǂ���������";
		mes "������x�l���Ă���A";
		mes "�܂��������󂯂ɂ��Ă��������ˁB";
		close;
	}
	if(CHANGE_KN == 9 && '@point < 80) {
		mes "[�R�m�G�C�~�[]";
		mes "���[��c����ς肾�߁I";
		mes "���Ȃ����i�C�g�ɂ��Ă��܂�����";
		mes "�����̋R�m�c�������������c";
		next;
		mes "[�R�m�G�C�~�[]";
		mes "�A���āA�ǂ��ŊԈ�����s����";
		mes "�����̂��������l���Ă݂Ȃ����B";
		mes "����������A�܂��������󂯂�����";
		mes "������B������ˁH";
		close;
	}
	mes "[�R�m�G�C�~�[]";
	mes "�������I���ꂾ���̐S���������";
	mes "�R�m�Ƃ��ď\���ł��I";
	mes "���̎����́c�G�h�����h�l�̂Ƃ���";
	mes "�ł��ˁB";
	next;
	mes "[�R�m�G�C�~�[]";
	mes "�R�m�l�̘b���悭�����āA";
	mes "�c�����������撣���Ă��������ˁI";
	set CHANGE_KN,10;
	close;
}

//============================================================
// �܎������i�E�ϗ͎����j
//------------------------------------------------------------
prt_in.gat,70,99,6	script	�R�m�G�h�����h	734,{
	if(Job == Job_Novice) {
		mes "[�R�m�G�h�����h]";
		mes "���[���؂͕��ɕ����Ȃ��c";
		next;
		mes "[�R�m�G�h�����h]";
		mes "��b����ł��z���グ��ꂽ�͂�";
		mes "�����P���������ʂ������炷�B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "�N�̖����͍����猈�܂�ƌ�����c";
		close;
	}
	if(Job == Job_Knight) {
		mes "[�R�m�G�h�����h]";
		mes "�S�𗬂�鐅�̔@���c";
		next;
		mes "[�R�m�G�h�����h]";
		mes "����鐅�͊�������߂Ȃ���";
		mes "�����̓���i�ށB";
		next;
		mes "[�R�m�G�h�����h]";
		mes "�R�m�͂ǂ�ȏ󋵂ł����̂悤��";
		mes "�Â��ɗ���Ȃ���΂Ȃ�Ȃ��B";
		close;
	}
	if(Job != Job_Swordman) {
		mes "[�R�m�G�h�����h]";
		mes "���̑S�Ă̕��́c�F���a����";
		mes "���藧���Ă���B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "���̗��ɋt��킸�ɕ�炷���Ƃ��B";
		close;
	}
	if(CHANGE_KN == 0) {
		mes "[�R�m�G�h�����h]";
		mes "�Â��l�������҂�";
		mes "�Â����΂��茩�邾�낤�c";
		next;
		mes "[�R�m�G�h�����h]";
		mes "�Â��������������";
		mes "�����猩�Ȃ��Ȃ邾�낤�c";
		close;
	}
	if(CHANGE_KN <= 12) {
		mes "[�R�m�G�h�����h]";
		mes "�p���H���m��c";
		next;
		if(select("�i�C�g�]�E�������󂯂����ł�","�Ȃ�ł��Ȃ��ł�")==2) {
			mes "[�R�m�G�h�����h]";
			mes "�N�̊肢�́A��O�ɊJ���邾�낤�B";
			close;
		}
	}
	switch(CHANGE_KN) {
	default:	//1�`9�̂Ƃ�
		mes "[�R�m�G�h�����h]";
		mes "�Ԃ́c��肪�炿�A�s���L�сA";
		mes "�t�������A�����o���č炭�B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "�����Ȃ��΁A����͕s���S��";
		mes "�ԂƂȂ邾�낤�c";
		next;
		mes "[�R�m�G�h�����h]";
		mes "��ɌN��҂l������B";
		mes "�N�̓����������邾�낤�B";
		close;
	case 10:
		mes "[�R�m�G�h�����h]";
		mes "���̎������󂯂�Ԃ��c";
		mes "����܂ł̎����̂悤��";
		mes "�����Ȕ��f������Ηǂ��B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "���̖��O�̓G�h�����h=�O���X�g";
		mes "�v�����e���R�m�c�ɑ�����҂��B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "�R�m�͑��̐l�X�̖͔͂ƂȂ�悤��";
		mes "�l�ԂłȂ���΂Ȃ�Ȃ��B";
		mes "���������Čh�i������Ɏ����A";
		mes "���E�̒��������̂�";
		mes "�ӂ��킵���l�ԂłȂ���΂Ȃ�Ȃ��B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "�D������ɔ��f���A�y���ȍs����";
		mes "���悤�ł͂����Ȃ��B";
		mes "���ɂ͐��̂悤�ɏ_��ȐS���K�v�ŁA";
		mes "���ɂ͊�̂悤�Ɍł����S���K�v���B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "���̗��R�������Ƀ����X�^�[��";
		mes "�E���Ă͂Ȃ�Ȃ����A�E�C���y����";
		mes "�Ȃǂ͂����Ă̂ق����B";
		mes "�ґz�����A�S�𐮂��Ȃ����B";
		next;
		mes "[�R�m�G�h�����h]";
		mes "����ł͎������n�߂�B";
		mes "�h�i�Ȃ�S�������ėՂ݂Ȃ����B";
		set CHANGE_KN,11;
		break;
	case 11:
		mes "[�R�m�G�h�����h]";
		mes "�O��͌y���ȓ����������ȁB";
		mes "�R�m�͎カ�҂����E�Ƃ��c";
		mes "�カ�҂��s����E�Ƃł͂Ȃ��c";
		next;
		mes "[�R�m�G�h�����h]";
		mes "���̖������������a�𐬂�����";
		mes "�l�Ԃ������j��𑱂�����ǂ��Ȃ邩�c";
		mes "����͎��������Ɍ��������Ƃł͂Ȃ�";
		mes "���ۂ̐��E�ł̘b�Ȃ̂��c";
		next;
		mes "[�R�m�G�h�����h]";
		mes "����ł͂�����x���B";
		mes "�Â��ɑ҂S�����Ɍ����Ă���B";
		break;
	case 12:
	case 13:
		mes "[�R�m�G�h�����h]";
		mes "�N�̐S�͌����Ă�������B";
		mes "�R�m�O���[�̏��֍s���A";
		mes "�Ō�̎������󂯂邪�����c";
		close;
	case 14:
		mes "[�R�m�G�h�����h]";
		mes "�R�m�c���̘b�𕷂��Ȃ����c";
		mes "�F�̈ӌ������̎������邾�낤�c";
		close;
	}
	//�E�ϗ͎�����������
	close2;
	addtimer 270000,"KN_Test5::OnClear";		//270sec�����c��΃N���A
	killmonster "job_knt.gat","KN_Test5::OnKilled";
	monster "job_knt.gat",167,57,"--ja--",1182,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",167,54,"--ja--",1182,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",120,57,"--ja--",1182,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",120,54,"--ja--",1182,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",141,57,"--ja--",1002,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",145,57,"--ja--",1002,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",143,55,"--ja--",1002,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",143,59,"--ja--",1002,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",141,55,"--ja--",1063,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",141,59,"--ja--",1063,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",145,55,"--ja--",1063,1,"KN_Test5::OnKilled";
	monster "job_knt.gat",145,59,"--ja--",1063,1,"KN_Test5::OnKilled";
	//stack�Ƃ݂Ȃ���ʏ��ɕ����݂����Ȃ̂ŃR�����g�A�E�g
	//	monster "job_knt.gat",139,57,"--ja--",1011,1,"KN_Test5::OnKilled";
	//	monster "job_knt.gat",147,57,"--ja--",1011,1,"KN_Test5::OnKilled";
	//	monster "job_knt.gat",143,53,"--ja--",1011,1,"KN_Test5::OnKilled";
	//	monster "job_knt.gat",143,61,"--ja--",1011,1,"KN_Test5::OnKilled";
	warp "job_knt.gat",143,57;
	end;
}

//����MAP�ɋ���NPC����C�x���g�𔭓�����K�v����
job_knt.gat,0,0,0	script	KN_Test5	-1,{
	end;
OnKilled:	//�G��|���Ă��܂������蒼��
	deltimer "KN_Test5::OnClear";
	warp "prt_fild05.gat",353,251;
	end;
OnClear:
	set CHANGE_KN,13;
	warp "prt_in.gat",80,100;
	end;
}

//============================================================
// �ŏI���� �y�� �N���C���A�쐬
//------------------------------------------------------------
prt_in.gat,87,92,4	script	�R�m�O���[	119,{
	if(Job == Job_Novice) {
		mes "[�R�m�O���[]";
		mes "���������Ă��A���ɂ�����";
		mes "�m�[�r�X���オ�������񂾁B";
		next;
		mes "[�R�m�O���[]";
		mes "���ʂɋR�m�ɂȂ낤�Ƃ͎v��Ȃ�������";
		mes "�����Ȃ肽���Ƃ����Ǝv���Ă����B";
		next;
		mes "[�R�m�O���[]";
		mes "����������A���̊Ԃɂ�";
		mes "�R�m�ɂȂ��Ă��Ƃ������Ƃ��B�͂͂́B";
		close;
	}
	if(Job == Job_Knight) {	//�N���C���A�̔�
		mes "[�R�m�O���[]";
		mes "���Ƃ��`�e���������������F�̐n�c";
		mes "�R�m�����ׂ�����ƌ����΂��ꂾ�I";
		mes "�����A ^3355FF�u�N���C���A�v^000000 !!";
		mes "�R�m�Ȃ��{�͎����Ă��Ȃ���΂ȁB";
		next;
		switch (select("^3355FF�u�N���C���A�v^000000 �ɂ���","�N���C���A���w������","��b����߂�")) {
		case 1:
			mes "[�R�m�O���[]";
			mes "���[���~�b�h�K�b�c�����̃v�����e����";
			mes "��ɓ���邱�Ƃ��ł���l�X�Ȗ�����";
			mes "���ł���ۗD��Ă���ƌ����錕";
			mes "�N���C���A!!";
			mes "�R�m�Ƃ̑����͂܂��ɔ��Q���B";
			next;
			mes "[�R�m�O���[]";
			mes "���̕]���̃N���C���A��";
			mes "�䂪�R�m�c�ł͋R�m�B�����̂��߂�";
			mes "^3355FF74000^000000Zeny�Ő��삵�Ă���B";
			next;
			mes "[�R�m�O���[]";
			mes "�������A�N���C���A�̓����ł���";
			mes "���̊��ŉs���Ȑn�𑢂邽�߂�";
			mes "�M�d�� ^3355FF�u�|�S�v^000000 ����K�v���B";
			mes "�����ƍ|�S�������ė����炷����";
			mes "�����Ă��B�R�m�c�̖��_�ɂ����ĂȁB";
			close;
		case 2:
			if(countitem(999) < 1 || Zeny < 74000) {
				mes "[�R�m�O���[]";
				mes "���O���N���C���A��~������C������";
				mes "�킩�������A�p�ӂ�����Ȃ����";
				mes "�����Ă�邱�Ƃ͂ł��Ȃ��ȁB";
				mes "^3355FF74000Zeny�I�|�S��I^000000";
				next;
				mes "[�R�m�O���[]";
				mes "�p�ӂ��ł�����܂����Ȃ����B";
				mes "���ł��҂��Ă��邩��B";
				close;
			}
			if(checkweight(1163,1)==0) {
				mes "[�R�m�O���[]";
				mes "�ו�����t�̂悤��";
				close;
			}
			mes "[�R�m�O���[]";
			mes "�����I�p�ӂ��Ă������B";
			mes "�N���C���A�̉��l���킩��z�߁B";
			mes "�悤���c����������Ă�邼�I";
			next;
			mes "[�R�m�O���[]";
			mes "�N���C���A�̓��g��M����";
			mes "�|�S��n�����č����āc";
			next;
			mes "^3355FF- �J�L���J�L���J�L�� -^000000";
			next;
			mes "[�R�m�O���[]";
			mes "�ق�A�R�m�c���ւ�N���C���A���I";
			mes "���ꂩ��̗��ŗ����������_��";
			mes "�Ȃ邾�낤�I";
			delitem 999,1;
			set Zeny,Zeny-74000;
			getitem 1163,1;
			close;
		case 3:
			mes "[�R�m�O���[]";
			mes "���h�ȋR�m�Ȃ�N���C���A�Ȃ�";
			mes "�葫�̔@���g�����Ȃ��Ȃ���΂ˁB";
			mes "�����܂����Ă���邱�Ƃ�";
			mes "���҂��Ă����B";
			close;
		}
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[�R�m�O���[]";
		mes "��҂�A���Ԃ͑�؂ɂ����B";
		next;
		mes "[�R�m�O���[]";
		mes "���Ԃ��o���Ă���A�����̂��Ă���";
		mes "���Ƃ��������悤�ɂȂ��Ă�";
		mes "�x������ȁB";
		close;
	default:
		mes "[�R�m�O���[]";
		mes "�Ⴂ���m��A�����p���ȁH";
		break;
	case 13:
		mes "[�R�m�O���[]";
		mes "���A���O���B���̗p���H";
		break;
	case 14:
		mes "[�R�m�O���[]";
		mes "�R�m�c���̘b�𕷂��Ă݂�B";
		next;
		mes "[�R�m�O���[]";
		mes "�A�����悭�l���Ă���邩��B";
		mes "�����s���Ȃ����B";
		close;
	}
	next;
	if(select("�i�C�g�]�E�������󂯂����ł�","�Ȃ�ł��Ȃ��ł�")==2) {
		mes "[�R�m�O���[]";
		mes "�̂�厖�ɂ��Ȃ����B";
		mes "���N����ꂾ�B";
		close;
	}
	switch(CHANGE_KN) {
	default:
		mes "[�R�m�O���[]";
		mes "�͂́A�����ɂ͉���肸���ƎႢ";
		mes "�R�m������񂾂�B�������";
		mes "�܂��͂Ȃ������Ă��痈�Ȃ����B";
		next;
		mes "[�R�m�O���[]";
		mes "�A���̘b���ς񂾂�";
		mes "�����ʓ|�����Ă��B";
		close;
	case 12:
		mes "[�R�m�O���[]";
		mes "�ق��A�������B���̘A���̎�����";
		mes "���ׂĎ󂯂Ă����񂾂ȁB";
		next;
		mes "[�R�m�O���[]";
		mes "����ł͉��̎������n�߂邩�B";
		mes "�܁A�����ƌ������ł��Ȃ��񂾂��B";
		next;
		mes "[�R�m�O���[]";
		mes "�C�y�ɘb�����悤���B";
		break;
	case 13:
		mes "[�R�m�O���[]";
		mes "�������c�F�X�ƍl���Ă����悤���ȁB";
		next;
		mes "[�R�m�O���[]";
		mes "����ł́A�܂��b�𕷂��Ă݂悤���B";
		break;
	}
	next;
	mes "[�R�m�O���[]";
	mes "�܂��c���O�͂Ȃ��i�C�g�ɂȂ낤��";
	mes "���S�����񂾁H";
	next;
	switch(select("�����Ƌ����Ȃ邽�߂�","�M���h�̖��ɗ��Ƃ���","���݂ɖ����ł��Ȃ���")) {
	case 1:
		mes "[�R�m�O���[]";
		mes "�����Ƌ����Ȃ邽�߂��Ɓc�H";
		mes "�m���Ƀi�C�g�͋����B";
		next;
		mes "[�R�m�O���[]";
		mes "�������A���̋����Ƃ͉����낤���B";
		mes "�l�ɗ͂��֎����邽�߂̂��̂Ȃ̂��A";
		mes "�܂��͗L���ɂȂ邽�߂̂��̂Ȃ̂��A";
		mes "���̑��̂��̂��c";
		next;
		mes "[�R�m�O���[]";
		mes "�R�m�Ƃ��Ắu�́v�Ƃ͉����낤���H";
		next;
		switch(select("���M�Ɩ����𓾂邽�߂̂���","��������邱�Ƃ��ł������","���̐l�X����邽�߂̂���")) {
		case 1:
			set '@bad,'@bad+10;
			mes "[�R�m�O���[]";
			mes "�������A��������ɓ��ꂽ��";
			mes "�L���ɂȂ邱�Ƃ͗ǂ����Ƃ��B";
			mes "�������A�����ł͂Ȃ����l�𓾂�";
			mes "���߂ɂ����̋R�m�B�͐����Ă���B";
			break;
		case 2:
			mes "[�R�m�O���[]";
			mes "�ǂ��������B����������z��";
			mes "�l����邱�Ƃ��ł���B";
			mes "���̂��߂ɕ��i����C����";
			mes "�ӂ��Ă͂Ȃ�Ȃ��B";
			break;
		case 3:
			mes "[�R�m�O���[]";
			mes "���h�ȍl�����B�R�m�̗͂Ƃ�";
			mes "�カ�҂�����Ă������̐^����";
			mes "���������B���܂ɂ��̐��_���̂�";
			mes "�R�m�̖��ɓD��h��y�����邪�c";
			break;
		}
		break;
	case 2:
		mes "[�R�m�O���[]";
		mes "�M���h�c�܂��̓p�[�e�B�[��";
		mes "���Ɋ���������c";
		mes "���B�̍����ł���g���X�^���O����";
		mes "���̂悤�ɂ�����������B";
		next;
		mes "[�R�m�O���[]";
		mes "���a�ȓ���̗��ɂ́A��ɋ��Ђ�";
		mes "���݂��Ă���B�ł��邩��A";
		mes "���炩���ߑS�Ă̊�@�ɑ΂���";
		mes "�������Ă����Ȃ���΂Ȃ�Ȃ��c�ƁB";
		next;
		mes "[�R�m�O���[]";
		mes "����ł́A���O������͂�";
		mes "�ǂ̂悤�ɃM���h�̖��ɗ��H";
		next;
		switch(select("�M���h�����̗͂�K�v�Ƃ��Ă��܂�","�M���h�̎����m�ۂɖ𗧂��܂�","�M���h���B����邱�Ƃ��ł��܂�")) {
		case 1:
			mes "[�R�m�O���[]";
			mes "���E�̂ǂ��ł��낤�ƁA";
			mes "�������]�ޏꏊ�ɍ݂肽�����̂��B";
			mes "�������A������K�v�Ƃ���҂�";
			mes "���邩����A����ł͂Ȃ�Ȃ��B";
			mes "�M���h�ɂ����炸�ȁc�B";
			break;
		case 2:
			set '@bad,'@bad+10;
			mes "[�R�m�O���[]";
			mes "�������A��������ɓ��ꂽ��";
			mes "�L���ɂȂ邱�Ƃ͗ǂ����Ƃ��B";
			mes "�������A�����ł͂Ȃ����l�𓾂�";
			mes "���߂ɂ����̋R�m�B�͐����Ă���B";
			break;
		case 3:
			mes "[�R�m�O���[]";
			mes "���h�ȍl�����B�R�m�̗͂Ƃ�";
			mes "�カ�҂�����Ă������̐^����";
			mes "���������B���܂ɂ��̐��_���̂�";
			mes "�R�m�̖��ɓD��h��y�����邪�c";
			break;
		}
		break;
	case 3:
		set '@bad,'@bad+5;
		mes "[�R�m�O���[]";
		mes "�ӂށc";
		mes "���O�͂������h�Ȍ��m����";
		mes "����ł��R�m��ڎw���̂͂Ȃ����H";
		next;
		mes "[�R�m�O���[]";
		mes "���m�Ȃ炢�����炸�A�R�m��";
		mes "��������͐�΂ɋ�����Ȃ��B";
		mes "���܂ɁA�͂�~���邠�܂�}����";
		mes "�����Ȃ��Ȃ��Ă��܂���҂�����B";
		next;
		mes "[�R�m�O���[]";
		mes "����ł́A���̉��ɖ��������Ȃ��̂��H";
		next;
		switch(select("�Z�p�ł�","�ڕW�ł�","�i�D�ł�")) {
		case 1:
			set '@bad,'@bad+5;
			mes "[�R�m�O���[]";
			mes "�Z�p�̓i�C�g�ɂȂ�Ύ�����";
			mes "�t���Ă���B";
			mes "�����炻�ꎩ�̂ɍ������l��";
			mes "�������낤�B�����ƃi�C�g�ɂȂ��Ă�";
			mes "�����ł��Ȃ��Ȃ�B";
			break;
		case 2:
			set '@bad,'@bad-5;
			mes "[�R�m�O���[]";
			mes "�������c�₦���V�����ڕW��";
			mes "�������Ƃ͑厖���B";
			mes "���̓i�C�g�ɂȂ邱�Ƃœ�����t";
			mes "���낤���A�i�C�g�ɂȂ������";
			mes "�܂��V�����ڕW���ł��邾�낤�B";
			break;
		case 3:
			set '@bad,'@bad+5;
			mes "[�R�m�O���[]";
			mes "����ȁA�����ڂ����̉��l�Ȃ�";
			mes "�債�����Ƃł͂Ȃ��B";
			mes "�i�C�g��苭�����m�����邵�A";
			mes "�܂�w�͂������Ƃ������Ƃ��B";
			break;
		}
		break;
	}
	next;
	mes "[�R�m�O���[]";
	mes "�ӂށA���O�͂悭�l���Ă���ˁB";
	mes "���ɂ͉����l�����Ƀi�C�g��";
	mes "�Ȃ낤�Ƃ���z������񂾂�c";
	next;
	mes "[�R�m�O���[]";
	mes "����Ȏ�ҒB�������N�����A";
	mes "�R�m�c�̖��_��������B";
	next;
	mes "[�R�m�O���[]";
	mes "����͂��O�ɂ������邱�Ƃ����A";
	mes "��x�i�C�g�ɂȂ������x�ƌ��m��";
	mes "�߂邱�Ƃ��ł��Ȃ��B";
	mes "�i�C�g�Ƃ��Ă̎��o�ƐӔC��";
	mes "��΂ɖY��Ă͂Ȃ�Ȃ��̂��B";
	next;
	mes "[�R�m�O���[]";
	mes "�����A�������i�C�g�ɂȂꂽ��";
	mes "��������H";
	next;
	switch(select("�����ɐ킢�ɏo�܂�","����҂l�X�̌���","�R�m�ɂ��Ă����Ɗw�т܂�")) {
	case 1:
		mes "[�R�m�O���[]";
		mes "�ӂށA�����āH";
		next;
		switch(select("������������ł��傤","�i�C�g�ɂȂ��������̋Z����������","���m�ł͍s����Ȃ��ꏊ�֍s��")) {
		case 1:
			set '@bad,'@bad+10;
			mes "[�R�m�O���[]";
			mes "���܂�}�����̂ł͂Ȃ��B";
			mes "���O���g���}�ɐ�������Ƃ�";
			mes "������Ȃ����낤�B";
			mes "��b���ł��ł߂�̂��ǂ��B";
			break;
		case 2:
			mes "[�R�m�O���[]";
			mes "�����������̂͗ǂ����Ƃ��B";
			mes "�g�ɂ����Z�ɂ��Ċ�Ԃ̂�";
			mes "�������A�R�m�̐S�\���͖Y���Ȃ�B";
			break;
		case 3:
			mes "[�R�m�O���[]";
			mes "�i�C�g�ɂȂ��Ă��A�����̖{����";
			mes "�ς��킯�ł͂Ȃ��B";
			mes "���܂薳�����đ̂����g����Ȃ�B";
			break;
		}
		break;
	case 2:
		mes "[�R�m�O���[]";
		mes "�N���҂��Ă���񂾁H";
		next;
		switch(select("�F�l�ł�","�M���h���B�ł�","���l�ł�")) {
		case 1:
			mes "[�R�m�O���[]";
			mes "���ށA�F�����O���i�C�g�ɂȂ���";
			mes "���Ƃ������̂��Ƃ̂悤�Ɋ���";
			mes "����邾�낤�B";
			mes "�F��厖�ɂ��邻�̐S";
			mes "�Y��Ȃ��悤�ɂ��Ȃ����B";
			break;
		case 2:
			mes "[�R�m�O���[]";
			mes "���������ɂ��钇�ԒB���B";
			mes "���Ԃ��؂ɂ��āA�ނ�������";
			mes "�����Ȃ����B";
			break;
		case 3:
			mes "[�R�m�O���[]";
			mes "�t���ˁI������l�̂��߂�";
			mes "�i�C�g�ɂȂ�Ƃ́B";
			mes "���O�̑S�Ă��Ȃ���";
			mes (Sex? "�ޏ�": "�ގ�")+ "������Ă����Ȃ����B";
			break;
		}
		break;
	case 3:
		mes "[�R�m�O���[]";
		mes "�ǂ��p�����B�����w�ԁH";
		next;
		switch(select("�i�C�g���킢�₷���ꏊ","�i�C�g�Ƃ��Ă̐����̂�����","�i�C�g�Ŏ����𓾂���@")) {
		case 1:
			set '@bad,'@bad+5;
			mes "[�R�m�O���[]";
			mes "���ɂ͊y�ȏꏊ�E�h���ꏊ�l�X����B";
			mes "�i�C�g�͂ǂ�ȏꏊ�ł�";
			mes "���������Ă����Ȃ���΂Ȃ�Ȃ��B";
			break;
		case 2:
			mes "[�R�m�O���[]";
			mes "�O�ɏo��΁A�i�C�g���������邾�낤�B";
			mes "��y�R�m�ɂ��F�X�ƕ����Ă݂Ȃ����B";
			break;
		case 3:
			set '@bad,'@bad+15;
			mes "[�R�m�O���[]";
			mes "����I�R�m�������Ǝv���Ă���B";
			mes "�R�m�͂����������݂ł͂Ȃ��I";
			break;
		}
		break;
	}
	next;
	mes "[�R�m�O���[]";
	mes "���c�����Ԃ񒷘b�ɂȂ��Ă��܂����ȁB";
	next;
	if('@bad > 10) {
		set CHANGE_KN,13;
		mes "[�R�m�O���[]";
		mes "���O�Ƃ̘b�͑ދ��������B";
		mes "�܂��i�C�g�ɂȂ�̂͑������낤�B";
		next;
		mes "[�R�m�O���[]";
		mes "���m�ł��������F�X�w�񂾂ق���";
		mes "�ǂ����낤�B";
		mes "�{���Ƀi�C�g��ڎw���Ȃ�A�������g��";
		mes "�ς���K�v�����邾�낤�B";
		close;
	}
	set CHANGE_KN,14;
	mes "[�R�m�O���[]";
	mes "���O�Ƃ̘b�͊y���������B";
	mes '@bad? "�����C�ɂȂ�_�����������B": "�Ⴂ���̎������v���o���悤���������B";
	next;
	mes "[�R�m�O���[]";
	mes "����ł́A�R�m�c���̘b�𕷂��āA";
	mes "�A���ɂ����f���Ă��炨�����B";
	next;
	mes "[�R�m�O���[]";
	mes "���܂�S�z����ȁB";
	mes "�����悭�b���Ă��B";
	close;
}

//============================================================
// �y�R�y�R�����^��
//------------------------------------------------------------
prontera.gat,55,350,5	script	�y�R�y�R�Ǘ���	105,{
	if(Job != Job_Knight) {
		mes "[�y�R�y�R�Ǘ���]";
		mes "���̌�p�ł����H";
		mes "�y�R�y�R�́A�i�C�g�l��";
		mes "���[�h�i�C�g�l��p��";
		mes "�Ȃ��Ă���܂��B";
		close;
	}
	mes "[�y�R�y�R�Ǘ���]";
	mes "��������Ⴂ�܂��B";
	mes "�y�R�y�R��C�p�ӂ������܂��傤���H";
	mes "��C 2500 zeny�ł������܂��B";
	next;
	if(select("���p����","��߂�")==2) {
		mes "[�y�R�y�R�Ǘ���]";
		mes "�����ł����B�ł́c�c";
		close;
	}
	if(checkriding()) {
		mes "[�y�R�y�R�Ǘ���]";
		mes "���łɃy�R�y�R�ɏ����";
		mes "��������Ⴂ�܂��ˁB";
		close;
	}
	if(Zeny < 2500) {
		mes "[�y�R�y�R�Ǘ���]";
		mes "���́A����������Ȃ��悤�ł����c�c";
		mes "�c�c�j�Y�ł����c�c�H";
		close;
	}
	if(getskilllv(63) < 1) {
		mes "[�y�R�y�R�Ǘ���]";
		mes "�c�c�܂��y�R�y�R�ɂ�";
		mes "���Ȃ��悤�ł��ˁB";
		mes "�X�L���u���C�f�B���O�v��";
		mes "�o���Ă��炨�z�����������B";
		close;
	}
	set Zeny,Zeny-2500;
	setriding;
	close;
}