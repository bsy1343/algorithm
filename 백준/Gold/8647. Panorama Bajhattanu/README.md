# [Gold I] Panorama Bajhattanu - 8647

[문제 링크](https://www.acmicpc.net/problem/8647)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 17, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

그리디 알고리즘, 누적 합, 정렬

### 문제 설명

<p>Bajtłomieja czeka pierwsza w życiu podr&oacute;ż za ocean, do Stan&oacute;w Zjednoczonych Bajtocji. Bardzo chce zobaczyć Bajhattan, dzielnicę jednego z tamtejszych ogromnych miast. Na Bajhattanie znajduje się mn&oacute;stwo wysokich wieżowc&oacute;w. Znana jest jego panorama, czyli widok na budynki z oddali.</p>

<p>Bajhattan składa się z <em>n</em>&nbsp;&times; <em>m</em>&nbsp;kwartał&oacute;w. Każdy kwartał jest albo pusty, albo zajęty przez dokładnie jeden wieżowiec o pewnej wysokości. Dla uproszczenia, puste kwartały utożsamiamy z kwartałami zajętymi przez wieżowce o wysokości <em>0</em>. Pomijamy r&oacute;wnież ulice pomiędzy kwartałami. Przykładowo, dla <em>n</em> = 3, <em>m</em> = 4&nbsp;oraz wysokości wieżowc&oacute;w jak w tabelce (widok z lotu ptaka, p&oacute;łnoc na g&oacute;rze tabelki)</p>

<table class="table table-bordered" style="width: 20%;">
	<tbody>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">3</td>
		</tr>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">2</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">1</td>
		</tr>
	</tbody>
</table>

<p>Bajhattan wygląda jak na rysunku poniżej:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8647.%E2%80%85Panorama%E2%80%85Bajhattanu/13e1c92d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8647.%E2%80%85Panorama%E2%80%85Bajhattanu/13e1c92d.png" data-original-src="https://upload.acmicpc.net/64db7839-b397-4d3c-8ebd-7c4c0df277b5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 137px; height: 142px;" /></p>

<p>Bajtłomiej widział Bajhattan tylko na zdjęciach. Najbardziej znane są dwie panoramy, zachodnia oraz południowa. W przykładzie, w panoramie zachodniej wybijają się wieżowce o wysokościach 3, 2 oraz 2, a w panoramie południowej wieżowce o wysokościach 2, 2, 1 oraz 3. Zdjęcia były robione z dosyć daleka, więc widoczne są na nich jedynie zarysy budynk&oacute;w.</p>

<p>Dla układu wieżowc&oacute;w z przykładu, panorama zachodnia wygląda następująco:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8647.%E2%80%85Panorama%E2%80%85Bajhattanu/60fe6946.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8647.%E2%80%85Panorama%E2%80%85Bajhattanu/60fe6946.png" data-original-src="https://upload.acmicpc.net/7569ebe0-c81c-491e-aedb-533e11c6d0cc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 70px; height: 43px;" /></p>

<p>A oto panorama południowa:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8647.%E2%80%85Panorama%E2%80%85Bajhattanu/0224b28d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8647.%E2%80%85Panorama%E2%80%85Bajhattanu/0224b28d.png" data-original-src="https://upload.acmicpc.net/66d3192a-3ab7-470d-88e0-f2219632a79d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 84px; height: 43px;" /></p>

<p>Bajtłomiej chciałby ustalić na podstawie zdjęć, jak duże są wieżowce na Bajhattanie. Chciałby oszacować ich&nbsp;<i>objętość</i>&nbsp;(kubaturę).</p>

<p>Pom&oacute;ż mu i powiedz, jaka jest maksymalna możliwa kubatura wszystkich wieżowc&oacute;w Bajhattanu. W przykładzie, kubatura wszystkich wieżowc&oacute;w wynosi 14, ale jeśli ich układ byłby nieco inny (ale panoramy wciąż takie same), kubatura mogłaby wynieść aż 22.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite <em>n</em>&nbsp;oraz <em>m</em>&nbsp;(1 &le; <em>n</em>, <em>m</em> &le; 1 000 000). Kolejny wiersz zawiera <em>n</em>&nbsp;liczb całkowitych <em>z<sub>i</sub></em>&nbsp;(1 &le; <em>i</em> &le; <em>n</em>), określających wysokości kolejnych wieżowc&oacute;w w panoramie zachodniej, począwszy od wieżowca najbardziej wysuniętego na p&oacute;łnoc. Trzeci wiersz zawiera <em>m</em>&nbsp;liczb całkowitych <em>p<sub>j</sub></em>&nbsp;(1 &le; <em>j</em> &le; <em>m</em>), określających wysokości kolejnych wieżowc&oacute;w w panoramie południowej, począwszy od wieżowca najbardziej wysuniętego na zach&oacute;d. Możesz założyć, że 0 &le; <em>z<sub>i</sub></em>, <em>p<sub>j</sub></em> &le; 1 000 000.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście maksymalną możliwą kubaturę Bajhattanu. Jeśli Bajtłomiej pomylił się (na przykład biorąc jedną panoramę Bajhattanu i jedną San Bajcisko, kt&oacute;re r&oacute;wnież odwiedza) i zdjęcia nie mogą przedstawiać tego samego miasta, wypisz jedno słowo&nbsp;<code>NIE</code>.</p>