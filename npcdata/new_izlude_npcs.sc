trader "izlude" "������" 1_M_JOBGUIDER 160 186 0 0 0
OnInit:
	sellitem Meat // 50
return

npc "izlude" "Ű��" 4W_M_01 140 186 3 0 0
OnClick:
	dialog "[Ű��]"
	dialog "����~! ���� ������¿�. �� ������ �����Ӹ��ƴ϶� �ٷ� ���� ���̴� ���� �ٴ��� ������ å������ �ִ�ϴ�."
	wait
	dialog "[Ű��]"
	dialog "������ Ŀ�ٶ� �������� ��ġ�ϰ� �ٴ� �ָ����� �̸��̸� ���������. ���� �̸��̸� ����س��°� �����̴ϱ��."
	close
return

npc "izlude" "���ھ�" 4_F_TELEPORTER 174 164 3 0 0
OnClick:
	dialog "[���ھ�]"
	dialog "�����׶��� �������� �׻� �ֹΰ� Ÿ�������� ������� ��ȭ�� �ò��ò�����."
	dialog "�������� ����� ���̴� ���̶� �׻� ������ ���ĳ��°��̱⵵ �ؿ� �� �͸� ��￩���� ������ �������� ���� ���� �� ����������."
	close
return

npc "izlude" "����" 8W_SOLDIER 166 156 2 0 0
OnClick:
	dialog "[����]"
	dialog "��������"
	dialog "��? ���� �׸� ������ı�?"
	dialog "�˷��ֱ�?"
	wait
	choose menu "�� �ֱ׷��ô°ſ���?" "�ƴϿ�" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[����]"
	dialog "�ƾ�.. ���� �ϰŸ��� �� �پ���Ȱŵ� �ڳ׵� �˰��ְ���? ���͸� ��Ƽ� ������ ����ǰ���� ���ε��� ���� �ְ� ����̰� �ִ°� ���̾�"
	wait
	choose menu "�� �˾ƿ�" "��? �׷���?" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[����]"
	dialog "�� ��� �װ� �츮 ���̿��ŵ�"
	dialog "�׷��� ������ ��ɲ۵��� ��½�þ��ݾ� �׷��� �츮�����δ� �����ϱⰡ �ʹ� ��á����"
	wait
	dialog "[����]"
	dialog "�������� ���� �߱��� �����̿��ٴϱ� �׶��� �����ϸ�.. ��������~~~"
	dialog "��·�� �׷��� ���ο��� �������� ���ž� �Ǹ����� �����ϰ� �־�߸� ��������޼ҿ��� ���� �����ϰԲ� �Ѱ���."
	wait
	dialog "[����]"
	dialog "�Ǹ����� �ٸ� ���� ����鿡�Լ� ����ǰ�� ����� �� �ִ� �⺻������ �ڱ��� �ְ� ��������ҿ� �׻� �ִ� ���ε鿡�� �����ְ� ���̾�"
	wait
	dialog "[����]"
	dialog "�׷��� �Ǽ� ������ ã�ƿ��»���� ��!�پ������ ���̾� ��� �׸� �γ��Ѱ͵� �ƴ����� �����ϰ� ���ϰ� �������ܸ��̾�~"
	dialog "���� ����� �ѹ����� �������� �޾���� ���Ѱ� ���� �˰Եȴٴϱ�"
	dialog "������!"
	close
return

npc "izlude" "�Ʒ���#nb1" 4_BULLETIN_BOARD2 207 167 3 0 0
OnClick:
	dialog "== ���� �϶�! �� �� ��! =="
	dialog " "
	dialog "���Ϳ��� ������ ����!"
	dialog "�ڽ��� �Ѱ����� ����ΰ�!"
	dialog "����� �Բ� �ϴ� PVE ��Ƽ!"
	dialog "�� ��� ���� �Ʒ�������..!"
	close
return

npc "izlude" "��ī��#izj" 4_M_02 155 132 4 0 0
OnClick:
	dialog "[��ī��]"
	dialog "���������� �̳� �������� ������ ���� 5���� �������� ���� ���������ܰ� ���������� ����� �帳�ϴ�."
	wait
	choose menu "���������� ����." "������ ����." "�ñ��� �� �����." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	endchoose
	dialog "[��ī��]"
	dialog "���������� ���� 5���� ���������� 1���� �����Ͻðڽ��ϱ�?"
	wait
	choose menu "1����ȯ" "������α�ȯ" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[��ī��]"
	dialog "����� �����Ͻô� ����?"
	dialog "���������� ���� 5���� �������ž� ���������� 1���� ������ �� �ֽ��ϴ�."
	close
