# [Silver III] Robô Colecionador - 13659

[문제 링크](https://www.acmicpc.net/problem/13659)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 20, 맞힌 사람: 16, 정답 비율: 88.889%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Um dos esportes favoritos na Robol&acirc;ndia &eacute; o Rali dos Rob&ocirc;s. Este rali &eacute; praticado em uma arena retangular gigante de N linhas por M colunas de c&eacute;lulas quadradas. Algumas das c&eacute;lulas est&atilde;o vazias, algumas cont&ecirc;m figurinhas da Copa (muito apreciadas pelas intelig&ecirc;ncias artificiais da Robol&acirc;ndia) e algumas s&atilde;o ocupadas por pilastras que sustentam o teto da arena. Em seu percurso os rob&ocirc;s podem ocupar qualquer c&eacute;lula da arena, exceto as que cont&eacute;m pilastras, que bloqueiam o seu movimento. O percurso do rob&ocirc; na arena durante o rali &eacute; determinado por uma sequ&ecirc;ncia de instru&ccedil;&otilde;es. Cada instru&ccedil;&atilde;o &eacute; representada por um dos seguintes caracteres: &lsquo;D&rsquo;, &lsquo;E&rsquo; e &lsquo;F&rsquo;, significando, respectivamente, &ldquo;gire 90 graus para a direita&rdquo;, &ldquo;gire 90 graus para a esquerda&rdquo; e &ldquo;ande uma c&eacute;lula para a frente&rdquo;. O rob&ocirc; come&ccedil;a o rali em uma posi&ccedil;&atilde;o inicial na arena e segue fielmente a sequ&ecirc;ncia de instru&ccedil;&otilde;es dada (afinal, eles s&atilde;o rob&ocirc;s!). Sempre que o rob&ocirc; ocupa uma c&eacute;lula que cont&eacute;m uma figurinha da Copa ele a coleta. As figurinhas da Copa n&atilde;o s&atilde;o repostas, ou seja, cada figurinha pode ser coletada uma unica vez. Quando um rob&ocirc; tenta andar para uma c&eacute;lula onde existe uma pilastra ele patina, permanecendo na c&eacute;lula onde estava, com a mesma orienta&ccedil;&atilde;o. O mesmo tamb&eacute;m acontece quando um rob&ocirc; tenta sair da arena.</p>

<p>Dados o mapa da arena, descrevendo a posi&ccedil;&atilde;o de pilastras e figurinhas, e a sequ&ecirc;ncia de instru&ccedil;&otilde;es de um rob&ocirc;, voc&ecirc; deve escrever um programa para determinar o n&uacute;mero de figurinhas coletadas pelo rob&ocirc;.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m tr&ecirc;s n&uacute;meros inteiros N, M e S (1 &le; N, M &le; 100, 1 &le; S &le; 5 &times; 10<sup>4</sup>), separados por espa&ccedil;os em branco, indicando respectivamente o n&uacute;mero de linhas e o n&uacute;mero de colunas da arena e o n&uacute;mero de instru&ccedil;&otilde;es para o rob&ocirc;. Cada uma das N linhas seguintes da entrada descreve uma linha de c&eacute;lulas da arena e cont&eacute;m uma cadeia com M caracteres. A primeira linha que aparece na descri&ccedil;&atilde;o da arena &eacute; a que est&aacute; mais ao Norte; a primeira coluna que aparece na descri&ccedil;&atilde;o de uma linha de c&eacute;lulas da arena &eacute; a que est&aacute; mais a Oeste.</p>

<p>Cada c&eacute;lula da arena pode conter um dos seguintes caracteres:</p>

<ul>
	<li>&lsquo;.&rsquo; &mdash; c&eacute;lula normal;</li>
	<li>&lsquo;*&rsquo; &mdash; c&eacute;lula que cont&eacute;m uma figurinha da Copa;</li>
	<li>&lsquo;#&rsquo; &mdash; c&eacute;lula que cont&eacute;m uma pilastra;</li>
	<li>&lsquo;N&rsquo;, &lsquo;S&rsquo;, &lsquo;L&rsquo;, &lsquo;O&rsquo; &mdash; c&eacute;lula onde o rob&ocirc; inicia o percurso (&uacute;nica na arena). A letra representa a orienta&ccedil;&atilde;o inicial do rob&ocirc; (Norte, Sul, Leste e Oeste, respectivamente).</li>
</ul>

<p>A ultima linha da entrada cont&eacute;m uma sequ&ecirc;ncia de S caracteres dentre &lsquo;D&rsquo;, &lsquo;E&rsquo; e &lsquo;F&rsquo;, representando as instru&ccedil;&otilde;es do rob&ocirc;.</p>

<p>O &uacute;ltimo caso de teste &eacute; seguido por uma linha que cont&eacute;m apenas tr&ecirc;s n&uacute;meros zero separados por um espa&ccedil;o em branco.</p>

### 출력

<p>Para cada rali descrito na entrada seu programa deve imprimir uma &uacute;nica linha contendo um &uacute;nico inteiro, indicando o n&uacute;mero de figurinhas que o rob&ocirc; colecionou durante o rali.</p>