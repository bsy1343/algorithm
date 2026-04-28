# [Gold V] Lavaspar - 20287

[문제 링크](https://www.acmicpc.net/problem/20287)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 28, 맞힌 사람: 22, 정답 비율: 64.706%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Ca&ccedil;a Palavras &eacute; um passatempo bastante conhecido, embora esteja perdendo um pouco do seu prest&iacute;gio nos &uacute;ltimos anos. O objetivo deste jogo &eacute; encontrar palavras em uma matriz, onde cada c&eacute;lula dessa matriz cont&eacute;m uma letra.</p>

<p>Bibika e seu irm&atilde;o estavam jogando Ca&ccedil;a Palavras, por&eacute;m em pouco tempo perderam o interesse, visto que encontrar todas as palavras estava ficando relativamente f&aacute;cil. Como Bibika queria que seu irm&atilde;o sa&iacute;sse um pouco do computador, ela pesquisou na internet jogos do mesmo estilo e acabou encontrando o <em>Ca&ccedil;a Lavaspar</em>.</p>

<p>Ca&ccedil;a Lavaspar &eacute; um jogo que segue a mesma ideia do famoso Ca&ccedil;a Palavras. Por&eacute;m, ao inv&eacute;s de simplesmente ter que encontrar uma palavra na matriz, o objetivo &eacute; encontrar um anagrama qualquer da palavra, fazendo assim com que o jogo fique mais dif&iacute;cil e interessante. O anagrama pode ser encontrado em uma linha, coluna ou diagonal.</p>

<p>Um anagrama de uma palavra &eacute; formado pelo rearranjo das letras da palavra. &Agrave;s vezes, o anagrama n&atilde;o tem sentido, mas isto n&atilde;o importa. BALO, LOBA e AOLB s&atilde;o exemplos de anagramas da palavra BOLA.</p>

<p>Bibika percebeu ser poss&iacute;vel que uma mesma c&eacute;lula da matriz fizesse parte de anagramas de diferentes palavras e ent&atilde;o ela passou a chamar essas c&eacute;lulas de <em>c&eacute;lulas especiais</em>.</p>

<p>Agora ela gostaria de saber, dada uma configura&ccedil;&atilde;o de uma matriz e uma cole&ccedil;&atilde;o de palavras, quantas c&eacute;lulas especiais existem?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20287.%E2%80%85Lavaspar/b04776f2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20287.%E2%80%85Lavaspar/b04776f2.png" data-original-src="https://upload.acmicpc.net/37f0062b-1d69-412e-b14d-d908bdb8a894/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 322px; height: 248px;" /></p>

<p>A imagem acima ilustra o primeiro exemplo, onde a cole&ccedil;&atilde;o de palavras consiste de tr&ecirc;s palavras: BOLA, CASA&nbsp;e BOI. Os ret&acirc;ngulos de cada cor representam anagramas de palavras diferentes da entrada. As 3 c&eacute;lulas especiais est&atilde;o pintadas de amarelo.</p>

### 입력

<p>A primeira linha possui dois inteiros L e C, que correspondem ao n&uacute;mero de linhas e de colunas da matriz, respectivamente.</p>

<p>Seguem ent&atilde;o L linhas, cada uma contendo uma palavra com C letras.</p>

<p>Ap&oacute;s isso, a pr&oacute;xima linha cont&eacute;m um inteiro, N, que representa a quantidade de palavras na cole&ccedil;&atilde;o de palavras a seguir.</p>

<p>E ent&atilde;o, por fim, temos mais N linhas, onde cada uma delas cont&eacute;m uma palavra da cole&ccedil;&atilde;o.</p>

<p>Todos os caracteres utilizados, tanto na matriz quanto na cole&ccedil;&atilde;o de palavras, s&atilde;o letras mai&uacute;sculas do alfabeto ingl&ecirc;s.</p>

<p>&Eacute; garantido que nenhum par de palavras da cole&ccedil;&atilde;o &eacute; um anagrama uma da outra.</p>

### 출력

<p>A sa&iacute;da deve consistir de uma &uacute;nica linha que cont&eacute;m o n&uacute;mero de c&eacute;lulas especiais.</p>

### 제한

<ul>
	<li>2 &le; L, C &le; 40.</li>
	<li>2 &le; N &le; 20.</li>
	<li>O n&uacute;mero P de letras de cada uma das N palavras est&aacute; no intervalo 2 &le; P &le; min(15, max(L, C)).</li>
</ul>