# [Platinum III] Točkice - 25459

[문제 링크](https://www.acmicpc.net/problem/25459)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 8, 맞힌 사람: 8, 정답 비율: 21.622%

### 분류

그래프 이론, 기하학, 게임 이론, 볼록 껍질, 홀짝성, 평면 그래프, 불변량 찾기, 오일러 지표 (χ=V-E+F)

### 문제 설명

<p>Ljetni kamp mladih informatičara već se godinama održava na otoku Krku. Mladi informatičari ono malo slobodnog vremena u pravilu provode kupajući se na <em>Dražici</em>, popularnoj pje&scaron;čanoj plaži, a do tamo ih prate odrasle, odgovorne osobe.</p>

<p>Alenka i Bara dvije su (ne)odgovorne osobe. Umjesto da paze na djecu, odlučile su vrijeme kratiti igrajući se u pijesku. U jednom trenutku Alenka nacrta $N$ točaka, pritom paziv&scaron;i da niti jedne tri nisu kolinearne i prozbori:</p>

<blockquote>
<p>&ldquo;Zaigrajmo igru <em>točkica</em>. Poteze ćemo vući naizmjence, a ja ću krenuti prva. U svakom ćemo potezu nacrtati dužinu koja spaja neke dvije točke, ali tako da ta dužina ne siječe niti jednu od prethodno nacrtanih dužina. Novonacrtana dužina smije neku od prethodno nacrtanih dužina dirati u krajnjoj točki. Tko napravi zadnji potez je pobjednik!.&rdquo;</p>
</blockquote>

<p>Za dani raspored točaka, odredite tko će pobijediti u igri <em>točkica</em> uz pretpostavku da obje igračice igraju optimalno.</p>

### 입력

<p>U prvom je retku prirodan broj $N$ iz teksta zadatka.</p>

<p>U $i$-tom od sljedećih $N$ redaka su dva prirodna broja $x_i$, $y_i$ ($1 &le; x_i , y_i &le; 10^6$) koji predstavljaju koordinate $i$-te točke.</p>

<p>Niti jedne tri točke neće biti kolinearne, te će svake dvije točke biti različite.</p>

### 출력

<p>U jedini redak ispi&scaron;ite <code>Alenka</code> ako će u igri pobjediti Alenka, odnosno <code>Bara</code> ako će u igri pobjediti Bara.</p>