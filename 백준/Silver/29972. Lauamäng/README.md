# [Silver I] Lauamäng - 29972

[문제 링크](https://www.acmicpc.net/problem/29972)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>Sa said hiljuti kingituseks lauam&auml;ngu, mis on nagu Tsirkus, aga ts&uuml;kliline.</p>

<p>M&auml;ngulaual on $N$ j&auml;rjestatud ruutu $1, \ldots, N$, kusjuures ruudule $N$ j&auml;rgneb ruut $1$. Igale ruudule $i$ on m&auml;rgitud mingi t&auml;isarv $a_i$. Kui $a_i = 0$, siis ruudul $i$ olles peab m&auml;ngija viskama kuuetahulist t&auml;ringut ja liikuma saadud tulemuse v&otilde;rra edasi. Kui $a_i \ne 0$, peab m&auml;ngija liikuma $a_i$ v&otilde;rra edasi (tagasi, kui $a_i$ on negatiivne); see kordub, kuni m&auml;ngija j&otilde;uab ruudule, millel on kirjas $0$ (aga on v&otilde;imalik sattuda ka l&otilde;pmatusse ts&uuml;klisse). M&auml;ng algab ruudult $1$ ja on teada, et $a_1 = 0$.</p>

<p>M&auml;ngu vaadates tekkis Sul kahtlus, et on ruute, kuhu ei olegi v&otilde;imalik kunagi sattuda. Kirjuta programm, mis leiab, milliseid ruute on v&otilde;imalik m&auml;ngu jooksul k&uuml;lastada.</p>

### 입력

<p>Tekstifaili esimesel real on m&auml;ngulaua ruutude arv $N$ ($1 \le N \le 1000$). Teisel real on $N$ t&uuml;hikutega eraldatud t&auml;isarvu $a_1, \ldots, a_N$ ($-N &lt; a_i &lt; N$, $a_1 = 0$).</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada $N$ t&uuml;hikutega eraldatud arvu $0$ v&otilde;i $1$. Positsioonil $i$ olev arv $1$ t&auml;hendab, et laua ruudule $i$ on v&otilde;imalik sattuda, ja arv $0$, et sinna ei ole v&otilde;imalik sattuda.</p>