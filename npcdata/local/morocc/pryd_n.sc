npc "moc_prydb1" "������ �����#nightmare" 4_CAT_SAILOR4 103 54 3 0 0
OnClick:
	dialog "[������ �����]"
	dialog "���̶� �������� ���� ���̾�. ���̰� �� �װڳ�. �� ���� �ƹ��� �𸣰ԡ�"
	wait
	choose menu "���̶�? ���� ���̾�?" "�� ü �Ѵ�"
	case 1
		dialog "[������ �����]"
		dialog "���̶� �������� ���� ���̾�. ���̰� �� �װڳ�. �� ���� �ƹ��� �𸣰ԡ�"
		wait
		dialog "[������ �����]"
		dialog "�ƾ� ���״�! ���桦 �̷� ������ �������� �׾ƿ� ���������μ��� ���� �߶��� ��������."
		wait
		dialog "[������ �����]"
		dialog "������ �� �༮�� ���� �̻��ϴٰ�! ���̶� ������! ���̶��ݾ�!! �� �༮�� �׷��� ��ٴ� ���̾�!"
		wait
		choose menu "���� ���̶���, ��� ����?" "��ȭ�� ��ģ��"
		case 1
			dialog "[������ �����]"
			dialog "����, �װ� ������ ���� �˰� ����."
			dialog "���� �Ƕ�̵��� ������ ������ ã�� �������� ��, �ƴ� ��,�����ϰ� �Ƕ�̵带 �ŴҴٰ� �쿬�� ã�� ���Ⱦ�."
			wait
			dialog "[������ �����]"
			dialog "�̾ƶ� �ٰ����淡 ��~ �ϸ� ����� �־��µ�, ���� ���ϰ� ���ư� ������ ���� �������ȴٰ�. �� �Ϳ��� ����̸��� ļ�ƾƾƿ�! �ΰ� ���� �ش�༮."
			wait
			choose menu "���� ������ �;�" "��ȭ�� ��ģ��"
			case 1
				dialog "[������ �����]"
				dialog "ļ��! �� ���� ���� ��� �˾Ƴ� ���ε�!!"
				wait
				dialog "[������ �����]"
				dialog "��, ������ 5000zeny ���� �ְڴٸ� �װ����� �ȳ��� ����."
				dialog "����! �̻��� �� ���� �����! ����̰� �̵尡���忡�� ��ư��� �� �󸶳� ������ �˾�!"
				wait
				dialog "[������ �����]"
				dialog "^FF0000�׷��� ���� �� ���� ����� �ְ� ���ٰ� 1�� ���� �����Ҵ��� �� �� ������?^000000"
				dialog "��, ���� �������� ���� �ƴ����� �� ����ߴ�!"
				wait
				choose menu "�����ϰ� ���." "���� �ʴ´�"
				case 1
					if v[VAR_MONEY] < 5000
						dialog "[������ �����]"
						dialog "..."
						close
					endif
					dropgold 5000
					dialog "[������ �����]"
					dialog "����? �� �� ������ ��¦��¦ �� �� �� ����? ��. ��������."
					dialog "��, ���� ������⳪ ��!"
					close
					moveto "moc_prydn1" 93 96
				break
				case 2
					dialog "[������ �����]"
					dialog "5000zeny�� ��� �׷��� �� �ƴϰ���?"
					close
				break
				endchoose
			break
			case 2
				close
			break
			endchoose
		break
		case 2
			dialog "[������ �����]"
			dialog "���� �� ��Ⱑ �ñ��� �� �Ƴ��? �̳༭���� ��� ���� �� ������� ����!!"
			close
		break
		endchoose
	break
	case 2
		close
	break
	endchoose
return