return

npc "izlude" "���� ���� �����̽�#iz" 4_F_JOB_BLACKSMITH 147 131 5 0 0
OnClick:
	dialog "[���� ���� �����̽�]"
	dialog "���� �� �ɾ� �ִ� û�⸻��, �� �ð� ° <�ͱ���>�� ������� �־�. ��� ���⸦ �� �Ұ� ������ �ϳ� ���Ҵٳ�?"
	wait
	dialog "[���� ���� �����̽�]"
	dialog "���� �������� ���� ����ϸ� �� �ٵ�, ���μ��� ���� ���и� �����ϴ� ������ �ϴ� �� ���ذ� �� �ȵ�."
	close
return

npc "izlude" "���ü����� ��#jtuto" 4_M_02 153 126 2 0 0
OnClick:
	dialog "[���ü����� ��]"
	dialog "�ȳ��Ͻʴϱ�? �� �̵尡���� ������ ���ù�ȭ�� �̲��� ���� �� �̶�� �մϴ�."
	wait
	dialog "[���ü����� ��]"
	dialog "�ڴʰ� ���忡 �پ������ ���� �����մ��� ���� ������ ����ϱⰡ ���� �ʾƼ���. �̷��� ȫ���� �ϰ� �Ǿ����ϴ�."
	wait
	dialog "[���ü����� ��]"
	dialog "Ȥ�� ����� ���ϰ� ������� ^3E86C3����^000000�̶� �Ϳ� ���� �����Ű���?"
	wait
	choose menu "���� �����." "����? �Դ� �ǰ���?" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	Emotion "���ü����� ��#jtuto" ET_SORRY
	dialog "[���ü����� ��]"
	dialog "��.. �˼��մϴ�. ���� �ٻ� ���� ����ұ���."
	close
return

npc "izlude" "Ÿ�嵥#izj" 4_M_04 145 122 8 0 0
OnClick:
	dialog "[Ÿ�嵥]"
	dialog "ö�̳� ��ö�� �� ���⸦ ������ �� ���̴� �ݼ��� �Ȱ� �ֽ���."
	dialog "1������ �������ÿ� ���̴� ^007777������^000000 ��... 2������ �������ÿ� ���̴� ^007777������Ÿ��^000000 �� �󸶵��� �Ȱ� �ֽ��ϴٿ�."
	wait
	choose menu "������ - 200z." "������Ÿ�� - 1000z." "�ñ��� �� �����." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	endchoose
	close
return

npc "izlude" "���øŴϾ�#iz_bs" 4_M_SITDOWN 148 122 5 0 0
OnClick:
	dialog "[���øŴϾ�]"
	dialog "��! ������ �غ���."
	dialog "���� �� ������ ^3131FF����^000000�� �� ������ �����ϴ� ���̶� ���̿���."
	wait
	choose menu "������ ����?" "����� �����." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[���øŴϾ�]"
	dialog "�Ϻ� ������ ������ �����۵��� ^3131FF������ ���� ��ȭ^000000 ��ų �� �־��."
	wait
	dialog "[���øŴϾ�]"
	dialog "Ư�� ����� ^3131FF���ݷ��� ���^000000�Ǳ� ������ ������ �����Ѵٸ� ū ������ �ȴٰ��."
	wait
	dialog "[���øŴϾ�]"
	dialog "1���� ������ ��� +7 ���ñ����� 100% ������ ���������, �� ���ķδ� ^FF0000����^000000�� ���� �־��. ^FF0000�������� ����� ������ ���̿���^000000."
	wait
	dialog "[���øŴϾ�]"
	dialog "���� �� +10�� �����ϰ� �־��. ����� ������� �� ������!!"
	dialog "��-��! ��-��!!"
	wait
	dialog "[���øŴϾ�]"
	dialog "�ڼ��� ������ ���� '���ü� ����'���� ������� �ؿ�. ������ +10�̶�� �߿��� ����� �����ϱ��!"
	close
return

npc "izlude" "���øӽ� �ͱ���" 2_MONEMUS 153 121 1 0 0
OnClick:
	dialog "[���øӽ� �ͱ���]"
	dialog "-�츴-"
	dialog "�ͱ��� ����.. �Ϸ�"
	dialog "����� üũ ��.. �Ϸ�"
	dialog "���� ��� �����ϼ���."
	wait
	choose menu "�ϴ�-[�����ȵ�]" "����-[�����ȵ�]" "�޼�-[�����ȵ�]" "������-[�����ȵ�]" "��ĥ��-[�����ȵ�]" "�Ź�-[�����ȵ�]" "�Ǽ��縮1-[�����ȵ�]" "�Ǽ��縮2-[�����ȵ�]" "����-[�����ȵ�]" "�ߴ�-[�����ȵ�]" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	case 5
		
	break
	case 6
		
	break
	case 7
		
	break
	case 8
		
	break
	case 9
		
	break
	case 10
		
	break
	endchoose
	close
