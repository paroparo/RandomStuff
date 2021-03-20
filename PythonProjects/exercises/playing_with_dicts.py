import pandas as pd

my_dict = {'HeadTeam': {'Team01': {'ID': '01',
                                   'Members': 3},
                        'Team02': {'ID': '02',
                                   'Members': 5}}}

df = pd.DataFrame(my_dict['HeadTeam'])
print(df)

# emp_details = {'Employee': {'Dave': {'ID': '001',
#                                      'Salary': 2000,
#                                      'Designation':'Python Developer'},
#                             'Ava': {'ID':'002',
#                                     'Salary': 2300,
#                                     'Designation': 'Java Developer'},
#                             'Joe': {'ID': '003',
#                                     'Salary': 1843,
#                                     'Designation': 'Hadoop Developer'}}}
# df=pd.DataFrame(emp_details['Employee'])
# print(df)