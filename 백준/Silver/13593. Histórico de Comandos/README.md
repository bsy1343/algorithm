# [Silver V] Histórico de Comandos - 13593

[문제 링크](https://www.acmicpc.net/problem/13593)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 89, 정답: 70, 맞힌 사람: 37, 정답 비율: 68.519%

### 분류

구현

### 문제 설명

<p>Uma&nbsp;interface por linha de comando&nbsp;(ILC) &eacute; um dos tipos de interface humano-computador mais antigos que existem. Uma ILC permite a intera&ccedil;&atilde;o com o software atrav&eacute;s de um&nbsp;interpretador de comandos, sendo normalmente acess&iacute;vel em um terminal (ou janela) de texto. A vantagem de um interpretador de comandos &eacute; que ele permite que o usu&aacute;rio opere o sistema usando apenas o teclado. Ainda hoje em dia, em que estamos acostumados com interfaces gr&aacute;ficas sofisticadas, muitos aplicativos e sistemas operacionais incluem algum tipo de interface por linha de comando, e muitos usu&aacute;rios ainda preferem us&aacute;-la para grande parte das tarefas.</p>

<p>Um dos recursos mais &uacute;teis de um interpretador de comandos &eacute; o&nbsp;hist&oacute;rico&nbsp;de comandos. Quando um comando &eacute; digitado e executado, ele &eacute; colocado no hist&oacute;rico de comandos do terminal. O comando pode ser exibido novamente no terminal apertando a tecla `&uarr;&#39;; a tecla&nbsp;Enter&nbsp;executa o comando novamente quando o comando est&aacute; sendo exibido no terminal. Todos os comandos executados s&atilde;o guardados no hist&oacute;rico: pressionar a tecla `&uarr;&#39; duas vezes exibe o pen&uacute;ltimo comando executado, pression&aacute;-la tr&ecirc;s vezes exibe o antepen&uacute;ltimo comando, e assim sucessivamente.</p>

<p>Por exemplo, se o hist&oacute;rico inicial &eacute;&nbsp;(A, B, C, D), para repetir o comando&nbsp;C&nbsp;basta pressionar duas vezes a tecla `&uarr;&#39;. O hist&oacute;rico ser&aacute; ent&atilde;o atualizado para&nbsp;(A, B, C, D, C). Nesse ponto, para repetir o comando&nbsp;Aser&aacute; necess&aacute;rio pressionar cinco vezes a tecla `&uarr;&#39;; o hist&oacute;rico ser&aacute; atualizado para&nbsp;(A, B, C, D, C, A). Nesse ponto, para repetir mais uma vez o comando&nbsp;A&nbsp;basta pressionar uma vez a tecla `&uarr;&#39;; o hist&oacute;rico ser&aacute; atualizado para&nbsp;(A, B, C, D, C, A, A).</p>

<p>Leandro &eacute; administrador de sistemas e usa freq&uuml;entemente o interpretador de comandos para gerenciar remotamente os servidores que administra. Em geral, ele precisa apenas repetir comandos que j&aacute; havia digitado antes. Enquanto estava trabalhando em um servidor, ele teve uma curiosidade: quantas vezes ele precisa pressionar a tecla `&uarr;&#39; para executar uma determinada seq&uuml;&ecirc;ncia de comandos? Ele sabe quais s&atilde;o as posi&ccedil;&otilde;es no hist&oacute;rico dos comandos que ele necessita executar, mas n&atilde;o sabe resolver esse problema. Por isso, pediu que voc&ecirc; fizesse um programa que respondesse &agrave; pergunta dele.</p>

### 입력

<p>A entrada &eacute; composta de v&aacute;rios casos de teste. A primeira linha de cada caso de teste cont&eacute;m um n&uacute;mero inteiro&nbsp;N, indicando o n&uacute;mero de comandos que Leandro deseja executar&nbsp;(1 &le; N &le; 1.000). A segunda linha de um caso de teste cont&eacute;m&nbsp;N&nbsp;inteiros&nbsp;P<sub>1</sub>,&nbsp;P<sub>2</sub>, . . . ,&nbsp;P<sub>N</sub>, que indicam as posi&ccedil;&otilde;es dos comandos no hist&oacute;rico&nbsp;(1 &le; P<sub>i</sub>&nbsp;&le; 1.000.000)&nbsp;no momento inicial, na ordem em que os comandos devem ser executados. Ou seja, o primeiro comando que deve ser executado est&aacute; inicialmente na posi&ccedil;&atilde;o&nbsp;P<sub>1</sub>&nbsp;do hist&oacute;rico; depois deve ser executado o comando que est&aacute; inicialmente na posi&ccedil;&atilde;o&nbsp;P<sub>2</sub>&nbsp;no hist&oacute;rico, e assim por diante, at&eacute;&nbsp;P<sub>N</sub>, que &eacute; a posi&ccedil;&atilde;o inicial do &uacute;ltimo comando que deve ser executado. Note que pode haver&nbsp;P<sub>i</sub>&nbsp;= P<sub>j</sub></p>

<p>As posi&ccedil;&otilde;es s&atilde;o dadas em fun&ccedil;&atilde;o do n&uacute;mero de vezes que a tecla `&uarr;&#39; deve ser pressionada: um comando na posi&ccedil;&atilde;o&nbsp;5&nbsp;necessita que a tecla `&uarr;&#39; seja pressionada cinco vezes antes de aparecer no terminal (note que &agrave; medida que comandos v&atilde;o sendo executados, a posi&ccedil;&atilde;o de um dado comando no hist&oacute;rico pode mudar).</p>

<p>O final da entrada &eacute; indicado por&nbsp;N = 0.</p>

### 출력

<p>Para cada caso de teste, seu programa deve imprimir apenas uma linha, contendo o n&uacute;mero de vezes que Leandro precisa pressionar a tecla `&uarr;&#39; para executar todos os comandos.</p>