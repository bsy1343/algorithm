# [Platinum V] Marinada - 25478

[문제 링크](https://www.acmicpc.net/problem/25478)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 21, 맞힌 사람: 17, 정답 비율: 58.621%

### 분류

너비 우선 탐색, 비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 외판원 순회 문제

### 문제 설명

<p>Da bi spoznao kako se pravi marinada<sup>1</sup> za mladu janjetinu, Kre&scaron;o mora proći kroz magični labirint. Labirint se sastoji od zidova, praznog prostora i namirnica od kojih se pravi marinada.</p>

<p>Točnije, labirint možemo prikazati kao matricu s $N \times M$ polja. Neka su polja zid (znak &lsquo;<code>#</code>&rsquo;), neka su prazan prostor (znak &lsquo;<code>.</code>&rsquo;), neka su namirnice (znak &lsquo;<code>N</code>&rsquo;), jedno polje je ulaz (znak &lsquo;<code>U</code>&rsquo;), a jedno izlaz (znak &lsquo;<code>I</code>&rsquo;). Polja na kojima su namirnice ima $K$. Kre&scaron;o se po labirintu kreće od ulaza do izlaza, a jedina polja kojima se ne smije kretati su zidovi. Sva polja osim zidova smije posjetiti koliko god puta želi. U jednom koraku, Kre&scaron;o s polja na kojem se nalazi može otići na neko polje njemu susjedno gore, dolje, lijevo ili desno.</p>

<p>Napi&scaron;i program koji će za tako opisan labirint ispisati <strong>najmanji broj koraka</strong> potreban da Kre&scaron;o dođe od ulaza do izlaza, a da pritom pokupi sve namirnice za slavnu marinadu.</p>

<p><em>I onda zapeče komad mlade janjetine za autore ovog zadatka.</em></p>

### 입력

<p>U prvom retku su prirodni brojevi $N$, $M$ ($1 &le; N, M &le; 1000$) i $K$ ($1 &le; K &le; 16$).</p>

<p>U sljedećih $N$ redaka je po $M$ znakova iz skupa {<code>#</code> <code>.</code> <code>N</code> <code>U</code> <code>I</code>}. Znak &lsquo;<code>N</code>&rsquo; pojavit će se ukupno K puta.</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i traženi najmanji broj koraka iz teksta zadatka.</p>