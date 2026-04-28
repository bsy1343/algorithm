# [Gold II] Hrvati - 25475

[문제 링크](https://www.acmicpc.net/problem/25475)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 14, 맞힌 사람: 13, 정답 비율: 100.000%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>Mirko je nedavno u bespućima interneta prona&scaron;ao legendu kako venama mnogo članova engleske kraljevske obitelji teče i hrvatska krv. Naime, hrvatski velikan Nikola &Scaron;ubić Zrinski je prapraprapra... pradjed kraljice Elizabete II.</p>

<p>Nakon tog saznanja, odmah se zapitao koliko je točno Hrvatica/Hrvata u engleskoj kraljevskoj obitelji te je postavio to pitanje na jednom poznatom internet forumu. Uskoro mu je stiglo $Q$ odgovora u obliku &ldquo;<em>Ja znam da je X sigurno Hrvatica/Hrvat.</em>&rdquo; Opće je poznata činjenica da kada za neku osobu znamo da je Hrvatica/Hrvat, onda znamo i da je <strong>svako njezino/njegovo dijete</strong> također Hrvatica/Hrvat.</p>

<p>Englesku kraljevsku obitelj možemo zamisliti kao <strong>povezan usmjeren graf</strong> s $N$ čvorova gdje svaki čvor predstavlja jednog člana obitelji. Veza od čvora A do čvora B postoji ako je osoba koju predstavlja čvor $A$ roditelj osobi koju predstavlja čvor $B$. Znamo da u grafu postoji točno $N-1$ takvih veza.</p>

<p>Tvoj je zadatak nakon svakog novog saznanja s foruma o tome tko je Hrvatica/Hrvat, ispisati za koliko osoba sa sigurno&scaron;ću možemo reći da su Hrvatice/Hrvati.</p>

### 입력

<p>U prvom su retku prirodni brojevi $N$ i $Q$ ($1 &le; N, Q &le; 200\,000$).</p>

<p>U sljedećih $N-1$ redaka nalaze se prirodni brojevi $A$ i $B$ ($1 &le; A &lt; B &le; N$) koji predstavljaju vezu u grafu.</p>

<p>U sljedećih $Q$ redaka nalazi se prirodan broj $X$ ($1 &le; X &le; N$), oznaka osobe za koju se sa sigurno&scaron;ću saznalo da je Hrvatica/Hrvat.</p>

### 출력

<p>Ispi&scaron;i $Q$ redaka. U $i$-ti redak ispi&scaron;i za koliko osoba sigurno znamo da su Hrvatice/Hrvati nakon $i$-tog saznanja.</p>

### 힌트

<p>Opis prvog primjera: Nakon &scaron;to smo saznali da je osoba $3$ Hrvat, samo za nju sa sigurno&scaron;ću znamo da je Hrvat. Nakon toga saznajemo da je osoba $2$ Hrvat, ali sada odmah i za njihovu djecu ($3$ i $4$) znamo da su Hrvati, a nakon &scaron;to znamo da je $4$ Hrvat, odmah znamo i da je $6$ Hrvat jer je dijete od $4$. Na kraju saznajemo i da je osoba $5$ Hrvat.</p>