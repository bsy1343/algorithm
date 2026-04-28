# [Platinum IV] Festival - 16447

[문제 링크](https://www.acmicpc.net/problem/16447)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 16, 맞힌 사람: 14, 정답 비율: 66.667%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Festivais de m&uacute;sica deveriam ser pura divers&atilde;o, por&eacute;m alguns deles se tornam t&atilde;o grandes a ponto de causar dor de cabe&ccedil;a para os frequentadores. O problema &eacute; que s&atilde;o tantas atra&ccedil;&otilde;es boas tocando em tantos palcos que a simples tarefa de escolher quais shows assistir se torna complexa.</p>

<p>Para ajudar frequentadores de tais festivais, Fulano decidiu criar um aplicativo que, ap&oacute;s avaliar as m&uacute;sicas ouvidas em seus servi&ccedil;os de streaming favoritos, sugere quais shows assistir de modo que n&atilde;o exista outra combina&ccedil;&atilde;o de shows melhor de acordo com os crit&eacute;rios descritos a seguir:</p>

<ul>
	<li>Para aproveitar a experi&ecirc;ncia ao m&aacute;ximo &eacute; importante assistir cada um dos shows escolhidos por completo;</li>
	<li>Ir no festival e n&atilde;o ver um dos palcos est&aacute; fora de cogita&ccedil;&atilde;o;</li>
	<li>Para garantir que a sele&ccedil;&atilde;o dos artistas seja compat&iacute;vel com o usu&aacute;rio, contou-se quantas m&uacute;sicas de cada artista o usu&aacute;rio conhece por j&aacute; ter ouvido-as nos servi&ccedil;os de streaming. O total de m&uacute;sicas conhecidas dos artistas escolhidos deve ser o maior poss&iacute;vel.</li>
</ul>

<p>Infelizmente a vers&atilde;o beta do aplicativo recebeu v&aacute;rias cr&iacute;ticas, pois os usu&aacute;rios conseguiram pensar em sele&ccedil;&otilde;es melhores que aquelas sugeridas. Sua tarefa nesse problema &eacute; ajudar Fulano e escrever um programa que, dadas as descri&ccedil;&otilde;es dos shows acontecendo em cada palco, calcula a lista ideal para o usu&aacute;rio.</p>

<p>O tempo de deslocamento entre os palcos &eacute; ignorado; portanto, desde que n&atilde;o haja interse&ccedil;&atilde;o entre os hor&aacute;rios de quaisquer dois shows escolhidos considera-se que &eacute; poss&iacute;vel assistir a todos por completo. Em particular, se um show acaba exatamente quando um outro come&ccedil;a, &eacute; poss&iacute;vel assistir a ambos.</p>

### 입력

<p>A primeira linha cont&eacute;m um n&uacute;mero inteiro 1 &le; N &le; 10 representando o n&uacute;mero de palcos. As N linhas seguintes descrevem os shows acontecendo em cada palco. A i-&eacute;sima delas &eacute; composta por um inteiro M<sub>i</sub> &ge; 1, representando o n&uacute;mero de shows marcados para o i-&eacute;simo palco seguido por M<sub>i</sub> descri&ccedil;&otilde;es de shows. Cada descri&ccedil;&atilde;o de show cont&eacute;m 3 inteiros i<sub>j</sub> , f<sub>j</sub> e o<sub>j</sub> (1 &le; i<sub>j</sub> &lt; f<sub>j</sub> &le; 86400 e 1 &le; o<sub>j</sub> &le; 1000), representando respectivamente os hor&aacute;rios de in&iacute;cio e fim do show e o n&uacute;mero de m&uacute;sicas do cantor se apresentando que foram previamente ouvidas pelo usu&aacute;rio. A soma dos M<sub>i</sub> n&atilde;o exceder&aacute; 1000.</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha com um inteiro representando o total de m&uacute;sicas previamente ouvidas dos artistas escolhidos, ou &minus;1 caso n&atilde;o haja solu&ccedil;&atilde;o v&aacute;lida.</p>