# [Silver I] Kocka - 25465

[문제 링크](https://www.acmicpc.net/problem/25465)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 12, 맞힌 사람: 10, 정답 비율: 52.632%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Zamisli kocku. Kocku dimenzije $N$ koja se sastoji od $N \times N \times N$ jediničnih kockica. Svaka jedinična kockica u kocki je u početku bezbojna tj. prozirna i vidi se kroz nju, a tijekom vremena na na&scaron; zahtjev cijela može promijeniti boju.</p>

<p>Zamisli da ta kocka stoji na staklenoj rotirajućoj podlozi. Znamo da kocka ima &scaron;est strana: prednju, stražnju, lijevu, desnu, gornju i donju. U početku, prednja strana kocke je okrenuta prema tebi, stoji u razini očiju i gleda&scaron; u nju. Kroz prozirne kockice vidi se sve do prve obojene kockice.</p>

<p>E sada, neka je dano $Q$ upita, a $i$-ti od njih je jednog od sljedećeg oblika:</p>

<ul>
	<li>$1$ $X_i$ $Y_i$ $Z_i$ $C_i$ - jedinična kockica koja se nalazi u $X_i$-tom redu (brojeći od gornje strane prema donjoj), $Y_i$-tom stupcu (brojeći od lijeve strane prema desnoj) i na dubini $Z_i$ (brojeći od prednje strane prema stražnjoj) poprima boju $C_i$. Pazi, kocka je okrenuta prednjom stranom prema tebi.</li>
	<li>$2$ $S_i$ - zarotiraj kocku tako da strana $S_i$ dođe na prednju stranu (ispred tvojih očiju) te ispi&scaron;i tablicu dimenzija $N \times N$ boja koje sada vidi&scaron;. Ako se na nekom mjestu u potpunosti vidi kroz kocku, za to mjesto ispi&scaron;i $0$. Vrati kocku u početni položaj, tj. da je prednja strana opet okrenuta prema tebi.</li>
</ul>

### 입력

<p>U prvom su retku prirodni brojevi $N$ i $Q$ ($2 &le; N &le; 100$, $1 &le; Q &le; 2\,000$), brojevi iz teksta zadatka.</p>

<p>U $i$-tom od sljedećih $Q$ redaka nalazi se po jedan upit prve ili druge vrste.</p>

<ul>
	<li>ako je prvi broj u upitu $1$, onda su u tom upitu jo&scaron; prirodni brojevi $X_i$ $Y_i$ $Z_i$ $C_i$ ($1 &le; X_i &le; N$, $1 &le; Y_i &le; N$, $1 &le; Z_i &le; N$, $1 &le; C_i &le; 1\,000\,000\,000$), iz teksta zadatka;</li>
	<li>ako je prvi broj u upitu $2$ onda u tom upitu jo&scaron; dolazi niz znakova $S_i$ ($S_i$ bit će jedna od sljedećih riječi: &ldquo;prednja&rdquo;, &ldquo;straznja&rdquo;, &ldquo;lijeva&rdquo;, &ldquo;desna&rdquo; i označava stranu koju treba zarotirati pred sebe, tamo gdje je do tada bila prednja), iz teksta zadatka.</li>
</ul>

### 출력

<p>Za svaki upit druge vrste ispi&scaron;i tablicu veličine $N \times N$, odgovor na taj upit.</p>

### 힌트

<p>Opis prvog probnog primjera</p>

<p>Na početku su sve kockice u kocki veličine $2 \times 2 \times 2$ bezbojne. Prvi upit: ispi&scaron;i izgled prednje strane kocke. Rotacija nije potrebna jer je ta strane već okrenuta prema nama. Kako je cijela kocka prozirna, odgovor na prvi upit je tablica $2 \times 2$ popunjena nulama.</p>

<p>Nakon toga dolaze dva upita gdje kockica u gornjem lijevom prednjem kutu poprima boju $1$, a kockica u donjem desnom stražnjem kutu boju $5$. Nakon toga dolaze dva upita od kojih prvi traži izgled kocke kada okrenemo stražnju stranu ispred nas, a drugi kada okrenemo desnu stranu ispred nas. U prvom slučaju kockica obojena bojom $1$ će se nalaziti u gornjem desnom kutu, a kockica boje $5$ u donjem lijevom. U drugom slučaju bit će isto kao i pogled od naprijed.</p>

<p>Opis drugog probnog primjera:</p>

<p>U ovom primjeru imamo kocku veličine $3 \times 3 \times 3$ te na početku mijenjamo boje svih kockica u drugom redu na dubini dva. Gledajući s lijeva, vidjet ćemo samo onu kockicu boje $1$, a gledajući s desna onu boje $3$.</p>