return

npc "izlude" "���øӽ� �ͱ���" 2_MONEMUS 153 121 1 0 0
OnClick:
	dialog "[���øӽ� �ͱ���]"
	dialog "-�츴-"
	dialog "�ͱ��� ����.. �Ϸ�"
	dialog "����� üũ ��.. �Ϸ�"
	dialog "���� ��� �����ϼ���."
	wait
	choose menu "�ϴ�-[�����ȵ�]" "����-[�����ȵ�]" "^nItemID^2112" "������-[�����ȵ�]" "��ĥ��-[�����ȵ�]" "�Ź�-[�����ȵ�]" "�Ǽ��縮1-[�����ȵ�]" "�Ǽ��縮2-[�����ȵ�]" "����-[�����ȵ�]" "�ߴ�-[�����ȵ�]" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	case 5
		
	break
	case 6
		
	break
	case 7
		
	break
	case 8
		
	break
	case 9
		
	break
	case 10
		
	break
	endchoose
	dialog "[���øӽ� �ͱ���]"
	dialog "������� �˻� ��.. �Ϸ�"
	wait
	dialog "[���øӽ� �ͱ���]"
	dialog "^FF0000- ������ȣ 4444 -^000000"
	dialog "������ �Ұ����� ����Դϴ�."
	close
return

npc "izlude" "�����ŴϾ�#iz_ac" 2_M_ALCHE 93 143 3 0 0
OnClick:
	dialog "[�����ŴϾ�]"
	dialog "�ȳ��ϼ���? �� ���ɹ̽�Ʈ�Դϴ�."
	dialog "���ο��� ������ �� �ִ� ��������."
	wait
	dialog "[�����ŴϾ�]"
	dialog "���� ������ ����� �־��."
	dialog "���� ���� ������ ������ ������ �ؾ� ���� �������� �ö󰡴� �� ���Ƽ� ��������� �Դµ�, ���� ������ ���ƿ�. ��! ����!"
	close
return

npc "izlude" "ȫ�����" 4W_SAILOR 102 171 5 0 0
OnClick:
	dialog "[ȫ�����]"
	dialog "�ھ��ھ� ȣ��� ���� �밨��"
	dialog "���谡�� �������Դϴ�~ ����"
	dialog "���谡���̿� �����϶�!"
	wait
	dialog "[ȫ�����]"
	dialog "�ű� �ڳ�, �� ������ ���谡��"
	dialog "������ �����Ǵµ�, �� �̾߱�"
	dialog "�� ��� ���� ���� ��Ѱ�?"
	wait
	choose menu "�׷���." "�� ���� �־..." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	close
return

npc "izlude" "�����ϵ����" 4_F_03 125 175 4 0 0
OnClick:
	dialog "[�����ϰ�]"
	dialog "�ȳ��ϼ��� �� �ȳ��ϼ��� ��"
	dialog "�����ϵ���� �Դϴ�"
	dialog "������ ���͵帱��� ?"
	wait
	choose menu "^3355FF�����ϰ���^000000 �� ���Ͽ�" "^3355FF�����ϰ���^000000 �� �����Ѵ�" "��ȭ�� �����Ѵ�" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	endchoose
	close
return

trader "izlude" "���ϻ���" 1_M_INNKEEPER 124 165 4 0 0
OnInit:
	sellitem Apple // 15
	sellitem Banana // 15
	sellitem Carrot // 15
	sellitem Sweet_Potato // 15
return

trader "izlude" "��������" 4_F_01 128 158 7 0 0
OnInit:
	sellitem Milk // 25
return

npc "izlude" "����Ʈ ����#������" 8_F_GIRL 138 163 5 0 0
OnClick:
	dialog "[����Ʈ ����]"
	dialog "�ȳ��ϼ���. ���� �˸ŷ� ���Ǵ� ^FF0000����Ʈ^000000�� �Ȱ� �ֽ��ϴ�. �ʿ��Ͻ� ���� �����Ű���?"
	wait
	choose menu "��Į������Ʈ - 200z" "���ӱ׸�����Ʈ - 200z" "�ε������Ʈ - 200z" "���ο���������Ʈ - 200z" "��ȭ����" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	case 5
		
	break
	endchoose
	dialog "[����Ʈ ����]"
	dialog "��Į������Ʈ�� �����ϼ̱���."
	dialog "�� �� �����Ͻðڽ��ϱ�?"
	dialog "����Ͻ÷��� 0�� �Է����ּ���."
	wait
	dlgwrite
	dialog "[����Ʈ ����]"
	dialog "�������� �����Ͽ� �����Ͻ� �� �����ϴ�."
	close
