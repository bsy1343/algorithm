# [Silver II] Erinevused - 32724

[문제 링크](https://www.acmicpc.net/problem/32724)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 34, 맞힌 사람: 26, 정답 비율: 72.222%

### 분류

사칙연산, 수학, 정렬

### 문제 설명

<p>Juku kooli reaalklassid osalesid informaatikaolümpiaadil. Nüüd analüüsib õpetaja tulemusi ja tahab muu hulgas teada, millises klassis on õpilaste tase kõige ühtlasem ja millises kõige ebaühtlasem.</p>

<p>Kahe õpilase tulemuste erinevuse leiab õpetaja, lahutades rohkem punkte saanud õpilase tulemusest vähem punkte saanud õpilase tulemuse. Klassi õpilaste taseme ebaühtluse mõõduks vaatab ta kõiki õpilaste paare, liidab kõigi paaride tulemuste erinevused ja jagab saadud summa paaride arvuga. Summa jagamine paaride arvuga on lihtne, sest see on alati üks tehe. Aga erinevuste summa arvutamine on tülikas ja Juku plaanib loovtööna selleks programmi kirjutada.</p>

<p>Juku ambitsioon on tegelikult laiem, ta tahab luua õpilasfirma ja pakkuda õpilaste tulemuste analüüsi lisaks koolidele ka linnade kaupa. Miljonilinnades on aga sadu tuhandeid õpilasi ja seetõttu peab programm olema piisavalt efektiivne ka suurte andmehulkade töötlemiseks. Aita Jukul selline programm kirjutada!</p>

### 입력

<p>Sisendi esimesel real on uuritavate õpilaste arv $N$ ($2 \le N \le 100\,000$). Teisel real on $N$ tühikutega eraldatud täisarvu $A_1, A_2, \ldots, A_N$ ($0 \le A_i \le 1\,000$): õpilaste tulemused.</p>

### 출력

<p>Ainsale reale väljastada sisendis antud tulemuste erinevuste summa.</p>