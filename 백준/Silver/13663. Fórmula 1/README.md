# [Silver III] Fórmula 1 - 13663

[문제 링크](https://www.acmicpc.net/problem/13663)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 16, 맞힌 사람: 14, 정답 비율: 100.000%

### 분류

구현, 정렬, 시뮬레이션

### 문제 설명

<p>A temporada de F&oacute;rmula 1 consiste de uma s&eacute;rie de corridas, conhecidas como Grandes Pr&ecirc;mios, organizados pela Federa&ccedil;&atilde;o Internacional de Automobilismo (FIA). Os resultados de cada Grande Pr&ecirc;mio s&atilde;o combinados para determinar o Campeonato Mundial de Pilotos. Mais especificamente, a cada Grande Pr&ecirc;mio s&atilde;o distribu&iacute;dos pontos para os pilotos, dependendo da classifica&ccedil;&atilde;o na corrida. Ao final da temporada, o piloto que tiver somado o maior n&uacute;mero de pontos &eacute; declarado Campe&atilde;o Mundial de Pilotos.<br />
<br />
Os organizadores da F&oacute;rmula 1 mudam constantemente as regras da competi&ccedil;&atilde;o, com o objetivo de dar mais emo&ccedil;&atilde;o &agrave;s disputas. Uma regra modificada para a temporada de 2010 foi justamente a distribui&ccedil;&atilde;o de pontos em cada Grande Pr&ecirc;mio. Desde 2003 a regra de pontua&ccedil;&atilde;o premiava os oito primeiros colocados, obedecendo a seguinte tabela:</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:300px">
	<tbody>
		<tr>
			<td>Coloca&ccedil;&atilde;o</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
		</tr>
		<tr>
			<td>Pontos</td>
			<td>10</td>
			<td>8</td>
			<td>6</td>
			<td>5</td>
			<td>4</td>
			<td>3</td>
			<td>2</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>Ou seja, o piloto vencedor ganhava 10 pontos, o segundo colocado ganhava 8 pontos, e assim por diante.</p>

<p>Na temporada de 2010, os dez primeiros colocados receber&atilde;o pontos obedecendo a seguinte tabela:</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:300px">
	<tbody>
		<tr>
			<td>Coloca&ccedil;&atilde;o</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
			<td>9</td>
			<td>10</td>
		</tr>
		<tr>
			<td>Pontos</td>
			<td>25</td>
			<td>18</td>
			<td>15</td>
			<td>12</td>
			<td>10</td>
			<td>8</td>
			<td>6</td>
			<td>4</td>
			<td>2</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>A mudan&ccedil;a no sistema de pontua&ccedil;&atilde;o provocou muita especula&ccedil;&atilde;o sobre qual teria sido o efeito nos Campeonatos Mundiais passados se a nova pontua&ccedil;&atilde;o tivesse sido utilizada nas temporadas anteriores. Por exemplo, teria Lewis Hamilton sido campe&atilde;o em 2008, j&aacute; que a diferen&ccedil;a de sua pontua&ccedil;&atilde;o total para Felipe Massa foi de apenas um ponto? Para acabar com as especula&ccedil;&otilde;es, a FIA contratou voc&ecirc; para escrever um programa que, dados os resultados de cada corrida de uma temporada determine Campe&atilde;o Mundial de Pilotos para sistemas de pontua&ccedil;&otilde;es diferentes.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m dois n&uacute;meros inteiros G e P separados por um espa&ccedil;o em branco, indicando respectivamente o n&uacute;mero de Grandes Pr&ecirc;mios (1 &le; G &le; 100) e o n&uacute;mero de pilotos (1 &le; P &le; 100). Os pilotos s&atilde;o identificados por inteiros de 1 a P. Cada uma das G linhas seguintes indica o resultado de uma corrida, e cont&eacute;m P inteiros separados por espa&ccedil;os em branco. Em cada linha, o i-&eacute;simo n&uacute;mero indica a ordem de chegada do pilodo i na corrida (o primeiro n&uacute;mero indica a ordem de chegada do piloto 1 naquela corrida, o segundo n&uacute;mero indica a ordem de chegada do piloto 2 na corrida, e assim por diante). A linha seguinte cont&eacute;m um &uacute;nico n&uacute;mero inteiro S indicando o n&uacute;mero de sistemas de pontua&ccedil;&atilde;o (1 &le; S &le; 10), e ap&oacute;s, cada uma das S linhas seguintes cont&eacute;m a descri&ccedil;&atilde;o de um sistema de pontua&ccedil;&atilde;o. A descri&ccedil;&atilde;o de um sistema de pontua&ccedil;&atilde;o inicia com um inteiro K (1 &le; K &le; P), indicando a &uacute;ltima ordem de chegada que receber&aacute; pontos, seguido de um espa&ccedil;o em branco, seguido de K inteiros k<sub>0</sub>, k<sub>1</sub>, ... , k<sub>n&minus;1</sub> (1 &le; k<sub>i</sub> &le; 100) separados por espa&ccedil;os em branco, indicando os pontos a serem atribu&iacute;dos (o primeiro inteiro indica os pontos do primeiro colocado, o segundo inteiro indica os pontos do segundo colocado, e assim por diante).</p>

<p>O &uacute;ltimo caso de teste &eacute; seguido por uma linha que cont&eacute;m apenas dois n&uacute;meros zero separados por um espa&ccedil;o em branco.</p>

### 출력

<p>Para cada caso de sistema de pontua&ccedil;&atilde;o da entrada seu programa deve imprimir uma linha, que deve conter o identificador do Campe&atilde;o Mundial de Pilotos. Se houver mais de um Campe&atilde;o Mundial Pilotos (ou seja, se houver empate), a linha deve conter todos os Campe&otilde;es Mundiais de Pilotos, em ordem crescente de identificador, separados por um espa&ccedil;o em branco.</p>