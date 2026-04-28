# [Platinum III] Cortador de Pizza - 16444

[문제 링크](https://www.acmicpc.net/problem/16444)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 23, 맞힌 사람: 22, 정답 비율: 75.862%

### 분류

자료 구조, 오일러 지표 (χ=V-E+F), 기하학, 세그먼트 트리

### 문제 설명

<p>V&ocirc; Giuseppe ganhou de presente um cortador profissional de pizza, daqueles do tipo carretilha e, para comemorar, assou uma pizza retangular gigante para seus netos! Ele sempre dividiu suas pizzas em peda&ccedil;os fazendo cortes ao longo de linhas cont&iacute;nuas, n&atilde;o necessariamente retil&iacute;neas, de dois tipos: algumas come&ccedil;am na borda esquerda da pizza, seguem monotonicamente para a direita e terminam na borda direita; outras come&ccedil;am na borda inferior, seguem monotonicamente para cima e terminam na borda superior. Mas V&ocirc; Giuseppe sempre seguia uma propriedade: dois cortes do mesmo tipo nunca podiam se interceptar. Veja um exemplo com 4 cortes, dois de cada tipo, na parte esquerda da figura, que dividem a pizza em 9 peda&ccedil;os.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16444.%E2%80%85Cortador%E2%80%85de%E2%80%85Pizza/757c5bfd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16444.%E2%80%85Cortador%E2%80%85de%E2%80%85Pizza/757c5bfd.png" data-original-src="https://upload.acmicpc.net/56e3c872-df9f-49c5-9e3e-69cb7c9063e4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 417px; height: 167px;" /></p>

<p>Acontece que V&ocirc; Giuseppe simplesmente ama geometria, topologia, combinat&oacute;ria e coisas assim; por isso, resolveu mostrar para as crian&ccedil;as que poderia obter mais peda&ccedil;os, com o mesmo n&uacute;mero de cortes, se cruzamentos de cortes de mesmo tipo fossem permitidos. A parte direita da figura mostra, por exemplo, que se os dois cortes do tipo dos que v&atilde;o da esquerda para a direita puderem se interceptar, a pizza ser&aacute; dividida em 10 peda&ccedil;os.</p>

<p>V&ocirc; Giuseppe descartou a propriedade, mas n&atilde;o vai fazer cortes aleat&oacute;rios. Al&eacute;m de serem de um dos dois tipos, eles v&atilde;o obedecer &agrave;s seguintes restri&ccedil;&otilde;es:</p>

<ul>
	<li>Dois cortes t&ecirc;m no m&aacute;ximo um ponto de interse&ccedil;&atilde;o e, se tiverem, &eacute; porque os cortes se cruzam naquele ponto;</li>
	<li>Tr&ecirc;s cortes n&atilde;o se interceptam num mesmo ponto;</li>
	<li>Dois cortes n&atilde;o se interceptam na borda da pizza;</li>
	<li>Um corte n&atilde;o intercepta um canto da pizza.</li>
</ul>

<p>Dados os pontos de come&ccedil;o e t&eacute;rmino de cada corte, seu programa deve computar o n&uacute;mero de peda&ccedil;os resultantes dos cortes do V&ocirc; Giuseppe.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m dois inteiros X e Y , (1 &le; X, Y &le; 10<sup>9</sup>), representando as coordenadas (X, Y ) do canto superior direito da pizza. O canto inferior esquerdo tem sempre coordenadas (0, 0). A segunda linha cont&eacute;m dois inteiros H e V , (1 &le; H, V &le; 10<sup>5</sup>), indicando, respectivamente, o n&uacute;mero de cortes que v&atilde;o da esquerda para a direita, e o n&uacute;mero de cortes que v&atilde;o de baixo para cima. Cada uma das H linhas seguintes cont&eacute;m dois inteiros Y<sub>1</sub> e Y<sub>2</sub> definindo as ordenadas de encontro dos lados verticais da pizza com um corte que vai do lado esquerdo, na ordenada Y<sub>1</sub>, para o lado direito, na ordenada Y<sub>2</sub>. Cada uma das V linhas seguintes cont&eacute;m dois inteiros X<sub>1</sub> e X<sub>2</sub> definindo as abscissas de encontro dos lados horizontais da pizza com um corte que vai do lado inferior, na abscissa X<sub>1</sub>, para o lado superior, na abscissa X<sub>2</sub>.</p>

### 출력

<p>Imprima uma linha contendo um inteiro representando o n&uacute;mero de peda&ccedil;os resultantes.</p>