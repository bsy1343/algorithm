# [Gold V] Teed - 7137

[문제 링크](https://www.acmicpc.net/problem/7137)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 15, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

그래프 이론, 그래프 탐색, 그리디 알고리즘

### 문제 설명

<p>Bytelandis on $N$ linna (t&auml;histatud $1 \ldots N$), mida &uuml;hendavad $M$ kahesuunalist maanteed. Iga kahe linna vahel on &uuml;limalt &uuml;ks tee ja iga tee otspunkid on kaks erinevat linna.</p>

<p>K&uuml;ll aga pole kindel, et need teed v&otilde;imaldavad liikuda igast linnast igasse teise. Seega jagab teedev&otilde;rk Bytelandi piirkondadeks, kus iga piirkonna sees on v&otilde;imalik teid pidi liikuda igast linnast igasse teise (v&otilde;imalik, et vahepeal ka muid linnu l&auml;bides), aga eri piirkondade linnade vahel liiklemiseks tuleb kasutada lennukeid.</p>

<p>N&uuml;&uuml;d plaanitakse Bytelandis teereformi. Ametnikud on otsustanud rajada t&auml;pselt $K$ uut teed, kuid pole teada, milliste linnade vahele uued teed ehitatakse. Niipalju on siiski kindel, et iga uue tee otspunktid on kaks erinevat linna, mille vahel veel ei ole maanteed.</p>

<p>On selge, et uute teede rajamine v&otilde;ib muuta ka riigi jaotust piirkondedeks. N&auml;iteks kui riigis on $N = 6$ linna vahel alguses $M = 2$ maanteed, vastavalt linnade $1$ ja $2$ ning linnade $3$ ja $4$ vahel, siis on riigis neli piirkonda: esimesse kuuluvad linnad $1$ ja $2$, teise linnad $3$ ja $4$, kolmandasse linn $5$ ja neljandasse linn $6$. Kui $K = 3$ uut teed rajatakse linnade $1$ ja $4$, $2$ ja $4$ ning $2$ ja $3$ vahele, v&auml;heneb regioonide arv sellega &uuml;he v&otilde;rra (endise jaotuse esimene ja teine regioon &uuml;hendatakse).</p>

<p>Kirjutada programm, mis leiab minimaalse ja maksimaalse v&otilde;imaliku regioonide arvu riigis p&auml;rast $K$ uue tee rajamist.</p>

### 입력

<p>Tekstifaili esimesel real on t&uuml;hikutega eraldatud t&auml;isarvud $N$, $M$ ja $K$ ($2 \le N \le 10^5$, $0 \le M \le 10^5$, $1 \le K \le \min(10^9, \frac{N \cdot (N - 1)}{2} - M)$), vastavalt linnade, olemasolevate teede ja rajatavate teede arv.</p>

<p>Faili j&auml;rgmisel $M$ real on iga&uuml;hel kaks t&uuml;hikuga eraldatud t&auml;isarvu $X_i$ ja $Y_i$ ($1 \le X_i, Y_i \le N$), mis n&auml;itavad, et linnade $X_i$ ja $Y_i$ vahel juba on maantee.</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada kaks t&uuml;hikuga eraldatud t&auml;isarvu, vastavalt minimaalne ja maksimaalne v&otilde;imalik piirkondade arv p&auml;rast uute teede rajamist.</p>