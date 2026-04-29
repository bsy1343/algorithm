# [Gold IV] Noorim algkoosseis - 32698

[문제 링크](https://www.acmicpc.net/problem/32698)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

누적 합, 매개 변수 탐색, 이분 탐색

### 문제 설명

<p>Ühes klubis on $N$ jalgpallurit särginumbritega $0, \ldots, N-1$ ja mängija number $i$ vanus on $V_i$.</p>

<p>Klubi peatreener teeb järgmiseks mänguks valmistudes $Q$ plaani, neist igaühe puhul valib ta mängijate $L$ kuni $R$ hulgast välja $11$ noorimat, et nad algkoosseisu panna.</p>

<p>Kirjutada programm, mis leiab iga plaani kohta algkooseisu vanima mängija vanuse.</p>

### 입력

<p>Esimesel real on arvud $N$ ja $Q$ ($11 \le N \le 2 \cdot 10^5$, $1 \le Q \le 3 \cdot 10^5$): vastavalt mängijate arv klubis ja treeneri tehtud plaanide arv.</p>

<p>Teisel real on $N$ täisarvu $V_0, V_1, \ldots, V_{N-1}$ ($16 \le V_i \le 56$): mängijate vanused.</p>

<p>Järgmisel $Q$ real on igaühel kaks täisarvu $L$ ja $R$ ($0 \le L \le R \le N-1$, $R-L+1 \ge 11$), mis tähendavad, et treener arvestab selles plaanis vaid mängijaid särginumbritega $L$ kuni $R$. Plaanid on nummerdatud $1$ kuni $Q$ nende sisendis loetlemise järjekorras.</p>

### 출력

<p>Väljastada täpselt $Q$ rida. Reale number $i$ väljastada plaani $i$ algkooseisu vanima mängija vanus.</p>