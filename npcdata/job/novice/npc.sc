npc "iz_int01" "���#new01_ship" 4_M_NOV_RUMIN 91 62 3 0 0
OnClick:
	var q = isbegin_quest 7471
	if (q == 0)
		dialog "[���]"
		dialog "............."
		dialog ".. ?"
		showimage "nov_lumin01.bmp" 0
		wait
		showimage "fly_trock.bmp" 2
		dialog "[���� ī��]"
		dialog "��, ������ ����°�?"
		dialog "�� ���� �� ģ���� �ٴٿ��� ǥ�� ���� �༮�� ���� �ֿ���."
		wait
		dialog "[���� ī��]"
		dialog "����� �Ҿ�����."
		dialog "���� ����̶� �̸��� �������. �׳� ���ϰ� �� ��� �θ��� ������.."
		wait
		dialog "[���� ī��]"
		dialog "�׸��� ��� �ڳװ� ���� ���� �ɾ��ٽ��� ������ ������ ���� ����鵵 �׷������� ���� �ɸ� �ǳ�."
		wait
		dialog "!- �ȳ� -!"
		dialog "^4d4dff�⺻������ ���콺 ���� Ŭ������ ������ ������ �����մϴ�."
		dialog "NPC ��ȭ �� �̵�, ������ ���콺 ���� Ŭ���� �̿��մϴ�.^000000"
		showimage "tutorial01.bmp" 4
		wait
		showimage "tutorial01.bmp" 255
		dialog "[���� ī��]"
		dialog "���� û����� ������ ���� ���� ^4d4dff��-�̵尡�� �ձ�^000000�� ã�ƿ´ٳ�."
		dialog "�츮�� �� ������ ������� �̵尡�� �ձ��� ������ �����׶��� �������þ�."
		wait
		dialog "[���� ī��]"
		dialog "������� �ڳװ��� ���� û��� �� ������ ���� ������ �����ϴ� �ڵ��� �𿩵���."
		dialog "���� �ڳ׵� �� �� �ϳ��� �ǰڱ�."
		wait
		dialog "[���� ī��]"
		dialog "���� �̾߱⸦ ���ְ� �ʹٸ� ���� �غ� �ؾ߰ڱ�."
		dialog "�����忡�� �ڳװ��� ���� ���谡�� ���� �п��� �ִٳ�."
		wait
		dialog "[���� ī��]"
		dialog "�ڼ��� �̾߱�� �迡�� ���� �� ���ְڳ�."
		dialog "�����忡�� ����."
		wait
		dialog "[���� ī��]"
		dialog "�迡�� �������� ������ ^4d4dff���� ���� ��Ż^000000�� ���� �ȴٳ�."
		dialog "��� ����̵��� ��Ż�� ���ϰ� ����."
		setquest 7471
		completequest 7471
		wait
		showimage "nov_lumin01.bmp" 0
		dialog "[���]"
		dialog "�׷���."
		wait
		showimage "fly_trock.bmp" 2
		dialog "[ī��]"
		dialog "����, �༮ ��."
		dialog "������ �Ϳ�����."
		close
	else
		dialog "[���]"
		dialog "....���."
		showimage "nov_lumin01.bmp" 0
		wait
		choose menu "����? �ڱ�Ұ��ΰ�?" "�� �̸���~!" 
		case 1
			dialog "["+PcName+"]"
			dialog "�� "+PcName+"���̽ô�!"
			dialog "������ ������ ���� �̷��� �����̽���!"
			wait
			dialog "[��]"
			dialog "....."
			wait
			dialog "[��]"
			dialog "....."
			dialog "....�׷���?"
			wait
			showimage "nov_lumin01.bmp" 255
			dialog "�����ϰ� ������ ��� �迡�� ���� �� �ָ� �������."
			wait
			showimage "fly_trock.bmp" 2
			dialog "[ī��]"
			dialog "�� �༮. �β������� �����°ž�."
			dialog "������ �����忡�� �� ������ �ɰ�. �� �����ְ�. ���� �༮�ϼ�."
			wait
			dialog "[ī��]"
			dialog "�� ���� �����带 �������� �ϰ� �ٰŸ� ���� ������ �� ��ȹ�̾�."
			dialog "���� �����ڰ�?"
			close
			showimage "fly_trock.bmp" 255
		break
		case 2
			dialog "["+PcName+"]"
			dialog "�� "+PcName+"���̽ô�!"
			dialog "������ ������ ���� �̷��� �����̽���!"
			wait
			dialog "[��]"
			dialog "....."
			wait
			dialog "[��]"
			dialog "....."
			dialog "....�׷���?"
			wait
			showimage "nov_lumin01.bmp" 255
			dialog "�����ϰ� ������ ��� �迡�� ���� �� �ָ� �������."
			wait
			showimage "fly_trock.bmp" 2
			dialog "[ī��]"
			dialog "�� �༮. �β������� �����°ž�."
			dialog "������ �����忡�� �� ������ �ɰ�. �� �����ְ�. ���� �༮�ϼ�."
			wait
			dialog "[ī��]"
			dialog "�� ���� �����带 �������� �ϰ� �ٰŸ� ���� ������ �� ��ȹ�̾�."
			dialog "���� �����ڰ�?"
			close
			showimage "fly_trock.bmp" 255
		break
		endchoose
	endif
return

