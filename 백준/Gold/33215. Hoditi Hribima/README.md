# [Gold I] Hoditi Hribima - 33215

[문제 링크](https://www.acmicpc.net/problem/33215)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

그래프 이론, 데이크스트라, 방향 비순환 그래프, 최단 경로

### 문제 설명

<p>Marin i Vedran vode tim izviđača u višednevnom putovanju kroz Sloveniju. Na njihovim mapama nalaze se $N$ sela označenih brojevima od $1$ do $N$. Među njima su i početno selo $s$ i ciljano selo $t$.</p>

<p>Svaki od njih se samostalno pripremio za ovo putovanje pa ima svoju mapu staza koje povezuju sela. Obje mape možemo predstaviti kao neusmjereni težinski graf te za obje mape vrijedi da je iz svakog sela moguće doći do svakog drugog sela.</p>

<p>Organizirali su se tako da danju Marin tim povede jednom stazom iz svoje mape, dok navečer Vedran vodi tim jednom stazom iz svoje mape te se tako ponavlja iz dana u dan sve dok u nekom trenutku tim ne dođe do ciljanog sela $t$ (bez obzira na to koji je od njih vodio u tom trenutku).</p>

<p>Obojica se savjetuju o tome koju stazu odabrati s Ivanom koji im zapravo želi napakostiti, ali oni to ne znaju.</p>

<p>Prije svakog odabira Marin, odnosno Vedran se savjetuju s Ivanom te im on preporuči neku stazu. Kako ne bi ništa posumnjali staza koju odabire Ivan bit će takva da vrijedi da se udaljenost do ciljanog sela $t$ nakon prolaska stazom <strong>strogo smanji</strong> (kada bi udaljenost računali samo s mapom od osobe koja vodi tim u trenutku).</p>

<p>Pomozite Ivanu izračunati kolika je najveća moguća udaljenost kojom on može voditi tim do ciljanog sela $t$, tako da nitko ništa ne posumnja ili odgonetnite da Ivan tim može po Sloveniji voditi zauvijek.</p>

<p>Ekspedicija počinje po danu iz sela $s$, odnosno Marin je taj koji prvi vodi stazom.</p>

### 입력

<p>U prvom su retku brojevi $N$, $s$ i $t$ ($2 ≤ N ≤ 1000$, $1 ≤ s, t ≤ N$).</p>

<p>Slijede dva bloka koja opisuju prvo Marinovu pa Vedranovu mapu. U prvom retku bloka nalazi se broj $M$ ($N - 1 ≤ M ≤ 10^5$), broj staza u mapi. U sljedećih $M$ redaka nalaze se tri prirodna broja $u$, $v$ i $w$ ($1 ≤ u, v ≤ N$, $1 ≤ w ≤ 10^6$) koji označavaju da u pripadajućoj mapi postoji staza duljine $w$ između $u$ i $v$.</p>

### 출력

<p>U prvom retku ispišite traženu maksimalnu duljinu rute ili <code>-1</code> ako je Ivanu tim moguće rutirati u nedogled.</p>

### 힌트

<p>Pojašnjenje prvog probnog primjera: Prvog dana po danu Ivan će Marnina navesti u iz početnog grada $1$ u grad $4$. Navečer će Ivan Vedranu odabrati stazu između $4$ i $2$. Drugog dana, Ivan Marina navodi iz grada $2$ u grad $3$, a zatim Vedrana iz grada $3$ u grad $2$. Svaki idući dan može učiniti isto pa je moguće rutirati u nedogled.</p>

<p>Na prvoj slici je Marinova mapa, na drugoj Vedrana, a na trećoj je plan kojim ih vodi Ivan.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33215.%E2%80%85Hoditi%E2%80%85Hribima/d2ab1bcc.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33215-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 444px; height: 126px;"></p>