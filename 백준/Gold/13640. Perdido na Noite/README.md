# [Gold II] Perdido na Noite - 13640

[문제 링크](https://www.acmicpc.net/problem/13640)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

최소 공통 조상, 수학, 확률론, 트리

### 문제 설명

<p>Numa cidade da Nlog&ocirc;nia, o sistema vi&aacute;rio &eacute; composto de N rotat&oacute;rias e N &minus; 1 ruas, sendo que cada rua liga duas rotat&oacute;rias distintas. Utilizando o sistema vi&aacute;rio, &eacute; poss&iacute;vel ir de qualquer rotat&oacute;ria para qualquer outra rotat&oacute;ria da cidade.</p>

<p>A cidade possui apenas dois hot&eacute;is: um barato, localizado na rotat&oacute;ria B, e um caro, localizado na rotat&oacute;ria C. Um turista veio &agrave; cidade para celebrar o anivers&aacute;rio de um amigo, cuja festa est&aacute; sendo realizada em um clube localizado na rotat&oacute;ria A. Como o turista n&atilde;o fez reserva em nenhum dos hot&eacute;is e a noite est&aacute; agrad&aacute;vel, ap&oacute;s a festa ele decidiu passear a p&eacute; pelas ruas e rotat&oacute;rias at&eacute; encontrar um dos hot&eacute;is (ele tamb&eacute;m decidiu hospedar-se no primeiro hotel que encontrar).</p>

<p>Seu plano foi dificultado porque como ele n&atilde;o conhece a cidade e bebeu um pouco al&eacute;m da conta, todas as ruas lhe parecem iguais. Assim, ele decidiu usar a seguinte estrat&eacute;gia: a cada rotat&oacute;ria ele escolhe, com probabilidade uniforme, uma das ruas que saem da rotat&oacute;ria, e usa essa rua para ir a uma outra rotat&oacute;ria, at&eacute; chegar &agrave; rotat&oacute;ria onde um dos hot&eacute;is est&aacute; localizado. Note que como o turista n&atilde;o consegue distinguir as ruas, pode ocorrer de ele escolher a mesma rua pela qual chegou &agrave; rotat&oacute;ria.</p>

<p>Voc&ecirc; deve escrever um programa que, dadas a descri&ccedil;&atilde;o do sistema vi&aacute;rio, a localiza&ccedil;&atilde;o A da festa de anivers&aacute;rio, a localiza&ccedil;&atilde;o B do hotel barato e a localiza&ccedil;&atilde;o C do hotel caro, determine a probabilidade de o turista chegar ao hotel barato antes de chegar ao hotel caro.</p>

### 입력

<p>A primeira linha de um caso de teste cont&eacute;m quatro inteiros N, A, B e C, indicando respectivamente o n&uacute;mero de rotat&oacute;rias do sistema vi&aacute;rio, a rotat&oacute;ria onde a festa de anivers&aacute;rio foi realizada, a rotat&oacute;ria onde o hotel barato est&aacute; localizado, e a rotat&oacute;ria onde o hotel caro est&aacute; localizado. Cada uma das N &minus; 1 linhas seguintes cont&eacute;m dois inteiros X e Y , indicando que existe uma rua que liga as rotat&oacute;rias X e Y .</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>3 &le; N &le; 100</li>
	<li>B &ne;&nbsp;C, A &ne; B, A &ne; C.</li>
	<li>1 &le; A, B, C &le; N</li>
	<li>1 &le; X, Y &le; N.</li>
	<li>X &ne; Y .</li>
</ul>

### 출력

<p>Seu programa deve imprimir uma &uacute;nica linha, contendo a probabilidade de o turista chegar ao hotel barato antes de chegar ao hotel caro, com 6 casas decimais.</p>