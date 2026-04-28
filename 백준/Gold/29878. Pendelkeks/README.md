# [Gold IV] Pendelkeks - 29878

[문제 링크](https://www.acmicpc.net/problem/29878)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 13, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Pendel-keksum&auml;ngu m&auml;ngitakse ruutude real, kus stardiruut on t&auml;histatud arvuga $0$, sellest paremal on ruudud $1, 2, 3, \ldots$ ja vasakul ruudud $-1, -2, -3, \ldots$. M&auml;ngijale on ette antud h&uuml;pete arv $N$ ja h&uuml;pete pikkused $L_1, L_2, \ldots, L_N$. M&auml;ngija peab tegema esimese h&uuml;ppe paremale ja edasi vaheldumisi vasakule ja paremale. Iga h&uuml;ppe pikkuseks valib ta pikkuste loendi sellise liikme, mida ta pole veel kasutanud. Leida, millistel ruutudel v&otilde;ib $N$-h&uuml;ppeline seeria l&otilde;ppeda.</p>

### 입력

<p>Esimesel real on h&uuml;pete arv $N$ ($1 \le N \le 80$), teisel real t&uuml;hikutega eraldatuna h&uuml;pete pikkused $L_1, L_2, \ldots, L_N$ ($0 \le L_i \le 2\,000$, kus m&otilde;ned v&auml;&auml;rtused v&otilde;ivad olla ka omavahel v&otilde;rdsed).</p>

### 출력

<p>Ainsale reale kirjutada kasvavas j&auml;rjekorras nende ruutude numbrid, millel v&otilde;ib h&uuml;pete seeria l&otilde;ppeda.</p>