# [Platinum II] Gospodar Gljiva - 20322

[문제 링크](https://www.acmicpc.net/problem/20322)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

조합론, 수학

### 문제 설명

<p>Gospodin Malnar odlučio je ove godine organizirati novogodi&scaron;nju proslavu na koju će pozvati svojih n najboljih prijatelja. Budući da se radi o <strong>najluđoj noći</strong> u godini, svakom će prijatelju pokloniti jednu gljivu pomoću koje će taj prijatelj naručenu pizzu margheritu pretvoriti u capricciosu.</p>

<p>Gospodin Malnar inače posjeduje beskonačno mnogo gljiva, a svaku je od njih označio različitim nenegativnim cijelim brojem. Prije početka same zabave, gljive će staviti u vreću iz koje će svaki gost izvući svoju gljivu. Nažalost, nije uspio nabaviti dovoljno veliku vreću u koju bi stale sve gljive i sada nikako ne može odrediti koje će gljive staviti u vreću. Nakon &scaron;to je jo&scaron; malo razmislio, donio je sljedeću odluku:</p>

<ul>
	<li>Prije početka zabave u vreći će se nalaziti točno n gljiva.</li>
	<li>Ako se u vreći nalazi gljiva s oznakom x &gt; 0, tada se u vreći mora nalaziti i gljiva s oznakom &lfloor;(x&minus;1)/k&rfloor;.</li>
</ul>

<p>Pomozite gospodinu Malnaru i odredite na koliko različitih načina može pripremiti vreću gljiva za novogodi&scaron;nju zabavu.</p>

<p><strong>Napomena</strong>: Budući da traženi broj načina može biti vrlo velik, potrebno je samo ispisati njegov ostatak pri djeljenju s 10<sup>9</sup> + 7.</p>

### 입력

<p>U prvom su retku prirodni brojevi n (2 &le; n &le; 1 000 000) i k (1 &le; k &le; 1 000 000).</p>

### 출력

<p>U prvom retku ispi&scaron;ite traženi broj načina modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p><strong>Poja&scaron;njenje prvog probnog primjera</strong>: moguće vreće su {0, 1, 2}, {0, 1, 3}, {0, 1, 4}, {0, 2, 5} i {0, 2, 6}</p>