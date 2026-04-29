# [Platinum III] Dvoboj - 34577

[문제 링크](https://www.acmicpc.net/problem/34577)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 중간에서 만나기

### 문제 설명

<p><em>Dvije faraonske žute linije su se pretvorile u oko...</em></p>

<p>Mladi Jusuf ima $N$ karata u svojem špilu, poredanih s lijeva na desno od $1$ do $N$. Svaka karta ima svoju snagu koju ćemo označavati s $p_i$. Jusuf se želi pripremiti za nadolazeći turnir, pa bi htio isprobati bitke između svojih karata te izmjenjivati karte u svojem špilu raznim drugim kartama koje je dobio na poklon od djeda. Ukupno će Jusuf napraviti $Q$ upita od kojih će svaki biti jednog od sljedeća dva tipa:</p>

<ul>
<li>$1$ $i$ $r$ - označava upit u kojem je Jusuf kartu na poziciji $i$ zamijenio novom kartom sa snagom $r$</li>
<li>$2$ $l$ $k$ - Jusuf će zamisliti imaginarnu bitku s $2^k$ karata, počevši od $l$-te te završivši s l$ + 2^k − 1$-tom, te zaderati se <em>Vrijeme je za dvoboj!</em>. Bitka će se odvijati u $k$ koraka. U svakom koraku, Jusuf će promatrati parove susjednih karata (prvu i drugu, treću i četvrtu itd.) te usporediti njihove snage, neka su u jednom paru to $A$ i $B$. Karta s većom snagom će pobijediti, te će njezina nova snaga iznositi $|A − B|$ (kojagod karta pobijedila). Ako su karte jednake snage, bitka će biti neizvjesna te će nasumična karta pobijediti i njezina će snaga biti $0$. Karta koja je izgubila ne sudjeluje u preostalim rundama. Primijetite da nakon $k$ ovakvih koraka, ostat će točno jedna karta. Jusufa zanima njezina snaga!</li>
</ul>

### 입력

<p>U prvom retku su prirodni brojevi $N$ i $Q$.</p>

<p>U sljedećem retku nalazi se $N$ brojeva $p_i$ ($0 ≤ p_i ≤ 10^9$) koji označavaju snage karata.</p>

<p>U sljedećih $Q$ redaka nalaze se opisi upita koji odgovaraju tekstu zadatka.</p>

<p>Za svaki upit tipa $1$ vrijedi $1 ≤ i ≤ N$ te $0 ≤ r ≤ 10^9$.</p>

<p>Za svaki upit tipa $2$ vrijedi $1 ≤ l ≤ N$ te $1 ≤ l + 2^k − 1 ≤ N$.</p>

### 출력

<p>Za svaki upit tipa 2 potrebno je ispisati snagu završne karte nakon svih k koraka.</p>

### 힌트

<p>Pojašnjenje prvog probnog primjera:</p>

<p>U prvom upitu karte će se ovako mijenjati tijekom koraka: $$(4, 8, 2, 0) → (4, 2) → (2)$$</p>

<p>U trećem upitu karte će se ovako mijenjati tijekom koraka: $$(8, 2) → (6)$$</p>