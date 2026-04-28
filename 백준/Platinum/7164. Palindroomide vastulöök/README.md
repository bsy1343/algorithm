# [Platinum II] Palindroomide vastulöök - 7164

[문제 링크](https://www.acmicpc.net/problem/7164)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 6, 맞힌 사람: 5, 정답 비율: 38.462%

### 분류

수학, 다이나믹 프로그래밍, 문자열, 조합론

### 문제 설명

<p>Palindroomid on programmeerimisv&otilde;istlustel l&auml;bi aegade korduv teema, kuid enamasti on nendega seotud &uuml;lesanded olnud k&uuml;llaltki lihtsad ja palindroomid tunnevad end sellep&auml;rast halvasti. Seet&otilde;ttu otsustati Palindroomide Maailmakongressil, et palindroomide j&otilde;ud tuleb &uuml;hendada ning v&otilde;istlusprogrammeerijatele koht k&auml;tte n&auml;idata.</p>

<p>Palindroomid on kavalad ja peidavad ennast sageli s&otilde;nedesse &auml;ra. S&otilde;ne sisse peitmine t&auml;hendab, et kui me kustutame s&otilde;nest mingi hulga m&auml;rke ja alles j&auml;&auml;nud m&auml;rgid moodustavad palindroomi, siis oligi see palindroom s&otilde;nes peidus. N&auml;iteks s&otilde;nes &#39;<code>banaan</code>&#39; peidavad end palindroomid &#39;<code>aaa</code>&#39;, &#39;<code>naan</code>&#39;, &#39;<code>nan</code>&#39;, &#39;<code>b</code>&#39; j.n.e.</p>

<p>S&otilde;ne igal m&auml;rgil on palindroomiline j&otilde;ud. See j&otilde;ud v&otilde;rdub m&auml;rgi j&auml;rjenumbri (alustame loendamist &uuml;hest) ja sellel m&auml;rgil end peitvate palindroomide arvu korrutisega. N&auml;iteks s&otilde;ne &#39;<code>aaba</code>&#39; nelja m&auml;rgi palindroomiline j&otilde;ud on vastavalt $1 \cdot 5 = 5$, $2 \cdot 5 = 10$, $3 \cdot 3 = 9$ ja $4 \cdot 6 = 24$. Selgitus, miks esimese m&auml;rgi palindroomiline j&otilde;ud on $5$: s&otilde;nest erinevaid m&auml;rgikombinatsioone kustutades saame 8 v&otilde;imalust, mis sisaldavad selle esimest m&auml;rki, neist omakorda 5 t&uuml;kki on palindroomid (m&auml;rgitud t&auml;rniga): &#39;<code>a...</code>&#39;*, &#39;<code>a..a</code>&#39;*, &#39;<code>a.b.</code>&#39;, &#39;<code>a.ba</code>&#39;*, &#39;<code>aa..</code>&#39;*, &#39;<code>aa.a</code>&#39;*, &#39;<code>aab.</code>&#39;, &#39;<code>aaba</code>&#39;.</p>

<p>J&otilde;udude &uuml;hendamise all pidasid palindroomid silmas, et nad panevad k&otilde;ik oma bitid kokku ja on siis &uuml;litugevad. Palindroomid ei arvestanud aga kahe asjaoluga.</p>

<p>Esiteks piirab nende j&otilde;udu programmeerimisv&otilde;istluste loodusseadus nimega Maagiline Moodul. Nagu k&otilde;ik teavad, on Maagilise Mooduli v&auml;&auml;rtuseks $1\,000\,000\,007$. S&otilde;ne iga koha palindroomilise j&otilde;u leidmisel tuleb tegelikult leida esialgse j&otilde;u j&auml;&auml;k Maagilise Mooduliga jagades.</p>

<p>Teiseks annihileeruvad j&otilde;udude bitid omavahel, mist&otilde;ttu ei saa nad kokku mitte j&otilde;udude summa, vaid $\text{XOR}$-tehte tulemuse. S&otilde;ne k&otilde;igi m&auml;rkide palindroomiliste j&otilde;udude $\text{XOR}$i tulemust nimetatakse s&otilde;ne palindroomiliseks j&otilde;uks.</p>

### 입력

<p>Tekstifaili esimesel real on s&otilde;ne pikkus $N$ ($1 \le N \le 3\,000$) ja teisel real $N$ v&auml;ikesest ladina t&auml;hest (&#39;<code>a</code>&#39;\ldots&#39;<code>z</code>&#39;) koosnev s&otilde;ne.</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada sisendis antud s&otilde;ne palindroomiline j&otilde;ud.</p>