npc "iz_int01" "���� ī��#new01_ship" 4_M_REINDEER 99 75 3 0 0
OnClick:
	var q = isbegin_quest 7471
	if (q == 0)
		dialog "[���� ī��]"
		dialog "���� �� �پ��°�, ���� ģ��?"
		dialog "���� �� ^4d4dff������^000000�� �����Ұɼ�."
		wait
		dialog "[���� ī��]"
		dialog "�׸��� ��� �ڳװ� ���� ���� �ɾ��ٽ��� ������ ������ ���� ����鵵 �׷������� ���� �ɸ� �ǳ�."
		wait
		dialog "!- �ȳ� -!"
		dialog "^4d4dff�⺻������ ���콺 ���� Ŭ������ ������ ������ �����մϴ�."
		dialog "NPC ��ȭ �� �̵�, ������ ���콺 ���� Ŭ���� �̿��մϴ�.^000000"
		showimage "tutorial01.bmp" 4
		wait
		showimage "tutorial01.bmp" 255
		dialog "[���� ī��]"
		dialog "���� û����� ������ ���� ���� ^4d4dff��-�̵尡�� �ձ�^000000�� ã�ƿ´ٳ�."
		dialog "�츮 �������� ������� �̵尡�� �ձ��� ���� �����׶��� �������þ�."
		wait
		dialog "[���� ī��]"
		dialog "������� �ڳװ��� ���� û��� �� ������ ���� ������ �����ϴ� �ڵ��� �𿩵���."
		dialog "���� �ڳ׵� �� �� �ϳ��� �ǰڱ�."
		wait
		dialog "[���� ī��]"
		dialog "���� �̾߱⸦ ���ְ� �ʹٸ� ���� �غ� �ؾ߰ڱ�."
		dialog "�����忡�� �ڳװ��� ���� ���谡�� ���� �п��� �ִٳ�."
		wait
		dialog "[���� ī��]"
		dialog "�ڼ��� �̾߱�� �迡�� ���� �� ���ְڳ�."
		dialog "�����忡�� ����."
		wait
		dialog "[���� ī��]"
		dialog "�迡�� �������� ������ ^4d4dff���� ���� ��Ż^000000�� ���� �ȴٳ�."
		dialog "��� ����̵��� ��Ż�� ���ϰ� ����."
		setquest 7471
		completequest 7471
		close
	else
		showimage "fly_trock.bmp" 2
		dialog "[���� ī��]"
		dialog "�����忡 ���������� �迡�� ��������?"
		dialog "^4d4dff���� ���� ��Ż^000000�� ���� ������ ���� �� �ִٳ�."
		wait
		dialog "[���� ī��]"
		dialog "������ �����忡�� �ڼ��� �̾߱⸦ �ϵ��� ����."
		dialog "�ڳ׿��� �˷��ְ� ������ ����."
		close
		showimage "fly_trock.bmp" 255
	endif
return


npc "izlude" "���� ī��#new_iz" 4_M_REINDEER 198 213 3 0 0
OnClick:
	showimage "fly_trock.bmp" 2
	var q = isbegin_quest 7472
	if (q == 0)
		dialog "[ī��]"
		dialog "���Ⱑ ��������."
		dialog "�ڳ��� ���� ��ġ�� ���� ��ҷδ� ���ҳ��� ���� ���� ������."
		wait
		dialog "[ī��]"
		dialog "���� �ڳ׿��� Ư���� ������ �ִ°��� �ƴϳ׸�..."
		dialog "�������� �����ϸ鼭 �ڳװ��� �����̸� ���� ������."
		wait
		dialog "[ī��]"
		dialog "�׵� �߿��� ������ �ڵ鵵 �ְ�, ���� �������� ���ϰ� �ǵ��ư� �̵鵵 �־���."
		dialog "���� �ڳװ� �� ���� �������� �������� ���������� �Ѵٳ�."
		wait
		dialog "[ī��]"
		dialog "�װ� �ƴ°�?"
		dialog "�����忡�� �ڳװ��� ������ ���谡���� �����ϱ� ���� �п��� �ִٴ� ��."
		wait
		choose menu "�п���?" 
		case 1		
		break
		endchoose
		dialog "[ī��]"
		dialog "�׷�. ^4d4dff�ո� ũ������ �п�^000000 �̶�� �ϴ���."
		dialog "�� �̵尡�� �սǿ��� ���谡�� ��������� �����ϱ� ���� ���� ���̾�."
		wait
		dialog "[ī��]"
		dialog "�п��� �� ģ���� �������� ���� �ϰ� ������ �Ұ��� ���ְڳ�."
		dialog "�������� ���Ǹ� ���ְ���."
		wait
		dialog "[ī��]"
		dialog "�� �п� �Ա� ��ó���� ���� �� ���谡���� ���� �ɰ� �����״�.."
		dialog "���� �ѹ� ���� ��������."
		wait
		dialog "[ī��]"
		dialog "�̸��� ^4d4dff �� ^000000 �̶�� ����."
		dialog "������ ǥ�ø� �� ���״� �� ģ���� ��������."
		setquest 7472
		compass 0 122 207 1 "0x4D4DFF00"
		wait
		dialog "!- �ȳ� -!"
		dialog "^4d4dff�̴ϸ��� ���� ��ܿ��� �� �� �ֽ��ϴ�."
		dialog " + �� Ȯ��, - �� ����� �� ������ NPC�κ��� �ȳ� �޴� ��ġ�� ǥ�� �Ǳ⵵ �մϴ�.^000000"
		wait
		showimage "tutorial02.bmp" 4
		dialog "!- �ȳ� -!"
		dialog "^4d4dff���� ī�����κ��� ����Ʈ�� �޾ҽ��ϴ�."
		dialog "����Ʈ�� ������ ����Ʈ ����â���� Ȯ�� �� �� �ֽ��ϴ�."
		wait
		dialog "!- �ȳ� -"
		dialog "����Ʈ ����â�� ^4d4dffAlt + u^000000Ű�� ���� �� �� �ֽ��ϴ�."
		wait
		showimage "tutorial02.bmp" 255
		dialog "[ī��]"
		dialog "������ ���� �� �𸣰ڴٸ� <NAVI>[��]<INFO>izlude,122,207</INFO></NAVI> ���� ��������."
		dialog "�׷� [��] �̶�� �� �κ� ���̾�."
		wait
		dialog "!- �ȳ� -"
		dialog "^4d4dff ��ȭ ���� �� <NAVI>[��]<INFO>izlude,122,207</INFO></NAVI> �̷� ǥ����"
		dialog "���� �ȳ��ϱ� ���� �׺���̼� ���� ��ũ �Դϴ�."
		showimage "navi01.bmp" 4
		wait
		dialog "!- �ȳ� -!"
		dialog "^4d4dff ��ǥ ����� �˻��Ͽ� ������ ������ �� �ȳ��� Ŭ���ϸ�"
		dialog "��ǥ����� ��ġ�� ���� ȭ��ǥ�� �����Ǹ� �ȳ��� ���۵˴ϴ�.^000000"
		showimage "navi02.bmp" 4
		wait
		showimage "navi01.bmp" 255
		dialog "[ī��]"
		dialog "��·�� �� ģ����� ��ī���̿� ����ϴ� ����� �˷�������."
		dialog "�ڳ� �ձ濡 ū ������ �Ǳ� �ٶ�ڳ�."
		close
	elseif (q == 1)
		dialog "[ī��]"
		dialog "�ڳװ� ���Ѵٸ� �ٷ� ������ ���� �߰����� ���𵮵� �ǰ���."
		dialog "������ �ϴ� �п��� �湮 �� ���⸦ ���ϰڳ�."
		wait
		dialog "[ī��]"
		dialog "�� ���踦 ��ư��⿡ ȥ�ڴ� �ʹ� �ܷ��� �ʴ°�."
		dialog "�п����� ����� ���� �� ���Ḧ ���� ���� ������.."
		wait
		dialog "[ī��]"
		dialog "���� �п��� �������� ������ ���̶��. ������."
		wait
		dialog "[ī��]"
		dialog "�� ģ�� '��'�� �п� �Ա� ��ó�� ���� ���̳�."
		dialog "��ġ�� �𸣰ڴٸ� �ٽ� �˷�����."
		compass 0 122 207 1 "0x4D4DFF00"
		wait
		dialog "[ī��]"
		dialog "������ ���� �� �𸣰ڴٸ� <NAVI>[��]<INFO>izlude,122,207</INFO></NAVI> ���� ��������."
		dialog "�׷� [��] �̶�� �� �κ� ���̾�."
		wait
		dialog "!- �ȳ� -!"
		dialog "^4d4dff ��ȭ ���� �� <NAVI>[��]<INFO>izlude,122,207</INFO></NAVI> �̷� ǥ����"
		dialog "���� �ȳ��ϱ� ���� �׺���̼� ���� ��ũ �Դϴ�."
		showimage "navi01.bmp" 4
		wait
		dialog "!- �ȳ� -!"
		dialog "^4d4dff ��ǥ ����� �˻��Ͽ� ������ ������ �� �ȳ��� Ŭ���ϸ�"
		dialog "��ǥ����� ��ġ�� ���� ȭ��ǥ�� �����Ǹ� �ȳ��� ���۵˴ϴ�.^000000"
		showimage "navi02.bmp" 4
		wait
		showimage "navi01.bmp" 255
		dialog "[ī��]"
		dialog "��·�� �� ģ����� ��ī���̿� ����ϴ� ����� �˷�������."
		dialog "�ڳ� �ձ濡 ū ������ �Ǳ� �ٶ�ڳ�."
		close
	else
		dialog "[ī��]"
		dialog "��,"+PcName+"!"
		dialog "������ �����̱�?"
		dialog "�ڳװ� ������ ���� �� ���� �ٻ���."
		dialog "�踦 ������ �ϰ� �ְŵ�."
		wait
		dialog "[ī��]"
		dialog "���� ������ �Ǵ´�� �簳�� �����̾�."
		dialog "�׶����� ^4d4dff�ķν� ���^000000�� ����� �����ɼ�."
		dialog "����ϰԳ�."
		close
	endif
	showimage "fly_trock.bmp" 255
