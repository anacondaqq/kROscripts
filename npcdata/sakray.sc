npc "geffen" "���� ���� �ȳ���#sa" 4_F_JOB_HUNTER 140 196 5 0 0
OnClick:
	dialog "[����]"
	dialog "�ȳ��ϼ���."
	dialog "�����е鿡�� �ٸ� ������"
	dialog "������ѵ帱 ������ �ȳ��� �帮��"
	dialog "'����'�Դϴ�."
	wait
	dialog "[����]"
	dialog "���� ���� �� �帮�� ���� �ƴϰ��."
	dialog "���� �ȳ��� �帮�� ��ҿ� �ִ�"
	dialog "�в��� �����е��� �ٸ� ��������"
	dialog "�ȳ��� �帱�̴ϴ�."
	wait
	dialog "[����]"
	dialog "�� �׷� �ٸ� �������� ������"
	dialog "�غ� �Ǽ̳���?"
	wait
	choose menu "��" "�ƴϿ�" 
	case 1
		dialog "[����]"
		dialog "�Ϳ�~"
		dialog "���� �� �����ϼ̾��~"
		dialog "�׷� ���� �� ������ �����帱�״�"
		dialog "���� �ܴ��� �ϼ���~"
		moveto "geffen_in" 180 180
		close
	break
	case 2
		dialog "[����]"
		dialog "����..."
		dialog "������ �غ� ���ϼ̴ٴ�.."
		dialog "���� �غ��ϰ� �ٽÿ�����~��"
		Emotion "���� ���� �ȳ���#sa" 3
		close
	break
	endchoose
return

//"geffen" 140 190

npc "geffen_in" "��ũ���� ��������#sa" 4_F_JOB_HUNTER 182 194 4 0 0
OnClick:
	dialog "[���]"
	dialog "�ȳ��ϼ���~"
	dialog "�������� �ٸ� �������� �������"
	dialog "�帮�� '���'�Դϴ�."
	wait
	dialog "[���]"
	dialog "�ռ� '����'���� ������"
	dialog "�����̰�����, ���� �ٽ� ������"
	dialog "�帱�Կ�."
	wait
	dialog "[���]"
	dialog "��! �� ���� �ٸ� �������� ������"
	dialog "������ �ٿ� �����̵��̶�� �ҰԿ�."
	dialog "�� �����̵��� ������ �մԿ��Դ�"
	dialog "�ƹ��� ������ ��ġ�� �ʾƿ�."
	wait
	dialog "[���]"
	dialog "�� ������ �����̵��� �����ô���"
	dialog "���� �� ���� �ִ� "+PcName+"��"
	dialog "���Դ� ��� ���⵵ ��ġ��"
	dialog "�ʴ´ٴ� ����."
	wait
	dialog "[���]"
	dialog "���� ���ϽŴٸ� �� ���̵�"
	dialog "�����̵��� �Ͻ� �� �ֽ��ϴ�."
	dialog "������ �ʹ� ���� ���� �̵���"
	dialog "�Ͻø�, �� �� ������ ������"
	dialog "���߸� �� �ֱ� ������ ������ ����"
	dialog "������ �ϰ� �־��."
	wait
	dialog "[���]"
	dialog "�� �׷� ���� �̵���"
	dialog "��û�Ͻðھ��?"
	dialog "�Ҿ��Ͻôٸ� ���߿� ��û�ϼŵ�"
	dialog "���������."
	wait
	choose menu "���� ��û�Ѵ�." "���� ��ȸ��..." 
	case 1
		dialog "[���]"
		dialog "�׷� ���� �����ϰ� ������"
		dialog "���� �̵��� �� �帱�Կ�."
		dialog "��ø� ��ٷ��ּ���."
		wait
		wait
		wait
		wait
		wait
		dialog "[���]"
		dialog "�̾�~"
		wait
		dialog "[���]"
		dialog "�޿�...."
		dialog "���� ��ٸ�����?"
		dialog ""+PcName+"���� ������"
		dialog "'��ũ����' �� ����� �����ϰ�"
		dialog "�����̵� ���� ��Ⱦ��."
		wait
		dialog "[���]"
		dialog "�� ������ ���ø� ���� �ȳ�����"
		dialog "�ٽ� �ȳ��� �帱�״� �� �ȳ���"
		dialog "��������~"
		wait
		dialog "[���]"
		dialog "�̿��� �ּż� �����մϴ�~"
		dialog "���� �Ϸ� �Ǽ���."
		close
	break
	case 2
		dialog "[���]"
		dialog "�ƽ����� ������ �� �ٽ� ����ּ���~"
		dialog "�׷� ���� �Ϸ� �Ǽ���~"
		close
	break
	endchoose
return