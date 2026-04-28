# [Platinum II] Transpordikulud - 29968

[문제 링크](https://www.acmicpc.net/problem/29968)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

수학, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>Bitlandis on $N$ linna, mis on t&auml;histatud arvudega $1$ kuni $N$. Linnad on omavahel &uuml;hendatud $N - 1$ kahesuunalise teega. Iga tee pikkus on &uuml;ks &uuml;hik ja tekkinud teedev&otilde;rk on sidus (igast linnast saab liikuda igasse teise linna).</p>

<p>Bitlandi $K$ suurimat linna soovivad korraldada oma &otilde;pilastele programmeerimisv&otilde;istluse. Nad tahavad korraldada v&otilde;istluse linnas, mis minimeerib &otilde;pilaste transpordikulud. V&otilde;istlus v&otilde;ib aset leida &uuml;ksk&otilde;ik missuguses Bitlandi linnas.</p>

<p>&Otilde;pilaste transportimine linnast $u$ linna $v$ maksab $x^2$ eurot, kus $x$ on $u$ ja $v$ vaheline kaugus. Leia minimaalne v&otilde;imalik transpordikulu.</p>

### 입력

<p>Tekstifaili esimesel real on kaks t&auml;isarvu, linnade arv $N$ ($1 \le N \le 5 \cdot 10^5$) ja v&otilde;istlusel osalevate linnade arv $K$ ($1 \le K \le N$). J&auml;rgmisel $N - 1$ real on iga&uuml;hel kaks t&auml;isarvu $u$ ja $v$, mis n&auml;itavad, et linnade $u$ ja $v$ vahel on tee. Viimasel real on $K$ suurima linna t&auml;hised.</p>

### 출력

<p>Tekstifaili v&auml;ljastada minimaalne transpordikulude summa eurodes.</p>