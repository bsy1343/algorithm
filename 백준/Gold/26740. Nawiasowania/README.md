# [Gold III] Nawiasowania - 26740

[문제 링크](https://www.acmicpc.net/problem/26740)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

조합론, 해 구성하기, 그리디 알고리즘, 수학, 정수론

### 문제 설명

<p>Poprawnym nawiasowaniem nazywamy napis, kt&oacute;ry może powstać z wyrażenia arytmetycznego przez usunięcie wszystkiego poza znakami nawias&oacute;w. Na przykład napis <code>()(())</code> jest poprawnym nawiasowaniem, ponieważ m&oacute;gł powstać na przykład z wyrażenia <code>(2 + 2) * (1 + (2 + 3) * 4)</code>.</p>

<p>Bajtosia jest wielką fanką wszelkich nawiasowań. Ostatnio wymyśliła zadanie, w kt&oacute;rym dla danego ciągu nawias&oacute;w (niekoniecznie będącego poprawnym nawiasowaniem), należy wyznaczyć ile niepustych sp&oacute;jnych fragment&oacute;w tego ciągu jest poprawnymi nawiasowaniami. Przypomnijmy tutaj, że sp&oacute;jnym fragmentem ciągu nazywamy każdy fragment, kt&oacute;ry powstaje poprzez usunięcie pewnej liczby znak&oacute;w (być może zera) z początku i końca tego ciągu.</p>

<p>Dla przykładu, jeżeli rozważymy ciąg <code>()())</code>, to ma on 15 niepustych sp&oacute;jnych fragment&oacute;w (wypisanych poniżej), z czego jedynie 3 z nich są poprawnymi nawiasowaniami (oznaczone zielonym kolorem).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26740.%E2%80%85Nawiasowania/ea4857ad.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26740.%E2%80%85Nawiasowania/ea4857ad.png" data-original-src="https://upload.acmicpc.net/ca0ec9f3-d30d-453b-a43b-5750f9bceef2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 290px; height: 159px;" /></p>

<p>Bajtosia zastanawia się, czy istnieje taki ciąg nawias&oacute;w, dla kt&oacute;rego liczba sp&oacute;jnych fragment&oacute;w będących poprawnymi nawiasowaniami wynosi dokładnie N. Czy jesteś w stanie pom&oacute;c jej wygenerować taki ciąg nawias&oacute;w? Ciąg ten nie powinien być zbyt długi &ndash; jego długość nie powinna przekraczać 100 000 znak&oacute;w.</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 10<sup>9</sup>) określająca oczekiwaną przez Bajtosię liczbę sposob&oacute;w wybrania poprawnego nawiasowania.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinien się znaleźć niepusty ciąg znak&oacute;w <code>(</code> oraz <code>)</code> odpowiadający wymaganiom Bajtosi opisanym powyżej.</p>

<p>Jeśli istnieje wiele rozwiązań, wystarczy wypisać dowolne z nich.</p>

<p>Uwaga: Zwr&oacute;ć uwagę, że nie jest konieczne, aby wypisany napis był najkr&oacute;tszy możliwy. Wystarczy, żeby nie był dłuższy niż 100 000 znak&oacute;w. Nie jest r&oacute;wnież konieczne, aby wypisany napis był poprawnym nawiasowaniem.</p>