return


npc "izlude" "ũ�������п� ���� ��#nb" 4_M_KHKYEL 122 207 3 0 0
OnClick:
	compass 0 1 1 2 "0xFFFFFF00"
	var q = isbegin_quest 7472
	if (q == 1)
		dialog "[��]"
		dialog "����.. ī���� ���ϴ� ����� �ڳ׷α���!"
		dialog "�ڳ� ������ ����� �𸣰ڳ׸� �λ��� �������� �� �̵尡���� �������� ����."
		wait
		dialog "[��]"
		dialog "������� �ϴ� �����̵��� ���°� ��ſ�."
		dialog "������� ������ �ǰ������״� ���� ���̶� �ϳ� �ٱ�?"
		changequest 7472 7473
		getexp 1200
		getitem Apple_Juice 1
		wait
		dialog "[��]"
		dialog "���� ����� �⺻����â���� 'Item'�������� ������ ������â�� Ȱ��ȭ �ȴٳ�."
		wait
		dialog "[��]"
		dialog "������â�� ũ�� ������ ������ �з��Ǵµ�"
		dialog "����, '�Һ�', '���', '��Ÿ', '����'���� ���� �뵵�� �°� �ڵ� �з��� ����."
		wait
		dialog "[��]"
		dialog "����ϰų� ����ϰ��� �ϴ� �������� �ش� ^4d4dff�������� ����Ŭ��^000000 �ϰų�"
		dialog "^4d4dff���â���� �巡�� �Ͽ� �̿�^000000�� �� �ְŵ�."
		wait
		showimage "tutorial03.BMP" 4
		dialog "!- �ȳ� -!"
		dialog "^4d4dff�����۵��� �����ϰ� ����Ŭ������ ����ϰų� ������ �� �ֽ��ϴ�."
		dialog "������â�� ����Ű Alt + E �� �����ϰ� ���� ���� �� �ֽ��ϴ�."
		wait
		dialog "!- �ȳ� -!"
		dialog "^4d4dff������ �������� Ȯ���� ����Ű ALT + Q �� ��� Ȯ���� �����մϴ�."
		dialog "�����ϰ��� �ϴ� ��ġ�� �ش� �������� �巡���Ͽ��� �˴ϴ�."
		wait
		showimage "tutorial03.BMP" 255
		dialog "[��]"
		dialog "�� ^4d4dff�����ۿ� ���� ���� ������ ���� ������ �ش� �������� ��Ŭ��^000000 �ϴ°ž�."
		dialog "������ �������� ���� ������ �� �� ����."
		wait
		showimage "tutorial04.BMP" 4
		dialog "!- �ȳ� -!"
		dialog "^4d4dff�������� ���콺 ������ Ŭ���� �ϸ� �ش� �������� ���� ������ �� �� �ֽ��ϴ�."
		wait
		dialog "!- �ȳ� -!"
		dialog "^4d4dff�÷��̾ ������ ��� Ŀ�´�Ƽ �޴��� Ȱ��ȭ�Ǹ� ��Ƽ����, �ŷ� ���� ��û�� �� �ֽ��ϴ�."
		wait
		showimage "tutorial04.BMP" 255
		dialog "[��]"
		dialog "�׷� ^4d4dff���� �� ����꽺�� ���ź���.^000000"
		close
	else
		dialog "[��]"
		dialog "������ â�� ���� ���� �� ����꽺�� �� ����Ű��."
		dialog "�� ������ �̾߱⸦ �����ϵ��� ����."
		close
	endif
return






npc "izlude" "ũ������ �п���#lumin01" 4_M_NOV_RUMIN 140 249 7 0 0
OnClick:
	dialog "��� ������ ��� �ִ� �� ����."
	dialog "���� �Ѵ�!"
	close
	showimage "nov_lumin01.bmp" 255
return

