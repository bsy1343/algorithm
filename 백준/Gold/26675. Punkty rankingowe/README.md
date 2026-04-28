# [Gold V] Punkty rankingowe - 26675

[문제 링크](https://www.acmicpc.net/problem/26675)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

애드 혹

### 문제 설명

<p>Bajtek postanowił sumiennie przygotować się do tegorocznych Potyczek Algorytmicznych. W tym celu założył konto na portalu BitForces, na kt&oacute;rym regularnie odbywają się zawody programistyczne.</p>

<p>Bajtek zorientował się, że portal stosuje system punkt&oacute;w rankingowych (tzw. rating), dzięki kt&oacute;remu może on śledzić własne postępy w por&oacute;wnaniu z osiągnięciami innych zawodnik&oacute;w. Ranking zawodnika jest liczbą całkowitą (być może ujemną). Tuż po założeniu konta ranking Bajtka wynosił 0, a każde zawody programistyczne, w kt&oacute;rych uczestniczył, zwiększały lub zmniejszały jego ranking o pewną liczbę całkowitą. Co więcej, w portalu dostępna jest cała historia zmian rankingu po każdych zawodach. Podekscytowany Bajtek zabrał się do analizy tych danych. Zapisał on na kartce kolejno n liczb:</p>

<ul>
	<li>największy wzrost rankingu, jaki nastąpił w pojedynczych zawodach;</li>
	<li>największy łączny wzrost rankingu w dw&oacute;ch kolejnych zawodach;</li>
	<li>największy łączny wzrost rankingu w trzech kolejnych zawodach;</li>
	<li>itd., aż ostatecznie zapisał największy łączny wzrost rankingu w n kolejnych zawodach.</li>
</ul>

<p>Kilka dni p&oacute;źniej Bajtek chciał sobie przypomnieć ciąg zmian rankingu. Okazało się jednak, że portal BitForces ma akurat problemy techniczne. . . Czy pomożesz Bajtkowi i odzyskasz jakikolwiek poprawny ciąg zmian rankingu o długości co najmniej n, kt&oacute;ry jest zgodny z danymi zapisanymi na kartce?</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą n (1 &le; n &le; 300) odpowiadającą liczbie informacji spisanych przez Bajtka na kartce. Drugi wiersz zawiera n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (&minus;10<sup>6</sup> &le; a<sub>i</sub> &le; 10<sup>6</sup>) znajdujących się na kartce Bajtka. Dla każdego 1 &le; j &le; n, największy łączny wzrost rankingu, jaki nastąpił w przeciągu j kolejnych zawod&oacute;w, jest według Bajtka r&oacute;wny dokładnie a<s>j</s>.</p>

### 출력

<p>Jeśli istnieje ciąg zmian rankingu spełniający wszystkie warunki opisane w treści zadania, w pierwszym wierszu wejścia wypisz słowo <code>TAK</code>. Następnie podaj przykładowy ciąg zmian. W drugim wierszu wyjścia wypisz długość znalezionego ciągu k (n &le; k &le; 100 000), a w trzecim wierszu &ndash; kolejne elementy tego ciągu b<sub>1</sub>, b<sub>2</sub>, . . . , b<sub>k</sub> (&minus;10<sup>13</sup> &le; b<sub>i</sub> &le; 10<sup>13</sup>).</p>

<p>Jeśli istnieje wiele poprawnych rozwiązań, wypisz dowolne z nich. Jeśli natomiast zadany ciąg zmian nie istnieje, wypisz <code>NIE</code> w pierwszym i jedynym wierszu wyjścia.</p>

<p>Można udowodnić, że jeżeli dla danych wejściowych spełniających ograniczenia istnieje jakikolwiek poprawny ciąg zmian, to istnieje też poprawny ciąg zmian spełniający powyższe ograniczenia.</p>

### 힌트

<p>Poniżej przedstawiony jest ciąg zmian z zaznaczonymi największymi wzrostami rankingu w jednych, dw&oacute;ch, trzech i czterech kolejnych zawodach:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26675.%E2%80%85Punkty%E2%80%85rankingowe/371501df.png" data-original-src="https://upload.acmicpc.net/d80cf81e-b200-430a-b527-ace9dbfee3d7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 233px; height: 61px;" /></p>