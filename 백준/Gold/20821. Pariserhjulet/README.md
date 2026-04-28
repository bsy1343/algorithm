# [Gold IV] Pariserhjulet - 20821

[문제 링크](https://www.acmicpc.net/problem/20821)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 9, 맞힌 사람: 9, 정답 비율: 60.000%

### 분류

구현, 자료 구조, 시뮬레이션, 우선순위 큐

### 문제 설명

<p>Efter att ha f&ouml;ljt en mycket v&auml;loptimerad rutt genom flygplatsen &auml;r det svenska laget &auml;ntligen framme vid IOI i Singapore. Under den f&ouml;rsta exkursionen f&aring;r alla $N$ lag p&aring; IOI &aring;ka i det j&auml;ttestora pariserhjulet Singapore Flyer. Pariserhjulet har $M$ stycken vagnar och det tar &auml;ven $M$ minuter f&ouml;r hjulet att snurra ett varv (det tar allts&aring; 1 minut f&ouml;r varje vagn att flyttas ett steg).</p>

<p>Vissa lag verkar vara mer intresserade av att &aring;ka pariserhjul &auml;n andra, och d&auml;rf&ouml;r f&aring;r varje lag best&auml;mma exakt hur m&aring;nga varv de vill &aring;ka. Det blir tr&aring;kigt f&ouml;r deltagarna om de m&aring;ste g&aring; av och sedan p&aring; igen innan de har &aring;kt alla sina varv. Det har d&auml;rf&ouml;r best&auml;mts att n&auml;r ett lag v&auml;l har satt sig i en vagn, s&aring; f&aring;r detta lag sitta kvar i vagnen fram till att de har &aring;kt alla sina varv. Detta betyder att om hjulet snurrar s&aring; att en vagn kommer ner till ing&aring;ngen, men det redan sitter ett lag i vagnen som vill forts&auml;tta &aring;ka, s&aring; kan n&auml;sta lag inte g&aring; in i vagnen. Detta lag m&aring;ste d&aring; v&auml;nta p&aring; en tom vagn eller en vagn med ett lag som g&aring;r av.</p>

<p>Lagen &auml;r v&auml;ldigt effektiva p&aring; att g&aring; in och ut ur vagnarna, s&aring; det tar ingen extra tid att byta lag i den nedersta vagnen.</p>

<p>Alla lag st&aring;r just nu i k&ouml; framf&ouml;r pariserhjulet, och det svenska laget undrar hur l&aring;ng tid det kommer ta innan alla har &aring;kt.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller heltalen $N$ och $M$ separerade med blanksteg, antalet lag och antalet vagnar i pariserhjulet. Den andra raden inneh&aring;ller $N$ heltal $T_1 ... T_N$ separerade med blanksteg, d&auml;r $T_i$ &auml;r antalet varv lag nummer $i$ vill &aring;ka. Lagen &auml;r ordnade efter k&ouml;plats, d&auml;r $T_1$ &auml;r det f&ouml;rsta laget i k&ouml;n.</p>

### 출력

<p>Skriv ut en rad med ett heltal, antalet minuter det kommer ta f&ouml;r alla lag att &aring;ka.</p>

### 제한

<ul>
	<li>$1 \le N, M \le 200000$</li>
	<li>$1 \le T_i&nbsp;\le 10^9$</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20821.%E2%80%85Pariserhjulet/40d5b2fa.png" data-original-src="https://upload.acmicpc.net/18b3732d-945f-46e3-a5ce-c2ef6e98799f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 254px;" /></p>

<p style="text-align: center;">Figure 1: Exempelfall 1</p>

<p>I exempelfall 1 finns det 4 lag och 3 vagnar. Lagen, som i bilden &auml;r Sverige, Norge, Finland och Danmark, vill &aring;ka 2, 2, 1 och 1 varv respektive. Notera att det danska laget inte kan g&aring; in i pariserhjulet vid $t=3$ eller $t=4$ eftersom det svenska / norska laget redan sitter i den nedersta vagnen och vill i b&aring;da fallen &aring;ka ett varv till.</p>