return

npc "izlude" "�����ǲ���������#33" CLEAR_NPC 136 160 0 0 0
OnClick:
	dialog "������ ����ģ ������ �ֽ��ϴ�."
	close
return

	showimage "kafra_01.bmp" 2
npc "izlude" "ī���� ����" 4_F_KAFRA1 128 148 4 0 0
OnClick:
	dialog "[ī���� ����]"
	dialog "����ʽÿ�. ī���� ���񽺴� ������ ������ �翡 �ֽ��ϴ�."
	dialog "������ ���͵帱���?"
	wait
	choose menu "���� ���� �̿�" "â�� ���� �̿�" "�����̵� ���� �̿�" "īƮ ���� �̿�" "��Ÿ���� Ȯ��" "����" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	case 5
		
	break
	case 6
		
	break
	endchoose
	dialog "[ī���� ����]"
	dialog "���� �Ǿ����ϴ�."
	dialog "�̿��� �ּż� �����մϴ�."
	close
return

	showimage "kafra_01.bmp" 255
npc "izlude" "������ �����̵���#30" 4_F_NOVICE 131 148 3 0 0
OnClick:
	dialog "[������ �����̵���]"
	dialog "�� ������ ��� ���� ������ ���û��̿� ��ǥ���� ��Ȳ���� ���谡��, ���Է� ������!"
	dialog "����� ������� Ÿ���� �� ������ ����!"
	wait
	dialog "[������ �����̵���]"
	dialog "�帣�� �ð��� ��ü�� ���� ���ٰ��?"
	dialog "����� ��ġ�µ� ������ ���ٰ��?"
	dialog "���� �ذ�簡 �ǰ� �ͽ��ϱ�?"
	dialog "������ ����̽ʴϱ�? ���� ���� �����ܰ� ����ϼ���!"
	wait
	choose menu "���������� �̵�" "��ȭ�� ��ģ��" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[������ �����̵���]"
	dialog "�ھ�, ���ô� �츮���� ����Ʈ��!"
	close
return

	showimage "thf_lumin01.bmp" 255
	dialog "[���� ���� �����]"
	dialog "� ����. ģ��."
	dialog "���� ��ɴ�� ���� ������."
	dialog "�ڳ׵��� �Ϸ绡�� �Ǹ��� ��簡 �� �� �ֵ��� ���� ���� ������ �Ƿڸ� �����ϰ� ������ ���� �ִٸ� �ѷ�����."
	wait
	choose menu "�Ƿڸ� ����." "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	choose menu "���󿡼� ���� ���ִ�(1~3)" "����� ���־�(1~3)" "�ĺ긣 �ʰ���(4~6)" "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	endchoose
	dialog "[���� ���� �����]"
	dialog "������ ��𿡼��� �� �� �ִ� �Ϳ��� �Ĺ�����."
	dialog "���� ���� ���Ƽ� ��ä�� �Ⱦ��ϴ� ���̵鵵 �� �԰� ���̾�."
	wait
	dialog "[���� ���� �����]"
	dialog "ũ������ �п������� �߿��� ������ ���ǰ� ������ ������ ������ �ʿ��ϴٳ�."
	wait
	choose menu "����Ʈ�� �޴´�." "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[���� ���� �����]"
	dialog "������ ũ������ �п��� �ִ� ������ ������ ���� �ʵ忡�� ���� �߰� �� �� ����."
	dialog "������ 10���� ��Ƽ� ������ 5���� ��������."
	dialog "���� ����Ʈ�� Alt+U�� ������ Ȯ���� �� �ִٳ�."
	setquest 11339
	close
