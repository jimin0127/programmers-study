def solution(records):
    answer = []
    name_map = dict()
    for record in records:
        r = record.split(' ')
        if len(r) == 2:
            act, uid = r
        else:
            act, uid, name = r
            
        if act == 'Enter':
            answer.append(uid+' 들어왔습니다.')
            name_map[uid] = name
        elif act == 'Leave':
            answer.append(uid+' 나갔습니다.')
        else:
            name_map[uid] = name
        
    l = list()

    for a in answer:
        uid = a.split(' ')[0]
        name = name_map[uid]
        l.append(a.replace(uid,  name+'님이'))
    
    return l