npc "iz_ac01" "��ī���� ������#nk" 4_F_01 100 39 5 0 0
OnClick:
	var q = isbegin_quest 4269
	if (q == 0)
		dialog "[������]"
		dialog "��ī���̿� ���� ���� ȯ���մϴ�. ���� �ȳ��� ��� ���� ������ ������ �ð� �ֽ��ϴ�."
		wait
		dialog "[������]"
		dialog "������ ���͵帱���?"
		wait
		choose menu "���� ���� ���" "�б� ����" "��ȭ ����" 
		case 1
			dialog "[������]"
			dialog "��� ����...������..."+PcName+"�̽ñ���."
			dialog "���� ����� �帮�ڽ��ϴ�."
			dialog "������ �������� �����Ͻ� ��"
			dialog "������ �� ������ �������� ������ ������ �ֽ��ϴ�."
			wait
			dialog "[������]"
			dialog "�׸��� �̰��� ���� ������ �ʿ���"
			dialog "���� �⺻���� ����Դϴ�."
			dialog "�����ϰ� ����Ͻñ� �ٶ��ϴ�."
			dialog "�����޵��� �����Ƿ� �����ϼ���."
			setquest 4269
			completequest 4269
			getitem Novice_Plate 1
			getitem Novice_Hood 1
			getitem Novice_Boots 1
			getitem Novice_Egg_Cap 1
			getitem Novice_Knife 1
			getitem Novice_Guard 1
			getitem Novice_Potion 300
			wait
			dialog "[������]"
			dialog "�ϴ� ���⸦ ã�Ҵٴ� ����"
			dialog "����� ���谡�μ��� ���� �Ϻ��Դϴ�."
			getexp 600
			getJexp 600
			wait
			dialog "[������]"
			dialog "������ ���� ���� ���� �� ������"
			dialog "�ֱ⸦ ����ҰԿ�."
			close
		break
		case 2
			choose menu "1�� ����" "2�� ����" "���� ����" "��ȭ�� �����Ѵ�." 
			case 1
				dialog "[������]"
				dialog "1������ ������ ���� �ü�����"
				dialog "�����ϸ�, ��ġ�� ���� ���ǵ���"
				dialog "�غ�Ǿ� �ֽ��ϴ�."
				wait
				dialog "[������]"
				dialog "�켱 �ǹ��ǿ����� ü���� ȸ���� �� �ִ� ����� ����ġ�� ��ų�� ������ �� �ֽ��ϴ�."
				wait
				dialog "[������]"
				dialog "���������� ������ ���� ������ ���� �� �ְ� ������ �Ʒ��� ���� �� �ֽ��ϴ�."
				wait
				dialog "[������]"
				dialog "�Ĵ翡���� �丮�� ���� ������ �� �� �ְ�, �丮 ��ų�� ���� ���� ���� �� �ֽ��ϴ�."
				wait
				dialog "[������]"
				dialog "������ ���͵帱���?"
				wait
			break
			case 2
				dialog "[������]"
				dialog "2������ �� ������ ����"
				dialog "�Ʒ��� �������ִ� ���� ���"
				dialog "�����Ե��� �ֽ��ϴ�."
				wait
				dialog "[������]"
				dialog "�� �������� ü���غ� �� �ִ�"
				dialog "�Թ����� ������ ������ �"
				dialog "�����ϰ� ������ ���� �� ��,"
				dialog "�ڽ��� ���θ� ������ �ֽñ� �ٶ��ϴ�."
				wait
			break
			case 3
				dialog "[������]"
				dialog "�� ������ �̸��� �������� �ϸ� �� �̵尡���� ������ �����׶��� �������� �� �ױ��Դϴ�."
				wait
				dialog "[������]"
				dialog "���� ���ԵǴ� �ʺ��ڵ��� ������ �����ϵ��� ���� ��ü�� ����Ǿ� ������"
				dialog "���� �������� �׿� ���� �ȳ� �� ������ ����ϴ� ������� ��ġ�Ǿ� �ֽ��ϴ�."
				wait
				dialog "[������]"
				dialog "������ ���͵帱���?"
				wait
			break
			case 4
				dialog "[������]"
				dialog "�ʿ��� ���� ������ �ٽ� ã�� �ּ���."
				close
			break
			endchoose
		break
		case 3
			dialog "[������]"
			dialog "�˰ڽ��ϴ�."
			dialog "�ʿ��� ���� ������ �ٽ� ã���ּ���."
			close
		break
		endchoose
	else
		dialog "[������]"
		dialog "�ȳ��ϼ���,"+PcName+"��."
		dialog "���õ� ���� �Ϸ縦 ������ ��Ű���?"
		dialog "���� ������ �ȳ��� �ð� �ֽ��ϴ�."
		dialog "������ ���͵帱���?"
		wait
		while (1)
			dialog "[������]"
			dialog "������ ���͵帱���?"
			wait
			choose menu "�б� ���� ����" "������ ��ġ �ȳ�" "��ȭ ����"
			case 1
				choose menu "1�� ����" "2�� ����" "���� ����" "��ȭ�� �����Ѵ�." 
				case 1
					dialog "[������]"
					dialog "1������ ������ ���� �ü�����"
					dialog "�����ϸ�, ��ġ�� ���� ���ǵ���"
					dialog "�غ�Ǿ� �ֽ��ϴ�."
					wait
					dialog "[������]"
					dialog "�켱 �ǹ��ǿ����� ü���� ȸ���� �� �ִ� ����� ����ġ�� ��ų�� ������ �� �ֽ��ϴ�."
					wait
					dialog "[������]"
					dialog "���������� ������ ���� ������ ���� �� �ְ� ������ �Ʒ��� ���� �� �ֽ��ϴ�."
					wait
					dialog "[������]"
					dialog "�Ĵ翡���� �丮�� ���� ������ �� �� �ְ�, �丮 ��ų�� ���� ���� ���� �� �ֽ��ϴ�."
					wait
					dialog "[������]"
					dialog "������ ���͵帱���?"
					wait
				break
				case 2
					dialog "[������]"
					dialog "2������ �� ������ ����"
					dialog "�Ʒ��� �������ִ� ���� ���"
					dialog "�����Ե��� �ֽ��ϴ�."
					wait
					dialog "[������]"
					dialog "�� �������� ü���غ� �� �ִ�"
					dialog "�Թ����� ������ ������ �"
					dialog "�����ϰ� ������ ���� �� ��,"
					dialog "�ڽ��� ���θ� ������ �ֽñ� �ٶ��ϴ�."
					wait
				break
				case 3
					dialog "[������]"
					dialog "�� ������ �̸��� �������� �ϸ� �� �̵尡���� ������ �����׶��� �������� �� �ױ��Դϴ�."
					wait
					dialog "[������]"
					dialog "���� ���ԵǴ� �ʺ��ڵ��� ������ �����ϵ��� ���� ��ü�� ����Ǿ� ������"
					dialog "���� �������� �׿� ���� �ȳ� �� ������ ����ϴ� ������� ��ġ�Ǿ� �ֽ��ϴ�."
					wait
					dialog "[������]"
					dialog "������ ���͵帱���?"
					wait
				break
				case 4
					dialog "[������]"
					dialog "�ʿ��� ���� ������ �ٽ� ã�� �ּ���."
					close
				break
				endchoose
			break
			case 2		
				while (1)
					choose menu "���� �Ʒ� ���" "1�� ���� ���" "������ �޴��� ���ư���." "��ȭ�� �����Ѵ�." 
					case 1
						dialog "[������]"
						dialog "ã���� �ϴ� �������� �̸��� ���콺�� ���� ���߷� Ŭ���Ͻø� �ȳ��� �� �帮�ڽ��ϴ�."
						wait
						dialog "ġ��� ȸ�� ��� <NAVI>ġ���<INFO>iz_ac01,59,43</INFO></NAVI>"
						dialog "���� �Ʒ� ��� <NAVI>�����<INFO>iz_ac01,59,83</INFO></NAVI>"
						dialog "���� �̻� ������ ���� <NAVI>������<INFO>iz_ac01,134,47</INFO></NAVI>"
						dialog "�丮�� ������ �ִ� <NAVI>�������<INFO>iz_ac01,147,47</INFO></NAVI>"
						dialog "���ÿ� ���� ������ <NAVI>���ü����� ��<INFO>izlude,153,126</INFO></NAVI>"
						dialog "���� ����� �Ϸ��� <NAVI>��ũ��<INFO>iz_ac02,143,55</INFO></NAVI>"
					break
					case 2
						dialog "[������]"
						dialog "ã���� �ϴ� �������� �̸��� ���콺�� ���� ���߷� Ŭ���Ͻø� �ȳ��� �� �帮�ڽ��ϴ�."
						wait
						dialog "�˻� ��� <NAVI>�˻� ����<INFO>iz_ac02,47,48</INFO></NAVI>"
						dialog "���� ��� <NAVI>������<INFO>iz_ac02,156,169</INFO></NAVI>"
						dialog "�ü� ��� <NAVI>�ü� ������<INFO>iz_ac02,65,109</INFO></NAVI>"
						dialog "������ ��� <NAVI>����<INFO>iz_ac02,148,110</INFO></NAVI>"
						dialog "���� ��� <NAVI>���̼�<INFO>iz_ac02,52,136</INFO></NAVI>"
						dialog "���� ��� <NAVI>���� ���̵�<INFO>iz_ac02,140,139</INFO></NAVI>"
						dialog "�ǽ����� ��� <NAVI>��� �İ� ����<INFO>iz_ac02,162,86</INFO></NAVI>"
						dialog "�±� ��� <NAVI>�ƶ�<INFO>iz_ac02,70,85</INFO></NAVI>"
					break
					case 3
						exitwhile
					break
					case 4
						dialog "[������]"
						dialog "�� �˰ڽ��ϴ�, �ʿ��� ���� ����� �ٽ� ã�� �ּ���."
						close
						return
					break
					endchoose
					wait
					dialog "[������]"
					dialog "�ȳ��� �Ǿ����ϱ�?"
					wait
					choose menu "��ø�..." "�׷� ���� �̸�." 
					case 1
						wait
					break
					case 2
						dialog "[������]"
						dialog "������ ���� ���� ���� �� ���־��� �������� �Ͼ��. ������ �ϼ���~"
						close
						return
					break
					endchoose
				endwhile
			break
			case 3
				exitwhile
			break
			endchoose
		endwhile
		close
	endif
