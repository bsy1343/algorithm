# [Platinum I] Bojanje stabla - 28587

[문제 링크](https://www.acmicpc.net/problem/28587)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 20, 맞힌 사람: 19, 정답 비율: 50.000%

### 분류

자료 구조, Heavy-light 분할, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 트리

### 문제 설명

<p>Zadano je stablo od $N$ čvorova označenih prirodnim brojevima od $1$ do $N$. Svaki čvor ima pridruženu neku vrijednost. Na početku su vrijednosti svih čvorova jednake nuli. Mirko je odlučio nekoliko puta promijeniti vrijednosti nekih čvorova. Preciznije, u i-tom mijenjanju, postavit će vrijednosti svih čvorova na putu od $a_i$ do $b_i$ na $i$. Njegov znatiželjni prijatelj Slavko će ga povremeno upitati koja je trenutno vrijednost pridružena određenom čvoru. Pomozi Mirku odgovoriti na Slavkova pitanja.</p>

### 입력

<p>U prvom retku je prirodni broj $N$, broj iz teksta zadatka.</p>

<p>U sljedećih $N-1$ redaka su po $2$ prirodna broja $a$ i $b$, parovi čvorova zadanog stabla koji su spojeni bridom.</p>

<p>Nakon toga se u zasebnom retku nalazi prirodni broj $M$ koji je jednak zbroju broja Mirkovih mijenjanja i Slavkovih pitanja. Svaki od sljedećih $M$ redaka je jednog od dva oblika:</p>

<ul>
	<li>$1$ $a_i$ $b_i$ &ndash; Mirkova promjena: Ako je ovo $i$-to mijenjanje čvorova, postavi vrijednosti svih čvorova na putu od $a_i$ do $b_i$ na $i$.</li>
	<li>$2$ $x$ &ndash; Slavkovo pitanje: Koja je trenutna vrijednost čvora s oznakom $x$?</li>
</ul>

### 출력

<p>Redom, u zasebnim retcima odgovori na Slavkova pitanja.</p>

### 힌트

<p>Opis trećeg probnog primjera:</p>

<p>Na početku su sve vrijednosti čvorova nula.</p>

<ol>
	<li>Slavko pita koja je vrijednost čvora $5$. Nula.</li>
	<li>Opet pita isto pitanje. Naravno, nula.</li>
	<li>Sad pita za čvor $3$. Ponovno nula.</li>
	<li>Budući da je ovo prvo Mirkovo mijenjanje, postavlja vrijednosti čvorova na putu od $2$ do $3$, tj. vrijednosti čvorova $2$, $1$ i $3$ na jedan.</li>
	<li>Slavko pita za vrijednost čvora $2$. Jedan.</li>
	<li>Budući da mu je ovo drugo mijenjanje, Mirko sad postavlja vrijednosti čvorova na putu od čvora $3$ do čvora $4$ na dva.</li>
	<li>Slavko pita koja je vrijednost čvora $3$. Upravo je postavljena na dva.</li>
	<li>Sad pita koja je vrijednost čvora $1$. Jedan.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28587.%E2%80%85Bojanje%E2%80%85stabla/d5286dd2.png" data-original-src="https://upload.acmicpc.net/f938705b-4300-4e96-9f6c-061821fae8af/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 251px; height: 158px;" /></p>