npc "moc_prydn1" "������ �����#nightmare" 4_CAT_SAILOR4 94 98 3 0 0
OnClick:
	dialog "[������ �����]"
	dialog "�װ� �Ѵ� �� ���̿� ���̶� �� �༮�� �� �� ������ �����Ⱦ�. ����. ���� �׸� ���ư���, ļ������!"
	wait
	choose menu "���ư���" "����Ʈ óġ" "���μ�Ʈ ���̶� óġ" "�ƹ��͵� �Ƴ�"
	case 1
		dialog "[������ �����]"
		dialog "�׷��׷�, � ���ư��ڰ�."
		close
		moveto "moc_prydb1" 100 57
	break
	case 2
		var q_2290_pt = checkquest_playtime 2290
		if (q_2290_pt == 1)
			dialog "[������ �����]"
			dialog "..."
			close
			return
		elseif (q_2290_pt == 2)
			erasequest 2290		 
		endif
		
		var q_2289_ht = checkquest_hunting 2289
		if (q_2289_ht == 0)
			dialog "[������ �����]"
			dialog "����̿� ���� ���������̶�� �� �˰� �ִ�?"
			wait
			dialog "[������ �����]"
			dialog "�� ¡�׷��� ������ ����Ʈ�� ��. ���� ������� ������ �¿�� ������ �ٰ����� �ϰ� �־�."
			dialog "��, �� ������ ����? ���� ���� ���� ���ö�� �ǹ̾�. ���� ���� �ο��� �ɾ� ���� �ִ� �Ŷ��!"
			wait
			dialog "[������ �����]"
			dialog "�԰ɽ����� ħ�� �Ҷ� �긮��, ���Ҹ��� ������. ���� �Ÿ��� �Ҹ� ���� ���� �� ����."
			dialog "�� �ڸ� ġ���� ���� ��ٸ��� �ִ� �� �и��� ����."
			wait
			dialog "[������ �����]"
			dialog "���� �踸 ������ �ʾҾ Ȯ �������� ���� �ܾ����� �ٵ�!"
			dialog "���� ���̳ʿ�ν��� �������� �̷��� �� �ƴ϶��!"
			wait
			dialog "[������ �����]"
			dialog "�ʵ� ���� ������ ���ư��� �ʹٸ�, �� ������ �۸����� �����̸� ���� �����ִ� �� ������? ������ ���� ����."
			wait
			choose menu "���´�" "���� �ʴ´�."
			case 1
				dialog "[������ �����]"
				dialog "����, �׷� ��ǥġ�� 20������! �����ϵ���!"
				setquest 2289
				close
			break
			case 2
				dialog "[������ �����]"
				dialog "��, ���� ���� �ǵ� ���� �̰ž�? �� �Ǹ� ���� �༮!"
				close
			break
			endchoose
		elseif (q_2289_ht == 1)		 
			dialog "[������ �����]"
			dialog "���μ�Ʈ ���̶� óġ�� �� �Ǿ��?"
			wait
			choose menu "��������" "�׸��ѷ�"
				case 1
					dialog "[������ �����]"
					dialog "����. ��� �����ϵ���."
					close
				break
				case 2
					dialog "[������ �����]"
					dialog "����? å�Ӱ� ���� �༮ ������!"
					erasequest 2289
					close
				break
			endchoose
		elseif (q_2289_ht == 2) 
			dialog "[������ �����]"
			dialog "�� �༮ ���⺸�� ���� �������ݾ�! ���߾�!"
			dialog "����Ʈ �༮, �ѵ����� �� ������ �� ������ ����� ���ϰ���? ��������!"
			changequest 2289 2290
			getexp 300000
			getJexp 100000
			close
		endif
	break
	case 3
		var q_2291_pt = checkquest_playtime 2291
		if (q_2291_pt == 1)
			dialog "[������ �����]"
			dialog "..."
			close
			return
		elseif (q_2291_pt == 2)
			erasequest 2291		 
		endif
		
		var q_2292_ht = checkquest_hunting 2292
		if (q_2292_ht == 0)
			dialog "[������ �����]"
			dialog "������ ������ �ڰ�� ��� ���� ���� ������ �ִ� ��!"
			dialog "�и� ���� 2���� �ƹ��� �߰����� ���� ���̶���� ������ �������� ����� ������ Ʋ������."
			wait
			dialog "[������ �����]"
			dialog "������ ���ݸ� ������ ��Ʈ���߸��� ����� ���μ�Ʈ ���̶� �ͼ� �� �Ӹ��� ������ ����?!"
			wait
			dialog "[������ �����]"
			dialog "�̰��� ���� ����� �������� ���ҽ��� ������ ã�� ���ϰ� �Ϸ��� ���̶���� �跫�ӿ� Ʋ������ ��!"
			wait
			dialog "[������ �����]"
			dialog "�׵��� ��ȹ��� �� �� ����! ��, � ���μ�Ʈ ���̶� óġ�Ϸ� ���� �Ŵ�!"
			wait
			dialog "[������ �����]"
			dialog "�ֳĴ� ������ ���� �ʰھ�. �ʵ� �Ƹ��ٿ� ������ ��� �ӿ� ���׿� ������ ���� �ٶ����� ���� ����!"
			wait
			choose menu "���´�" "���� �ʴ´�."
			case 1
				dialog "[������ �����]"
				dialog "����, �׷� ��ǥġ�� 20������! �����ϵ���!"
				setquest 2292
				close
			break
			case 2
				dialog "[������ �����]"
				dialog "��, ���� ���� �ǵ� ���� �̰ž�? �� �Ǹ� ���� �༮!"
				close
			break
			endchoose
		elseif (q_2292_ht == 1)		 
			dialog "[������ �����]"
			dialog "���μ�Ʈ ���̶� óġ�� �� �Ǿ��?"
			wait
			choose menu "��������" "�׸��ѷ�"
				case 1
					dialog "[������ �����]"
					dialog "����. ��� �����ϵ���."
					close
				break
				case 2
					dialog "[������ �����]"
					dialog "����? å�Ӱ� ���� �༮ ������!"
					erasequest 2292
					close
				break
			endchoose
		elseif (q_2292_ht == 2) 
			dialog "[������ �����]"
			dialog "�� �༮ ���⺸�� ���� �������ݾ�! ���߾�!"
			dialog "����Ʈ �༮, �ѵ����� �� ������ �� ������ ����� ���ϰ���? ��������!"
			changequest 2292 2291
			getexp 600000
			getJexp 200000
			close
		endif
	break
	case 4
		close
	break
	endchoose
return

// warps
warp "moc_prydn1" "PyramidsN1-2" 223 9 2 2
OnTouch:
	moveto "moc_prydn2" 192 8
return

warp "moc_prydn2" "PyramidsN2-1" 195 8 2 3
OnTouch:
	moveto "moc_prydn1" 220 9
return

// mobs
putmob "moc_prydn1" 0 0 0 0 60 N_MINOROUS 5000 0 0
putmob "moc_prydn1" 0 0 0 0 10 N_MUMMY 5000 0 0
putmob "moc_prydn1" 0 0 0 0 50 N_VERIT 5000 0 0
putmob "moc_prydn2" 0 0 0 0 30 N_MIMIC 5000 0 0
putmob "moc_prydn2" 0 0 0 0 30 N_VERIT 5000 0 0
putmob "moc_prydn2" 0 0 0 0 20 N_ARCLOUSE 5000 0 0
putmob "moc_prydn2" 0 0 0 0 20 N_ANCIENT_MUMMY 5000 0 0
putboss "moc_prydn2" 102 85 1 1 1 N_AMON_RA 3600000 600000 0 1