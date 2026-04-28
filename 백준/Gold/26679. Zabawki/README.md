# [Gold IV] Zabawki - 26679

[문제 링크](https://www.acmicpc.net/problem/26679)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 20, 맞힌 사람: 16, 정답 비율: 72.727%

### 분류

문자열, 애드 혹, 홀짝성

### 문제 설명

<p>Być może o tym nie wiesz, ale bracia Bituś i Bajtuś posiadają całkiem imponujące kolekcje zabawek! Każdy z braci posiada n zabawek, a każda jest jednego z 26 typ&oacute;w. Dla ułatwienia bracia oznaczyli zabawki każdego typu kolejnymi literami alfabetu angielskiego &ndash; od <code>a</code> do <code>z</code>.</p>

<p>Podczas dzisiejszej zabawy Bituś wyjął swoje zabawki i ułożył je w ciągu od lewej do prawej. Tak więc Bituś może opisać ułożenie swoich zabawek za pomocą ciągu n znak&oacute;w alfabetu angielskiego; i-ty znak tego ciągu wyznacza i-tą zabawkę od lewej w ciągu Bitusia. R&oacute;wnież Bajtuś wyjął swoje zabawki i ułożył je w ciągu od lewej do prawej. Teraz Bituś chciałby upodobnić się do Bajtusia &ndash; sprawić, by jego zabawki były ułożone w tej samej kolejności, co zabawki Bajtusia.</p>

<p>W trakcie zabawy Bituś może zmieniać kolejność swoich zabawek za pomocą ruch&oacute;w: każdy ruch polega na wzięciu pewnej nieparzystej liczby kolejnych zabawek i odwr&oacute;ceniu ich kolejności. Tak więc jeśli ciąg znak&oacute;w <code>abcdea</code> opisuje kolejność zabawek Bitusia, to w jednym ruchu Bituś może uzyskać na przykład kolejność <code>adcbea</code> (poprzez odwr&oacute;cenie kolejności zabawek od drugiej do czwartej) lub <code>edcbaa</code> (odwracając zabawki od pierwszej do piątej). Nie może on jednak wyprodukować w jednym ruchu kolejności bacdea.</p>

<p>Czy Bituś jest w stanie sprawić, by jego zabawki były ułożone w tej samej kolejności, co zabawki Bajtusia?</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą n (1 &le; n &le; 300 000) oznaczającą liczbę zabawek posiadanych przez Bitusia (i zarazem liczbę zabawek Bajtusia). Drugi wiersz zawiera ciąg n znak&oacute;w alfabetu angielskiego (od <code>a</code> do <code>z</code>) opisujący układ zabawek Bitusia na początku zabawy. Trzeci wiersz opisuje układ zabawek Bajtusia &ndash; w tym samym formacie co drugi wiersz.</p>

### 출력

<p>Jeśli Bituś może operacjami odwracania doprowadzić sw&oacute;j początkowy układ zabawek do układu zabawek Bajtusia, wypisz <code>TAK</code> w jedynym wierszu wyjścia. W przeciwnym razie wypisz <code>NIE</code>.</p>

### 힌트

<p>Wyjaśnienie przykład&oacute;w: W pierwszym przykładzie z początkowego układu zabawek Bitek może utworzyć docelowy układ zabawek w trzech ruchach:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26679.%E2%80%85Zabawki/9d8d9e14.png" data-original-src="https://upload.acmicpc.net/6276ae8d-981e-475b-b26c-e6c40525f19b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 167px; height: 168px;" /></p>

<p>Odpowiedź do drugiego przykładu to <code>NIE</code>, gdyż Bitek nie posiada żadnej zabawki typu <code>h</code> potrzebnej w docelowym układzie zabawek.</p>