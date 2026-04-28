# [Gold III] Redução de Pena - 13692

[문제 링크](https://www.acmicpc.net/problem/13692)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 5, 맞힌 사람: 4, 정답 비율: 30.769%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>O conhecido e temido hacker SideBarCoder finalmente decidiu entregar-se &agrave;s autoridades, depois de anos infernizando a vida de administradores de sistemas. SideBarCoder nunca causou preju&iacute;zos diretamente, mas deixava os administradores furiosos, tendo ficado famoso por deixar recados humorosos em arquivos localizados em sistemas supostamente impenetr&aacute;veis.</p>

<p>SideBarCoder aceitou a proposta feita publicamente por uma grande empresa, de um &oacute;timo sal&aacute;rio, com a condi&ccedil;&atilde;o de revelar a sua verdadeira identidade e trabalhar dali em diante na melhoria da seguran&ccedil;a do sistema Linux. No entanto, a Pol&iacute;cia Federal n&atilde;o foi t&atilde;o condescendente quanto SideBarCoder esperava e prendeu-o no seu primeiro dia de trabalho.</p>

<p>Felizmente o juiz encarregado do caso levou em considera&ccedil;&atilde;o o fato de SideBarCoder nunca ter causado preju&iacute;zo a nenhuma empresa, e decidiu que ele poderia reduzir o per&iacute;odo na cadeia se realizasse trabalho volunt&aacute;rio nas escolas de seu bairro (como pintar paredes de salas de aulas, ajudar a cuidar de beb&ecirc;s em creches, etc).</p>

<p>O juiz entregou a SideBarCoder uma lista de tarefas poss&iacute;veis. Cada tarefa corresponde a uma certa quantidade de pontos que podem ser utilizados para reduzir a pena. SideBarCoder deve realizar as tarefas no per&iacute;odo de uma semana, de segunda-feira a sexta-feira. Para cada tarefa, o juiz especificou o dia e hora de in&iacute;cio e de final da tarefa, e o n&uacute;mero de pontos correspondente. O n&uacute;mero de pontos atribu&iacute;do &agrave; tarefa n&atilde;o &eacute; fun&ccedil;&atilde;o de sua dura&ccedil;&atilde;o, mas sim de sua dificuldade. Assim, cuidar de uma classe com vinte crian&ccedil;as por duas horas representa um n&uacute;mero maior de pontos do que pintar uma sala de aula, que demora quatro horas.</p>

<p>&Eacute; l&oacute;gico que SideBarCoder pensou em utilizar um computador para determinar como conseguir o maior n&uacute;mero de pontos poss&iacute;vel. No entanto, como pena adicional, o juiz determinou que SideBarCoder n&atilde;o pode chegar perto de um computador antes de cumprir sua pena. Desesperado, SideBarCoder solicitou que voc&ecirc; escrevesse um programa para determinar quais tarefas ele deveria escolher.</p>

<p>Para ter os pontos contabilizados, uma tarefa deve ser cumprida integralmente (ou seja, do in&iacute;cio ao final do per&iacute;odo para ela estabelecido, sem interrup&ccedil;&atilde;o). No conjunto de tarefas selecionado pelo seu programa n&atilde;o pode haver tarefas conflitantes. Duas tarefas conflitam se ambas devem ser executadas no mesmo dia e existir intersec&ccedil;&atilde;o entre os seus hor&aacute;rios. Como todas as tarefas ser&atilde;o realizadas no bairro onde SideBarCoder mora, o tempo de deslocamento de uma tarefa para outra pode ser desconsiderado. Assim, ele pode executar sem conflito duas tarefas A e B tais que o hor&aacute;rio de t&eacute;rmino de A &eacute; igual ao hor&aacute;rio de in&iacute;co de B.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m um inteiro 0 &le; N &le; 10000 que indica o n&uacute;mero de tarefas disponibilizadas pelo juiz. Cada uma das N linhas seguintes descreve uma tarefa, no seguinte formato:</p>

<p><code>Codigo Pontos Dia Inicio Final</code></p>

<p>onde</p>

<ul>
	<li>Codigo &eacute; um inteiro que identifica univocamente uma tarefa (1 &le; Codigo &le; 10000);</li>
	<li>Pontos &eacute; um inteiro que indica o n&uacute;mero de pontos da tarefa (1 &le; Pontos &le; 50);</li>
	<li>Dia &eacute; uma cadeia de tr&ecirc;s caracteres que indica o dia da semana (Seg, Ter, Qua, Qui, Sex) da tarefa;</li>
	<li>In&iacute;cio e Final indicam a hora de in&iacute;cio e fim da tarefa, no formato HH:MM (entre 00:00 e 23:59). O final de uma tarefa ocorre sempre ap&oacute;s o seu in&iacute;cio e uma tarefa &eacute; inteiramente contida em um dia.</li>
</ul>

<p>O final da entrada &eacute; indicado por N = 0.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve produzir seis linhas. A primeira linha deve conter a express&atilde;o &lsquo;Total de pontos:&rsquo;, seguida de um espa&ccedil;o, seguida de um inteiro: o n&uacute;mero m&aacute;ximo de pontos que SideBarCoder pode acumular. As cinco linhas seguintes da sa&iacute;da devem conter a lista dos pontos a serem conseguidos em cada dia da semana, no formato mostrado no exemplo de sa&iacute;da abaixo.</p>