return


npc "iz_ac01" "ī���� �ȳ� ����#1" 4_F_KAFRA1 95 46 6 0 0
OnClick:
	showimage "kafra_01.bmp" 2
	var q = isbegin_quest 4269
	if (q == 0)
		dialog "[ī���� �ȳ� ����]"
		dialog "���� ^8B4513��ī���� ��� ����^000000��"
		dialog "��ġ�� �;� �� �� ���ƿ�~!"
		dialog "��ī���� 1�� �Ա��� ����"
		dialog "��� �� �ִ� ����"
		dialog "��ǰſ���~!"
		close
	else
		dialog "[ī���� �ȳ� ����]"
		dialog "����ʽÿ�. ī���� ���񽺴� ������ ������ �翡 �ֽ��ϴ�."
		wait
		dialog "[ī���� �ȳ� ����]"
		dialog "ī���� ���񽺸� ó��"
		dialog "�̿��ϴ� �е��� ���ؼ�"
		dialog "ī���� ���񽺿� ����"
		dialog "�پ��� ������ �ص帮��"
		dialog "������~!"
		wait
		while(1)
			dialog "[ī���� �ȳ� ����]"
			dialog "ī���� ���񽺿� ���ؼ�"
			dialog "���� �˰��������~!"
			wait
			choose menu "���� ���� �̿�" "â�� ���� �̿�" "���� �̵� ���� �̿�" "īƮ ���� �̿�" "��Ÿ���� Ȯ��" "����"
			case 1
				dialog "[ī���� �ȳ� ����]"
				dialog "���� ���񽺶� �� �״��"
				dialog "�ʵ忡�� ^8B4513�����Ҵ�^000000�� �ǰų�"
				dialog "^8B4513������ ����^000000�� ���� ��������"
				dialog "������� �� �̵��Ǵ� ������"
				dialog "���ϴ� �� �̿���~"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "�����ϱ� ���� ����~?"
				dialog "���� ���񽺸�"
				dialog "�̿��� ���ðھ��~?"
				wait
				choose menu "�ƴϿ�" "��" 
				case 1
					dialog "[ī���� �ȳ� ����]"
					dialog "������ ���� ���ƿ�~!"
					dialog "���弭�񽺴� ��������"
					dialog "��Ƹ��� �ʾƿ�~"
					dialog "������ �ٲ�� ���� ���񽺸�"
					dialog "��~ �̿��غ����� ���ھ��~!"
					wait
				break
				case 2
					dialog "[ī���� �ȳ� ����]"
					dialog "��~ �׷�"
					dialog "���� ũ������ ��ī���̰� �ִ�"
					dialog "������ ^8B4513������ ����^000000����"
					dialog "������ �մϴ�~!."
					wait
					dialog "[ī���� �ȳ� ����]"
					dialog "§~!"
					wait
					dialog "[ī���� �ȳ� ����]"
					dialog "���� �������~ �� ����~?"
					wait
					dialog "[ī���� �ȳ� ����]"
					dialog "���� ^006400������ ����^000000��"
					dialog "��� �� ���� ����������"
					dialog "������ ��ġ�� �̵� �� �ſ���."
					wait
				break
				endchoose
			break
			case 2
				dialog "[ī���� �ȳ� ����]"
				dialog "â�� ���񽺶�~"
				dialog "�� �״�� ���� �����۵���"
				dialog "^8B4513�����ϰ� ����^000000 �� �� �ֵ��� �ϴ�"
				dialog "�߿��� �ݰ�� ���� ���񽺿���~!"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "â�� �̿��ϱ� ���ؼ���"
				dialog "^8B4513�ʺ��� ��ų������ 6^000000�̻�����"
				dialog "�÷��� ������~!"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "�׸��� ������ ������~"
				dialog "^006400500 ����^000000�� �޾ƿ�!"
				dialog "â�� �̿��� ���ðھ��~?"
				wait
				choose menu "�ƴϿ�" "��" 
				case 1
					dialog "[ī���� �ȳ� ����]"
					dialog "â�� ���񽺴�"
					dialog "�ʼ� ���񽺴ϱ�~"
					dialog "��~ �̿��� ������~!"
					wait
				break
				case 2
					dialog "[ī���� �ȳ� ����]"
					dialog "â�� �̿��Ͻ÷���"
					dialog "�ʺ��� ��ų������ 6 �̻�"
					dialog "�ø��ž� �ؿ�."
					wait
				break
				endchoose
			break
			case 3
				dialog "[ī���� �ȳ� ����]"
				dialog "���� �̵� ���񽺶�~"
				dialog "�� �״�� ���Ե鲲��"
				dialog "^8B4513���ϴ� ���^000000�� �ణ��"
				dialog "���ϸ� �ް� ���ϰ�"
				dialog "�̵����ѵ帮�� ���񽺶��ϴ�~."
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "����~ ������ �������̸� �̾��ִ�"
				dialog "^8B4513�ٸ��� ����^000000�� �ϰ��~"
				dialog "��Ȥ~ �����̳�~ �ʵ��"
				dialog "�̵������ִ� ���� ������"
				dialog "���� ���� ��������~!"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "�����~? ����� ������"
				dialog "���ؼ� �ù� ���񽺸�"
				dialog "^8B4513����^000000��~! ��ϰ� ������~"
				dialog "���񽺸� �̿��� ���ھ��~?"
				wait
				choose menu "�ƴϿ�" "��" 
				case 1
					dialog "[ī���� �ȳ� ����]"
					dialog "���� �ʿ��� ���񽺶�~"
					dialog "��~ �̿��� ���� ����"
					dialog "�����ٵ���~~."
					wait
				break
				case 2
					choose menu "��ī���� 1�� �� ���ǽ� �Ա�" "��ī���� 2�� ����� �Ա�" "������ �̿��Ѵ�" 
					case 1
						close
						moveto "iz_ac01" 98 85
					break
					case 2
						close
						moveto "iz_ac02" 104 179
					break
					case 3
						
					break
					endchoose
				break
				endchoose
			break
			case 4
				dialog "[ī���� �ȳ� ����]"
				dialog "īƮ ���񽺶�~"
				dialog "īƮ�� ����� �� �ִ�"
				dialog "^8B4513���� �迭�� ����^000000�鿡��"
				dialog "�ణ�� ���ϸ� �ް�"
				dialog "īƮ�� �뿩�� �帮��"
				dialog "���񽺶��ϴ�~."
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "���� �迭�� �ƴϰų�~"
				dialog "īƮ ���� ��ų�� ��������"
				dialog "������ ��쿡�� �̿��� ��"
				dialog "���� ���񽺶�°�~"
				dialog "�˾Ƶμ���~!."
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "�ϴ� ^0000FF��ī���� ������^000000����~"
				dialog "�̿��ϰ� �;~"
				dialog "�̿� �� �� ���� ���񽺴ϱ�~"
				dialog "�ϴ� �˾Ƹ� �μ���~!!."
				wait
			break
			case 5
				dialog "[ī���� �ȳ� ����]"
				dialog "��Ÿ ���� �� ����"
				dialog "���� ����Ʈ��� ����"
				dialog "�־��~!"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "���� ����Ʈ Ȯ���̶�~"
				dialog "����~ ī���� ���񽺸�"
				dialog "�̿��� �� ����"
				dialog "���Ե鿡��~ ������ �ǹ̷�"
				dialog "���ݾ� ^8B4513����Ʈ�� �׾�^000000�帮��"
				dialog "���� ���ؿ�~."
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "���� ����Ʈ�� �� ��"
				dialog "Ȯ�� �� ���ðھ��~?"
				wait
				choose menu "��������Ʈ Ȯ��" "���" 
				case 1
					dialog "[ī���� �ȳ� ����]"
					dialog ""+PcName+" ������ ��������Ʈ�� 0 �� �̿���."
					wait
					dialog "[ī���� �ȳ� ����]"
					dialog "��������Ʈ�� ���� ī���� ���翡�� ��ǰ�� ��ȯ�� �����ؿ�."
					dialog "���� ���� ī���� ���񽺵� �̿��Ͻð� ���� ��ǰ�� �޾ư�����~"
					wait
				break
				case 2
					wait
				break
				endchoose
			break
			case 6
				dialog "[ī���� �ȳ� ����]"
				dialog "���� ī���� ���񽺴� ���� �Ϻ��� ���񽺿� ������ ���� ������ �� �������� �Ƚ��ϰ� ���ϰ� �̿��Ͻ� �� �ֵ��� �ּ��� ���ϰ� �ֽ��ϴ�."
				dialog "�̿��� �ּż� �����մϴ�."
				close
				exitwhile
			break
			endchoose
		endwhile
	endif
	showimage "kafra_01.bmp" 255
