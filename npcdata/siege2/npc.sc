npc "prt_gld" "������Ȳ�Խ���#fund01" 4_BOARD3 163 99 3 0 0
OnClick:
	dialog "5�� ���賻�� (���� ��)"
	dialog "������Ʈ ���ѿ ���: 0"
	dialog "����׽� ��ī�罺 ���: 0"
	dialog "���걼 ��Ű���� ���: 0"
	dialog "���� Unique ���: 0"
	dialog "��Ű������ �Ϲ�: 51"
	dialog "��Ű������ ���� �� �� : 51"
	close
return

npc "prt_gld" "����̼ջ�� �κ�" 4_CAT_MERMASTER 158 96 5 0 0
OnClick:
	dialog "[�κ�]"
	dialog "����̼� ��� �����׶� ��Ű������ ������ �κ��Դϴ�."
	dialog "�ɿ��� ȸ�� ����Ʈ ���ߺ�� ��ġ�� ���� ���� ����� �ð� �ֽ��ϴ�."
	dialog "������ ���� �帱���?"
	wait
	choose menu "�ɿ��� ȸ���� ��������?" "����Ʈ ������ ���� ���ڴ� ����?" "�� ������ �����ϰڽ��ϴ�." "���" 
	case 1
		
	break
	case 2
		
	break
	case 3
		dialog "[�κ�]"
		dialog "^4d4dff��Ű������^000000������ ���� �Ͻʴϱ�?"
		dialog "������ ���� ���� ��� �ش� ���� ���� ������ ����� �̸����� ���ڵ˴ϴ�."
		wait
		dialog "[�κ�]"
		dialog "���ڴ� ����(zeny)�� ����̼� ��� �������� �� ������ ���� �� �� �ֽ��ϴ�."
		dialog "� ������� ���� �Ͻðڽ��ϱ�?"
		wait
		choose menu "����(Zeny)�� ���� �Ѵ�." "����̼ջ�� ���������� ���� �Ѵ�." "���" 
		case 1
			dialog "[�κ�]"
			dialog "���Ϸ� ���� �Ͻô±���."
			dialog "�ּ� ����  1 ������ ^4d4dff10,000 zeny^000000�Դϴ�."
			dialog "�� ���� �ִ� 50 ���� ^4d4dff 500,000 zeny^000000 ���� �����մϴ�."
			wait
			choose menu "1���� 1��z" "10���� 10��z" "50���� 50��z" "���� �Է�" "���" 
			case 1
				dialog "[�κ�]"
				dialog "������ ��� �ݾ��� ������ �� �����ϴ�."
				close
			break
			case 2
				dialog "[�κ�]"
				dialog "������ ��� �ݾ��� ������ �� �����ϴ�."
				close
			break
			case 3
				dialog "[�κ�]"
				dialog "������ ��� �ݾ��� ������ �� �����ϴ�."
				close
			break
			case 4
				dialog "[�κ�]"
				dialog "���� �Ͻ� ������ �Է� �� �ּ���."
				dialog "1 ���� 200 ���̷� ���� �� �ֽø� �˴ϴ�."
				dialog "��Ҵ� 0 �Դϴ�."
				wait
				dlgwrite 1 200
				if (input == 0)
					dialog "[�κ�]"
					dialog "��� �ϼ̽��ϴ�."
					close
				endif
				if (input == error)
					dialog "[�κ�]"
					dialog "�� ���� ���� ������ ������ �Ѿ����ϴ�."
					dialog "�ٽ� �õ� �� �ֽʽÿ�."
					close
				endif
				dialog "[�κ�]"
				dialog "������ ��� �ݾ��� ������ �� �����ϴ�."
				close
			break
			case 5
				close
			break
			endchoose
		break
		case 2
			dialog "[�κ�]"
			dialog "��, ���������� ������ ���̱���."
			dialog "�� ���̳� ���� �Ͻðڽ��ϱ�?"
			wait
			choose menu "�������� 1��" "�������� 5��" "���� �Է�" "���" 
			case 1
				dialog "[�κ�]"
				dialog "�����Ͻ� �������� �����ϰ� ��ô� ���������� ���� ������ ���Դϴٸ�..."
				close
			break
			case 2
				dialog "[�κ�]"
				dialog "�����Ͻ� �������� �����ϰ� ��ô� ���������� ���� ������ ���Դϴٸ�..."
				close
			break
			case 3
				dialog "[�κ�]"
				dialog "������ ���������� ������ �Է� �� �ֽʽÿ�."
				dialog "1 ���� 20 ���̷� ���� �� �ֽø� �˴ϴ�."
				dialog "��Ҵ� 0 �Դϴ�."
				wait
				dlgwrite 1 20
				if (input == 0)
					dialog "[�κ�]"
					dialog "��� �ϼ̽��ϴ�."
					close
				endif
				if (input == error)
					dialog "[�κ�]"
					dialog "�� ���� ���� ������ ������ �Ѿ����ϴ�."
					dialog "�ٽ� �õ� �� �ֽʽÿ�."
					close
				endif
				dialog "[�κ�]"
				dialog "�����Ͻ� �������� �����ϰ� ��ô� ���������� ���� ������ ���Դϴٸ�..."
				close
			break
			case 4
				close
			break
			endchoose
		break
		case 3
			dialog "[�κ�]"
			dialog "����ϼ̽��ϴ�."
			close
		break
		endchoose
	break
	case 4
		
	break
	endchoose
return

npc "prt_gld" "����Ʈ ������#prt_f00" 4_M_BOSSCAT 161 96 3 0 0
OnClick:
	dialog "[�Ƹ�����]"
	dialog "���� ���� �� ���� ����Ʈ�� �����ϴ�."
	close
return