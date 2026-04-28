# [Gold III] Curso Universitário - 13691

[문제 링크](https://www.acmicpc.net/problem/13691)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

그래프 이론, 위상 정렬, 방향 비순환 그래프

### 문제 설명

<p>H&aacute; alguns anos atr&aacute;s, a Universidade de Pinguinhos introduziu um novo sistema flex&iacute;vel de cr&eacute;ditos para os alunos ingressantes de cursos de gradua&ccedil;&atilde;o. No novo sistema os alunos podem escolher as disciplinas que desejam cursar em um semestre, com a unica restri&ccedil;&atilde;o de n&atilde;o poderem cursar uma dada disciplina A sem antes terem cursado todas as disciplinas que tiverem sido estabelecidas como pr&eacute;-requisitos de A. Ap&oacute;s alguns semestres o reitor notou que muitos estudantes estavam sendo reprovados em muitas disciplinas, simplesmente porque os estudantes estavam cursando muitas disciplinas por semestre &ndash; alguns estudantes chegavam a se matricular em at&eacute; quinze disciplinas em um semestre. Sendo muito s&aacute;bio, este ano o reitor introduziu uma regra adicional limitando o n&uacute;mero de disciplinas que cada estudante pode cursar por semestre a um certo valor N . Essa regra adicional, no entanto, fez com que os alunos ficassem muito confusos na hora de escolher as disciplinas a serem cursadas em cada semestre.</p>

<p>&Eacute; a&iacute; que voc&ecirc; entra na est&oacute;ria. O reitor resolveu disponibilizar um programa de computador para ajudar os alunos a fazerem suas escolhas de disciplinas, e solicitou sua ajuda. Mais precisamente, o reitor quer que o programa sugira as disciplinas a serem cursadas durante o curso da seguinte forma. A cada disciplina &eacute; atribu&iacute;da uma prioridade. Se mais do que N disciplinas podem ser cursadas em um determinado semestre (obedecendo ao sistema de pr&eacute;- requisitos), o programa deve sugerir que o aluno matricule-se nas N disciplinas de maior prioridade. Se N ou menos disciplinas podem ser cursadas em um determinado semestre, o programa deve sugerir que o aluno matricule-se em todas as disciplinas dispon&iacute;veis.</p>

<p>Portanto, dadas a descri&ccedil;&atilde;o de pr&eacute;-requisitos para cada disciplina, a prioridade de cada disciplina, e o n&uacute;mero m&aacute;ximo de disciplinas por semestre, seu programa deve calcular o n&uacute;mero necess&aacute;rio de semestres para concluir o curso, segundo a sugest&atilde;o do reitor, e a lista de disciplinas que o aluno deve matricular-se em cada semestre.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. Se uma disciplina n&atilde;o tem qualquer pr&eacute;-requisito ela &eacute; denominada b&aacute;sica; caso contr&aacute;rio ela &eacute; denominada avan&ccedil;ada. A primeira linha de um caso de teste cont&eacute;m dois inteiros 1 &le; N &le; 100 e 1 &le; M &le; 10 indicando respectivamente o n&uacute;mero de disciplinas avan&ccedil;adas do curso e o n&uacute;mero m&aacute;ximo de disciplinas que podem ser cursadas por semestre. Cada uma das N linhas seguintes tem o formato</p>

<p>STR0 K STR1 STR2 ... STRK</p>

<p>onde STR0 &eacute; o nome de uma disciplina avan&ccedil;ada, 1 &le; K &le; 15 &eacute; o n&uacute;mero de disciplinas que s&atilde;o pr&eacute;-requisitos de STR0, e STR1, STR2, . . . STRK s&atilde;o os nomes das disciplinas que s&atilde;o pr&eacute;-requisitos de STR0. O nome de uma disciplina &eacute; uma cadeia com no m&iacute;nimo um e no m&aacute;ximo sete caracteres alfanum&eacute;ricos mai&uacute;sculos (&lsquo;A&rsquo;-&lsquo;Z&rsquo; e &lsquo;0&rsquo;-&lsquo;9&rsquo;). Note que as disciplinas b&aacute;sicas s&atilde;o aquelas que aparecem apenas como pr&eacute;-requisito de alguma disciplina avan&ccedil;ada. Para concluir o curso, um aluno deve cursar (e passar!) todas as disciplinas b&aacute;sicas e avan&ccedil;adas. A prioridade das disciplinas &eacute; determinada pela ordem em que elas aparecem pela primeira vez na entrada: a que aparece primeiro tem maior prioridade, e a que aparece por &uacute;ltimo tem a menor prioridade. N&atilde;o h&aacute; circularidade nos pr&eacute;-requisitos (ou seja, se a disciplina B tem como pr&eacute;-requisito a disciplina A ent&atilde;o A n&atilde;o tem B como pr&eacute;-requisito, direta ou indiretamente). O n&uacute;mero total de disciplinas &eacute; no m&aacute;ximo igual a 200. O final da entrada &eacute; indicado por N = M = 0.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve produzir a sa&iacute;da na seguinte forma. A primeira linha deve conter a frase &lsquo;Formatura em S semestres&rsquo;, onde S &eacute; o n&uacute;mero de semestres necess&aacute;rios para concluir o curso segundo a sugest&atilde;o do reitor. As S linhas seguintes devem conter a descri&ccedil;&atilde;o das disciplinas a serem cursadas em cada semestre, um semestre por linha, no formato mostrado no exemplo de sa&iacute;da abaixo. Para cada semestre, a lista das disciplinas deve ser dada em ordem lexicogr&aacute;fica.</p>

<p>Defini&ccedil;&atilde;o: considere as cadeias de caracteres S<sub>a</sub> = a<sub>1</sub>a<sub>2</sub>&hellip;a<sub>m</sub> e S<sub>b</sub> = b<sub>1</sub>b<sub>2</sub>&hellip;b<sub>n</sub>. S<sub>a</sub> precede S<sub>b</sub> em ordem lexicogr&aacute;fica se e apenas se S<sub>b</sub> &eacute; n&atilde;o-vazia e uma das seguintes condi&ccedil;&otilde;es &eacute; verdadeira:&nbsp;</p>

<ul>
	<li>S<sub>a</sub> &eacute; uma cadeia vazia;&nbsp;</li>
	<li>a<sub>1</sub> &lt; b<sub>1</sub> na ordem &lsquo;0 &lt; &lsquo;1 &lt; &lsquo;2 &lt; &hellip; &lt; &lsquo;9 &lt; &lsquo;A &lt; &lsquo;B &lt; &hellip; &lt; &lsquo;Z ;</li>
	<li>a<sub>1</sub> = b<sub>1</sub> e a cadeia a<sub>2</sub>a<sub>3</sub>&hellip;a<sub>m</sub> precede a cadeia b<sub>2</sub>b<sub>3</sub>&hellip;b<sub>n</sub>.</li>
</ul>