return

npc "iz_ac02" "ī���� �ȳ� ����#2" 4_F_KAFRA1 101 176 6 0 0
OnClick:
	showimage "kafra_01.bmp" 2
	var q = isbegin_quest 4269
	if (q == 0)
		dialog "[ī���� �ȳ� ����]"
		dialog "���� ^8B4513��ī���� ��� ����^000000��"
		dialog "��ġ�� �;� �� �� ���ƿ�~!"
		dialog "��ī���� 1�� �Ա��� ����"
		dialog "��� �� �ִ� ����"
		dialog "��ǰſ���~!"
		close
	else
		dialog "[ī���� �ȳ� ����]"
		dialog "����ʽÿ�. ī���� ���񽺴� ������ ������ �翡 �ֽ��ϴ�."
		wait
		dialog "[ī���� �ȳ� ����]"
		dialog "ī���� ���񽺸� ó��"
		dialog "�̿��ϴ� �е��� ���ؼ�"
		dialog "ī���� ���񽺿� ����"
		dialog "�پ��� ������ �ص帮��"
		dialog "������~!"
		wait
		while(1)
			dialog "[ī���� �ȳ� ����]"
			dialog "ī���� ���񽺿� ���ؼ�"
			dialog "���� �˰��������~!"
			wait
			choose menu "���� ���� �̿�" "â�� ���� �̿�" "���� �̵� ���� �̿�" "īƮ ���� �̿�" "��Ÿ���� Ȯ��" "����"
			case 1
				dialog "[ī���� �ȳ� ����]"
				dialog "���� ���񽺶� �� �״��"
				dialog "�ʵ忡�� ^8B4513�����Ҵ�^000000�� �ǰų�"
				dialog "^8B4513������ ����^000000�� ���� ��������"
				dialog "������� �� �̵��Ǵ� ������"
				dialog "���ϴ� �� �̿���~"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "�����ϱ� ���� ����~?"
				dialog "���� ���񽺸�"
				dialog "�̿��� ���ðھ��~?"
				wait
				choose menu "�ƴϿ�" "��" 
				case 1
					dialog "[ī���� �ȳ� ����]"
					dialog "������ ���� ���ƿ�~!"
					dialog "���弭�񽺴� ��������"
					dialog "��Ƹ��� �ʾƿ�~"
					dialog "������ �ٲ�� ���� ���񽺸�"
					dialog "��~ �̿��غ����� ���ھ��~!"
					wait
				break
				case 2
					dialog "[ī���� �ȳ� ����]"
					dialog "��~ �׷�"
					dialog "���� ũ������ ��ī���̰� �ִ�"
					dialog "������ ^8B4513������ ����^000000����"
					dialog "������ �մϴ�~!."
					wait
					dialog "[ī���� �ȳ� ����]"
					dialog "§~!"
					wait
					dialog "[ī���� �ȳ� ����]"
					dialog "���� �������~ �� ����~?"
					wait
					dialog "[ī���� �ȳ� ����]"
					dialog "���� ^006400������ ����^000000��"
					dialog "��� �� ���� ����������"
					dialog "������ ��ġ�� �̵� �� �ſ���."
					wait
				break
				endchoose
			break
			case 2
				dialog "[ī���� �ȳ� ����]"
				dialog "â�� ���񽺶�~"
				dialog "�� �״�� ���� �����۵���"
				dialog "^8B4513�����ϰ� ����^000000 �� �� �ֵ��� �ϴ�"
				dialog "�߿��� �ݰ�� ���� ���񽺿���~!"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "â�� �̿��ϱ� ���ؼ���"
				dialog "^8B4513�ʺ��� ��ų������ 6^000000�̻�����"
				dialog "�÷��� ������~!"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "�׸��� ������ ������~"
				dialog "^006400500 ����^000000�� �޾ƿ�!"
				dialog "â�� �̿��� ���ðھ��~?"
				wait
				choose menu "�ƴϿ�" "��" 
				case 1
					dialog "[ī���� �ȳ� ����]"
					dialog "â�� ���񽺴�"
					dialog "�ʼ� ���񽺴ϱ�~"
					dialog "��~ �̿��� ������~!"
					wait
				break
				case 2
					dialog "[ī���� �ȳ� ����]"
					dialog "â�� �̿��Ͻ÷���"
					dialog "�ʺ��� ��ų������ 6 �̻�"
					dialog "�ø��ž� �ؿ�."
					wait
				break
				endchoose
			break
			case 3
				dialog "[ī���� �ȳ� ����]"
				dialog "���� �̵� ���񽺶�~"
				dialog "�� �״�� ���Ե鲲��"
				dialog "^8B4513���ϴ� ���^000000�� �ణ��"
				dialog "���ϸ� �ް� ���ϰ�"
				dialog "�̵����ѵ帮�� ���񽺶��ϴ�~."
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "����~ ������ �������̸� �̾��ִ�"
				dialog "^8B4513�ٸ��� ����^000000�� �ϰ��~"
				dialog "��Ȥ~ �����̳�~ �ʵ��"
				dialog "�̵������ִ� ���� ������"
				dialog "���� ���� ��������~!"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "�����~? ����� ������"
				dialog "���ؼ� �ù� ���񽺸�"
				dialog "^8B4513����^000000��~! ��ϰ� ������~"
				dialog "���񽺸� �̿��� ���ھ��~?"
				wait
				choose menu "�ƴϿ�" "��" 
				case 1
					dialog "[ī���� �ȳ� ����]"
					dialog "���� �ʿ��� ���񽺶�~"
					dialog "��~ �̿��� ���� ����"
					dialog "�����ٵ���~~."
					wait
				break
				case 2
					choose menu "��ī���� 1�� �� ���ǽ� �Ա�" "��ī���� 2�� ����� �Ա�" "������ �̿��Ѵ�" 
					case 1
						close
						moveto "iz_ac01" 98 85
					break
					case 2
						close
						moveto "iz_ac02" 104 179
					break
					case 3
						
					break
					endchoose
				break
				endchoose
			break
			case 4
				dialog "[ī���� �ȳ� ����]"
				dialog "īƮ ���񽺶�~"
				dialog "īƮ�� ����� �� �ִ�"
				dialog "^8B4513���� �迭�� ����^000000�鿡��"
				dialog "�ణ�� ���ϸ� �ް�"
				dialog "īƮ�� �뿩�� �帮��"
				dialog "���񽺶��ϴ�~."
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "���� �迭�� �ƴϰų�~"
				dialog "īƮ ���� ��ų�� ��������"
				dialog "������ ��쿡�� �̿��� ��"
				dialog "���� ���񽺶�°�~"
				dialog "�˾Ƶμ���~!."
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "�ϴ� ^0000FF��ī���� ������^000000����~"
				dialog "�̿��ϰ� �;~"
				dialog "�̿� �� �� ���� ���񽺴ϱ�~"
				dialog "�ϴ� �˾Ƹ� �μ���~!!."
				wait
			break
			case 5
				dialog "[ī���� �ȳ� ����]"
				dialog "��Ÿ ���� �� ����"
				dialog "���� ����Ʈ��� ����"
				dialog "�־��~!"
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "���� ����Ʈ Ȯ���̶�~"
				dialog "����~ ī���� ���񽺸�"
				dialog "�̿��� �� ����"
				dialog "���Ե鿡��~ ������ �ǹ̷�"
				dialog "���ݾ� ^8B4513����Ʈ�� �׾�^000000�帮��"
				dialog "���� ���ؿ�~."
				wait
				dialog "[ī���� �ȳ� ����]"
				dialog "���� ����Ʈ�� �� ��"
				dialog "Ȯ�� �� ���ðھ��~?"
				wait
				choose menu "��������Ʈ Ȯ��" "���" 
				case 1
					dialog "[ī���� �ȳ� ����]"
					dialog ""+PcName+" ������ ��������Ʈ�� 0 �� �̿���."
					wait
					dialog "[ī���� �ȳ� ����]"
					dialog "��������Ʈ�� ���� ī���� ���翡�� ��ǰ�� ��ȯ�� �����ؿ�."
					dialog "���� ���� ī���� ���񽺵� �̿��Ͻð� ���� ��ǰ�� �޾ư�����~"
					wait
				break
				case 2
					wait
				break
				endchoose
			break
			case 6
				dialog "[ī���� �ȳ� ����]"
				dialog "���� ī���� ���񽺴� ���� �Ϻ��� ���񽺿� ������ ���� ������ �� �������� �Ƚ��ϰ� ���ϰ� �̿��Ͻ� �� �ֵ��� �ּ��� ���ϰ� �ֽ��ϴ�."
				dialog "�̿��� �ּż� �����մϴ�."
				close
				exitwhile
			break
			endchoose
		endwhile
	endif
	showimage "kafra_01.bmp" 255
