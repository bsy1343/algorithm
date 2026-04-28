# [Gold II] Kuklite jagamine - 29924

[문제 링크](https://www.acmicpc.net/problem/29924)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 10, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

이분 탐색, 누적 합, 두 포인터

### 문제 설명

<p>Laual seisavad reas $N$ karpi. Karbid on nummerdatud vasakult paremale $1 \ldots N$. Karbis number $i$ on $K_i$ vastlakuklit. J&uuml;ri ja Mari tahavad jagada karbid kaheks nii, et J&uuml;ri saaks $N_1$ vasakpoolset ja $N_2$ parempoolset karpi ning Mari k&otilde;ik &uuml;lej&auml;&auml;nud. Aita neil karbid jagada nii, et nad saaks v&otilde;imalikult v&otilde;rdselt kukleid!</p>

### 입력

<p>Tekstifaili esimesel real on karpide arv $N$ ($1 \le N \le 100\,000$). J&auml;rgmisel $N$ real on iga&uuml;hel &uuml;ks t&auml;isarv $K_i$: karbis number $i$ olevate kuklite arv ($1 \le i \le N$, $0 \le K_i \le 10\,000$).</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada kaks t&uuml;hikuga eraldatud t&auml;isarvu $N_1$ ja $N_2$, mis t&auml;hendavad, et kui J&uuml;rile anda $N_1$ vasakpoolset ja $N_2$ parempoolset karpi ning Marile k&otilde;ik &uuml;lej&auml;&auml;nud karbid, siis on nende saadud kuklite arvude vahe absoluutv&auml;&auml;rtus v&otilde;imalikult v&auml;ike. Kui v&otilde;rdselt h&auml;id vastuseid on mitu, siis v&auml;ljastada &uuml;ksk&otilde;ik milline neist.</p>