return

	dialog "[���� ���� �����]"
	dialog "� ����. ģ��."
	dialog "���� ��ɴ�� ���� ������."
	dialog "�ڳ׵��� �Ϸ绡�� �Ǹ��� ��簡 �� �� �ֵ��� ���� ���� ������ �Ƿڸ� �����ϰ� ������ ���� �ִٸ� �ѷ�����."
	wait
	choose menu "�Ƿڸ� ����." "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	choose menu "���󿡼� ���� ���ִ�(1~3)" "����� ���־�(1~3)" "�ĺ긣 �ʰ���(4~6)" "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	endchoose
	dialog "[���� ���� �����]"
	dialog "�糪ƽ�� �����׶� �ٱ��� �����ϴ� ���� �Ϳ��� �����̶��."
	dialog "���麸���ϰ� ���������ϰ��� ���� �Ϳ������� �Ϳ�������"
	wait
	dialog "[���� ���� �����]"
	dialog "�Դٰ� �׻� ����� ������ �ٴϱ� ������ ���ִ� ����� ���� ���� �� �ֳ�."
	dialog "����� ���̼����Ұ� ǳ���ϰ� ��Ÿ��A�� ī��ƾ�� �����ϰ� �־ �÷°������� ȿ���� �ִ� ���� ���� ä�Ҿ�."
	wait
	choose menu "����Ʈ�� �޴´�." "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[���� ���� �����]"
	dialog "�糪ƽ�� ũ������ �п��� �ִ� ������ ������ �����ʵ忡�� ���� �߰� �� �� ����."
	dialog "�糪ƽ�� 10���� ��Ƽ� ��� 3���� ��������. "
	dialog "���� ����Ʈ�� Alt+U�� ������ Ȯ���� �� �ִٳ�."
	setquest 11340
	close
return

	dialog "[���� ���� �����]"
	dialog "� ����. ģ��."
	dialog "���� ��ɴ�� ���� ������."
	dialog "�ڳ׵��� �Ϸ绡�� �Ǹ��� ��簡 �� �� �ֵ��� ���� ���� ������ �Ƿڸ� �����ϰ� ������ ���� �ִٸ� �ѷ�����."
	wait
	choose menu "�Ƿڸ� ����." "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	choose menu "���󿡼� ���� ���ִ�(1~3)" "����� ���־�(1~3)" "�ĺ긣 �ʰ���(4~6)" "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	endchoose
	dialog "[���� ���� �����]"
	dialog "�糪ƽ�� �����׶� �ٱ��� �����ϴ� ���� �Ϳ��� �����̶��."
	dialog "���麸���ϰ� ���������ϰ��� ���� �Ϳ������� �Ϳ�������"
	wait
	dialog "[���� ���� �����]"
	dialog "�Դٰ� �׻� ����� ������ �ٴϱ� ������ ���ִ� ����� ���� ���� �� �ֳ�."
	dialog "����� ���̼����Ұ� ǳ���ϰ� ��Ÿ��A�� ī��ƾ�� �����ϰ� �־ �÷°������� ȿ���� �ִ� ���� ���� ä�Ҿ�."
	wait
	choose menu "��ȭ�� ��ģ��." "����Ʈ�� �����Ѵ�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[���� ���� �����]"
	dialog "���� ����Ʈ�� �����ϰڳ�?"
	wait
	choose menu "��ȭ�� ��ģ��." "���� �����Ѵ�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	close
return

	dialog "[���� ���� �����]"
	dialog "� ����. ģ��."
	dialog "���� ��ɴ�� ���� ������."
	dialog "�ڳ׵��� �Ϸ绡�� �Ǹ��� ��簡 �� �� �ֵ��� ���� ���� ������ �Ƿڸ� �����ϰ� ������ ���� �ִٸ� �ѷ�����."
	wait
	choose menu "�Ƿڸ� ����." "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	choose menu "���󿡼� ���� ���ִ�(1~3)" "����� ���־�(1~3)" "�ĺ긣 �ʰ���(4~6)" "�׸� �д�." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	endchoose
	dialog "[���� ���� �����]"
	dialog "�糪ƽ�� �����׶� �ٱ��� �����ϴ� ���� �Ϳ��� �����̶��."
	dialog "���麸���ϰ� ���������ϰ��� ���� �Ϳ������� �Ϳ�������"
	wait
	dialog "[���� ���� �����]"
	dialog "�Դٰ� �׻� ����� ������ �ٴϱ� ������ ���ִ� ����� ���� ���� �� �ֳ�."
	dialog "����� ���̼����Ұ� ǳ���ϰ� ��Ÿ��A�� ī��ƾ�� �����ϰ� �־ �÷°������� ȿ���� �ִ� ���� ���� ä�Ҿ�."
	wait
	choose menu "��ȭ�� ��ģ��." "����Ʈ�� �����Ѵ�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[���� ���� �����]"
	dialog "���� ����Ʈ�� �����ϰڳ�?"
	wait
	choose menu "��ȭ�� ��ģ��." "���� �����Ѵ�." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[���� ���� �����]"
	dialog "�� ������ �ʿ��� �̻� �󸶵��� ����Ʈ�� �ٽ� ������ �� ������ ������ ����."
	erasequest 11340
	close
return