return

npc "iz_ac01" "���� ���� �����#ũ����" 4_M_NOV_HUNT 59 83 4 0 0
OnClick:
	dialog "[���� ���� �����]"
	dialog "� ����. ģ��."
	dialog "���� ��ɴ�� ���� ������."
	dialog "�ڳ׵��� �Ϸ绡�� �Ǹ��� ��簡 �� �� �ֵ��� ���� ���� ������ �Ƿڸ� �����ϰ� ������ ���� �ִٸ� �ѷ�����."
	wait
	choose menu "�Ƿڸ� ����." "�׸� �д�." 
	case 1
		choose menu "���󿡼� ���� ���ִ�(1~3)" "����� ���־�(1~3)" "�ĺ긣 �ʰ���(4~6)" "�׸� �д�." 
		case 1
			setquest 11338
			erasequest 11338
			dialog "[���� ���� �����]"
			dialog "������ ��𿡼��� �� �� �ִ� �Ϳ��� �Ĺ�����."
			dialog "���� ���� ���Ƽ� ��ä�� �Ⱦ��ϴ� ���̵鵵 �� �԰� ���̾�."
			wait
			dialog "[���� ���� �����]"
			dialog "ũ������ �п������� �߿��� ������ ���ǰ� ������ ������ ������ �ʿ��ϴٳ�."
			wait
			choose menu "����Ʈ�� �޴´�." "�׸� �д�." 
			case 1
				dialog "[���� ���� �����]"
				dialog "������ ũ������ �п��� �ִ� ������ ������ ���� �ʵ忡�� ���� �߰� �� �� ����."
				dialog "������ 10���� ��Ƽ� ������ 5���� ��������."
				dialog "���� ����Ʈ�� Alt+U�� ������ Ȯ���� �� �ִٳ�."
				setquest 11339
				close				
			break
			case 2
				dialog "[���� ���� �����]"
				dialog "������ ��𿡼��� �� �� �ִ� �Ϳ��� �Ĺ�����."
				dialog "���� ���� ���Ƽ� ��ä�� �Ⱦ��ϴ� ���̵鵵 �� �԰� ���̾�."
				wait
				dialog "[���� ���� �����]"
				dialog "ũ������ �п������� �߿��� ������ ���ǰ� ������ ������ ������ �ʿ��ϴٳ�."
				wait
				choose menu "��ȭ�� ��ģ��." "����Ʈ�� �����Ѵ�." 
				case 1
					close
				break
				case 2
					dialog "[���� ���� �����]"
					dialog "���� ����Ʈ�� �����ϰڳ�?"
					wait
					choose menu "��ȭ�� ��ģ��." "���� �����Ѵ�." 
					case 1
						close
					break
					case 2
						dialog "[���� ���� �����]"
						dialog "�� ������ �ʿ��� �̻� �󸶵��� ����Ʈ�� �ٽ� ������ �� ������ ������ ����."
						erasequest 11339
						close
					break
					endchoose
				break
				endchoose
			break
			endchoose
		break
		case 2
			dialog "[���� ���� �����]"
			dialog "�糪ƽ�� �����׶� �ٱ��� �����ϴ� ���� �Ϳ��� �����̶��."
			dialog "���麸���ϰ� ���������ϰ��� ���� �Ϳ������� �Ϳ�������"
			wait
			dialog "[���� ���� �����]"
			dialog "�Դٰ� �׻� ����� ������ �ٴϱ� ������ ���ִ� ����� ���� ���� �� �ֳ�."
			dialog "����� ���̼����Ұ� ǳ���ϰ� ��Ÿ��A�� ī��ƾ�� �����ϰ� �־ �÷°������� ȿ���� �ִ� ���� ���� ä�Ҿ�."
			wait
			var q = isbegin_quest 11340
			if (q == 0)
				choose menu "����Ʈ�� �޴´�." "�׸� �д�." 
				case 1
					dialog "[���� ���� �����]"
					dialog "�糪ƽ�� ũ������ �п��� �ִ� ������ ������ �����ʵ忡�� ���� �߰� �� �� ����."
					dialog "�糪ƽ�� 10���� ��Ƽ� ��� 3���� ��������. "
					dialog "���� ����Ʈ�� Alt+U�� ������ Ȯ���� �� �ִٳ�."
					setquest 11340
					close
				break
				case 2
					
				break
				endchoose
			else
				choose menu "��ȭ�� ��ģ��." "����Ʈ�� �����Ѵ�." 
				case 1
					
				break
				case 2
					dialog "[���� ���� �����]"
					dialog "���� ����Ʈ�� �����ϰڳ�?"
					wait
					choose menu "��ȭ�� ��ģ��." "���� �����Ѵ�." 
					case 1
						close
					break
					case 2
						dialog "[���� ���� �����]"
						dialog "�� ������ �ʿ��� �̻� �󸶵��� ����Ʈ�� �ٽ� ������ �� ������ ������ ����."
						erasequest 11340
						close
					break
					endchoose
				break
				endchoose
			endif
		break
		case 3
			
		break
		case 4
			dialog "[���� ���� �����]"
			dialog "������ ���� ������ ���� ����."
			dialog "������ �ٲ�� ������ ����."
			close
		break
		endchoose
	break
	case 2
		dialog "[���� ���� �����]"
		dialog "������ ���� ������ ���� ����."
		dialog "������ �ٲ�� ������ ����."
		close
	break
	endchoose
return