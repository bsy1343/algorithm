# [Gold III] Migawka - 33829

[문제 링크](https://www.acmicpc.net/problem/33829)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

해 구성하기

### 문제 설명

<p>Bajtek bawi się starym czarno-białym telewizorem, który ma ekran o wymiarach $100 \times 100$ pikseli. Może na nim wyświetlić dowolny obrazek, decydując, które piksele będą zaświecone, a które zgaszone. Jednak telewizor jest wadliwy i zazwyczaj wyświetlony obrazek nie pozostaje na nim zbyt długo.</p>

<p>Kwadrat $2 \times 2$ składający się z $4$ sąsiadujących rogiem pikseli nazwiemy złym, gdy <strong><u>dokładnie</u> dwa przeciwległe piksele</strong> są w nim zaświecone. Telewizor co sekundę zmienia stan wszystkich pikseli należących do co najmniej jednego złego kwadratu – piksele, które były zaświecone stają się zgaszone, a te które były zgaszone stają się zapalone.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33829.%E2%80%85Migawka/4a6ea193.png" data-original-src="https://boja.mercury.kr/assets/problem/33829-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 249px; height: 193px;"></p>

<p>Dla przykładu rozważmy telewizor z ekranem o rozmiarze $4 \times 4$ pikseli, którego początkowa konfiguracja została przedstawiona na rysunku po lewej stronie. Kolejne rysunki pokazują, jak będzie wyglądał ekran telewizora w kolejnych sekundach:</p>

<table class="table table-bordered td-center td-middle">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33829.%E2%80%85Migawka/be7bdfa0.png" data-original-src="https://boja.mercury.kr/assets/problem/33829-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 125px; height: 127px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33829.%E2%80%85Migawka/55bebee8.png" data-original-src="https://boja.mercury.kr/assets/problem/33829-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 125px; height: 126px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33829.%E2%80%85Migawka/f4e67e5d.png" data-original-src="https://boja.mercury.kr/assets/problem/33829-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 125px; height: 126px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33829.%E2%80%85Migawka/55bebee8.png" data-original-src="https://boja.mercury.kr/assets/problem/33829-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 125px; height: 126px;"></td>
		</tr>
		<tr>
			<td>sekunda $0$</td>
			<td>sekunda $1$</td>
			<td>sekunda $2$</td>
			<td>sekunda $3$</td>
		</tr>
	</tbody>
</table>

<p>Bajtek chce wykorzystać ten efekt, by maksymalnie wydłużyć liczbę unikalnych konfiguracji ekranu. Innymi słowy, chcemy zmaksymalizować czas, po którym jakaś konfiguracja ekranu się powtórzy. Dla przykładu powyżej widzimy, że konfiguracja z sekundy $3$ jest identyczna jak konfiguracja z sekundy $1$, zatem mamy trzy unikalne konfiguracje ekranu.</p>

<p>Twoim zadaniem jest znalezienie i wypisanie początkowej konfiguracji pikseli. Twój wynik w tym zadaniu będzie zależał od tego, po ilu sekundach jakaś konfiguracja ekranu się powtórzy.</p>

### 입력

<p>Wejście w tym zadaniu jest puste.</p>

### 출력

<p>Należy wypisać $100$ wierszy, każdy zawierający jedno słowo składające się ze $100$ znaków <code>1</code> i <code>0</code>, reprezentujących początkową konfigurację ekranu telewizora (<code>1</code> oznacza piksel zaświecony, <code>0</code> zgaszony).</p>