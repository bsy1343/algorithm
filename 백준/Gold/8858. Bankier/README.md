# [Gold V] Bankier - 8858

[문제 링크](https://www.acmicpc.net/problem/8858)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 12, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

자료 구조, 우선순위 큐, 스택

### 문제 설명

<p>Edek, kolega Pawła, kt&oacute;rego znamy z zadania &quot;Kodowanie&quot;, pracuje w kasie banku przyjmując wpłaty i wypłaty z kont klient&oacute;w. Ponieważ praca ta może być momentami nużąca, Edek wymyślił sw&oacute;j własny system realizowania wpłat i wypłat.</p>

<p>Rozpoczynając sw&oacute;j dzień pracy, Edek ma w kasie kwotę&nbsp;<strong>S</strong>, z kt&oacute;rej może realizować wypłaty. Jeżeli do Edka przychodzi klient chcąc wpłacić pieniądze na konto, Edek odnotowuje kwotę wpłaty w systemie, a otrzymane pieniądze (klienci zawsze przynoszą odliczoną kwotę) wkłada do koperty i odkłada na szczyt kupki kopert z wcześniejszymi wpłatami.</p>

<p>W sytuacji gdy do Edka przychodzi klient chcąc wypłacić kwotę X, Edek postępuje w następujący spos&oacute;b:</p>

<ul>
	<li>jeżeli na stosie nie ma żadnej koperty, to pieniądze są wypłacane z kasy</li>
	<li>jeżeli kwota do wypłaty&nbsp;<strong>X</strong>&nbsp;jest mniejsza od najmniejszej kwoty spośr&oacute;d kwot znajdujących się w kopertach, to Edek wypłaca całą kwotę&nbsp;<strong>X</strong>&nbsp;z kasy</li>
	<li>w przeciwnym przypadku, dop&oacute;ki nie zostanie wypłacona cała kwota, Edek zdejmuje kolejno koperty ze szczytu kupki i wypłaca brakującą kwotę. Jeżeli na końcu, po wydaniu całej kwoty, w ostatnio zdjętej kopercie pozostały jakieś pieniądze, to są one wkładane do kasy. Jeżeli zdarzy się, że Edek zdejmie z kupki wszystkie koperty, a klient nie otrzymał całej kwoty, to pozostałą część pieniędzy Edek wydaje z kasy.</li>
</ul>

<p>Możesz założyć, że w kasie zawsze znajduje się wystarczająco dużo pieniędzy, aby dokonać koniecznych operacji.</p>

<p>Ponieważ jest to system bankowy, Edek nie chciałby popełnić błędu. Z tego powodu Edek poprosił Ciebie o napisanie programu, kt&oacute;ry pomoże mu obliczyć jaka kwota powinna znajdować się w kasie, a jaka w kopertach, kt&oacute;re pozostały na kupce, po wykonaniu wszystkich wpłat i wypłat klient&oacute;w.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się pojedyncza liczba T (1&lt;=<strong>T</strong>&lt;=3) oznaczająca liczbę zastaw&oacute;w danych. W kolejnych liniach wejścia znajdują się opisy zestaw&oacute;w danych. Pojedynczy zestaw danych zawiera zapis wszystkich akcji klient&oacute;w banku. W pierwszej linii takiego opisu znajdują się dwie liczby całkowite&nbsp;<strong>n&nbsp;</strong>(1&lt;=<strong>n</strong>&lt;=10^6) i&nbsp;<strong>S</strong>&nbsp;(1&lt;=<strong>S</strong>&lt;=10^12). Oznaczają one odpowiednio ilość akcji klient&oacute;w banku oraz początkową kwotę jaka znajdowała się w kasie na początku dnia. W kolejnych&nbsp;<strong>n&nbsp;</strong>liniach opisu zestawu danych znajdują się opisy pojedynczych akcji klient&oacute;w. Opis akcji składa się z jednej liczby całkowitej&nbsp;<strong>x</strong>&nbsp;(-10^6&lt;=<strong>x</strong>&lt;=10^6,&nbsp;<strong>x</strong>&nbsp;jest r&oacute;żne od zera). Kwota dodatnia oznacza wpłatę na konto, kwota ujemna oznacza wypłatę pieniędzy z konta. Możesz założyć, że podczas realizowania kolejnych akcji klient&oacute;w, w kasie nigdy nie znajdzie się kwota większa niż 10^12.</p>

### 출력

<p>Dla każdego zestawu danych należy wypisać jedną linię zawierającą dwie liczby całkowite oddzielone pojedynczym odstępem. Są to odpowiednio kwota jaka pozostała w kasie po zrealizowaniu wszystkich akcji klient&oacute;w banku oraz sumaryczna kwota znajdującą się w kopertach, kt&oacute;re pozostały na kupce.</p>

<p>&nbsp;</p>